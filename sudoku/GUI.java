import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

public class GUI extends JFrame implements ActionListener, KeyListener {
    private Board board;
    private JPanel p;
    static ArrayList<JButton> cell;
    private JButton select = null;
    private JLabel log;

    public GUI(Board b) {
        super("Sudoku Solver");
        this.board = b;
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        JLabel head = new JLabel("Sudoku Solver", JLabel.CENTER);
        head.setFont(new Font("Consolas", Font.PLAIN, 48));
        head.setBorder(new EmptyBorder(10, 0, 0, 0));
        add(head, BorderLayout.NORTH);

        // Dimension d = getSize();
        // System.out.println(d.height + " " + d.width);

        JPanel contain = new JPanel();
        contain.setLayout(null);
        add(contain, BorderLayout.CENTER);

        JPanel control = new JPanel();
        control.setLayout(new FlowLayout(FlowLayout.CENTER));
        control.setBounds(650, 500, 740, 100);
        contain.add(control);

        log = new JLabel("CLICK CELL AND USE KEYBOARD TO SET", JLabel.CENTER);
        log.setFont(new Font("Consolas", Font.PLAIN, 28));
        log.setBounds(650, 300, 740, 200);
        contain.add(log);

        JButton solve = new JButton("SOLVE");
        solve.addActionListener(this);
        solve.setFont(new Font("Ariel", Font.PLAIN, 24));
        control.add(solve);

        JButton reset = new JButton("RESET");
        reset.addActionListener(this);
        reset.setFont(new Font("Ariel", Font.PLAIN, 24));
        control.add(reset);

        p = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                // Horizontal
                g.drawLine(10, 215, 600, 215);
                g.drawLine(10, 415, 600, 415);
                // Vertical
                g.drawLine(205, 20, 205, 610);
                g.drawLine(405, 20, 405, 610);
            }
        };
        p.setLayout(null);
        p.setBounds(0, 0, 600, 600);
        contain.add(p);
        initializeBoard();
    }

    private void initializeBoard() {
        cell = new ArrayList<JButton>();
        int i, j, x = 20, y = 30;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                JButton b = new JButton();
                p.add(b);
                b.setBounds(x, y, 50, 50);
                b.setFont(new Font("Consolas", Font.PLAIN, 24));
                b.addActionListener(this);
                cell.add(b);
                x += 50 + 10;
                if ((j + 1) % 3 == 0)
                    x += 20;
            }
            x = 20;
            y += 50 + 10;
            if ((i + 1) % 3 == 0)
                y += 20;
        }
    }

    public void reflect() {
        int i, j, index, val;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                index = 9 * i + j;
                val = board.current[i][j];
                if (val == 0)
                    cell.get(index).setText("");
                else
                    cell.get(index).setText(String.valueOf(val));
                cell.get(index).setBackground(null);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        int i, j;
        if (cell.contains(src))
            select = src;
        else if (src.getText() == "SOLVE") {
            for (i = 0; i < 9; i++) {
                for (j = 0; j < 9; j++) {
                    board.current[i][j] = board.unsolved[i][j];
                }
            }
            if (board.initialVerify()) {
                if (board.solve()) {
                    reflect();
                    log.setText("Board Solved!");
                } else {
                    // Should never occur.
                    log.setText("That's unexpected.");
                }
            } else {
                log.setText("Input Board Verification Failed! (Recheck)");
            }
        } else if (src.getText() == "RESET") {
            for (i = 0; i < 9; i++) {
                for (j = 0; j < 9; j++) {
                    board.unsolved[i][j] = 0;
                    board.current[i][j] = 0;
                    cell.get(9 * i + j).setBackground(null);
                }
            }
            log.setText("Board Reset Complete.");
            reflect();
        }
        setFocusable(true);
        requestFocus();
        requestFocusInWindow();
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        char ch = e.getKeyChar();
        if (select != null && ch >= 49 && ch <= 57) {
            int val = (int) ch - 48;
            select.setText(String.valueOf(val));
            int index = cell.indexOf(select), i, j;
            i = (int) (index / 9);
            j = index % 9;
            board.unsolved[i][j] = val;
        } else if (select != null) {
            select.setText("");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}
