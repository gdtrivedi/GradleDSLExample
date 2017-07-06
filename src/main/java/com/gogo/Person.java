package com.gogo;
import java.io.Serializable;

/**
 * 
 */

/**
 * @author gtrivedi
 *
 */
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3378342148307597118L;
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
