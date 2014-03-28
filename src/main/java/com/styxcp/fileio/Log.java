package com.styxcp.fileio;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.styxcp.Styx;

public class Log {
	public static void TestLog() {
		Logger logger = LogManager.getLogger(Styx.class);
	    logger.info("Hello, World!");
	}
}
