package acadamy.learnprogramming;

public class Explorer extends Car {

    private int roadServiceMonths;

    public Explorer(int roadServiceMonths) {
        super("Explorer", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else if(newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
        } else if(newVelocity > 40 && newVelocity <= 50){
            changeGear(5);
        } else{
            changeGear(6);
        }

        if(newVelocity > 0 ){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
