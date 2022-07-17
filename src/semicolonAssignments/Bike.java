package semicolonAssignments;

public class Bike {
    private boolean isOn;
    private boolean isOff;
    private int speed;
    private int gear;

    public boolean isOn() { return isOn;}
    public boolean isOff()  { return isOff;}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        if (speed >= 0 && speed <= 20){
            speed+=1;
            if(speed >20 && gear == 1) {
                speed = 20;
            }
        } else if(speed>=21 && speed <=30) {
            speed+=2;
            if (speed >31 && gear != 2)
                speed = 30;
        } else if (speed >=31 && speed <=40) {
            speed+=3;
            if(speed > 41 && gear !=3);
              speed = 40;
        } else if (speed >=41){
            speed+=4;
        }

    }

    public void deccelerate() {
        if (speed > 0 && speed <= 20){
            speed-=1;
        } else if(speed >=21 && speed <=30) {
            speed-=2;
        } else if (speed >=31 && speed <=40) {
            speed-=3;
        } else if (speed >=41){
            speed-=4;
        }
    }

    int getGear(){
        return gear;
    }

    public void increaseGear() {
       gear+=1;
        if (gear > 4) {
            gear = 4;
        }
    }

    public void decreaseGear() {
        gear-=1;
        if (gear < 0) {
            gear = 0;
        }
    }
}

