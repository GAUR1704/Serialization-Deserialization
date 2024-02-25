package com.prowings.customSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class TestCustomSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String originalString = "HelloWorld";
		
		String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
		
		System.out.println("Original String : "+ originalString );
		
		System.out.println("Encoded String : " + encodedString);
		
		
		User user = new User(10, "Gaurav", "Gaurav@123");
		
		File file = new File("myFile");
		
//		Serialization
		
		FileOutputStream fos = new FileOutputStream(file);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(user);
		
		System.out.println("Object written to file successfully!!");
		
//		Deerialization
		
		FileInputStream fis = new FileInputStream(file);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User deserializedUser = (User) ois.readObject();
		
		System.out.println("User after deserialization " + deserializedUser);
		
		
		

	}

}
