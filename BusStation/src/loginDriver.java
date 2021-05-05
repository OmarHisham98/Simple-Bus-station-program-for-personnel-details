import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class loginDriver {


    static int indexD = 0 ;
    public String[] listOfDrivers = new String[100];
    Scanner scan = null;
    String line = null;

    public void readFile() {                       //reads whole file and adds in an array

        try {

            scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\driver.txt"));
            while (scan.hasNextLine()) {

                line = scan.nextLine();
                listOfDrivers[indexD] = line;
                indexD++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean verify(String usernamePassword) {
        int i,flag = 0;
        for (i = 0; i <= indexD; i++) {
            System.out.println(listOfDrivers[i]);
            if ( usernamePassword.equals(listOfDrivers[i])) {

                flag =1;
                break;
            }

            else {

                flag = 0;
            }
        }

        if(flag == 1){

            return true;
        }
        else{

            return false;
        }

    }
}
