/*
 * see FXML variables commented out below
 */
package edu.tridentech.rsfh.alzintake.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.tridentech.rsfh.alzintake.dao.DataReadWrite;
import edu.tridentech.rsfh.alzintake.model.Participant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;



/**
 *
 * @author 5JLBt1
 */

public class FXMLDocumentController implements Initializable {

	private String filePath = "";

	private Participant partic = new Participant();


	@FXML
	private Text actiontarget;
	@FXML private TextField subjectFirstNameTxtBx;
	@FXML private TextField subjectMITxtBx;
	@FXML private TextField subjectLastNameTxtBx;
	@FXML private TextField subjectDOBTxtBx;
	@FXML private TextField subjectAddressTxtBx;    
	@FXML private TextField subjectCityTxtBx;
	@FXML private TextField subjectStateTxtBx;
	@FXML private TextField subjectZipTxtBx;
	@FXML private TextField subjectEmailTxtBx;
	@FXML private TextField subjectPhoneTxtBx;
	@FXML private TextField subjectCellTxtBx;
	@FXML private TextField subjectPcpTxtBx;
	@FXML private TextField subjectSpecialistTxtBx;
	@FXML private TextField hpoaFirstNameTxtBx;
	@FXML private TextField hpoaLastNameTxtBx;
	@FXML private TextField hpoaPhoneTxtBx;
	@FXML private TextField hpoaSpouseFirstNameTxtBx;
	@FXML private TextField hpoaSpouseLastNameTxtBx;
	@FXML private TextField hpoaSpousePhoneTxtBx;
	@FXML private TextField hpoaChildFirstNameTxtBx;
	@FXML private TextField hpoaChildLastNameTxtBx;
	@FXML private TextField hpoaChildPhoneTxtBx;
	@FXML private TextField alzMemDiagnosisTxtBx;
	@FXML private TextField alzMemDiagnosisClinicianTxtBx;
	@FXML private TextField alzMemDiagnosisDateTxtBx;
	@FXML private TextField donepezilStartDateTxtBx;
	@FXML private TextField donepezilEndDateTxtBx;	
	@FXML private TextField memantineStartDateTxtBx;
	@FXML private TextField memantineEndDateTxtBx;
	@FXML private TextField rivastigmineStartDateTxtBx;
	@FXML private TextField rivastigmineEndDateTxtBx;	
	@FXML private TextField galantamineStartDateTxtBx;
	@FXML private TextField galantamineEndDateTxtBx;
	@FXML private TextField nammzaricStartDateTxtBx;
	@FXML private TextField nammzaricEndDateTxtBx;
	@FXML private TextField studyPartnerFirstNameTxtBx;
	@FXML private TextField studyPartnerLastNameTxtBx;
	@FXML private TextField studyPartnerPhoneTxtBx;
	@FXML private TextField studyPartnerEmailTxtBx;
	@FXML private TextField studyPartnerRelationTxtBx;
	@FXML private TextField alzFamHistoryStatusRelationTxtBx;
	@FXML private TextField ongoingHealthConcernsTxtBx;
	@FXML private TextField cancerStatusTypeTxtBx;
	@FXML private TextField rsfhClinRecommendsTxtBx;
	@FXML private TextField memLossNotedDateTxtBx;
	@FXML private TextField race;
	@FXML private TextField gender;



	@FXML private RadioButton alzMemAgitationRadY;
	@FXML private RadioButton alzMemApathyRadY;
	@FXML private RadioButton alzMemSleepIssueRadY;
	@FXML private RadioButton planSolveStatusRadY;
	@FXML private RadioButton memLossDisruptRadY;
	@FXML private RadioButton tasksStatusRadY;
	@FXML private RadioButton conversationStatusRadY;
	@FXML private RadioButton schizBiMddStatusRadY;
	@FXML private RadioButton sleepDisorderStatusRadY;
	@FXML private RadioButton deviseMRIConcernRadY;
	@FXML private RadioButton drugAlcoholStatusRadY;






	@FXML private ComboBox<String> subjectReferralDrpDn;
	//	@FXML private ComboBox<String> gender;



