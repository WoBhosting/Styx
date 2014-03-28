package com.styxcp.exception;

public class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Error has occured in " + t.toString());
		System.out.println("Stack Trace:");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

}
