package edu.chengXian.bean;


public class titles {
	private String isbn;
	private String title;
	private int editionNumber;
	private String copyright;
	private int publisherId;
	private String imageFile;
	private double price;
	private String summary;
	public titles(String isbn, String title, int editionNumber, String copyright, int publisherId, String imageFile,
			double price, String summary) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.editionNumber = editionNumber;
		this.copyright = copyright;
		this.publisherId = publisherId;
		this.imageFile = imageFile;
		this.price = price;
		this.summary = summary;
	}
	public titles() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getEditionNumber() {
		return editionNumber;
	}
	public void seteditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getImageFile() {
		return imageFile;
	}
	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	@Override
	public String toString() {
		return "titles [isbn=" + isbn + ", title=" + title + ", editionNumber=" + editionNumber + ", copyright="
				+ copyright + ", publisherId=" + publisherId + ", imageFile=" + imageFile + ", price=" + price
				+ ", summary=" + summary + "]";
	}
	
	
}
