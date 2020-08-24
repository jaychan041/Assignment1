/**
 *
 * @author jaychan
 * Application that runs the GUI with the main method.
 */


public class Application {

    public static void main (String[] args){
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setSize(1200, 450);
        mainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
    }
}
