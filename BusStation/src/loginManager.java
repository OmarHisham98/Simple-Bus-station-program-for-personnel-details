import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class loginManager {

    private static int indexm = 0;
    String[] listOfManagers = new String[100];
    String line = null;
    Scanner scan = null;


    public void readFile() {       //reads whole file and adds in an array

        try {

            scan = new Scanner(new File("C:\\Users\\CtC1\\IdeaProjects\\BusStation\\src\\manager.txt"));
            while(scan.hasNextLine()){

                line = scan.nextLine();
                listOfManagers[indexm] = line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean verify(String usernamePassword) {

            if(listOfManagers[indexm].equals(usernamePassword))
            {return true;}
            else
            {return false;}
    }
}

