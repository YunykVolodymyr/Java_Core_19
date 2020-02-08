package ua.yunyk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Methods {

	public static void serialize(Serializable obj, File file) {

		try {
			FileOutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(obj);
			oos.close();
			os.close();
		} catch (IOException e) {
			System.err.println(e);
		}

	}
	
	public static Serializable deserialize(File file) {
		try {
		FileInputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable obj = (Serializable)ois.readObject();
		ois.close();
		is.close();
		return obj;
		} catch(IOException e){
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		return null;
	}

}