	@FXML private CheckBox studyPartnerStatusTglBtn;
	private TextField[] partnerArray = {studyPartnerFirstNameTxtBx, studyPartnerLastNameTxtBx, studyPartnerPhoneTxtBx, studyPartnerEmailTxtBx, studyPartnerRelationTxtBx};

	@FXML private RadioButton hpoaRadY;
	private TextField[] hpoaStatusArray = {hpoaFirstNameTxtBx, hpoaLastNameTxtBx, hpoaPhoneTxtBx};

	@FXML private RadioButton hpoaMarriedStatusRadY;
	private TextField[] hpoaMarriedStatArray = {hpoaSpouseFirstNameTxtBx,  hpoaSpouseLastNameTxtBx, hpoaSpousePhoneTxtBx};

	@FXML private RadioButton hpoaChildStatusRadY; 
	private TextField[] hpoaChildStatArray = {hpoaChildFirstNameTxtBx,  hpoaChildLastNameTxtBx, hpoaChildPhoneTxtBx};

	@FXML private RadioButton alzMemStatusRadY;  
	private TextField[] alzMemStatArray = {alzMemDiagnosisTxtBx,  alzMemDiagnosisClinicianTxtBx, alzMemDiagnosisDateTxtBx};

	@FXML private RadioButton memLossNotedRadY;  
	private TextField[] alzMemArray = {memLossNotedDateTxtBx};

	@FXML private RadioButton alzFamHistoryStatusRadY;
	private TextField[] alzFamHistArray = {alzFamHistoryStatusRelationTxtBx};

	@FXML private CheckBox donepezilStatusTglBtn;
	private TextField[] donepezilBeginEnd = {donepezilStartDateTxtBx, donepezilEndDateTxtBx};

	@FXML private CheckBox memantineStatusTglBtn;
	private TextField[] memantineBeginEnd = {memantineStartDateTxtBx, memantineEndDateTxtBx};

	@FXML private CheckBox rivastigmineStatusTglBtn;
	private TextField[] rivastigmineBeginEnd = {rivastigmineStartDateTxtBx, rivastigmineEndDateTxtBx};

	@FXML private CheckBox galantamineStatusTglBtn;
	private TextField[] galantamineBeginEnd = {galantamineStartDateTxtBx, galantamineEndDateTxtBx};

	@FXML private CheckBox nammzaricStatusTglBtn;
	private TextField[] nammzaricBeginEnd = {nammzaricStartDateTxtBx, nammzaricEndDateTxtBx};

	@FXML private RadioButton cancerStatusRadY;
	private TextField[] cancerStatusArray = {cancerStatusTypeTxtBx};

	@FXML private CheckBox subjectMailListStatusCkBxY;




	private ObservableList<String> TYPE = FXCollections.observableArrayList(" ", "23andMe referral", "A4 AARP Ad", "A4 direct mailing", "A4 Facebook Ad", "ADNI3 - Brain Health Registry","Advantage Magazine", "Community Event", "Facebook Ad - Biogen", "GeneMatch ", "GeneMatch- community event", "Health Fair", "Housecalls Magazine", "Housecalls TV", "Memory Screen Day", "Merck Referral", "News Story-Print/TV", "Other", "P&C Ad", "Radio", "Referral- Friend", "Referral- Patient", "Referral- study website", "Referral-Community Partner", "Referral-Physician", "Referral-VA", "Roper Recording", "Web Search", "Word of Mouth");        


	@FXML
	private void handleSubmitButtonAction(ActionEvent event) /*throws ParseException*/ {


		DataReadWrite writer = DataReadWrite.getInstance();

		try
		{
			consumePatientInfo();

			consumePartnerInfo();

			consumeHPOA();

			consumeSymptomsInfo(); 
			
			consumeMedicaInfo();		

		}
		catch(Exception e)
		{
			return;
		}

		try 
		{

			if (writer.writeRecord(partic, filePath))
			{
				Alert successWrite = new Alert(AlertType.INFORMATION, "Information successfully submitted to the Excel Spreadsheet.");
				successWrite.showAndWait();
			}
		} 
		catch (InvalidFormatException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert dateError = new Alert(AlertType.ERROR, "Unexpected Error. Contact IT Deptment");
			dateError.showAndWait();
		} 
		catch (FileNotFoundException e) 
		{
			//file in use error

			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert dateError = new Alert(AlertType.ERROR, "You have the Spreadsheet open. Please close the spreadsheet.");
			dateError.showAndWait();
		}
		catch (IOException e) 
		{

			//file not located in correct place error

			// TODO Auto-generated catch block
			e.printStackTrace();
			Alert dateError = new Alert(AlertType.ERROR, "Could not find spreadsheet.");
			dateError.showAndWait();
		}

	}


