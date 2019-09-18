package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private String addrs;
	
	
	public Student(int sno, String sname, String addrs) {
		this.sno = sno;
		this.sname = sname;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", addrs=" + addrs + "]";
	}
	
	

}
