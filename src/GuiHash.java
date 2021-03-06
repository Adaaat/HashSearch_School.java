import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GuiHash extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Adnans Hash");
    JLabel label = new JLabel("Kundennummer:");
    JTextField kText = new JTextField();
    JLabel wert = new JLabel("Wert:");
    JTextField wText = new JTextField();
    JButton button = new JButton("Speichern");
    JButton button2 = new JButton("Suchen");
    JLabel alert = new JLabel("");
    HashSuche hash = new HashSuche(10);

    public GuiHash() {

        JPanel mainPanel = new JPanel();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(mainPanel);

        mainPanel.setLayout(null);

        label.setBounds(10, 20, 100, 25);
        mainPanel.add(label);


        kText.setBounds(120, 20, 165, 25);
        mainPanel.add(kText);


        wert.setBounds(10, 50, 100, 25);
        mainPanel.add(wert);


        wText.setBounds(120, 50, 165, 25);
        mainPanel.add(wText);

        button2.setBounds(120, 80, 100, 25);
        mainPanel.add(button2);

        button2.addActionListener(e -> {
            String schluessel = kText.getText();
            int schluessel1 = Integer.parseInt(schluessel);
            int temp = hash.suchePos(schluessel1);
            double[] wert = hash.getWert();
            if (temp == -1) {
                alert.setText("Schlüssel existiert nicht!");
            } else {
                alert.setText("Wert: "+ wert[temp] );
                kText.setText("");
                wText.setText("");
            }
        });

        button.setBounds(10, 80, 100, 25);
        mainPanel.add(button);

        button.addActionListener(e -> {
            try {
                String schluessel = kText.getText();
                String wert = wText.getText();

            int schluessel1 = Integer.parseInt(schluessel);
            double wert1 = Double.parseDouble(wert);
            int[] arrayWert =   hash.getSchluessel();

         int temp = hash.fuegeEin(schluessel1, wert1);

                if (temp == -1) {
                    alert.setText("Array Voll");
                } else if (temp == -2) {
                    alert.setText("Kundennummer existiert bereits");
                } else {
                    alert.setText("Gespeichert");
                    kText.setText("");
                    wText.setText("");
                }
                System.out.println(Arrays.toString(hash.getSchluessel()));
                System.out.println(Arrays.toString(hash.getWert()));
            } catch (NumberFormatException f){
                alert.setText("Geben Sie nur Zahlen ein");
            }
        });

        alert.setBounds(10, 110, 300, 25);
        mainPanel.add(alert);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        GuiHash Gui = new GuiHash();
    }
  /*  }
    public void actionPerformed(ActionEvent e){
        alert.setText("Gespeichert!");
    }*/

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
