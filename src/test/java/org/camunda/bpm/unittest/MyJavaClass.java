package org.camunda.bpm.unittest;

import java.io.Serializable;

public class MyJavaClass implements Serializable {

	private int arg1;
	private String arg2;

	public MyJavaClass(int arg1, String arg2){
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	public int getArg1() {
		return arg1;
	}

	public String getArg2() {
		return arg2;
	}
	
}
