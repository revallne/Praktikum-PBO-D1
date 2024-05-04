package latihanMedium;

public class KontrolSenjata {
    public Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata= s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumPeluru){
        System.out.println(">> Siap menembak " + jumPeluru + " kali");
        if(isAdaPeluru()){
            for(int i = 0; i < jumPeluru; i++){
                if (senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru habis");
        }
    }

    public void menusuk() {
        senjata.setMenusuk(true);
        System.out.println(senjata.getBunyi() + " menusuk.");
    }


    public void pasangBayonet() {
        if (!senjata.isMenunsuk()) {
            System.out.println("Bayonet sudah terpasang.");
        } else {
            System.out.println("Bayonet berhasil dipasang.");
        }
    }

}
