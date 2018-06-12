/**
 * Used for implementing the Participant Object to the DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

public interface PartRecord  
{
	String getScreener();
	void setScreener(String screen);
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
	
	
}
