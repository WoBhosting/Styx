package com.styxcp;

import java.net.InetSocketAddress;

import com.styxcp.web.server.FrontendServer;
import com.styxcp.exception.*;

public class Styx {
	public static void main(String [] args) {
		System.out.println("Welcome to STYX EXTREMELY IN-DEV EDITION, This project is under the ownership of WoBHosting. WoBHosting Copyright 2014.");
		System.out.println("Starting frontend web server...");
		InetSocketAddress addr = InetSocketAddress.createUnresolved("127.0.0.1", 8880);
		Thread FrontendServer = new Thread(new FrontendServer(addr));
		FrontendServer.setUncaughtExceptionHandler(new UncaughtExceptionHandler());
		FrontendServer.start();
		System.out.println("Frontend web server started on port 8880");
	}
}
