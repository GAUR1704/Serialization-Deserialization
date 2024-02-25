package com.prowings.SerializationComposition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationCompositionCollegeDemo {

	public static void main(String[] args) {
		
		Student std = new Student(10, "Ram");
		
		Department dept = new Department("Mechanical", 250, std);
		
		College clg = new College(1990, "KDK", dept);
		
		System.out.println("College object before serialization : " + clg);
		
		File file = new File("CollegeComposition.txt");
		
		
//		Serialization
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
			
			oos.writeObject(clg);
			
			System.out.println("Object return to file sucessfully. ");
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
//		Deserialization
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
			
			College deserializedCollege = (College) ois.readObject();
			
			System.out.println("College object after deserialized " + deserializedCollege);
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();	
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
