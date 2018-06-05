/**
 * Used for implementing the Participant Object to the DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

public interface PartRecord  
{
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
	void setReferral(String reffer);
	String getAddress();
	void setAddress(String address);
	String getPhone();
	void setPhone(String phone);
	String getCellPhone();
	void setCellPhone(String cellPhone);
	String getSpec();
	void setSpec(String spec);
	String getStdyFirst();
	void setStdyFirst(String stdyFirst);
	String getStdyLast();
	void setStdyLast(String stdyLast);
	String getStdyPhone();
	void setStdyPhone(String phone);
	String getStdyEmail();
	void setStdyEmail(String email);
	String getStdyRelation();
	void setStdyRelation(String stdyRelation);
	boolean getPOA();
	void setPOA(boolean POA);
	String getPOAFirst();
	void setPOAFirst(String name);
	String getPOALast();
	void setPOALast(String lastName);
	boolean getSpouse();
	void setSpouse(boolean POA);
	String getSpouseFirst();
	void setSpouseFirst(String name);
	String getSpouseLast();
	void setSpouseLast(String lastName);
	boolean getChild();
	void setChild(boolean POA);
	String getChildFirst();
	void setChildFirst(String name);
	String getChildLast();
	void setChildLast(String lastName);
}
