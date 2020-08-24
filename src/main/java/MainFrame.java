import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    public static ArrayList ownerArray;
    public static ArrayList vehicleArray;

    public MainFrame(){

        super ("Motor Vehicle Registration System");

        ownerArray = new ArrayList();
        vehicleArray = new ArrayList();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Owner", new OwnerPanel());
        tabbedPane.addTab("Vehicle", new VehiclePanel());
        tabbedPane.addTab("Search", new SearchPanel());


        JLabel titleLabel = new JLabel("Motor Vehicle Registration System");

        panel.add(titleLabel, BorderLayout.NORTH);

        panel.add(tabbedPane,BorderLayout.CENTER);

        add(panel);
    }
}
