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
    public thermostaat(boolean progActive, float minTemp, float maxTemp, float curTemp, float stepSize, float nightTemp, float dayTemp) {
        this.progActive = progActive;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.curTemp = curTemp;
        this.stepSize = stepSize;
        this.nightTemp = nightTemp;
        this.dayTemp = dayTemp;
    }

    public void addHistory(float temp) {
        try {
            //for () {
            // history[i] = temp;
            //}
        }
        catch(Exception e){

        }
    }

    public void setStepSize() {
        try {

        }
        catch(Exception e){

        }
    }

    //setters and getters are under me :}
    //getters voor (mogelijk) nodig zou zijn.
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
