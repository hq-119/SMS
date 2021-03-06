package com.example.sms;

public class Contact {
	private int id;
	private String name;
	private String phoneNumber;
	
	/* Constructors */
	public Contact(int id, String name, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Contact(Contact ct){
		this(ct.id, ct.name, ct.phoneNumber);
	}
	/* End Constructor */

	
	/* Getter and Setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/* End Getter and Setter */
	
	public boolean equals(Contact ct){
		return (ct.name==name)
				&& (ct.phoneNumber==phoneNumber);
	}
}
