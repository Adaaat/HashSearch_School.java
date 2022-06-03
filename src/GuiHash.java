import javax.swing.*;

public class GuiHash extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton speichernButton;
    private JButton suchenButton;

    public GuiHash(){
        setContentPane(mainPanel);
        setTitle("Adnan's Test");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main (String[]args){
        GuiHash Gui = new GuiHash();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