	private void consumePatientInfo() throws Exception
	{
		String subFirstName = "";
		String subMiddleInit = "";
		String subLastName = "";
		String subDOBStr = "";
		String subGender = "";
		String subRace = "";
		Date subDOB = new Date();
		String subAddress = "";
		String subAddress2 = "";
		String subCity = "";
		String subState = "";
		String subZip = "";
		String subEmail = "";
		String subPhone = "";
		String subCell = "";
		String subPCP = "";
		String subSpecialist = "";
		String subjectReferral = "";
		boolean mailList = false;

		VerifyRequiredFields(subDOBStr, subFirstName, subLastName, subLastName, subCell);

		subDOBStr = subjectDOBTxtBx.getText();

		subDOB = VerifyReqiuredDate(subDOBStr);
		subFirstName = subjectFirstNameTxtBx.getText();
		VerifyRequiredName(subFirstName);
		subMiddleInit = subjectMITxtBx.getText();
		subLastName = subjectLastNameTxtBx.getText();
		VerifyRequiredName(subLastName);
		subAddress = subjectAddressTxtBx.getText();
		subRace = race.getText();
		subGender = gender.getText();
		subCity = subjectCityTxtBx.getText();
		subState = subjectStateTxtBx.getText();
		subZip = subjectZipTxtBx.getText();
		subEmail = subjectEmailTxtBx.getText();
		VerifyEmail(subEmail);
		subPhone = subjectPhoneTxtBx.getText();
		subCell = subjectCellTxtBx.getText();
		VerifyParticipantPhone(subCell, subPhone);
		subPCP = subjectPcpTxtBx.getText();
		subSpecialist = subjectSpecialistTxtBx.getText();
		subjectReferral = subjectReferralDrpDn.getSelectionModel().getSelectedItem();
		mailList = subjectMailListStatusCkBxY.isSelected();

		partic.setFirstName(subFirstName);
		partic.setMiddleI(subMiddleInit);
		partic.setLastName(subLastName);
		partic.setDOB(subDOB);
		partic.setAddress(subAddress);
		//		partic.setAddress2(address2);
		partic.setCity(subCity);
		partic.setState(subState);
		partic.setZip(subZip);
		partic.setEmail(subEmail);
		partic.setPhone(subPhone);
		partic.setCell(subCell);
		partic.setPcp(subPCP);
		partic.setSpec(subSpecialist);
		partic.setReferral(subjectReferral);
		partic.setRace(subRace);
		partic.setGender(subGender);
		partic.setMailList(mailList);
	}


	private void consumePartnerInfo() throws Exception
	{
		//partner
		String partnerFirstName = "";
		String partnerLastName = "";
		String partnerHomePhone = "";
		String partnerEmail = "";
		String partnerRelation = "";
		boolean partnerStatus = false;

		//partner info
		partnerStatus = studyPartnerStatusTglBtn.isSelected();
		if(partnerStatus)
		{
			partnerFirstName = studyPartnerFirstNameTxtBx.getText();
			VerifyRequiredName(partnerFirstName);
			partnerLastName = studyPartnerLastNameTxtBx.getText();
			VerifyRequiredName(partnerLastName);
			partnerHomePhone = studyPartnerPhoneTxtBx.getText();
			VerifyPhone(partnerHomePhone);
			partnerEmail = studyPartnerEmailTxtBx.getText();
			VerifyEmail(partnerEmail);
			partnerRelation = studyPartnerRelationTxtBx.getText();
		}

		//partner info
		partic.setPartFirstname(partnerFirstName);
		partic.setPartLastName(partnerLastName);
		partic.setPartEmail(partnerEmail);
		partic.setPartPhone(partnerHomePhone);
		partic.setPartRel(partnerRelation);
	}



