import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class passenger extends Trips {

    String[] arrayOfTrips = new String[100];
    private static String tripP = new String();

    static int indexp = 0;
    public String[] passengerList = new String[100];
    Scanner scan = null;
    String line = null;

    public void search(String tripNumber) {
        int indexOfTrip = Integer.valueOf(tripNumber);
        int newIndex = (indexOfTrip - 1) * 10;
        arrayOfTrips = super.getListOfTrips();
        tripP = arrayOfTrips[newIndex] + " " + arrayOfTrips[newIndex + 1] + " " + arrayOfTrips[newIndex + 2] + " " + arrayOfTrips[newIndex + 3] + " " + arrayOfTrips[newIndex + 4] + " " + arrayOfTrips[newIndex + 5] + " " + arrayOfTrips[newIndex + 6] + " " + arrayOfTrips[newIndex + 7] + " " + arrayOfTrips[newIndex + 8] + " " + arrayOfTrips[newIndex + 9];
        System.out.println(tripP);
    }


    public String getTrip() {
        return tripP;
    }

    public void readFile() {                       //reads whole file and adds in an array

        try {

            scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\passengerList"));
            while (scan.hasNextLine()) {

                line = scan.nextLine();
                passengerList[indexp] = line;
                indexp++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean book(String tripNo){
        int tripNum = Integer.valueOf(tripNo);
        int seats = (10*(tripNum-1))+9;
        arrayOfTrips = super.getListOfTrips();
        int x = Integer.valueOf(arrayOfTrips[seats]);
        if(x>0) {
            x = x - 1;
            arrayOfTrips[seats] = String.valueOf(x);
            super.setListOfTrips(arrayOfTrips);
            super.save();
            return true;
        }
        else{
            return false;
        }
    }

    public void cancel(String tripNo){

        String [] fornumber = tripNo.split(" ");
        String x = fornumber[0];
        System.out.println(x);
        int v = Integer.valueOf(x);
        int seatss = (10*(v-1))+9 ;
        arrayOfTrips = super.getListOfTrips();
        int y = Integer.valueOf(arrayOfTrips[seatss]);
        y = y+1;
        arrayOfTrips[seatss]=String.valueOf(y);
        super.setListOfTrips(arrayOfTrips);
        super.save();
    }

}