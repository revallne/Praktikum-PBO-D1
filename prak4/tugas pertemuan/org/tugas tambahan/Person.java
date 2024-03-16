public class Person {
    public String name;
    public int age;
    public String address;

    public void setPerson(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void getDetails() {
        System.out.println("Nama\t: " + name);
        System.out.println("Usia\t: " + age);
        System.out.println("Alamat\t: " + address);
    }    
}