	private void consumeHPOA() throws Exception
	{

		//hopa
		String hpoaFirstName = "";
		String hpoaLastName = "";
		String hpoaHomePhone = "";
		String hpoaSpouseFirst = "";
		String hpoaSpouseLast = "";
		String hpoaSpousePhone = "";
		String hpoaChildFirst = "";
		String hpoaChildLast = "";
		String hpoaChilePhone = "";
		boolean hpoaStat = false;
		boolean hpoaMarriedStat = false;
		boolean hpoaChildStat = false;

		//hpoa
		hpoaStat = hpoaRadY.isSelected();
		if(hpoaStat)
		{
			hpoaFirstName = hpoaFirstNameTxtBx.getText();
			VerifyRequiredName(hpoaFirstName);
			hpoaLastName = hpoaLastNameTxtBx.getText();
			VerifyRequiredName(hpoaLastName);
			hpoaHomePhone = hpoaPhoneTxtBx.getText();
			VerifyPhone(hpoaHomePhone);
		}

		hpoaMarriedStat = hpoaMarriedStatusRadY.isSelected();
		if(hpoaMarriedStat)
		{
			hpoaSpouseFirst = hpoaSpouseFirstNameTxtBx.getText();
			VerifyRequiredName(hpoaSpouseFirst);
			hpoaSpouseLast = hpoaSpouseLastNameTxtBx.getText();
			VerifyRequiredName(hpoaSpouseLast);
			hpoaSpousePhone = hpoaSpousePhoneTxtBx.getText();
			VerifyPhone(hpoaSpousePhone);
		}

		hpoaChildStat = hpoaChildStatusRadY.isSelected();
		if(hpoaChildStat)
		{
			hpoaChildFirst = hpoaChildFirstNameTxtBx.getText();
			VerifyRequiredName(hpoaChildFirst);
			hpoaChildLast = hpoaChildLastNameTxtBx.getText();
			VerifyRequiredName(hpoaChildLast);
			hpoaChilePhone = hpoaChildPhoneTxtBx.getText();
			VerifyPhone(hpoaChilePhone);
		}


		//HPOA
		partic.setPoaFirstName(hpoaFirstName);
		partic.setPoaLastName(hpoaLastName);
		partic.setPoaPhone(hpoaHomePhone);
		partic.setSpouseFirstName(hpoaSpouseFirst);
		partic.setSpouseLastName(hpoaSpouseLast);
		partic.setSpousePhone(hpoaSpousePhone);
		partic.setChildFirstName(hpoaChildFirst);
		partic.setChildLastName(hpoaChildLast);
		partic.setChildPhone(hpoaChilePhone);
	}


