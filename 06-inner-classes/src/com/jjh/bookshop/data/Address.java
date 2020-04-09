package com.jjh.bookshop.data;

public class Address {
	
	private int number;
	private String street;
	private String city;
	private String county;
	private Postcode postcode;
	
	protected class Postcode {
		private String firstPart;
		private String secondPart;
		
		public Postcode(String firstPart, String secondPart) {
			super();
			this.firstPart = firstPart;
			this.secondPart = secondPart;
		}

		@Override
		public String toString() {
			return "Postcode [firstPart=" + firstPart + " secondPart=" + secondPart + "]";
		}
		
	}
	
	public Address(int number, String street, String city, String county, String postcodePart1, String postCodePart2) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.county = county;
		this.postcode = new Postcode(postcodePart1, postCodePart2);
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Postcode getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcodePart1, String postCodePart2) {
		this.postcode = new Postcode(postcodePart1, postCodePart2);
	}

	@Override
	public String toString() {
		return String.format("Address [number=%s, street=%s, city=%s, county=%s, postcode=%s]", number, street, city,
				county, postcode);
	}
	
	
	

}
