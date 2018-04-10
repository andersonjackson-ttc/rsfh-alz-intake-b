/**
 * Interface for access to the database through the DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

public interface DbObject 
{
	boolean saveRecord(PartRecord pr);
	boolean updateRecord(PartRecord pr);
	PartRecord findRecord(int idNum);
	PartRecord findRecord(String lastName, int phone);
	PartRecord findRecord(String lastName, Date dob);
}
