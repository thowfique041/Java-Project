
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    ImageIcon img = new ImageIcon("Icon.gif");
    int w = 700;
    int h = 750;
    String s = "X";
    String s2 = "O";
    String te = s;
    String p1 = JOptionPane.showInputDialog("Player 1 name");
    String p2 = JOptionPane.showInputDialog("Player 2 name");
    boolean gameOver = false;
    boolean draw = false;
    JFrame frame = new JFrame("Tic Tac Toe");
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JPanel bPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(w, h);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Centers the frame on the screen
        frame.setResizable(false);
        frame.setVisible(true);

        label.setText(p1 + "->X");
        label.setBackground(new Color(0x123456));
        label.setForeground(Color.white);
        label.setFont(new Font("Arial", Font.BOLD, 50));
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.setIconImage(img.getImage());

        panel.setLayout(new BorderLayout());
        panel.add(label);

        frame.add(panel, BorderLayout.NORTH);
        bPanel.setBackground(new Color(0x123456));
        bPanel.setLayout(new GridLayout(3, 3));
        frame.add(bPanel);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                buttons[r][c] = new JButton();
                buttons[r][c].setBackground(new Color(0x123456));
                buttons[r][c].setFocusable(false);
                buttons[r][c].setFont(new Font("Arial", Font.BOLD, 60));
                bPanel.add(buttons[r][c]);

                buttons[r][c].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton source = (JButton) e.getSource();
                        if (source.getText().equals("") && !gameOver) {
                            if (te.equals(s)) {
                                source.setText(te);
                                source.setFont(new Font("Arial", Font.BOLD, 60));
                                source.setEnabled(false);
                                source.setBackground(Color.BLACK);
                                source.setForeground(Color.white);
                                te = s2;
                                label.setText(p2 + "->O");
                                checkWinner();
                                if (gameOver) {
                                    win(p1);
                                }
                                
                            } else {
                                source.setText(te);
                                source.setFont(new Font("Arial", Font.BOLD, 60));
                                source.setEnabled(false);
                                source.setBackground(Color.WHITE);
                                source.setForeground(Color.BLACK);
                                te = s;
                                label.setText(p1 + "->X");
                                checkWinner();
                                if (gameOver) {
                                    win(p2);
                                }
                            }
                            // checkWinner();
                            if (!gameOver && isBoardFull()) {
                                draw = true;
                                gameOver = true;
                                label.setText("It's a Draw!");
                                highlightDrawButtons();
                            }
                        }
                    }
                });
            }
        }
    }

    public void checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                !buttons[i][0].getText().equals("")) {
                gameOver = true;
                highlightWinningButtons(buttons[i][0], buttons[i][1], buttons[i][2]);
                return;
            }

            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                !buttons[0][i].getText().equals("")) {
                gameOver = true;
                highlightWinningButtons(buttons[0][i], buttons[1][i], buttons[2][i]);
                return;
            }
        }

        // Check diagonals
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText()) &&
            !buttons[0][0].getText().equals("")) {
            gameOver = true;
            highlightWinningButtons(buttons[0][0], buttons[1][1], buttons[2][2]);
            return;
        }

        if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText()) &&
            !buttons[0][2].getText().equals("")) {
            gameOver = true;
            highlightWinningButtons(buttons[0][2], buttons[1][1], buttons[2][0]);
            return;
        }
    }

    // Method to highlight winning buttons
    public void highlightWinningButtons(JButton b1, JButton b2, JButton b3) {
        b1.setBackground(Color.green);
        b2.setBackground(Color.green);
        b3.setBackground(Color.green);
    }

    // Method to highlight all buttons when there's a draw
    public void highlightDrawButtons() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                buttons[r][c].setBackground(Color.yellow);
            }
        }
    }

    // Method to check if the board is full
    public boolean isBoardFull() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (buttons[r][c].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void win(String s){
        label.setText(s+" WIN");

    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
