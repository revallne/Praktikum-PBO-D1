public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(){

    }

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(Flyer flyer){
        if (flyer instanceof Airplane){
            return flyer + " diizinkan untuk mendarat";
        }
        else{
            return "Izin mendarat ditolak";
        }
    }
}
