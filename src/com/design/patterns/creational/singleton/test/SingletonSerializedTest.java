package com.design.patterns.creational.singleton.test;

import com.design.patterns.creational.singleton.BillPughSingleton;
import com.design.patterns.creational.singleton.SerializedSingleton;

import java.io.*;

public class SingletonSerializedTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode= " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode= " + instanceTwo.hashCode());


        System.out.println("--- Singleton Pattern ---");
        BillPughSingleton single1 = BillPughSingleton.getInstance();
        BillPughSingleton single2 = BillPughSingleton.getInstance();
        if (single1.equals(single2)) {
            System.out.println("Unique Instance");
            System.out.println("instanceOne hashCode= " + single1.hashCode());
            System.out.println("instanceTwo hashCode= " + single2.hashCode());
        }
    }
}
