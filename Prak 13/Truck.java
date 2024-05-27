public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(){

    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 50;
    }

    public double calcTripDistance(){
        return 50;
    }

    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}