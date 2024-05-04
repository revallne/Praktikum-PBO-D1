package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");

        System.out.println("Jumlah Peluru Ak47: " + ak47.getPeluru());
        System.out.println("Ak47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru Ak47: " + ak47.getPeluru());

        System.out.println("Ak47 menembak");
        ak47.menembak();
    }
}
