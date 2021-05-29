package com.mindtree.playerRegistrationApp.exception;

public class Myexception extends Exception {
	String message="Exception Occured";
	public Myexception(String message) {
		System.out.println(message);
	}
	public Myexception() {
		System.out.println(message);
	}

}
