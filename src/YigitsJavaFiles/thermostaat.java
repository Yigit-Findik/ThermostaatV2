package YigitsJavaFiles;

public class thermostaat {

    boolean operational;
    boolean progActive;
    float minTemp;
    float maxTemp;
    float curTemp;
    float stepSize;
    float nightTemp;
    float dayTemp;

    float history[] = new float[10];

    //constructor without parameters
    public thermostaat() {
        this.operational = true;
        this.progActive = false;
        this.minTemp = -20.50f;
        this.maxTemp = 34.50f;
        this.curTemp = 20.50f;
        this.stepSize = 0.50f;
        this.nightTemp = 4.50f;
        this.dayTemp = 10.00f;
    }

    //constructor with parameters
    public thermostaat(boolean operational, boolean progActive, float minTemp, float maxTemp, float curTemp, float stepSize, float nightTemp, float dayTemp) {
        this.operational = operational;
        this.progActive = progActive;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.curTemp = curTemp;
        this.stepSize = stepSize;
        this.nightTemp = nightTemp;
        this.dayTemp = dayTemp;
    }

    //Override toString methode.
    @Override
    public String toString() {
        String thermostaat1 = "";
        thermostaat1 = " Thermostat overview " +
                "\r\nSystem on off           : " + getOperational() +
                "\r\nprogram status          : " + getProgActive() +
                "\r\nMin Temprature          : " + getMinTemp() +
                "\r\nMax Temprature     	    : " + getMaxTemp() +
                "\r\nCurrent Temprature      : " + getCurTemp() +
                "\r\nStep size	     	    : " + getStepSize() +
                "\r\nNight Temprature	    : " + getNightTemp() +
                "\r\nDay Temprature		    : " + getDayTemp() +
                "\r\n---------------";
        return thermostaat1;
    }

    public void addHistory(float temp) {
        try {
            for (int i = 0; i < history.length; i++) {
                history[i] = temp;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound, this is the original error: " + e);
        }
        catch(Exception b){
            System.out.println(b);
        }
    }

    //setters and getters are under me :}
    //getters voor (mogelijk) nodig zou zijn.
    public boolean getOperational() {
        //if (input value turned on) {
        //      (System powered on,)
        //}
        //Else if (input value turned off) {
        //      print(System powered off)
        //}
        return operational;
    }
    public boolean getProgActive() {
        return progActive;
    }
    public float getCurTemp() {
        return curTemp;
    }
    public float getDayTemp() {
        return dayTemp;
    }
    public float getMaxTemp() {
        return maxTemp;
    }
    public float getMinTemp() {
        return minTemp;
    }
    public float getNightTemp() {
        return nightTemp;
    }
    public float getStepSize() {
        return stepSize;
    }
    public float[] getHistory() {
        return history;
    }

    //setters (mogelijk) nodig zou zijn.
    public void setCurTemp(float curTemp) {
        this.curTemp = curTemp;
    }
    public void setDayTemp(float dayTemp) {
        this.dayTemp = dayTemp;
    }
    public void setHistory(float[] history) {
        this.history = history;
    }
    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }
    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }
    public void setNightTemp(float nightTemp) {
        this.nightTemp = nightTemp;
    }
    public void setOperational(boolean operational) {
        this.operational = operational;
    }
    public void setProgActive(boolean progActive) {
        this.progActive = progActive;
    }
    public void setStepSize(float stepSize) {
        this.stepSize = stepSize;
    }
}
