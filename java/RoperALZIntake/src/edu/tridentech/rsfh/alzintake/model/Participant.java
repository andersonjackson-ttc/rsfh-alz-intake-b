package edu.tridentech.rsfh.alzintake.model;

import java.util.Date;

import edu.tridentech.rsfh.alzintake.dao.PartRecord;

//participant record to be passed to dao

public class Participant implements PartRecord {
	
	private String middleI;
	private String firstName;
	private String lastName;
	private Date dob;
	private String race;
	private String gender;
	private String Email;
	private String referral;
	private String address;
	private String City;
	private String st;
	private String zipCode;
	private String phoneNum;
	private String cellNum;
	private String PCP;
	private String specialist;
	private boolean partner;
	private String partFirstname;
	private String partLastName;
	private String partPhone;
	private String partEmail;
	private String partRel;
	private boolean spouse;
	private String spouseFirstName;
	private String spouseLastName;
	private String spousePhone;
	private boolean child;
	private String childFirstName;
	private String childLastName;
	private String childPhone;
	private String address2;
	private Date intakeDate;
	private String diagnosis;
	private String clinician;
	private Date diagnosisDate;
	private boolean agitation;
	private boolean apathy;
	private boolean sleepProblem;
	private boolean memoryLoss;
	private Date memoryLossDate;
	private boolean memoryDisruption;
	private boolean problemSolving;
	private boolean familiarTask;
	private boolean problemsConversations;
	private boolean familyHistory;
	private String familyRelation;
	private boolean aricept;
	private Date ariceptStartDate;
	private Date ariceptStopDate;
	private boolean namenda;
	private Date namendaStartDate;
	private Date namendaStopDate;
	private boolean exelon;
	private Date exelonStartDate;
	private Date exelonStopDate;
	private boolean razadyne;
	private Date razadyneStartDate;
	private Date razadyneStopDate;
	private boolean ariceptNamenda;
	private Date ariceptNamendaStartDate;
	private Date ariceptNamendaStopDate;
	private boolean mentalIllness;
	private boolean sleepDisorder;
	private boolean cancerHistory;
	private String cancerType;
	private boolean pacemakerMRI;
	private boolean substanceAbuse;
	private String ongoingIssues;
	private boolean Hpoa;
	private String poaFirstName;
	private String poaLastName;
	private String poaPhone;

	String screener;
	
	@Override
	public String getScreener() {
		return screener;
	}

	@Override
	public void setScreener(String screen) {
		screener = screen;
	}

//Subject Information
	
	@Override
	public String getMiddleI() {
		return middleI;
	}

	@Override
	public void setMiddleI(String mi) {
		this.middleI = mi;
		
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String name) {
		this.firstName = name;
		
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String name) {
		this.lastName = name;
		
	}
	
	@Override
	public Date getDOB() {
		return dob;
	}

	@Override
	public void setDOB(Date dob) {
		this.dob = dob;
		
	}
	

	@Override
	public String getRace() {
		return race;
	}

	@Override
	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
		
	}

	@Override
	public String getEmail() {
		return Email;
	}

	@Override
	public void setEmail(String email) {
		this.Email = email;
		
	}
	
	@Override
	public String getReferral() {
		return referral;
	}

	@Override
	public void setReferral(String ref) {
		this.referral = ref;
		
	}
	
	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
		
	}
	
	@Override
	public String getCity() {
		return City;
	}

	@Override
	public void setCity(String city) {
		this.City = city;
		
	}

	@Override
	public String getState() {
		return st;
	}

	@Override
	public void setState(String state) {
		this.st = state;
		
	}
	
	@Override
	public String getZip() {
		return zipCode;
	}

	@Override
	public void setZip(String zip) {
		this.zipCode = zip;
		
	}

	@Override
	public String getPhone() {
		return phoneNum;
	}

	@Override
	public void setPhone(String phone) {
		this.phoneNum = phone;
		
	}
	
	@Override
	public String getCell() {
		return cellNum;
	}

	@Override
	public void setCell(String cell) {
		this.cellNum = cell;
				
	}
	
	@Override
	public String getPcp() {
		return PCP;
	}

	@Override
	public void setPcp(String pcp) {
		this.PCP = pcp;
		
	}

	@Override
	public String getSpec() {
		return specialist;
	}

	@Override
	public void setSpec(String spec) {
		this.specialist = spec;
		
	}
	
//Study Partner Information
	
	@Override
	public boolean getPartner() {
		return partner;
	}

	@Override
	public void setPartner(boolean prt) {
		this.partner = prt;
		
	}
	
	@Override
	public String getPartFirstName() {
		return partFirstname;
	}

	@Override
	public void setPartFirstname(String name) {
		this.partFirstname = name;
		
	}
	
	@Override
	public String getPartLastName() {
		return partLastName;
	}

	@Override
	public void setPartLastName(String name) {
		this.partLastName = name;
		
	}

	@Override
	public String getPartPhone() {
		return partPhone;
	}

	@Override
	public void setPartPhone(String phone) {
		this.partPhone = phone;
		
	}
	
	@Override
	public String getPartEmail() {
		return partEmail;
	}

	@Override
	public void setPartEmail(String email) {
		this.partEmail = email;
		
	}
	
	@Override
	public String getPartRel() {
		return partRel;
	}

	@Override
	public void setPartRel(String relation) {
		this.partRel = relation;
		
	}
	
