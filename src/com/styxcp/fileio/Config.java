package com.styxcp.fileio;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.List;
import com.styxcp.exception.FilePermissionException;

import org.yaml.snakeyaml.Yaml;

public class Config {
	private static Yaml yaml = new Yaml();
	public void loadConfig() throws FilePermissionException{
		InputStream input = null;
		try {input = new FileInputStream(new File("styx.conf"));} catch (Exception e) {
			System.out.println(e.getMessage());
			try {
				FileOutputStream out = new FileOutputStream("styx.conf"); out.close();
				} catch (Exception e1) {
					e1.printStackTrace();
					throw new FilePermissionException();
				}
			}
		Object data = yaml.load(input);
	}
	private List[] getConfig(String name) {
		List[] options = null;
		return options;
	}
	private boolean addConfig(List[] option) {
		return true;
	}
	private boolean removeConfig(String name) {
		return true;
	}
	
}
