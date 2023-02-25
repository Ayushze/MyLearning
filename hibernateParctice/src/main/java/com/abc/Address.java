package com.abc;

import javax.persistence.ManyToOne;

public class Address {
	private int streetNum;
	@ManyToOne
	private String add1;
	private String add2;
	public int getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public Address(int streetNum, String add1, String add2) {
		super();
		this.streetNum = streetNum;
		this.add1 = add1;
		this.add2 = add2;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", add1=" + add1 + ", add2=" + add2 + "]";
	}
}
