import java.util.*;

public class ArmadaKendaraan<T extends Vehicle> {
    private Collection<T> armada;

    public ArmadaKendaraan(){
        armada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends T> kendaraanBaru){
        armada.addAll(kendaraanBaru);
    }

    public Collection<T> getAllArmada(){
        return armada;
    }
}