	private void consumeSymptomsInfo() throws Exception
	{


		//Symptoms
		String familyHistoryRelationship = "";
		String memDiagnosis = "";
		String memClinician = "";

		boolean alzDiagnose = false;
		boolean agitation = false;
		boolean apathy = false;
		boolean sleepProblems = false;
		boolean memLoss = false;
		boolean memLossDisrupt = false;
		boolean difficultPlanning = false;
		boolean familiarTasks = false;
		boolean conversation = false;
		boolean famHistAlz = false;


		String symptDODStr = "";
		Date symptDOD = new Date();
		String symptDOOStr = "";
		Date symptDOO = new Date();
		String donepezilStartStr = "";
		Date donepezilStart = new Date();
		String donepezilEndStr = "";
		Date donepezilEnd = new Date();
		String memantineStartStr = "";
		Date memantineStart = new Date();
		String memantineEndStr = "";
		Date memantineEnd = new Date();
		String rivantigmineStartStr = "";
		Date rivantigmineStart = new Date();
		String rivantigmineEndStr = "";
		Date rivantigmineEnd = new Date();
		String galantamineStartStr = "";
		Date galantamineStart = new Date();
		String galantamineEndStr = "";
		Date galantamineEnd = new Date();
		String namzaricStartStr = "";
		Date namzaricStart = new Date();
		String namzaricEndStr = "";
		Date namzaricEnd = new Date();
		boolean donepezil = false;
		boolean memantine = false;
		boolean rivastigmine = false;
		boolean galantamine = false;
		boolean namzaric = false;


		//symptoms
		familyHistoryRelationship = alzFamHistoryStatusRelationTxtBx.getText();
		memDiagnosis = alzMemDiagnosisTxtBx.getText();
		memClinician = alzMemDiagnosisClinicianTxtBx.getText();

		symptDODStr = alzMemDiagnosisDateTxtBx.getText();
		symptDOD = VerifyNonReqiuredDate(symptDOOStr);

		alzDiagnose = alzMemStatusRadY.isSelected();
		agitation = alzMemAgitationRadY.isSelected();
		apathy = alzMemApathyRadY.isSelected();
		sleepProblems = alzMemSleepIssueRadY.isSelected();
		memLoss = memLossNotedRadY.isSelected();

		symptDOOStr = memLossNotedDateTxtBx.getText();
		symptDOO = VerifyNonReqiuredDate(symptDOOStr);

		memLossDisrupt = memLossDisruptRadY.isSelected();
		difficultPlanning = planSolveStatusRadY.isSelected();
		familiarTasks = tasksStatusRadY.isSelected();
		conversation = conversationStatusRadY.isSelected();
		famHistAlz = alzFamHistoryStatusRadY.isSelected();
		donepezil = donepezilStatusTglBtn.isSelected();


		donepezilStartStr = donepezilStartDateTxtBx.getText();
		donepezilStart = VerifyNonReqiuredDate(donepezilStartStr);

		donepezilEndStr = donepezilEndDateTxtBx.getText();
		donepezilEnd = VerifyNonReqiuredDate(donepezilEndStr);

		memantine = memantineStatusTglBtn.isSelected();

		memantineStartStr = memantineStartDateTxtBx.getText();
		memantineStart = VerifyNonReqiuredDate(memantineStartStr);

		memantineEndStr = memantineEndDateTxtBx.getText();
		memantineEnd = VerifyNonReqiuredDate(memantineEndStr);

		rivastigmine = rivastigmineStatusTglBtn.isSelected();

		rivantigmineStartStr = rivastigmineStartDateTxtBx.getText();
		rivantigmineStart = VerifyNonReqiuredDate(rivantigmineStartStr);

		rivantigmineEndStr = rivastigmineEndDateTxtBx.getText();
		rivantigmineEnd = VerifyNonReqiuredDate(rivantigmineEndStr);

		galantamine = galantamineStatusTglBtn.isSelected();

		galantamineStartStr = galantamineStartDateTxtBx.getText();
		galantamineStart = VerifyNonReqiuredDate(galantamineStartStr);

		galantamineEndStr = galantamineEndDateTxtBx.getText();
		galantamineEnd = VerifyNonReqiuredDate(galantamineEndStr);

		namzaric = nammzaricStatusTglBtn.isSelected();

		namzaricStartStr = nammzaricStartDateTxtBx.getText();
		namzaricStart = VerifyNonReqiuredDate(namzaricStartStr);

		namzaricEndStr = nammzaricEndDateTxtBx.getText();
		namzaricEnd = VerifyNonReqiuredDate(namzaricEndStr);


		//symptoms
		partic.setFamilyRelation(familyHistoryRelationship);
		partic.setDiagnosis(memDiagnosis);
		partic.setClinician(memClinician);
		partic.setDiagnosisDate(symptDOD);
		partic.setAgitation(agitation);
		partic.setApathy(apathy);
		partic.setSleepProblem(sleepProblems);
		partic.setMemoryLoss(memLoss);
		partic.setMemoryLossDate(symptDOO);
		partic.setMemoryDisruption(memLossDisrupt);
		partic.setProblemSolving(difficultPlanning);
		partic.setFamiliarTask(familiarTasks);
		partic.setProblemsConversations(conversation);
		partic.setFamilyHistory(famHistAlz);
		partic.setFamilyRelation(familyHistoryRelationship);
		partic.setAricept(donepezil);
		partic.setAriceptStartDate(donepezilStart);
		partic.setAriceptStopDate(donepezilEnd);
		partic.setNamenda(memantine);
		partic.setNamendaStartDate(memantineStart);
		partic.setNamendaStopDate(memantineEnd);
		partic.setExelon(rivastigmine);
		partic.setExelonStartDate(rivantigmineStart);
		partic.setExelonStopDate(rivantigmineEnd);
		partic.setRazadyne(galantamine);
		partic.setRazadyneStartDate(galantamineStart);
		partic.setRazadyneStopDate(galantamineEnd);
		partic.setAriceptNamenda(namzaric);
		partic.setAriceptNamendaStartDate(namzaricStart);
		partic.setAriceptNamendaStopDate(namzaricEnd);
	}


