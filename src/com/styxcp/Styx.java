package com.styxcp;

import java.net.InetSocketAddress;

import com.styxcp.web.server.FrontendServer;

public class Styx {
	public static void main(String [] args) {
		System.out.println("Welcome to STYX EXTREMELY IN-DEV EDITION, This project is under the ownership of WoBHosting. WoBHosting Copyright 2014.");
		System.out.println("Starting frontend web server...");
		InetSocketAddress addr = InetSocketAddress.createUnresolved("127.0.0.1", 8880);
		Runnable FrontendServer = new FrontendServer(addr);
		new Thread(FrontendServer).start();
		System.out.println("Frontend web server started on port 8880");
	}
}
