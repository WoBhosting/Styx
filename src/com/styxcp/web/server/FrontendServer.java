package com.styxcp.web.server;

import java.net.InetSocketAddress;

import org.eclipse.jetty.server.Server;

public class FrontendServer implements Runnable{
	
	private static InetSocketAddress addr;

	public FrontendServer (InetSocketAddress address) {
		addr = address;
	}
	
	public void run(){
		Server server = new Server(addr);
        try {
			server.start();
			server.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
