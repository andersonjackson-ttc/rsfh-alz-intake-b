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
	String getLastName();
	Date getDOB();
	String getRace();
	char getGender();
	
	
}
