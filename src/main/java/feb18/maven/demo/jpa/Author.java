package feb18.maven.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	@Id
	@Column(name = "authorId")
	private int aid;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "middleName")
	private String middleName;

	@Column(name = "phoneNo")
	private String phoneNo;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Author() {
		super();
	}

	public Author(int aid, String firstName, String middleName, String lastName, String phoneNo) {
		super();
		this.aid = aid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", phoneNo=" + phoneNo + "]";
	}

}
