import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Manager extends Trips{

    String[] arrayOfTrips = new String[100];
    private static String trip = new String();

    static int index= 0 ;
    public String[] driversList = new String[100];
    Scanner scan = null;
    String line = null;



    public  String getTrip() {
        return trip;
    }

    public void search(String tripNumber){
        int indexOfTrip = Integer.valueOf(tripNumber);
        int newIndex =(indexOfTrip-1)*10;
        arrayOfTrips =super.getListOfTrips();
        trip =arrayOfTrips[newIndex]+" "+arrayOfTrips[newIndex+1]+" "+arrayOfTrips[newIndex+2]+" "+arrayOfTrips[newIndex+3]+" "+arrayOfTrips[newIndex+4]+" "+arrayOfTrips[newIndex+5]+" "+arrayOfTrips[newIndex+6]+" "+arrayOfTrips[newIndex+7]+" "+arrayOfTrips[newIndex+8]+" "+arrayOfTrips[newIndex+9];
        System.out.println(trip);
    }

    public void readFile() {                       //reads whole file and adds in an array

        try {

            scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\driverList"));
            while (scan.hasNextLine()) {

                line = scan.nextLine();
                driversList[index] = line;
                index++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    //public void assign

}
