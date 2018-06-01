package edu.tridentech.rsfh.alzintake.model;

import java.util.Date;

public class Participant 
{	
	//Variables for the intake form
	private String
	//Subject Variables
	subjectFirstName,
	subjectLastName,
	subjectMI,
	subjectAddress,
	subjectCity,
	subjectState,
	subjectZip,
	subjectEmail,
	subjectPhone,
	subjectCell,
	subjectReferralDrpDn,
	subjectPcp,
	subjectSpecialist,
	//Study Partner Variables
	studyPartnerFirstName,
	studyPartnerLastName,
	studyPartnerRelation,
	studyPartnerPhone,
	studyPartnerEmail,
	//Healthcare Power of Attorney Variables
	hpoaFirstName,
	hpoaLastName,
	hpoaPhone,
	hpoaSpouseFirstName,
	hpoaSpouseLastName,
	hpoaSpousePhone,
	hpoaChildFirstName,
	hpoaChildLastName, 
	hpoaChildPhone,
	//Symptoms Variables
	alzMemDiagnosis,
	alzMemDiagnosisClinician,
	alzFamHistoryStatusRelation,
	//Medical History Variables
	cancerStatusType,
	ongoingHealthConcerns,
	//Roper Staff Variables
	rsfhClinRecommends,
	intakeScreenByDrpDn;
	
	public String getSubjectFirstName() {
		return subjectFirstName;
	}

	public void setSubjectFirstName(String subjectFirstName) {
		this.subjectFirstName = subjectFirstName;
	}

	public String getSubjectLastName() {
		return subjectLastName;
	}

	public void setSubjectLastName(String subjectLastName) {
		this.subjectLastName = subjectLastName;
	}

	public String getSubjectMI() {
		return subjectMI;
	}

	public void setSubjectMI(String subjectMI) {
		this.subjectMI = subjectMI;
	}

	public String getSubjectAddress() {
		return subjectAddress;
	}

	public void setSubjectAddress(String subjectAddress) {
		this.subjectAddress = subjectAddress;
	}

	public String getSubjectCity() {
		return subjectCity;
	}

	public void setSubjectCity(String subjectCity) {
		this.subjectCity = subjectCity;
	}

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

	public String getSubjectZip() {
		return subjectZip;
	}

	public void setSubjectZip(String subjectZip) {
		this.subjectZip = subjectZip;
	}

	public String getSubjectEmail() {
		return subjectEmail;
	}

	public void setSubjectEmail(String subjectEmail) {
		this.subjectEmail = subjectEmail;
	}

	public String getSubjectPhone() {
		return subjectPhone;
	}

	public void setSubjectPhone(String subjectPhone) {
		this.subjectPhone = subjectPhone;
	}

	public String getSubjectCell() {
		return subjectCell;
	}

	public void setSubjectCell(String subjectCell) {
		this.subjectCell = subjectCell;
	}

	public String getSubjectReferralDrpDn() {
		return subjectReferralDrpDn;
	}

	public void setSubjectReferralDrpDn(String subjectReferralDrpDn) {
		this.subjectReferralDrpDn = subjectReferralDrpDn;
	}

	public String getSubjectPcp() {
		return subjectPcp;
	}

	public void setSubjectPcp(String subjectPcp) {
		this.subjectPcp = subjectPcp;
	}

	public String getSubjectSpecialist() {
		return subjectSpecialist;
	}

	public void setSubjectSpecialist(String subjectSpecialist) {
		this.subjectSpecialist = subjectSpecialist;
	}

	public String getStudyPartnerFirstName() {
		return studyPartnerFirstName;
	}

	public void setStudyPartnerFirstName(String studyPartnerFirstName) {
		this.studyPartnerFirstName = studyPartnerFirstName;
	}

	public String getStudyPartnerLastName() {
		return studyPartnerLastName;
	}

	public void setStudyPartnerLastName(String studyPartnerLastName) {
		this.studyPartnerLastName = studyPartnerLastName;
	}

	public String getStudyPartnerRelation() {
		return studyPartnerRelation;
	}

	public void setStudyPartnerRelation(String studyPartnerRelation) {
		this.studyPartnerRelation = studyPartnerRelation;
	}

