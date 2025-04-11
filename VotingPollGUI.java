import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VotingPollGUI extends JFrame implements ActionListener {
    JRadioButton chapati, pilau, fries, ugali;
    JButton voteBtn;
    JLabel resultLabel;
    int cCount = 0, pCount = 0, fCount = 0, uCount = 0;

    public VotingPollGUI() {
        setTitle("Favorite Food Voting Poll");
        setSize(400, 300);
        setLayout(new FlowLayout());

        JLabel question = new JLabel("What is your favorite food?");
        add(question);

        ButtonGroup group = new ButtonGroup();
        chapati = new JRadioButton("Chapati");
        pilau = new JRadioButton("Pilau");
        fries = new JRadioButton("Fries");
        ugali = new JRadioButton("Ugali");

        group.add(chapati);
        group.add(pilau);
        group.add(fries);
        group.add(ugali);

        add(chapati);
        add(pilau);
        add(fries);
        add(ugali);

        voteBtn = new JButton("Vote");
        voteBtn.addActionListener(this);
        add(voteBtn);

        resultLabel = new JLabel("Vote count will appear here.");
        add(resultLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (chapati.isSelected())
            cCount++;
        else if (pilau.isSelected())
            pCount++;
        else if (fries.isSelected())
            fCount++;
        else if (ugali.isSelected())
            uCount++;

        resultLabel.setText("<html>Votes:<br>Chapati: " + cCount + "<br>Pilau: " + pCount + "<br>Fries: " + fCount
                + "<br>Ugali: " + uCount + "</html>");
    }

    public static void main(String[] args) {
        new VotingPollGUI();
    }
}
