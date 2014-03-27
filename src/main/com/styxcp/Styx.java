package com.styxcp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;

import com.styxcp.web.server.FrontendServer;
import com.styxcp.exception.UncaughtExceptionHandler;
import com.styxcp.fileio.Config;

public class Styx {
	public static Config config = new Config();
	public static void main(String [] args) {
		System.out.println("Welcome to STYX EXTREMELY IN-DEV EDITION, This project is under the ownership of WoBHosting. WoBHosting Copyright 2014.");
		System.out.println("Starting frontend web server...");
		InetSocketAddress addr = InetSocketAddress.createUnresolved("127.0.0.1", 8880);
		Thread FrontendServer = new Thread(new FrontendServer(addr));
		FrontendServer.setUncaughtExceptionHandler(new UncaughtExceptionHandler());
		FrontendServer.start();
		System.out.println("Frontend web server started on port 8880");
		System.out.println("Loading config...");
		InputStream input = Styx.class.getClass().getResourceAsStream("/resources/configuration/styx.yml");
		if (input==null) System.out.println("Input is null :/");
		try {
			config.loadConfig(input);
			System.out.println("Config loaded/created successfully! :D");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("SOMETHING WENT WRONG!");
			System.out.println("TO THE MYSTERY VAN!");
			e.printStackTrace();
		}
	}
}
