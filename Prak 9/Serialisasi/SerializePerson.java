/*
* Nama File    : SerializePerson.java
* Nama Pembuat : Dhela Revaline
* NIM          : 24060122130078
* Deskripsi    : Main file untuk menyimpan data melalui serialisasi
* Tanggal      : 21 Mei 2024
*/
import java.io.*;

class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person p = new Person("Panji");
        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            System.out.println("Selesai menulis objek person");
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}