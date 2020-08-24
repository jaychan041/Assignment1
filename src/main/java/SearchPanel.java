import javax.swing.*;
import java.awt.*;

public class SearchPanel extends JPanel {

    JPanel panelPlateNumberInput = new JPanel();

    JLabel lblPlateNumber = new JLabel("Enter Plate Number Here:");
    JLabel lblName= new JLabel("Enter Full Name Here:");

    JTextField txtPlateNumber = new JTextField();
    JTextField txtName = new JTextField();

    JTextArea taSearchPanel = new JTextArea();

    JButton btnSearchByPlateNumber = new JButton("Search By Plate Number");
    JButton btnSearchByName = new JButton ("Search By Name");

    public SearchPanel() {
        this.setLayout( new BorderLayout());

        panelPlateNumberInput.setLayout(new GridLayout(2,4));

        panelPlateNumberInput.add(lblPlateNumber);
        panelPlateNumberInput.add(txtPlateNumber);
        panelPlateNumberInput.add(new JLabel("        "));
        panelPlateNumberInput.add(btnSearchByPlateNumber);

        panelPlateNumberInput.add(lblName);
        panelPlateNumberInput.add(txtName);
        panelPlateNumberInput.add(new JLabel("        "));
        panelPlateNumberInput.add(btnSearchByName);

        taSearchPanel.setText("Search Result:\n");

        this.add(panelPlateNumberInput, BorderLayout.NORTH);
        this.add(taSearchPanel, BorderLayout.CENTER);

    }

}
