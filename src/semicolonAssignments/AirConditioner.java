package semicolonAssignments;
;

public class AirConditioner {

    private int temperature = 16;
    private boolean isOn;
    private boolean isOff;
    private String acName;


    public int increaseTemp() {
        if (temperature >= 16 && temperature <= 30) {
            this.temperature = temperature + 1;
        } else if (temperature < 16) {
            this.temperature = 16;
        } else {
            this.temperature = 30;
        }
        return increaseTemp();
    }

    public int getTemperature() {
        return temperature;
    }

    public void DecreaseTemp() {
        this.temperature = temperature;
        if (this.temperature >= 16 && this.temperature <= 30) {
            this.temperature = this.temperature - 1;
        } else if (this.temperature < 16) {
            this.temperature = 16;
        } else {
            this.temperature = 30;
        }
    }

    public boolean turnOn() {
        int power = 1;
        if(power == 1){
            isOn = true;
            System.out.println("Ac is on");
        }
        if (power == 0){
            isOn = false;
        }
        return isOn;
    }

    public boolean turnOff() {
        int power = 0;
        if (power == 0){
            isOff = true;
            System.out.println("Ac if off");
        }
        if (power == 1) {
            isOff = false;
        }
        return isOff;
    }

    public void setName(String acName) {
    }

    public String getName() {
        return acName;
    }
}
