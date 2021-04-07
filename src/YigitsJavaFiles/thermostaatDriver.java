package YigitsJavaFiles;
import java.util.*;

public class thermostaatDriver {

    public static void main(String[] args) {
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
                System.out.println("Enter the number of thermostats you would like to add Enter 0 (zero) if you do not wish to add products: ");
                maxSize = in.nextInt();

                if (maxSize == 0) {
                    System.out.println("No thermostat(s) required!");
                     System.exit(0);
                }
                else {
                    thermostaat[] arrayThermostat = new thermostaat[maxSize];
                    for (int a = 0; a < arrayThermostat.length; a++){

                        in.nextLine();
                        System.out.print("bool: ");
                        tempOperational = in.nextBoolean();

                        System.out.print("bool: ");
                        tempProgActive = in.nextBoolean();

                        System.out.print("float: ");
                        tempMinTemp = in.nextFloat();

                        System.out.print("float: ");
                        tempMaxTemp = in.nextFloat();

                        System.out.print("float: ");
                        tempCurTemp = in.nextFloat();

                        System.out.print("float: ");
                        tempStepSize = in.nextFloat();

                        System.out.print("float: ");
                        tempNightTemp = in.nextFloat();

                        System.out.print("float: ");
                        tempDayTemp = in.nextFloat();

                        arrayThermostat[a] = new thermostaat(tempOperational, tempProgActive, tempMinTemp, tempMaxTemp, tempCurTemp, tempStepSize, tempNightTemp, tempDayTemp);
                    }

                    System.out.println("Here are your products: \r\n");

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

}
