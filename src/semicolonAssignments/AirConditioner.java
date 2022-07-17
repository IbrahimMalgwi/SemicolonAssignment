package semicolonAssignments;
;

public class AirConditioner {

    private int temperature = 16;
    private boolean isOn;
    private boolean isOff;
    private String acName;


    public boolean isOn() {
        return isOn;
    }

    public boolean turnOff() {
        return  isOff;
    }

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

    public int getTemperaturep() {
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

    public void turnOn() {
        isOn = true;
    }

    public void isOff() {
        isOff = true;
    }

    public void setName(String acName) {
    }

    public String getName() {
        return acName;
    }
}
