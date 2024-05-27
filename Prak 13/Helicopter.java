public class Helicopter extends Vehicle implements Flyer {
    private double maxLoad;

    public Helicopter(){

    }

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 25;
    }

    public double calcTripDistance(){
        return 50;
    }

    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }

    public void takeOff(){
        System.out.println("Helicopter lepas landas");
    }

    public void land(){
        System.out.println("Helicopter mendarat");
    }

    public void fly(){
        System.out.println("Helicopter terbang");
    }
    
}
