package YigitsJavaFiles;
import java.util.*;
import java.time.LocalDateTime;

public class thermostaatDriver {

    static LocalDateTime now;

    public static void main(String[] args) {
        timeset();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        boolean tempOperational;
        boolean tempProgActive;
        float tempMinTemp;
        float tempMaxTemp;
        float tempCurTemp;
        float tempStepSize;
        float tempNightTemp;
        float tempDayTemp;

        int maxSize;
        Scanner in = new Scanner(System.in);
        maxSize = 0;

        do {
            try {
                System.out.println("Enter the number of thermostats you would like to add. Enter 0 (zero) if you do not wish to add any thermostats: ");
                maxSize = in.nextInt();

                if (maxSize == 0) {
                    System.out.println("No thermostat(s) required!");
                     System.exit(0);
                }
                else {
                    thermostaat[] arrayThermostat = new thermostaat[maxSize];
                    for (int a = 0; a < arrayThermostat.length; a++){

                        in.nextLine();
                        System.out.print("Turn system on/off, use true or false: ");
                        tempOperational = in.nextBoolean();

                        System.out.print("Activate time program, use true or false: ");
                        tempProgActive = in.nextBoolean();

                        System.out.print("Minimum temprature: ");
                        tempMinTemp = in.nextFloat();

                        System.out.print("Maximum temprature: ");
                        tempMaxTemp = in.nextFloat();

                        System.out.print("Current temprature: ");
                        tempCurTemp = in.nextFloat();

                        System.out.print("Step size: ");
                        tempStepSize = in.nextFloat();

                        tempNightTemp = 5f;
                        tempDayTemp = 15f;


                        if (tempProgActive) {
                            //night temp beneath
                            if (hour > 21 || hour < 6) {
                                System.out.print("Night temprature: ");
                                try {
                                    tempNightTemp = in.nextFloat();
                                }
                                catch(Exception e) {
                                    System.out.println("You have entered an invalid data type. Use a number!");
                                }
                                if (tempNightTemp < tempCurTemp) {
                                    while (tempCurTemp > tempNightTemp) {
                                        tempCurTemp = tempCurTemp - tempStepSize;
                                        System.out.println(tempCurTemp);
                                    }
                                    if (tempCurTemp < tempNightTemp) {
                                        tempCurTemp = tempNightTemp;
                                        System.out.println("Done, the new temperature is: " + tempCurTemp );
                                    }
                                }
                                if (tempNightTemp > tempCurTemp) {
                                    while (tempCurTemp < tempNightTemp) {
                                        tempCurTemp = tempCurTemp + tempStepSize;
                                        System.out.println(tempCurTemp);
                                    }
                                    if (tempCurTemp > tempNightTemp) {
                                        tempCurTemp = tempNightTemp;
                                        System.out.println("Done, the new temperature is: " + tempCurTemp );
                                    }
                                }
                            }
                            //end night temp

                            //day temp beneath
                            else if (hour > 6 || hour < 21) {
                                System.out.print("Day temprature: ");
                                try {
                                    tempDayTemp = in.nextFloat();
                                }
                                catch(Exception e) {
                                    System.out.println("You have entered an invalid data type. Use a number!");
                                }
                                if (tempDayTemp < tempCurTemp) {
                                    while (tempCurTemp > tempDayTemp) {
                                        tempCurTemp = tempCurTemp - tempStepSize;
                                        System.out.println(tempCurTemp);
                                    }
                                    if (tempCurTemp < tempDayTemp) {
                                        tempCurTemp = tempDayTemp;
                                        System.out.println("Done, the new temperature is: " + tempCurTemp );
                                    }
                                }
                                if (tempDayTemp > tempCurTemp) {
                                    while (tempCurTemp < tempDayTemp) {
                                        tempCurTemp = tempCurTemp + tempStepSize;
                                        System.out.println(tempCurTemp);
                                    }
                                    if (tempCurTemp > tempDayTemp) {
                                        tempCurTemp = tempDayTemp;
                                        System.out.println("Done, the new temperature is: " + tempCurTemp );
                                    }
                                }
                            }
                            //end day temp
                        }
                        //end programme

                        String ArrayStringProgActive = String.valueOf(tempOperational);
                        String ArrayStringOperational = String.valueOf(tempProgActive);
                        String ArrayStringMinTemp = String.valueOf(tempMinTemp);
                        String ArrayStringMaxTemp = String.valueOf(tempMaxTemp);
                        String ArrayStringCurTemp = String.valueOf(tempCurTemp);
                        String ArrayStringStepSize = String.valueOf(tempStepSize);

                        String ArrayStringNightTemp = String.valueOf(tempNightTemp);
                        String ArrayStringDayTemp = String.valueOf(tempDayTemp);

                        if (tempProgActive) {
                            String fake[] = {ArrayStringProgActive, ArrayStringOperational, ArrayStringMinTemp, ArrayStringMaxTemp, ArrayStringCurTemp, ArrayStringStepSize, ArrayStringNightTemp, ArrayStringDayTemp};

                            try {
                                String[] history = {null,null,null,null,null,null,null,null,null,null};
                                for(int i = 0; i < fake.length; i++) {
                                    history[i] = fake[i];
                                    System.out.println(history[i]);

                                    if (history[i] == null) {
                                        String tempvar = null;
                                        history[i - 1] = tempvar;
                                    }
                                    history[i] = tempvar;

                                }
                            }
                            catch(ArrayIndexOutOfBoundsException e){
                                System.out.println("Array out of bound, this is the original error: " + e);
                            }
                            catch(Exception b){
                                System.out.println(b);
                            }
                        }
                        else {
                            String fake[] = {ArrayStringProgActive, ArrayStringOperational, ArrayStringMinTemp, ArrayStringMaxTemp, ArrayStringCurTemp, ArrayStringStepSize};

                            try {
                                System.out.println("History log,");
                                String[] history = {null,null,null,null,null,null,null,null,null,null};
                                for(int i = 0; i < fake.length; i++) {
                                    history[i] = fake[i];
                                    System.out.println(history[i]);
                                }
                            }
                            catch(ArrayIndexOutOfBoundsException e){
                                System.out.println("Array out of bound, this is the original error: " + e);
                            }
                            catch(Exception b){
                                System.out.println(b);
                            }
                        }
                        System.out.println("\r\n");
                        arrayThermostat[a] = new thermostaat(tempOperational, tempProgActive, tempMinTemp, tempMaxTemp, tempCurTemp, tempStepSize, tempNightTemp, tempDayTemp);
                    }

                    System.out.println("Here are your thermostats: \r\n");

                    for (int i = 0; i < arrayThermostat.length; i++) {
                        System.out.println(arrayThermostat[i].toString());
                    }
                }
            }
            catch (Exception e) {
                System.out.println("Incorrect, you didnt give an int, the original error: " + e);
                in.nextLine();
            }
        }
        while (maxSize <= 0);

    }
    public static void timeset(){
        now = LocalDateTime.now();
    }
}