	public String getStudyPartnerPhone() {
		return studyPartnerPhone;
	}

	public void setStudyPartnerPhone(String studyPartnerPhone) {
		this.studyPartnerPhone = studyPartnerPhone;
	}

	public String getStudyPartnerEmail() {
		return studyPartnerEmail;
	}

	public void setStudyPartnerEmail(String studyPartnerEmail) {
		this.studyPartnerEmail = studyPartnerEmail;
	}

	public String getHpoaFirstName() {
		return hpoaFirstName;
	}

	public void setHpoaFirstName(String hpoaFirstName) {
		this.hpoaFirstName = hpoaFirstName;
	}

	public String getHpoaLastName() {
		return hpoaLastName;
	}

	public void setHpoaLastName(String hpoaLastName) {
		this.hpoaLastName = hpoaLastName;
	}

	public String getHpoaPhone() {
		return hpoaPhone;
	}

	public void setHpoaPhone(String hpoaPhone) {
		this.hpoaPhone = hpoaPhone;
	}

	public String getHpoaSpouseFirstName() {
		return hpoaSpouseFirstName;
	}

	public void setHpoaSpouseFirstName(String hpoaSpouseFirstName) {
		this.hpoaSpouseFirstName = hpoaSpouseFirstName;
	}

	public String getHpoaSpouseLastName() {
		return hpoaSpouseLastName;
	}

	public void setHpoaSpouseLastName(String hpoaSpouseLastName) {
		this.hpoaSpouseLastName = hpoaSpouseLastName;
	}

	public String getHpoaSpousePhone() {
		return hpoaSpousePhone;
	}

	public void setHpoaSpousePhone(String hpoaSpousePhone) {
		this.hpoaSpousePhone = hpoaSpousePhone;
	}

	public String getHpoaChildFirstName() {
		return hpoaChildFirstName;
	}

	public void setHpoaChildFirstName(String hpoaChildFirstName) {
		this.hpoaChildFirstName = hpoaChildFirstName;
	}

	public String getHpoaChildLastName() {
		return hpoaChildLastName;
	}

	public void setHpoaChildLastName(String hpoaChildLastName) {
		this.hpoaChildLastName = hpoaChildLastName;
	}

	public String getHpoaChildPhone() {
		return hpoaChildPhone;
	}

	public void setHpoaChildPhone(String hpoaChildPhone) {
		this.hpoaChildPhone = hpoaChildPhone;
	}

	public String getAlzMemDiagnosis() {
		return alzMemDiagnosis;
	}

	public void setAlzMemDiagnosis(String alzMemDiagnosis) {
		this.alzMemDiagnosis = alzMemDiagnosis;
	}

	public String getAlzMemDiagnosisClinician() {
		return alzMemDiagnosisClinician;
	}

	public void setAlzMemDiagnosisClinician(String alzMemDiagnosisClinician) {
		this.alzMemDiagnosisClinician = alzMemDiagnosisClinician;
	}

	public String getAlzFamHistoryStatusRelation() {
		return alzFamHistoryStatusRelation;
	}

	public void setAlzFamHistoryStatusRelation(String alzFamHistoryStatusRelation) {
		this.alzFamHistoryStatusRelation = alzFamHistoryStatusRelation;
	}

	public String getCancerStatusType() {
		return cancerStatusType;
	}

	public void setCancerStatusType(String cancerStatusType) {
		this.cancerStatusType = cancerStatusType;
	}

	public String getOngoingHealthConcerns() {
		return ongoingHealthConcerns;
	}

	public void setOngoingHealthConcerns(String ongoingHealthConcerns) {
		this.ongoingHealthConcerns = ongoingHealthConcerns;
	}

	public String getRsfhClinRecommends() {
		return rsfhClinRecommends;
	}

	public void setRsfhClinRecommends(String rsfhClinRecommends) {
		this.rsfhClinRecommends = rsfhClinRecommends;
	}

	public String getIntakeScreenByDrpDn() {
		return intakeScreenByDrpDn;
	}

	public void setIntakeScreenByDrpDn(String intakeScreenByDrpDn) {
		this.intakeScreenByDrpDn = intakeScreenByDrpDn;
	}

	public Boolean getSubjectMailListStatus() {
		return subjectMailListStatus;
	}

