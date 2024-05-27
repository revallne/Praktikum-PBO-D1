import java.util.*;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);
        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);
        Helicopter copter = new Helicopter();
        System.out.println(copter);
        System.out.println("################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
        System.out.println("################################");

        ArmadaKendaraan<Truck> armadaKendaraanTruck = new ArmadaKendaraan<>();
        ArmadaKendaraan<SeaPlane> armadaKendaraanSeaPlane = new ArmadaKendaraan<>();
        ArmadaKendaraan<Helicopter> armadaKendaraanHelicopter = new ArmadaKendaraan<>();

        System.out.println("Menambahkan armada baru");
        armadaKendaraanTruck.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraanTruck.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraanSeaPlane.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraanSeaPlane.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraanHelicopter.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraanHelicopter.getAllArmada().size());
    }
}