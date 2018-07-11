/**
 * Used for implementing the Participant Object to the DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

public interface PartRecord  
{
	
	// Header fields
	String getScreener();
	void setScreener(String screen);
	Date getIntakeDate();
	void setIntakeDate(Date intake);
	
	// Subject Info Fields
	String getMiddleI();
	void setMiddleI(String mi);
	String getFirstName();
	void setFirstName(String name);
	String getLastName();
	void setLastName(String name);
	Date getDOB();
	void setDOB(Date dob);
	String getRace();
	void setRace(String race);
	String getGender();
	void setGender(String gender);
	String getEmail();
	void setEmail(String email);
	String getReferral();
	void setReferral(String ref);
	String getAddress();
	void setAddress(String address);
	String getAddress2();
	void setAddress2(String Address2);
	String getCity();
	void setCity(String city);
	String getState();
	void setState(String state);
	String getZip();
	void setZip(String zip);
	String getPhone();
	void setPhone(String phone);
	String getCell();
	void setCell(String cell);
	String getPcp();
	void setPcp(String pcp);
	String getSpec();
	void setSpec(String spec);
	boolean getMailList();
	void setMailList(boolean mailList);
	
	// Study Partner Fields
	boolean getPartner();
	void setPartner(boolean prt);
	String getPartFirstName();
	void setPartFirstname(String name);
	String getPartLastName();
	void setPartLastName(String name);
	String getPartPhone();
	void setPartPhone(String phone);
	String getPartEmail();
	void setPartEmail(String email);
	String getPartRel();
	void setPartRel(String relation);
	
	//POA fields
	boolean getPoa();
	void setPoa(boolean poa);
	String getPoaFirstName();
	void setPoaFirstName(String poaFirstName);
	String getPoaLastName();
	void setPoaLastName(String poaLastName);
	String getPoaPhone();
	void setPoaPhone(String poaPhone);
	boolean getSpouse();
	void setSpouse(boolean spo);
	String getSpouseFistName();
	void setSpouseFirstName(String name);
	String getSpouseLastName();
	void setSpouseLastName(String name);
	String getSpousePhone();
	void setSpousePhone(String phone);
	boolean getChild();
	void setChild(boolean child);
	String getChildFirstName();
	void setChildFirstName(String name);
	String getChildLastName();
	void setChildLastName(String name);
	String getChildPhone();
	void setChildPhone(String phone);
	
	// Symptoms Fields
	String getDiagnosis();
	void setDiagnosis(String diagnosis);
	String getClinician();
	void setClinician(String clinician);
	Date getDiagnosisDate();
	void setDiagnosisDate(Date diagnosisDate);
	boolean getAgitation();
	void setAgitation(boolean agitate);
	boolean getApathy();
	void setApathy(boolean apathy);
	boolean getSleepProblem();
	void setSleepProblem(boolean sleep);
	boolean getMemoryLoss();
	void setMemoryLoss(boolean memory);
	Date getMemoryLossDate();
	void setMemoryLossDate(Date memoryLoss);
	boolean getMemoryDisruption();
	void setMemoryDisruption(boolean memoryDisruption);
	boolean getProblemSolving();
	void setProblemSolving(boolean problemSolving);
	boolean getFamiliarTask();
	void setFamiliarTask(boolean familiarTask);
	boolean getProblemsConversations();
	void setProblemsConversations(boolean conversation);
	boolean getFamilyHistory();
	void setFamilyHistory(boolean familyHistory);
	String getFamilyRelation();
	void setFamilyRelation(String familyRealtion);
	
	// Drug Sections
	boolean getAricept();
	void setAricept(boolean aricept);
	Date getAriceptStartDate();
	void setAriceptStartDate(Date ariceptStart);
	Date getAriceptStopDate();
	void setAriceptStopDate(Date ariceptStop);
	boolean getNamenda();
	void setNamenda(boolean Namenda);
	Date getNamendaStartDate();
	void setNamendaStartDate(Date namendaStart);
	Date getNamendaStopDate();
	void setNamendaStopDate(Date namendaStop);
	boolean getExelon();
	void setExelon(boolean exelon);
	Date getExelonStartDate();
	void setExelonStartDate(Date exelonStart);
	Date getExelonStopDate();
	void setExelonStopDate(Date exelonStop);
	boolean getRazadyne();
	void setRazadyne(boolean razadyne);
	Date getRazadyneStartDate();
	void setRazadyneStartDate(Date razaydenStart);
	Date getRazadyneStopDate();
	void setRazadyneStopDate(Date razadyneStop);
	boolean getAriceptNamenda();
	void setAriceptNamenda(boolean ariceptNamenda);
	Date getAriceptNamendaStartDate();
	void setAriceptNamendaStartDate(Date ariceptNamendaStart);
	Date getAriceptNamendaStopDate();
	void setAriceptNamendaStopDate(Date ariceptNamendaStop);
	
	//Medical History Fields
	boolean getMentalIllness();
	void setMentalIllness(boolean mentalIllness);
	boolean getSleedDisorder();
	void setSleepDisorder(boolean sleepDisorder);
	boolean getCancerHistory();
	void setCancerHistory(boolean cancerHistory);
	String getCancerType();
	void setCancerType(String cancerType);
	boolean getPacemakerMRI();
	void setPacemakerMRI(boolean pacemakerMRI);
	boolean getSubstanceAbuse();
	void setSubstanceAbuse(boolean substanceAbuse);
	String getOngoingIssues();
	void setOngoingIssues(String ongoingIssues);
	
	
	
	
	
	
	
	
	
}
