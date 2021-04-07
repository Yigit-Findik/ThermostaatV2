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

        Scanner in = new Scanner(System.in);

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

        thermostaat GOKU = new thermostaat(tempOperational, tempProgActive, tempMinTemp, tempMaxTemp, tempCurTemp, tempStepSize, tempNightTemp, tempDayTemp);
        System.out.println(GOKU.toString());
    }

}
