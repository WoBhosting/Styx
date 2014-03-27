package com.styxcp.fileio;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.List;

import org.yaml.snakeyaml.Yaml;

public final class Config {
	private final Yaml yaml = new Yaml();
	private Object data = null;
	public void loadConfig(InputStream input) throws FileNotFoundException{
		data = yaml.load(input);
	}
	public List[] getConfig(String name) {
		List[] options = null;
		return options;
	}
	public void addConfig(List[] option) {
		
	}
	public void removeConfig(String name) {
		
	}
	/** 
	 * Clears configuration currently loaded into memory. Doesn't delete configuration file.
	 */
	public void disposeConfig() {
		data = null;
	}
}
