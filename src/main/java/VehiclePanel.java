import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VehiclePanel extends JPanel {

    JPanel panelVehicleInput = new JPanel();

    JLabel lblPlateNumber = new JLabel("Plate Number");
    JLabel lblEngineCapacity = new JLabel("Engine Capacity (Litres)");
    JLabel lblMake = new JLabel("Make");
    JLabel lblModel = new JLabel("Model");
    JLabel lblYear = new JLabel("Year");
    JLabel lblOwnerId = new JLabel("Owner ID");
    JLabel lblNumOfSeats = new JLabel("Number of Seats");
    JLabel lblLoadCapacity = new JLabel("Load Capacity");

    JTextField txtPlateNumber= new JTextField(40);
    JTextField txtEngineCapacity = new JTextField(40);
    JTextField txtMake = new JTextField(40);
    JTextField txtModel = new JTextField(40);
    JTextField txtYear = new JTextField(40);
    JTextField txtNumOfSeats = new JTextField();
    JTextField txtLoadCapacity = new JTextField();
    JTextField txtOwnerId = new JTextField();

    JCheckBox lightVehicle = new JCheckBox("Light Vehicle");
    JCheckBox heavyVehicle = new JCheckBox("Heavy Vehicle");

    JTextArea taVehicleDetails = new JTextArea();

    JButton btnAdd = new JButton ("Add New Vehicle");
    JButton btnClear = new JButton("Clear");
    JButton btnExit = new JButton("Exit");


    public VehiclePanel(){
        this.setLayout(new BorderLayout());

        panelVehicleInput.setLayout(new GridLayout(3,8));

        panelVehicleInput.add(lblOwnerId);
        panelVehicleInput.add(lblPlateNumber);
        panelVehicleInput.add(lblEngineCapacity);
        panelVehicleInput.add(lblMake);
        panelVehicleInput.add(lblModel);
        panelVehicleInput.add(lblYear);
        panelVehicleInput.add(lblNumOfSeats);
        panelVehicleInput.add(lblLoadCapacity);


        panelVehicleInput.add(txtOwnerId);
        panelVehicleInput.add(txtPlateNumber);
        panelVehicleInput.add(txtEngineCapacity);
        panelVehicleInput.add(txtMake);
        panelVehicleInput.add(txtModel);
        panelVehicleInput.add(txtYear);
        panelVehicleInput.add(txtNumOfSeats);
        panelVehicleInput.add(txtLoadCapacity);

        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(lightVehicle);
        lightVehicle.addActionListener((ActionEvent e) -> {
            if(lightVehicle.isSelected()) {
                heavyVehicle.setSelected(false);
                lblLoadCapacity.setVisible(false);
                txtLoadCapacity.setVisible(false);
                lblNumOfSeats.setVisible(true);
                txtNumOfSeats.setVisible(true);
            }
        });
        panelVehicleInput.add(heavyVehicle);
        heavyVehicle.addActionListener((ActionEvent e) -> {
            if(heavyVehicle.isSelected()){
                lightVehicle.setSelected(false);
                lblNumOfSeats.setVisible(false);
                txtNumOfSeats.setVisible(false);
                lblLoadCapacity.setVisible(true);
                txtLoadCapacity.setVisible(true);
            }
        });

        panelVehicleInput.add(btnAdd);
        panelVehicleInput.add(btnClear);
        panelVehicleInput.add(btnExit);


        taVehicleDetails.setText("Vehicle Information");

        this.add(panelVehicleInput, BorderLayout.NORTH);
        this.add(taVehicleDetails, BorderLayout.CENTER);

        btnAdd.addActionListener((ActionEvent e) -> {

            if (txtPlateNumber.getText().compareTo("") == 0) {

                errorPrompt("You must enter a plate number.");

                txtPlateNumber.requestFocus();
                return;
            }

            if (txtEngineCapacity.getText().compareTo("") == 0) {

                errorPrompt("You must enter the car's engine capacity");

                txtEngineCapacity.requestFocus();
                return;
            }

            if (txtMake.getText().compareTo("") == 0) {

                errorPrompt("You must enter the make of the car");

                txtMake.requestFocus();
                return;
            }

            if (txtModel.getText().compareTo("") == 0) {

                errorPrompt("You must enter the model of the car");

                txtModel.requestFocus();
                return;
            }

            if (txtYear.getText().compareTo("") == 0) {

                errorPrompt("You must enter the year the car was manufactured");

                txtYear.requestFocus();
                return;
            }

            if (lightVehicle.isSelected()) {
                if (txtNumOfSeats.getText().compareTo("") == 0) {

                    errorPrompt("You must enter the number of seats in the car");

                    txtNumOfSeats.requestFocus();
                    return;

                }

                LightVehicle aNewVehicle = new LightVehicle(this.txtPlateNumber.getText(), this.txtEngineCapacity.getText(), this.txtModel.getText(), this.txtMake.getText(), this.txtYear.getText(), this.txtOwnerId.getText(), this.txtNumOfSeats.getText());
                MainFrame.vehicleArray.add(aNewVehicle);
                taVehicleDetails.setText(aNewVehicle.toString());
            }

            if (heavyVehicle.isSelected()) {
                if (txtLoadCapacity.getText().compareTo("") == 0) {

                    errorPrompt("You must enter the car's load capacity");

                    txtLoadCapacity.requestFocus();
                    return;
                }
                HeavyVehicle aNewVehicle = new HeavyVehicle(this.txtPlateNumber.getText(), this.txtEngineCapacity.getText(), this.txtModel.getText(), this.txtMake.getText(), this.txtYear.getText(), this.txtOwnerId.getText(), this.txtLoadCapacity.getText());
                MainFrame.vehicleArray.add(aNewVehicle);
                taVehicleDetails.setText(aNewVehicle.toString());
            }
        });

        btnClear.addActionListener((ActionEvent e)-> {

            txtPlateNumber.setText("");
            txtEngineCapacity.setText("");
            txtMake.setText("");
            txtModel.setText("");
            txtYear.setText("");
            txtNumOfSeats.setText("");
            txtLoadCapacity.setText("");

        });

        btnExit.addActionListener((ActionEvent e) ->{
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the application?",
                    "Motor Vehicle Registration System", JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Thank you for using the Motor Vehicle Registration System",
                        "Motor Vehicle Registration System", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);

            } else if (result == JOptionPane.NO_OPTION){
                return;
            } else if (result == JOptionPane.CLOSED_OPTION) {
                return;
            }
        });
    }


    private void errorPrompt (String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage,
                "Motor Vehicle Registration System", JOptionPane.ERROR_MESSAGE);
        //A method, when called displays an error prompt where you can set any message to appear in the dialogue box
    }

}