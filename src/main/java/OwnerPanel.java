import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

public class OwnerPanel extends JPanel {

    private int ownerId = 1001;

    JPanel panelOwnerInput = new JPanel();

    JLabel lblLicenceNumber = new JLabel("Licence Number ");
    JLabel lblFirstName = new JLabel("First Name ");
    JLabel lblLastName = new JLabel("Last Name ");
    JLabel lblAddress = new JLabel("Address ");
    JLabel lblPhoneNumber = new JLabel("Phone No. ");
    JLabel lblDateOfBirth = new JLabel("Date of Birth ");
    JLabel lblAbn = new JLabel("ABN ");

    JTextField txtLicenceNumber = new JTextField();
    JTextField txtFirstName = new JTextField();
    JTextField txtLastName = new JTextField();
    JTextField txtAddress = new JTextField();
    JTextField txtPhoneNumber = new JTextField();
    JTextField txtDateOfBirth = new JTextField();
    JTextField txtAbn = new JTextField();

    JCheckBox privateOwner = new JCheckBox("Private Owner");
    JCheckBox corporateOwner = new JCheckBox(" Corporate Owner");

    JTextArea taOwnerDetails = new JTextArea();

    JButton btnAdd = new JButton ("Add New Owner");
    JButton btnClear = new JButton("Clear");
    JButton btnExit = new JButton("Exit");


    public OwnerPanel(){
        this.setLayout(new BorderLayout());

        panelOwnerInput.setLayout(new GridLayout(3,6));


        panelOwnerInput.add(lblLicenceNumber);
        panelOwnerInput.add(lblFirstName);
        panelOwnerInput.add(lblLastName);
        panelOwnerInput.add(lblAddress);
        panelOwnerInput.add(lblPhoneNumber);
        panelOwnerInput.add(lblDateOfBirth);
        panelOwnerInput.add(lblAbn);


        panelOwnerInput.add(txtLicenceNumber);
        panelOwnerInput.add(txtFirstName);
        panelOwnerInput.add(txtLastName);
        panelOwnerInput.add(txtAddress);
        panelOwnerInput.add(txtPhoneNumber);
        panelOwnerInput.add(txtDateOfBirth);
        panelOwnerInput.add(txtAbn);


        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(privateOwner);
        privateOwner.addActionListener((ActionEvent e) -> {
            if (privateOwner.isSelected()) {
                corporateOwner.setSelected(false);
                lblDateOfBirth.setVisible(true);
                txtDateOfBirth.setVisible(true);
                lblAbn.setVisible(false);
                txtAbn.setVisible(false);
            }
        });
        panelOwnerInput.add(corporateOwner);
        corporateOwner.addActionListener((ActionEvent e) -> {
            if (corporateOwner.isSelected()) {
                privateOwner.setSelected(false);
                lblDateOfBirth.setVisible(false);
                txtDateOfBirth.setVisible(false);
                lblAbn.setVisible(true);
                txtAbn.setVisible(true);
            }
        });

        panelOwnerInput.add(btnAdd);
        panelOwnerInput.add(btnClear);
        panelOwnerInput.add(btnExit);

        taOwnerDetails.setText("Owner Information");

        this.add(panelOwnerInput, BorderLayout.NORTH);
        this.add(taOwnerDetails, BorderLayout.CENTER);

        btnAdd.addActionListener((ActionEvent e) -> {

            if(txtLicenceNumber.getText().compareTo("") == 0){

                errorPrompt("You must enter a licence number.");

                txtLicenceNumber.requestFocus();
                return;
            } else if(!Pattern.matches("[0-9]+$", txtLicenceNumber.getText())){

                errorPrompt("Please make sure you have entered a valid Licence Number");

                txtLicenceNumber.requestFocus();
                return;
            }

            if(txtFirstName.getText().compareTo("") == 0) {

                errorPrompt("You must enter a First Name");

                txtFirstName.requestFocus();
                return;
            } else if(!Pattern.matches("[a-zA-Z]+\\.?", txtFirstName.getText())){

                errorPrompt("Please make sure you have entered a valid First Name");

                txtFirstName.requestFocus();
                return;
            }

            if(txtLastName.getText().compareTo("") == 0){

                errorPrompt("You must enter a Last Name");

                txtLastName.requestFocus();
                return;
            } else if(!Pattern.matches("[a-zA-Z]+\\.?", txtLastName.getText())){

                errorPrompt("Please make sure you have entered a valid Last Name");

                txtFirstName.requestFocus();
                return;
            }

            if(txtAddress.getText().compareTo("") == 0) {

                errorPrompt("You must enter an Address");

                txtAddress.requestFocus();
                return;
            }

            if(txtPhoneNumber.getText().compareTo("") == 0) {

                errorPrompt("You must enter a Phone Number");

                txtPhoneNumber.requestFocus();
                return;
            } else if(!Pattern.matches("[0-9]+$", txtPhoneNumber.getText())){

                errorPrompt("Please make sure you have entered a valid Phone Number");

                txtPhoneNumber.requestFocus();
                return;
            }

            if(corporateOwner.isSelected()) {
                if(txtAbn.getText().compareTo("") == 0) {

                    errorPrompt("You must enter an Australian Business Number");

                    txtAbn.requestFocus();
                    return;

                }
                CorporateOwner aNewOwner = new CorporateOwner(this.txtLicenceNumber.getText(), this.txtFirstName.getText(), this.txtLastName.getText(), this.txtAddress.getText(), this.txtPhoneNumber.getText(), this.txtAbn.getText());
                MainFrame.ownerArray.add(aNewOwner);
                taOwnerDetails.setText(aNewOwner.toString() + "\nOwner ID: " + ownerId);
            }

            if(privateOwner.isSelected()) {
                if(txtDateOfBirth.getText().compareTo("") == 0) {

                    errorPrompt("You must enter a Date of Birth");

                    txtDateOfBirth.requestFocus();
                    return;

                } else if(!Pattern.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", txtDateOfBirth.getText())){
                    errorPrompt("Please make sure you have entered a valid Date of Birth");

                    txtDateOfBirth.requestFocus();
                    return;
                }
                PrivateOwner aNewOwner = new PrivateOwner(this.txtLicenceNumber.getText(), this.txtFirstName.getText(), this.txtLastName.getText(), this.txtAddress.getText(), this.txtPhoneNumber.getText(),this.txtDateOfBirth.getText());
                MainFrame.ownerArray.add(aNewOwner);
                taOwnerDetails.setText(aNewOwner.toString() + "\nOwner ID: " + ownerId);
            }

            ownerId++;
        });

        btnClear.addActionListener((ActionEvent e) -> {
            txtLicenceNumber.setText("");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtAddress.setText("");
            txtPhoneNumber.setText("");
            txtDateOfBirth.setText("");
            txtAbn.setText("");
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