	public void setSubjectMailListStatus(Boolean subjectMailListStatus) {
		this.subjectMailListStatus = subjectMailListStatus;
	}

	public Boolean getStudyPartnerStatus() {
		return studyPartnerStatus;
	}

	public void setStudyPartnerStatus(Boolean studyPartnerStatus) {
		this.studyPartnerStatus = studyPartnerStatus;
	}

	public Boolean getHpoaStatus() {
		return hpoaStatus;
	}

	public void setHpoaStatus(Boolean hpoaStatus) {
		this.hpoaStatus = hpoaStatus;
	}

	public Boolean getHpoaMarriedStatus() {
		return hpoaMarriedStatus;
	}

	public void setHpoaMarriedStatus(Boolean hpoaMarriedStatus) {
		this.hpoaMarriedStatus = hpoaMarriedStatus;
	}

	public Boolean getHpoaChildStatus() {
		return hpoaChildStatus;
	}

	public void setHpoaChildStatus(Boolean hpoaChildStatus) {
		this.hpoaChildStatus = hpoaChildStatus;
	}

	public Boolean getAlzMemStatus() {
		return alzMemStatus;
	}

	public void setAlzMemStatus(Boolean alzMemStatus) {
		this.alzMemStatus = alzMemStatus;
	}

	public Boolean getAlzMemAgitation() {
		return alzMemAgitation;
	}

	public void setAlzMemAgitation(Boolean alzMemAgitation) {
		this.alzMemAgitation = alzMemAgitation;
	}

	public Boolean getAlzMemApathy() {
		return alzMemApathy;
	}

	public void setAlzMemApathy(Boolean alzMemApathy) {
		this.alzMemApathy = alzMemApathy;
	}

	public Boolean getAlzMemSleepIssue() {
		return alzMemSleepIssue;
	}

	public void setAlzMemSleepIssue(Boolean alzMemSleepIssue) {
		this.alzMemSleepIssue = alzMemSleepIssue;
	}

	public Boolean getMemLossNoted() {
		return memLossNoted;
	}

	public void setMemLossNoted(Boolean memLossNoted) {
		this.memLossNoted = memLossNoted;
	}

	public Boolean getMemLossDisrupt() {
		return memLossDisrupt;
	}

	public void setMemLossDisrupt(Boolean memLossDisrupt) {
		this.memLossDisrupt = memLossDisrupt;
	}

	public Boolean getPlanSolveStatus() {
		return planSolveStatus;
	}

	public void setPlanSolveStatus(Boolean planSolveStatus) {
		this.planSolveStatus = planSolveStatus;
	}

	public Boolean getTasksStatus() {
		return tasksStatus;
	}

	public void setTasksStatus(Boolean tasksStatus) {
		this.tasksStatus = tasksStatus;
	}

	public Boolean getConversationStatus() {
		return conversationStatus;
	}

	public void setConversationStatus(Boolean conversationStatus) {
		this.conversationStatus = conversationStatus;
	}

	public Boolean getAlzFamHistoryStatus() {
		return alzFamHistoryStatus;
	}

	public void setAlzFamHistoryStatus(Boolean alzFamHistoryStatus) {
		this.alzFamHistoryStatus = alzFamHistoryStatus;
	}

	public Boolean getDonepezilStatus() {
		return donepezilStatus;
	}

	public void setDonepezilStatus(Boolean donepezilStatus) {
		this.donepezilStatus = donepezilStatus;
	}

	public Boolean getMemantineStatus() {
		return memantineStatus;
	}

	public void setMemantineStatus(Boolean memantineStatus) {
		this.memantineStatus = memantineStatus;
	}

	public Boolean getRivastigmineStatus() {
		return rivastigmineStatus;
	}

	public void setRivastigmineStatus(Boolean rivastigmineStatus) {
		this.rivastigmineStatus = rivastigmineStatus;
	}

	public Boolean getGalantamineStatus() {
		return galantamineStatus;
	}

	public void setGalantamineStatus(Boolean galantamineStatus) {
		this.galantamineStatus = galantamineStatus;
	}

	public Boolean getNammzaricStatus() {
		return nammzaricStatus;
	}

