package database.hibernate.test.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private int userID;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "City")
	private String city;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "Email")
	private String email;

	public User() {

	}

	public User(String firstName, String city, String phone, String email) {
		this.firstName = firstName;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.userID + ", " + this.firstName + ", " + this.city + ", " + this.phone + ", " + this.email;
	}

}
