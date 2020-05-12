package edu.chengXian.bean;

public class bookorder {
	private String username;
	private String phone;
	private String creditcard;
	private String zipcode;
	private double total;
	@Override
	public String toString() {
		return "bookorder [username=" + username + ", phone=" + phone + ", creditcard=" + creditcard + ", zipcode="
				+ zipcode + ", total=" + total + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public bookorder(String username, String phone, String creditcard, String zipcode, double total) {
		super();
		this.username = username;
		this.phone = phone;
		this.creditcard = creditcard;
		this.zipcode = zipcode;
		this.total = total;
	}
	
	
	
	
	
}