	public void setNammzaricStatus(Boolean nammzaricStatus) {
		this.nammzaricStatus = nammzaricStatus;
	}

	public Boolean getSchizBiMddStatus() {
		return schizBiMddStatus;
	}

	public void setSchizBiMddStatus(Boolean schizBiMddStatus) {
		this.schizBiMddStatus = schizBiMddStatus;
	}

	public Boolean getSleepDisorderStatus() {
		return sleepDisorderStatus;
	}

	public void setSleepDisorderStatus(Boolean sleepDisorderStatus) {
		this.sleepDisorderStatus = sleepDisorderStatus;
	}

	public Boolean getCancerStatus() {
		return cancerStatus;
	}

	public void setCancerStatus(Boolean cancerStatus) {
		this.cancerStatus = cancerStatus;
	}

	public Boolean getDeviseMRIConcern() {
		return deviseMRIConcern;
	}

	public void setDeviseMRIConcern(Boolean deviseMRIConcern) {
		this.deviseMRIConcern = deviseMRIConcern;
	}

	public Boolean getDrugAlcoholStatus() {
		return drugAlcoholStatus;
	}

	public void setDrugAlcoholStatus(Boolean drugAlcoholStatus) {
		this.drugAlcoholStatus = drugAlcoholStatus;
	}

	public Boolean getRsfhIntakeDbStatus() {
		return rsfhIntakeDbStatus;
	}

	public void setRsfhIntakeDbStatus(Boolean rsfhIntakeDbStatus) {
		this.rsfhIntakeDbStatus = rsfhIntakeDbStatus;
	}

	public Boolean getRsfhChartStatus() {
		return rsfhChartStatus;
	}

	public void setRsfhChartStatus(Boolean rsfhChartStatus) {
		this.rsfhChartStatus = rsfhChartStatus;
	}

	public Boolean getRsfhScheduledVisitStatus() {
		return rsfhScheduledVisitStatus;
	}

	public void setRsfhScheduledVisitStatus(Boolean rsfhScheduledVisitStatus) {
		this.rsfhScheduledVisitStatus = rsfhScheduledVisitStatus;
	}

	public Boolean getRsfhSentConfirmationStatus() {
		return rsfhSentConfirmationStatus;
	}

	public void setRsfhSentConfirmationStatus(Boolean rsfhSentConfirmationStatus) {
		this.rsfhSentConfirmationStatus = rsfhSentConfirmationStatus;
	}

	public Boolean getRsfhObtainRoiStatus() {
		return rsfhObtainRoiStatus;
	}

	public void setRsfhObtainRoiStatus(Boolean rsfhObtainRoiStatus) {
		this.rsfhObtainRoiStatus = rsfhObtainRoiStatus;
	}

	public Boolean getRsfhFaxRoiStatus() {
		return rsfhFaxRoiStatus;
	}

	public void setRsfhFaxRoiStatus(Boolean rsfhFaxRoiStatus) {
		this.rsfhFaxRoiStatus = rsfhFaxRoiStatus;
	}

	public Boolean getRsfhFileStatus() {
		return rsfhFileStatus;
	}

	public void setRsfhFileStatus(Boolean rsfhFileStatus) {
		this.rsfhFileStatus = rsfhFileStatus;
	}

	public int getSubjectAge() {
		return subjectAge;
	}

	public void setSubjectAge(int subjectAge) {
		this.subjectAge = subjectAge;
	}

	public Date getIntakeScreenDate() {
		return intakeScreenDate;
	}

	public void setIntakeScreenDate(Date intakeScreenDate) {
		this.intakeScreenDate = intakeScreenDate;
	}

	public Date getSubjectDOB() {
		return subjectDOB;
	}

	public void setSubjectDOB(Date subjectDOB) {
		this.subjectDOB = subjectDOB;
	}

	public Date getAlzMemDiagnosisDate() {
		return alzMemDiagnosisDate;
	}

	public void setAlzMemDiagnosisDate(Date alzMemDiagnosisDate) {
		this.alzMemDiagnosisDate = alzMemDiagnosisDate;
	}

	public Date getMemLossNotedDate() {
		return memLossNotedDate;
	}

	public void setMemLossNotedDate(Date memLossNotedDate) {
		this.memLossNotedDate = memLossNotedDate;
	}

