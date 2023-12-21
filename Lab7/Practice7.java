package Lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice7 extends JFrame {
    private int Madrid = 0;
    private int Milan = 0;

    private JLabel score = new JLabel("Result: 0 X 0");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JButton madrid = new JButton("Real Madrid");
    private JButton milan = new JButton("AC Milan");

    public Practice7() {
        super("new game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {refresher(0,1);}
        });
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {refresher(1,0);}
        });
        setLayout(new BorderLayout());
        add(score, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);
        add(lastScorer, BorderLayout.SOUTH);
        add(madrid, BorderLayout.WEST);
        add(milan, BorderLayout.EAST);
    }

    private void refresher(int milan, int madrid) {
        Madrid += madrid;
        Milan += milan;
        score.setText("Result:" + Madrid + "X" + Milan);
        if (Milan > Madrid) winner.setText("Winner: AC Milan");
        else if (Milan < Madrid) winner.setText("Winner: Real Madrid");
        else winner.setText("Winner: DRAW");
        if (milan == 1) lastScorer.setText("Last Scorer: AC Milan");
        else lastScorer.setText("Last Scorer: Real Madrid");
    }
}

