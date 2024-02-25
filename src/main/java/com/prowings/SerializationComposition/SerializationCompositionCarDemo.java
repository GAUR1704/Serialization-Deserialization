package com.prowings.SerializationComposition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationCompositionCarDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Head h = new Head("XYZ", 10);
		Engine e = new Engine("ABC", 2.5f, h);
		Car c = new Car("TATA", 2022, e);
		
		System.out.println("car object before serialization :" + c);
		
//		Serialization
		
		File file = new File("carComposition.txt");
		
		FileOutputStream fos  = new FileOutputStream(file);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c);
		
		System.out.println("Object return to file sucessfully.");
		
//		Deserialization
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car deserializedCar = (Car) ois.readObject();
		
		System.out.println("Car object After Deserialization :" + deserializedCar);

	}

}
