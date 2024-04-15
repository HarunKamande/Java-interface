public class Car1 implements SportCar,Normalcar{

    //Performing Multiple inheritance through the use of several interfaces
    public Car1(){}
    int normalSpeed;
    int fuelrate;
    int accerating;
    int decelerating;
    public Car1(int normalSpeed,int fuelrate,int accerating,int decelerating){
        this.accerating=accerating;
        this.fuelrate=fuelrate;
        this.normalSpeed=normalSpeed;
        this.decelerating=decelerating;
    }
    @Override
    public void normalSpeeding() {
        System.out.println("Normal Speed is: "+ normalSpeed+" km/h");

    }

    @Override
    public void fuelconsuption() {
        System.out.println("Fuel consuption is "+ fuelrate+" litre/10km");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleration is "+accerating+" m/s");
    }

    @Override
    public void decelerate() {
        System.out.println("Deceleration is "+decelerating+" m/s");

    }
}
