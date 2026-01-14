package io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDataOperations {
	
	public static void main(String[]args) {
		// A variable with null initialization
		// DataOutpotStream os = null;
		
		try {
			
		DataOutputStream os = 
				new DataOutputStream(new FileOutputStream(""));
		
			os.writeChar(34);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
}
}
