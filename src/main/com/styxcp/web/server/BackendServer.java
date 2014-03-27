package com.styxcp.web.server;

import java.net.InetSocketAddress;

import org.eclipse.jetty.server.Server;

public class BackendServer {
	
	private static InetSocketAddress addr;
	public BackendServer (InetSocketAddress address) {
		addr = address;
	}
	public void run(){
		Server server = new Server(addr);
        try {
			server.start();
			server.join();
		} catch (Exception e) {
			System.out.println("Error has occured.");
			System.out.println("Stack Trace:");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
