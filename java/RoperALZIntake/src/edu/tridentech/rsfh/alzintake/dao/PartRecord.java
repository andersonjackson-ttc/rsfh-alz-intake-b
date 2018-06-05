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
	String getGender();
	
	
}
