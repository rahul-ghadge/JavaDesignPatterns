package com.arya.demo.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class RestrictSerializationInSingleton {

	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		
		DeepCopy deepCopy = new DeepCopy();
		Singleton singleton1 = deepCopy.getDeepCopyOfObject(singleton);
		
		System.out.println("Singleton 1 : " + singleton.hashCode());
		System.out.println("Singleton 2 : " + singleton1.hashCode());
		
	}

}


class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Singleton INSTANCE = null;
    
	private Singleton() {}
    
	public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
	
	// This will prevent serialization and deserialization
	protected Object readResolve(){
		return INSTANCE;
	}
}


class DeepCopy {
	@SuppressWarnings("unchecked")
	public <T> T getDeepCopyOfObject(T object) {
		T t = null;
		if (object != null) {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = null;
			try {
				oos = new ObjectOutputStream(bos);
				oos.writeObject(object);
				oos.flush();
				ByteArrayInputStream bin = new ByteArrayInputStream(
						bos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bin);

				t = (T) ois.readObject();

			} catch (IOException ioException) {
				ioException.printStackTrace();
			} catch (ClassNotFoundException classNotFoundEx) {
				classNotFoundEx.printStackTrace();
			}
		}
		return t;
	}
}
