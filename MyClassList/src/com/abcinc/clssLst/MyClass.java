package com.abcinc.clssLst;

import java.io.Serializable;

public class MyClass implements Serializable {

	private String ab;
	private int av;
	
	//parameterized constructor
	public MyClass(String ab, int av) {
		super();
		this.ab = ab;
		this.av = av;
	}

	//getter setter methods
	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}

	public int getAv() {
		return av;
	}

	public void setAv(int av) {
		this.av = av;
	}

	//displaying the output
	@Override
	public String toString() {
		return "MyClass [ab=" + ab + ", av=" + av + "]";
	}
	
	
	
}