//HPOA Information
	
	@Override
	public boolean getPoa() {
		return Hpoa;
	}

	@Override
	public void setPoa(boolean poa) {
		this.Hpoa = poa;
		
	}

	@Override
	public String getPoaFirstName() {
		return poaFirstName;
	}

	@Override
	public void setPoaFirstName(String poaFirstName) {
		this.poaFirstName = poaFirstName;
		
	}

	@Override
	public String getPoaLastName() {
		return poaLastName;
	}

	@Override
	public void setPoaLastName(String poaLastName) {
		this.poaLastName = poaLastName;
	}

	@Override
	public String getPoaPhone() {
		return poaPhone;
	}

	@Override
	public void setPoaPhone(String poaPhone) {
		this.poaPhone = poaPhone;
	}
	
	@Override
	public boolean getSpouse() {
		return spouse;
	}

	@Override
	public void setSpouse(boolean spo) {
		this.spouse = spo;
		
	}
	
	@Override
	public String getSpouseFistName() {
		return spouseFirstName;
	}

	@Override
	public void setSpouseFirstName(String name) {
		this.spouseFirstName = name;
		
	}
	
	@Override
	public String getSpouseLastName() {
		return spouseLastName;
	}

	@Override
	public void setSpouseLastName(String name) {
		this.spouseLastName = name;
		
	}

	@Override
	public String getSpousePhone() {
		return spousePhone;
	}

	@Override
	public void setSpousePhone(String phone) {
		this.spousePhone = phone;
		
	}

	@Override
	public boolean getChild() {
		return child;
	}

	@Override
	public void setChild(boolean child) {
		this.child = child;
		
	}
	@Override
	public String getChildFirstName() {
		return childFirstName;
	}

	@Override
	public void setChildFirstName(String name) {
		this.childFirstName = name;
		
	}

	
	@Override
	public String getChildLastName() {
		return childLastName;
	}

	@Override
	public void setChildLastName(String name) {
		this.childLastName = name;
		
	}
	
	@Override
	public String getChildPhone() {
		return childPhone;
	}

	@Override
	public void setChildPhone(String phone) {
		this.childPhone = phone;
		
	}
	
	@Override
	public String getAddress2() {
		return address2;
	}

	@Override
	public void setAddress2(String address) {
		this.address2 = address;
		
	}
	
