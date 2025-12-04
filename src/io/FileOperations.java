package io;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		File file = new File("/logs/user.log");
		
		File directory = new File("/manolo/logs/");
		
		System.out.println("working directory : "+ System.getProperty("user.dir"));
		
		

		
		createFile(file);
		createpath(directory);
		//Create directory using absolute path
		File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
		absoluteDir.mkdirs();
		
	}
	private static void createpath(File file) {
		System.out.println(file.isAbsolute());
		
		System.out.println(file.getPath());
		//create directories specified by the "file" object
		file.getParentFile().mkdirs();
		
		System.out.println(file.getAbsolutePath());
		
		
	}
	/**
	 * 
	 * @param file
	 * 
	 */

	private static void createFile(File file) {
		
		if (file.exists()) {
			System.out.println("The log file exist");
		}
		else {
			System.out.println("The log file does not exist");
			try {
				file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			//With try catch we can continue executing the program without interruption
			System.out.println("finished");
		}
		
	}

}