	private void consumeMedicaInfo() throws Exception
	{
		//Medical history
		String ongoingConcerns = "";
		String cancerType = "";
		boolean mentalDisorder = false;
		boolean sleepDisorder = false;
		boolean activeCancer = false;
		boolean pacemakerMRI = false;
		boolean drugAbuse = false;


		//medical history
		ongoingConcerns = ongoingHealthConcernsTxtBx.getText();
		cancerType = cancerStatusTypeTxtBx.getText();
		mentalDisorder = schizBiMddStatusRadY.isSelected();
		sleepDisorder = sleepDisorderStatusRadY.isSelected();
		activeCancer = cancerStatusRadY.isSelected();
		pacemakerMRI = deviseMRIConcernRadY.isSelected();
		drugAbuse = drugAlcoholStatusRadY.isSelected();


		//Medical History
		partic.setMentalIllness(mentalDisorder);
		partic.setSleepDisorder(sleepDisorder);
		partic.setCancerHistory(activeCancer);
		partic.setCancerType(cancerType);
		partic.setPacemakerMRI(pacemakerMRI);
		partic.setSubstanceAbuse(drugAbuse);
		partic.setOngoingIssues(ongoingConcerns);
	}



	@FXML
	private void handleClearButtonAction(ActionEvent event) 
	{
		clearForm();
	}



	private void clearForm() 
	{
		subjectFirstNameTxtBx.setText("");
		subjectMITxtBx.setText("");
		subjectLastNameTxtBx.setText("");
		subjectAddressTxtBx.setText("");
		subjectCityTxtBx.setText("");
		subjectStateTxtBx.setText("");
		subjectZipTxtBx.setText("");
		subjectEmailTxtBx.setText("");
		subjectPhoneTxtBx.setText("");
		subjectCellTxtBx.setText("");
		subjectPcpTxtBx.setText("");
		subjectSpecialistTxtBx.setText("");
		subjectReferralDrpDn.setValue(null);
		subjectDOBTxtBx.setText("");
	}

	public void setFilePath(String path)
	{
		filePath =  path;
	}


	private Date VerifyReqiuredDate(String tempDateStr) throws Exception
	{
		SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");
		Date tempDate;

		if (!tempDateStr.equals(""))
		{
			try 
			{
				dateParser.setLenient(false);
				tempDate = dateParser.parse(tempDateStr);


				return tempDate;
			}
			catch (ParseException e)
			{
				String msg = String.format("Date is not Valid: %s. \nPlease enter date as MM/DD/YYYY", tempDateStr);
				Alert dateError = new Alert(AlertType.ERROR, msg);
				dateError.showAndWait();
				throw new Exception ("Bad Date");
			}
		}

		//		New Stuff
		else
		{
			String msg = String.format("Please enter a Valid Date");
			Alert dateError = new Alert(AlertType.ERROR, msg);
			dateError.showAndWait();
			throw new Exception ("No Date");
		}
	}

	private void VerifyEmail(String tempEmail) throws Exception
	{
		boolean verifyFlag= false;

		if(!tempEmail.equals(""))
		{
			verifyFlag = CheckEmail(tempEmail);

			if (!verifyFlag)
			{
				String msg = String.format("Eamil Address -- %s -- is Invalid. \nPlease enter a Valid Email Address", tempEmail);
				Alert emailError = new Alert(AlertType.ERROR, msg);
				emailError.showAndWait();
				throw new Exception ("Bad Email");
			}
		}
	}



