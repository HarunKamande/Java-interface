public class Car implements SportCar {
    int top_acc;
    int decelerating;
    public Car(int accelerating,int top_acceleration){
        top_acc=accelerating;
        decelerating=top_acceleration;



    }
    @Override
    public void accelerate() {
        System.out.println("Top acceleration for our cor is "+ top_acc+" m/s");

    }

    @Override
    public void decelerate() {
        System.out.println("Top deceleration for our car is "+ decelerating+ " m/s");

    }

}
