import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class VotingApplet extends Applet implements ActionListener {
    Label question;
    CheckboxGroup options;
    Checkbox chapati, pilau, fries, ugali;
    Button voteBtn;
    int cCount = 0, pCount = 0, fCount = 0, uCount = 0;

    public void init() {
        question = new Label("What is your favorite food?");
        options = new CheckboxGroup();

        chapati = new Checkbox("Chapati", options, false);
        pilau = new Checkbox("Pilau", options, false);
        fries = new Checkbox("Fries", options, false);
        ugali = new Checkbox("Ugali", options, false);

        voteBtn = new Button("Vote");
        voteBtn.addActionListener(this);

        add(question);
        add(chapati);
        add(pilau);
        add(fries);
        add(ugali);
        add(voteBtn);
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = options.getSelectedCheckbox();
        if (selected == chapati) cCount++;
        else if (selected == pilau) pCount++;
        else if (selected == fries) fCount++;
        else if (selected == ugali) uCount++;

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Current Votes:", 20, 150);
        g.drawString("Chapati: " + cCount, 20, 170);
        g.drawString("Pilau: " + pCount, 20, 190);
        g.drawString("Fries: " + fCount, 20, 210);
        g.drawString("Ugali: " + uCount, 20, 230);
    }
}