	private Date VerifyNonReqiuredDate(String tempDateStr) throws Exception
	{
		SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");
		Date tempDate;

		if (!tempDateStr.equals(""))
		{
			try 
			{
				dateParser.setLenient(false);
				tempDate = dateParser.parse(tempDateStr);


				return tempDate;
			}
			catch (ParseException e)
			{
				String msg = String.format("Date is not Valid: %s. \nPlease enter date as MM/DD/YYYY", tempDateStr);
				Alert dateError = new Alert(AlertType.ERROR, msg);
				dateError.showAndWait();
				throw new Exception ("Bad Date");
			}
		}

		return null;
	}



	private void VerifyParticipantPhone(String tempPhone1, String tempPhone2) throws Exception
	{
		//		boolean verifyFlag = false;


		//		verifyFlag = CheckPhone(tempPhone1);
		//		verify

		if(!CheckPhone(tempPhone1) && !CheckPhone(tempPhone2))
		{
			String msg = String.format("Valid Home Phone or Cell Phone Required.");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();
			throw new Exception ("Invalid homme or cell phone");
		}
	}

	private void VerifyPhone(String tempPhone1) throws Exception
	{
		//		boolean verifyFlag = false;
		//		
		//		verifyFlag = CheckPhone(tempPhone1);

		if(!tempPhone1.equals(""))
		{
			if(!CheckPhone(tempPhone1))
			{
				String msg = String.format("Phone Number not Valid: %s. \\nPlease enter a valid phone number", tempPhone1);
				Alert emailError = new Alert(AlertType.ERROR, msg);
				emailError.showAndWait();
				throw new Exception ("Invalid homme or cell phone");
			}
		}
	}

	private void VerifyRequiredFields(String tempFirstName, String tempLastName, String tempDate, String tempPhone1, String tempPhone2) throws Exception
	{
		if(tempFirstName.equals(""))
		{
			String msg = String.format("You must enter a First Name");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();
			throw new Exception ("Blank First Name");

		}

		if(tempLastName.equals(""))
		{
			String msg = String.format("You must enter a Last Name");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();
			throw new Exception ("Blank Last Name");
		}

		if(tempDate.equals(""))
		{
			String msg = String.format("You must enter a Date of Birth");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();
			throw new Exception ("No DOB");
		}

		if(tempPhone1.equals("") && tempPhone2.equals(""))
		{
			String msg = String.format("You must enter either a Home Phone or Cell Phone number");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();
			throw new Exception ("No Phone Number");
		}
	}



	private void VerifyRequiredName(String tempName) 
	{	
		if(tempName.equals(""))
		{
			String msg = String.format("You must enter a First and Last Name");
			Alert emailError = new Alert(AlertType.ERROR, msg);
			emailError.showAndWait();

		}
	}

	//	private void VerifyNonRequiredName(String tempName)
	//	{
	//		
	//		
	//		
	//		if(tempName.equals(""));
	//		{
	//			String msg = String.format("You must enter a First and Last Name");
	//			Alert emailError = new Alert(AlertType.ERROR, msg);
	//			emailError.showAndWait();
	//		}
	//	}





	//	method to grey-out unselected options
	//	@FXML
	//	private void OnClickStudyPartner(ActionEvent event) 
	//	{
	//		studyPartnerFirstNameTxtBx.setVisible(false);
	//	}


	@Override
	public void initialize(URL url, ResourceBundle rb) 
	{
		subjectReferralDrpDn.setItems(TYPE);
		// subjectReferralDrpDn.getSelectionModel().select(0);
	}    



	private boolean CheckEmail(String tempEmail)
	{	
		return tempEmail.matches("^[a-zA-Z_0-9-]@[a-zA-Z_0-9].[a-zA-Z]$");
	}


	private boolean CheckPhone(String tempPhone)
	{
		return tempPhone.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
	} 

	private boolean CheckName(String tempName)
	{
		return tempName.matches("^[a-zA-Z_0-9-]$");
	}


}
