/**
 * Used for testing RSFH DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

public class ParticipentTest implements PartRecord
{
	private String firstName;
	private String lastName;
	private Date DOB;
	private String race;
	private char gender;
	
	
	public ParticipentTest()
	{
		firstName = "Kevin";
		lastName = "Franks";
		DOB = new Date(06/05/1969);
		race = "Alien";
		gender = 'C';
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public Date getDOB() {
		// TODO Auto-generated method stub
		return DOB;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return race;
	}

	@Override
	public char getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	
}
