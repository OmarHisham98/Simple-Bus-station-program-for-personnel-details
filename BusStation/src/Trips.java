import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class Trips {


    private static String[] listOfTrips = new String[100];
    private static ArrayList<String> sa=new ArrayList<>();


    public ArrayList<String> getSa() {

        convert();
        return sa;
    }

    public  String[] getListOfTrips() {
        return listOfTrips;
    }

    public  void setListOfTrips(String[] listOfTrips) {
        Trips.listOfTrips = listOfTrips;
    }

    public void clearList(){
        sa.clear();
    }
    String line = null;
        static int indexT =0;
        Scanner scan = null;

        public void readFile() {                       //reads whole file and adds in an array

                try {
                        scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\trips.txt"));
                        while (scan.hasNextLine()) {

                                line = scan.nextLine();
                                listOfTrips[indexT] = line;
                                System.out.println(listOfTrips[indexT]);
                                indexT++;
                        }
                        //for(int i=0;i<indexT;i++)
                    //System.out.println(listOfTrips[i]);
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }


        public void addTrip(String tripNo , String source , String destination ,String price, String date , String time,String stops,String vehicleType,String tripType,String seatVacancies){
               int i = Integer.valueOf(tripNo);
                listOfTrips[10*(i-1)]=tripNo;
                listOfTrips[(10*(i-1))+1]=source;
                listOfTrips[(10*(i-1))+2]=destination;
                listOfTrips[(10*(i-1))+3]=price;
                listOfTrips[(10*(i-1))+4]=date;
                listOfTrips[(10*(i-1))+5]=time;
                listOfTrips[(10*(i-1))+6]=stops;
                listOfTrips[(10*(i-1))+7]=vehicleType;
                listOfTrips[(10*(i-1))+8]=tripType;
                listOfTrips[(10*(i-1))+9]=seatVacancies;
                indexT = indexT +10;
        }
        public void save(){
    int i;
                PrintWriter print =null;
                try{
                    File file = new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\trips.txt");
                    print =new PrintWriter(file);
                    for(i=0;i<(indexT);i++) {
                        print.println(listOfTrips[i]);
                      System.out.println(indexT + "  " + listOfTrips[i]);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }finally{
                    print.close();
                }
        }
        public void convert(){
                for (int i = 0; i < indexT; i += 10) {
                    String temp = listOfTrips[i]+" "+listOfTrips[i+1]+" "+listOfTrips[i+2]+" "+listOfTrips[i+3]+" "+listOfTrips[i+4]+" "+listOfTrips[i+5]+" "+listOfTrips[i+6]+" "+listOfTrips[i+7]+" "+listOfTrips[i+8]+" "+listOfTrips[i+9];
                    sa.add(temp);
                }
            System.out.println(sa);
        }


}

