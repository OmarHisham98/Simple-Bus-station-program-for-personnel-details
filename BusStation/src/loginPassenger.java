import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class loginPassenger {


    public String[] listOfPassengers = new String[100];

    String line = null;
    private static int indexp = 0;
    Scanner scan = null;

    public void readFile() {                       //reads whole file and adds in an array

        try {

            scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\passenger.txt"));
            while (scan.hasNextLine()) {

                line = scan.nextLine();
                listOfPassengers[indexp] = line;
                indexp++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean verify(String usernamePassword) {
        int i,flag = 0;
        for (i = 0; i <= indexp; i++) {
            if ( usernamePassword.equals(listOfPassengers[i])) {

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
