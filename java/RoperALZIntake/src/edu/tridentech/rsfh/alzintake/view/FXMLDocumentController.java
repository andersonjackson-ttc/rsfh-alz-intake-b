/*
 * see FXML variables commented out below
 */
package edu.tridentech.rsfh.alzintake.view;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author 5JLBt1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Text actiontarget;
    @FXML private TextField subjectFirstNameTxtBx;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
    	String subFirstName = "";
    	subFirstName = subjectFirstNameTxtBx.getText();
        System.out.println(subFirstName);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
// @FXML private DatePicker intakeScreenDateTxtBx;
//   @FXML private ComboBox intakeScreenByDrpDn;
//   @FXML private TextField subjectFirstNameTxtBx;
//   @FXML private TextField subjectMITxtBx;
//   @FXML private TextField subjectLastNameTxtBx;
//   @FXML private TextField subjectDOBTxtBx;
//   @FXML private TextField subjectAddressTxtBx;
//   @FXML private TextField subjectStateTxtBx;
//   @FXML private TextField subjectZipTxtBx;
//   @FXML private CheckBox hpoaStatusCkBxY;
//   @FXML private CheckBox hpoaStatusCkBxN;
//   @FXML private TextField subjectEmailTxtBx;
//   @FXML private TextField subjectPhoneTxtBx;
//   @FXML private TextField subjectCellTxtBx;
//   @FXML private TextField subjectPcpTxtBx;
//   @FXML private TextField subjectCityTxtBx;
//   @FXML private TextField subjectSpecialistTxtBx;
//   @FXML private TextField hpoaFirstNameTxtBx;
//   @FXML private TextField hpoaLastNameTxtBx;
//   @FXML private TextField hpoaPhoneTxtBx;
//   @FXML private ComboBox subjectReferralDrpDn;
//   @FXML private CheckBox studyPartnerStatusTglBtn;
//   @FXML private TextField studyPartnerRelationTxtBx;
//   @FXML private TextField studyPartnerPhoneTxtBx;
//   @FXML private TextField studyPartnerEmailTxtBx;
//   @FXML private TextField studyPartnerLastNameTxtBx;
//   @FXML private TextField studyPartnerFirstNameTxtBx;
//   @FXML private TextField hpoaSpousePhoneTxtBx;
//   @FXML private TextField hpoaSpouseLastNameTxtBx;
//   @FXML private TextField hpoaSpouseFirstNameTxtBx;
//   @FXML private CheckBox hpoaMarriedStatusCkBxN;
//   @FXML private CheckBox hpoaMarriedStatusCkBxY;
//   @FXML private CheckBox hpoaChildStatusCkBxY;
//   @FXML private CheckBox hpoaChildStatusCkBxN;
//   @FXML private TextField hpoaChildFirstNameTxtBx;
//   @FXML private TextField hpoaChildLastNameTxtBx;
//   @FXML private TextField hpoaChildPhoneTxtBx;