	public Date getDonepezilStartDate() {
		return donepezilStartDate;
	}

	public void setDonepezilStartDate(Date donepezilStartDate) {
		this.donepezilStartDate = donepezilStartDate;
	}

	public Date getDonepezilEndDate() {
		return donepezilEndDate;
	}

	public void setDonepezilEndDate(Date donepezilEndDate) {
		this.donepezilEndDate = donepezilEndDate;
	}

	public Date getMemantineStartDate() {
		return memantineStartDate;
	}

	public void setMemantineStartDate(Date memantineStartDate) {
		this.memantineStartDate = memantineStartDate;
	}

	public Date getMemantineEndDate() {
		return memantineEndDate;
	}

	public void setMemantineEndDate(Date memantineEndDate) {
		this.memantineEndDate = memantineEndDate;
	}

	public Date getRivastigmineStartDate() {
		return rivastigmineStartDate;
	}

	public void setRivastigmineStartDate(Date rivastigmineStartDate) {
		this.rivastigmineStartDate = rivastigmineStartDate;
	}

	public Date getRivastigmineEndDate() {
		return rivastigmineEndDate;
	}

	public void setRivastigmineEndDate(Date rivastigmineEndDate) {
		this.rivastigmineEndDate = rivastigmineEndDate;
	}

	public Date getGalantamineStartDate() {
		return galantamineStartDate;
	}

	public void setGalantamineStartDate(Date galantamineStartDate) {
		this.galantamineStartDate = galantamineStartDate;
	}

	public Date getGalantamineEndDate() {
		return galantamineEndDate;
	}

	public void setGalantamineEndDate(Date galantamineEndDate) {
		this.galantamineEndDate = galantamineEndDate;
	}

	public Date getNammzaricStartDate() {
		return nammzaricStartDate;
	}

	public void setNammzaricStartDate(Date nammzaricStartDate) {
		this.nammzaricStartDate = nammzaricStartDate;
	}

	public Date getNammzaricEndDate() {
		return nammzaricEndDate;
	}

	public void setNammzaricEndDate(Date nammzaricEndDate) {
		this.nammzaricEndDate = nammzaricEndDate;
	}

	public Date getRsfhClinAssessDate() {
		return rsfhClinAssessDate;
	}

	public void setRsfhClinAssessDate(Date rsfhClinAssessDate) {
		this.rsfhClinAssessDate = rsfhClinAssessDate;
	}

	private Boolean
	//Subject Variables
	subjectMailListStatus, 
	studyPartnerStatus,
	//Healthcare Power of Attorney Variables
	hpoaStatus,
	hpoaMarriedStatus,
	hpoaChildStatus,
	//Symptoms Variables
	alzMemStatus,
	alzMemAgitation,
	alzMemApathy,
	alzMemSleepIssue,
	memLossNoted,
	memLossDisrupt,
	planSolveStatus,
	tasksStatus,
	conversationStatus,
	alzFamHistoryStatus,
	donepezilStatus,
	memantineStatus,
	rivastigmineStatus,
	galantamineStatus,
	nammzaricStatus,
	//Medical History Variables
	schizBiMddStatus,
	sleepDisorderStatus,
	cancerStatus,
	deviseMRIConcern,
	drugAlcoholStatus,
	//Roper Staff Variables
	rsfhIntakeDbStatus,
	rsfhChartStatus,
	rsfhScheduledVisitStatus,
	rsfhSentConfirmationStatus,
	rsfhObtainRoiStatus,
	rsfhFaxRoiStatus,
	rsfhFileStatus;
	
	private int
	subjectAge;

	private Date 
	intakeScreenDate,
	subjectDOB,
	alzMemDiagnosisDate,
	memLossNotedDate,
	donepezilStartDate,
	donepezilEndDate,
	memantineStartDate,
	memantineEndDate,
	rivastigmineStartDate,
	rivastigmineEndDate,
	galantamineStartDate,
	galantamineEndDate,
	nammzaricStartDate,
	nammzaricEndDate,
	rsfhClinAssessDate;
	
	public Participant(String first, String last)
	{
		subjectFirstName = first;
		subjectLastName = last;
	}
}