//Symptoms

	@Override
	public Date getIntakeDate() {
		return intakeDate;
	}

	@Override
	public void setIntakeDate(Date intake) {
		this.intakeDate = intake;
		
	}
	
	@Override
	public String getDiagnosis() {
		return diagnosis;
	}

	@Override
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
		
	}
		
	@Override
	public String getClinician() {
		return clinician;
	}

	@Override
	public void setClinician(String clinician) {
		this.clinician = clinician;
		
	}

	@Override
	public Date getDiagnosisDate() {
		return diagnosisDate;
	}

	@Override
	public void setDiagnosisDate(Date diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
		
	}

	@Override
	public boolean getAgitation() {
		return agitation;
	}

	@Override
	public void setAgitation(boolean agitate) {
		this.agitation = agitate;
		
	}

	@Override
	public boolean getApathy() {
		return apathy;
	}

	@Override
	public void setApathy(boolean apathy) {
		this.apathy = apathy;
		
	}
	
	@Override
	public boolean getSleepProblem() {
		return sleepProblem;
	}

	@Override
	public void setSleepProblem(boolean sleep) {
		this.sleepProblem = sleep;
		
	}
	
	@Override
	public boolean getMemoryLoss() {
		return memoryLoss;
	}

	@Override
	public void setMemoryLoss(boolean memory) {
		this.memoryLoss = memory;
		
	}

	@Override
	public Date getMemoryLossDate() {
		return memoryLossDate;
	}

	@Override
	public void setMemoryLossDate(Date memoryLoss) {
		this.memoryLossDate = memoryLoss;
		
	}

	@Override
	public boolean getMemoryDisruption() {
		return memoryDisruption;
	}

	@Override
	public void setMemoryDisruption(boolean memoryDisruption) {
		this.memoryDisruption = memoryDisruption;
		
	}
	
	@Override
	public boolean getProblemSolving() {
		return problemSolving;
	}

	@Override
	public void setProblemSolving(boolean problemSolving) {
		this.problemSolving = problemSolving;
		
	}


	@Override
	public boolean getFamiliarTask() {
		return familiarTask;
	}

	@Override
	public void setFamiliarTask(boolean familiarTask) {
		this.familiarTask = familiarTask;
		
	}


	@Override
	public boolean getProblemsConversations() {
		return problemsConversations;
	}

	@Override
	public void setProblemsConversations(boolean conversation) {
		this.problemsConversations = conversation;
		
	}
	
	@Override
	public boolean getFamilyHistory() {
		return familyHistory;
	}

	@Override
	public void setFamilyHistory(boolean familyHistory) {
		this.familyHistory = familyHistory;
		
	}
	

	@Override
	public String getFamilyRelation() {
		return familyRelation;
	}

	@Override
	public void setFamilyRelation(String familyRealtion) {
		this.familyRelation = familyRealtion;
		
	}
	
	@Override
	public boolean getAricept() {
		return aricept;
	}

	@Override
	public void setAricept(boolean aricept) {
		this.aricept = aricept;
		
	}


	@Override
	public Date getAriceptStartDate() {
		return ariceptStartDate;
	}

	@Override
	public void setAriceptStartDate(Date ariceptStart) {
		this.ariceptStartDate = ariceptStart;
		
	}
	

	@Override
	public Date getAriceptStopDate() {
		return ariceptStopDate;
	}

	@Override
	public void setAriceptStopDate(Date ariceptStop) {
		this.ariceptStopDate = ariceptStop;
		
	}

	@Override
	public boolean getNamenda() {
		return namenda;
	}

	@Override
	public void setNamenda(boolean Namenda) {
		this.namenda = Namenda;
		
	}
	
	@Override
	public Date getNamendaStartDate() {
		return namendaStartDate;
	}

	@Override
	public void setNamendaStartDate(Date namendaStart) {
		this.namendaStartDate = namendaStart;
		
	}

	
	@Override
	public Date getNamendaStopDate() {
		return namendaStopDate;
	}

	@Override
	public void setNamendaStopDate(Date namendaStop) {
		this.namendaStopDate = namendaStop;
		
	}

	@Override
	public boolean getExelon() {
		return exelon;
	}

	@Override
	public void setExelon(boolean exelon) {
		this.exelon = exelon;
		
	}
	
	@Override
	public Date getExelonStartDate() {
		return exelonStartDate;
	}

	@Override
	public void setExelonStartDate(Date exelonStart) {
		this.exelonStartDate = exelonStart;
		
	}

	@Override
	public Date getExelonStopDate() {
		return exelonStopDate;
	}

	@Override
	public void setExelonStopDate(Date exelonStop) {
		this.exelonStopDate = exelonStop;
		
	}
	
	@Override
	public boolean getRazadyne() {
		return razadyne;
	}

	@Override
	public void setRazadyne(boolean razadyne) {
		this.razadyne = razadyne;
		
	}

	
	@Override
	public Date getRazadyneStartDate() {
		return razadyneStartDate;
	}

	@Override
	public void setRazadyneStartDate(Date razaydenStart) {
		this.razadyneStartDate = razaydenStart;
		 
	}
	
	@Override
	public Date getRazadyneStopDate() {
		return razadyneStopDate;
	}

	@Override
	public void setRazadyneStopDate(Date razadyneStop) {
		this.razadyneStopDate = razadyneStop;
		
	}

	@Override
	public boolean getAriceptNamenda() {
		return ariceptNamenda;
	}

	@Override
	public void setAriceptNamenda(boolean ariceptNamenda) {
		this.ariceptNamenda= ariceptNamenda;
		
	}
	
	@Override
	public Date getAriceptNamendaStartDate() {
		return ariceptNamendaStartDate;
	}

	@Override
	public void setAriceptNamendaStartDate(Date ariceptNamendaStart) {
		this.ariceptNamendaStartDate = ariceptNamendaStart;
		
	}

	@Override
	public Date getAriceptNamendaStopDate() {
		
		return ariceptNamendaStopDate;
	}

	@Override
	public void setAriceptNamendaStopDate(Date ariceptNamendaStop) {
		this.ariceptNamendaStopDate = ariceptNamendaStop;
		
	}
	
//Medical History

	@Override
	public boolean getMentalIllness() {
		
		return mentalIllness;
	}

	@Override
	public void setMentalIllness(boolean mentalIllness) {
		this.mentalIllness = mentalIllness;
		
	}

	@Override
	public boolean getSleedDisorder() {
		
		return sleepDisorder;
	}

	@Override
	public void setSleepDisorder(boolean sleepDisorder) {
		this.sleepDisorder = sleepDisorder;
		
	}

	@Override
	public boolean getCancerHistory() {
		return cancerHistory;
	}

	@Override
	public void setCancerHistory(boolean cancerHistory) {
		this.cancerHistory = cancerHistory;
		
	}

	@Override
	public String getCancerType() {
		return cancerType;
	}

	@Override
	public void setCancerType(String cancerType) {
		this.cancerType = cancerType;
		
	}

	@Override
	public boolean getPacemakerMRI() {
		return pacemakerMRI;
	}

	@Override
	public void setPacemakerMRI(boolean pacemakerMRI) {
		this.pacemakerMRI = pacemakerMRI;
		
	}

	@Override
	public boolean getSubstanceAbuse() {
		return substanceAbuse;
	}

	@Override
	public void setSubstanceAbuse(boolean substanceAbuse) {
		this.substanceAbuse = substanceAbuse;		
	}

	@Override
	public String getOngoingIssues() {
		return ongoingIssues;
	}

	@Override
	public void setOngoingIssues(String ongoingIssues) {
		this.ongoingIssues = ongoingIssues;
		
	}
	

}
