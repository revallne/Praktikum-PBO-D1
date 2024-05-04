package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public void menembak(){
        if(peluru > 0){
            peluru--;
            System.out.println(getBunyi());
            System.out.println("Sisa peluru: " + getPeluru());
        }
        else {
            System.out.println("Tidak ada peluru");
        }
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }

    
}
