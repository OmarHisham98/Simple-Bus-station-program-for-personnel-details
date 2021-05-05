import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BusGui extends Application {

    // @Override
    Scene homepage, customerVal, managerVal, driverVal, customerPageY, customerPageT, customerPageB, searchTripCustomer, bookSure, reviewTripCustomerY,reviewTripCustomerT,reviewTripCustomerB, cancelSure, driverPageH, managerPage, tripsManager, listDrivers, addTrips, newTrip, deleteSure, driverPageF, driverPageS;

    loginPassenger loadPassenger ;
    loginManager loadManager ;
    loginDriver loadDriver ;
    public Trips tripp;
    //driver driverr1;
    //driver driverr2;
    //driver driverr3;
    public Manager managerr;
    passenger passengerr;
    String number;
    public static void main(String[] args) {

        launch(args);
    }


    public void start(Stage primaryStage) throws Exception{
        loadPassenger = new loginPassenger();
        loadManager = new loginManager() ;
        loadDriver = new loginDriver() ;
        tripp = new Trips();
        managerr = new Manager();
        passengerr = new passenger();
        number = new String();
        primaryStage.setTitle("Welcome to CRUISE CONTROL");
        GridPane grid1 = new GridPane();//home page
        GridPane grid2 = new GridPane();//customer val
        GridPane grid3 = new GridPane();//manager val
        GridPane grid4 = new GridPane();//driver val
        GridPane grid5 = new GridPane();//Customer page youssef
        GridPane grid17 = new GridPane();//Customer page tarek
        GridPane grid18 = new GridPane();//Customer page badr
        GridPane grid6 = new GridPane();//search trips
        GridPane grid7 = new GridPane();//review trips youssef
        GridPane grid19 = new GridPane();//review trips tarek
        GridPane grid20 = new GridPane();//review trips badr
        GridPane grid8 = new GridPane();//book
        GridPane grid9 = new GridPane();//manager page
        GridPane grid10 = new GridPane();//are you sure of cancel
        GridPane grid11 = new GridPane();//review trips in manager
        GridPane grid12 = new GridPane();//to enter new trip details
        GridPane grid13 = new GridPane();// opens when he picks a trip to assign driver to
        GridPane grid14 = new GridPane();//driver hania
        GridPane grid15 = new GridPane();//driver fagr
        GridPane grid16 = new GridPane();//driver salma


        homepage = new Scene(grid1,400,400);
        primaryStage.setScene(homepage);
        primaryStage.show();
        loadPassenger.readFile();
        loadManager.readFile();
        loadDriver.readFile();
        tripp.readFile();
        customerVal = new Scene(grid2,400,400);
        managerVal = new Scene(grid3,400,400);
        driverVal = new Scene(grid4,400,400);
        customerPageY = new Scene(grid5,400,400);
        customerPageT = new Scene(grid17,400,400);
        customerPageB = new Scene(grid18,400,400);
        searchTripCustomer = new Scene(grid6,400,400);
        reviewTripCustomerY = new Scene(grid7,400,400);
        reviewTripCustomerT = new Scene(grid19,400,400);
        reviewTripCustomerB = new Scene(grid20,400,400);
        bookSure = new Scene(grid8,400,400);
        cancelSure = new Scene(grid10,400,400);
        managerPage = new Scene(grid9,400,400);
        tripsManager = new Scene(grid11,400,400);
        newTrip = new Scene(grid12,400,400);
        listDrivers = new Scene(grid13,400,400);
        driverPageH = new Scene(grid14,400,400);
        driverPageF = new Scene(grid15,400,400);
        driverPageS = new Scene(grid16,400,400);

        Button customer = new Button("Customer");
        Button manager = new Button("Manager");
        Button driver = new Button("Driver");
        Label username2 = new Label("Username:");//customer
        Label password2 = new Label("Password:");
        Button submit2 = new Button("Submit");
        Label passwordCheck2 = new Label();
        Label username3 = new Label("Username:");//manager
        Label password3 = new Label("Password:");
        Button submit3 = new Button("Submit");
        Label passwordCheck3 = new Label();
        Label username4 = new Label("Username:");//driver
        Label password4 = new Label("Password:");
        Button submit4 = new Button("Submit");
        Label passwordCheck4 = new Label();
        TextField usernameC = new TextField();
        PasswordField passwordC = new PasswordField();
        Button backC = new Button("Back");
        TextField usernameM = new TextField();
        PasswordField passwordM = new PasswordField();
        Button backM = new Button("Back");
        TextField usernameD = new TextField();
        PasswordField passwordD = new PasswordField();
        Button backD = new Button("Back");
        Button searchTripsY = new Button("Search for a trip");
        Button reviewTripsY = new Button("Review your trips");
        Button logoutCY = new Button("Logout");
        Button searchTripsT = new Button("Search for a trip");
        Button reviewTripsT = new Button("Review your trips");
        Button logoutCT = new Button("Logout");
        Button searchTripsB = new Button("Search for a trip");
        Button reviewTripsB = new Button("Review your trips");
        Button logoutCB = new Button("Logout");
        TextArea trip = new TextArea();
        Button backC3 = new Button("Back");
        Label tripDetailY = new Label(" ");
        Button cancelTripY = new Button("Cancel Trip");
        Button backC2Y = new Button("Back");
        Label tripDetailT = new Label(" ");
        Button cancelTripT = new Button("Cancel Trip");
        Button backC2T = new Button("Back");
        Label tripDetailB = new Label(" ");
        Button cancelTripB = new Button("Cancel Trip");
        Button backC2B = new Button("Back");
        Label sureCancel = new Label("Are you sure??");
        Button sureCancelYes = new Button("Yes");
        Button sureCancelNo = new Button("back");
        Button book = new Button("Book");
        Button backBook = new Button("Back");
        Label confirmation = new Label(" ");
        Label enterNum = new Label("Enter tripNO you wish to book");
        TextField textNum = new TextField();
        Button submitTrip = new Button("Submit");
        Label tripLabel = new Label(" ");
        Button reviewManager = new Button("Review Trips");
        Button addTrip = new Button("Add trips");
       /////////////////////////////////////////////////////////////////////// Button deleteTrips = new Button("Delete Trip");
        Button logoutM = new Button("logout");
        //Label tripLabelM = new Label(" ");
        TextArea tripM = new TextArea();
        Button back2M = new Button("Back");
        Label tripNO = new Label("Trip Number:");
        TextField tripNOT = new TextField();
        Label source = new Label("Source:");
        TextField sourceT = new TextField();
        Label destination = new Label("Destination:");
        TextField destinationT = new TextField();
        Label price = new Label("Price:");
        TextField priceT = new TextField();
        Label date = new Label("Date:");
        TextField dateT = new TextField();
        Label time = new Label("Time:");
        TextField timeT = new TextField();
        Label stops = new Label("Stops:");
        TextField stopsT = new TextField();
        Label vehicle = new Label("Vehicle:");
        TextField vehicleT = new TextField();
        Label type = new Label("Type:");
        TextField typeT = new TextField();
        Label availableSeats = new Label("Available seats:");
        TextField availableSeatsT = new TextField();
        Button submitAdd = new Button("Submit");
        Button backAdd = new Button("Back");
        Button saveTrip = new Button("save");
        Label assignDriver = new Label("Driver's Number:");
        TextField assignDriverT = new TextField();
        Label toTripno = new Label("Trip Number to Assign to Driver:");
        TextField toTripnoT = new TextField();
        Button assignTrip = new Button("Assign this trip to:");
        Label driver1 = new Label(" ");
        Label driver2 = new Label(" ");
        Label driver3 = new Label(" ");
        Button submitD = new Button("Submit");
        Button back2MD = new Button("Back");
        Label driverNameH = new Label("Name:");
        Label driverName2H = new Label(" ");
        TextArea driverTripH =new TextArea();
        Label driverNameF = new Label("Name:");
        Label driverName2F = new Label(" ");
        TextArea driverTripF =new TextArea();
        Label driverNameS = new Label("Name:");
        Label driverName2S = new Label(" ");
        TextArea driverTripS = new TextArea();
        Button backH = new Button("Back");
        Button backF = new Button("Back");
        Button backS = new Button("Back");

        grid1.add(customer,0,0);
        customer.setOnAction(e->{

            primaryStage.setScene(customerVal);
        });

        grid1.add(manager,0,1);
        manager.setOnAction(e->{

            primaryStage.setScene(managerVal);
        });

        grid1.add(driver,0,2);
        driver.setOnAction(e->{

            primaryStage.setScene(driverVal);
        });

        grid2.add(username2,0,0);
        grid2.add(password2,0,1);
        grid2.add(usernameC,1,0);
        grid2.add(passwordC,1,1);
        grid2.add(passwordCheck2,1,2);
        grid2.add(submit2,0,3);
        grid2.add(backC, 1, 3);

        submit2.setOnAction(e->{
            String user = usernameC.getText();
            String pass = passwordC.getText();
            String userPass = user+" "+pass;
            if(loadPassenger.verify( userPass )){

                passwordC.clear();
                //usernameC.clear();
                if(user.equals("youssef")){

                    primaryStage.setScene(customerPageY);
                }

                else  if(user.equals("tarek")){

                    primaryStage.setScene(customerPageT);
                }

                else  if(user.equals("badr")){

                    primaryStage.setScene(customerPageB);
                }
            }

            else {

                passwordCheck2.setText("Incorrect username/password, please try again");
            }
        });

        backC.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid3.add(username3,0,0);
        grid3.add(password3,0,1);
        grid3.add(usernameM,1,0);
        grid3.add(passwordM,1,1);
        grid3.add(passwordCheck3,1,2);
        grid3.add(submit3,0,3);
        grid3.add(backM, 1, 3);

        submit3.setOnAction(e->{

            String user = usernameM.getText();
            String pass = passwordM.getText();
            String userPass = user+" "+pass;
            if(loadManager.verify( userPass )){

                passwordM.clear();
                //usernameM.clear();
                primaryStage.setScene(managerPage);
            }
            else{

                passwordCheck3.setText("Incorrect username/password, please try again");
            }


        });

        backM.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid4.add(username4,0,0);
        grid4.add(password4,0,1);
        grid4.add(usernameD,1,0);
        grid4.add(passwordD,1,1);
        grid4.add(passwordCheck4,1,2);
        grid4.add(submit4,0,3);
        grid4.add(backD, 1, 3);

        submit4.setOnAction(e->{

            String user = usernameD.getText();
            String pass = passwordD.getText();
            String userPass = user+" "+pass;
            if(loadDriver.verify( userPass )){

                passwordD.clear();
                //usernameD.clear();
                if(user.equals("hania")){

                    driverName2H.setText("Hania");
                    primaryStage.setScene(driverPageH);

                }

                else if(user.equals("fagr")){

                    driverName2F.setText("Fagr");
                    primaryStage.setScene(driverPageF);
                }

                else if(user.equals("salma")){

                    driverName2S.setText("Salma");
                    primaryStage.setScene(driverPageS);
                }
            }
            else{

                passwordCheck4.setText("Incorrect username/password, please try again");
            }

            if(number.equals("1")){

                driverTripH.setText(managerr.getTrip());
            }

            else if(number.equals("2")){

                driverTripF.setText(managerr.getTrip());
            }

            else if(number.equals("3")){

                driverTripS.setText(managerr.getTrip());
            }

        });

        backD.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid5.add(searchTripsY,0,0);
        grid5.add(reviewTripsY,0,1);
        grid5.add(logoutCY,1,2);
        searchTripsY.setOnAction(e->{
            trip.clear();
            ArrayList <String> lines = tripp.getSa();
            String text="";
            for(String line : lines)
            {
                text = text + line +"\n";
            }
            trip.setText(text);
            tripp.clearList();
            primaryStage.setScene(searchTripCustomer);
        });

        reviewTripsY.setOnAction(e->{

            if(usernameC.getText().equals("youssef")){

                tripDetailY.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("tarek")){

                tripDetailT.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("badr")){

                tripDetailB.setText(passengerr.getTrip());
            }

            primaryStage.setScene(reviewTripCustomerY);
        });

        logoutCY.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid6.add(trip, 0, 0);
        trip.setEditable(false);
        grid6.add(backC3, 0, 4);
        grid6.add(enterNum, 0, 1);
        grid6.add(textNum, 0, 2);
        grid6.add(submitTrip, 0, 3);
        backC3.setOnAction(e->{

            if(usernameC.getText().equals("youssef")){

                primaryStage.setScene(customerPageY);
            }

            else  if(usernameC.getText().equals("tarek")){

                primaryStage.setScene(customerPageT);
            }

            else  if(usernameC.getText().equals("badr")){

                primaryStage.setScene(customerPageB);
            }
        });

        submitTrip.setOnAction(e->{

            String textNo = textNum.getText();
            passengerr.search(textNo);
            System.out.println(textNo);
            tripLabel.setText(passengerr.getTrip());
            primaryStage.setScene(bookSure);
        });

        grid7.add(tripDetailY,0,0);
        grid7.add(cancelTripY,0,1);
        grid7.add(backC2Y, 1, 1);


        cancelTripY.setOnAction(e->{


            primaryStage.setScene(cancelSure);
        });

        backC2Y.setOnAction(e->{

                primaryStage.setScene(customerPageY);


        });

        grid8.add(tripLabel, 0, 0);
        grid8.add(book,1,0);
        grid8.add(backBook,1,1);
        grid8.add(confirmation,0,1);//checking number of seats
        book.setOnAction(e->{

            if(passengerr.book(textNum.getText())){

                confirmation.setText("Booking successful");

            }
            else{

                confirmation.setText("NO SEATS AVAILABLE");
            }


        });

        backBook.setOnAction(e->{

            confirmation.setText(" ");
            primaryStage.setScene(searchTripCustomer);
        });



        grid10.add(sureCancel, 0, 0);
        grid10.add(sureCancelYes, 0, 1);
        sureCancelYes.setOnAction(e->{

            //todo:add 1 to seats available
            passengerr.cancel(passengerr.getTrip());

            if(usernameC.getText().equals("youssef")){

                tripDetailY.setText(" ");
                primaryStage.setScene(reviewTripCustomerY);
            }

            else if(usernameC.getText().equals("tarek")){

                tripDetailT.setText(" ");
                primaryStage.setScene(reviewTripCustomerT);
            }

            else if(usernameC.getText().equals("badr")){

                tripDetailB.setText(" ");
                primaryStage.setScene(reviewTripCustomerB);
            }


        });

        grid10.add(sureCancelNo, 1, 1);
        sureCancelNo.setOnAction(e->{

            if(usernameC.getText().equals("youssef")){

                primaryStage.setScene(reviewTripCustomerY);
            }

            else  if(usernameC.getText().equals("tarek")){

                primaryStage.setScene(reviewTripCustomerT);
            }

            else  if(usernameC.getText().equals("badr")){

                primaryStage.setScene(reviewTripCustomerB);
            }
        });

        grid9.add(reviewManager, 0, 0);
        grid9.add(addTrip, 0, 1);
        ///////////////////////////////////////////////////grid9.add(deleteTrips, 0, 2);
        grid9.add(logoutM, 1, 2);

        reviewManager.setOnAction(e->{

        	 tripM.clear();
             ArrayList <String> lines = tripp.getSa();
             String text="";
             for(String line : lines)
             {
                 text = text + line +"\n";
             }
             tripM.setText(text);
             tripp.clearList();
            primaryStage.setScene(tripsManager);
        });

        addTrip.setOnAction(e->{

            primaryStage.setScene(newTrip);
        });

        /////////////////////////////////////////////////////deleteTrips.setOnAction(e->{

            //delete trip
       //////// });

        logoutM.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid11.add(tripM, 0, 0);
        grid11.add(back2M, 0,5);
        grid11.add(toTripno, 0, 2);
        grid11.add(toTripnoT, 1, 2);
        grid11.add(assignTrip, 0, 3);

        tripM.setEditable(false);

        assignTrip.setOnAction(e->{

            String tripNo = toTripnoT.getText();
            managerr.search(tripNo);
            System.out.println(tripNo);


            primaryStage.setScene(listDrivers);
        });

        back2M.setOnAction(e->{

            primaryStage.setScene(managerPage);
        });

        grid12.add(tripNO, 0, 0);
        grid12.add(tripNOT, 1, 0);
        grid12.add(source, 0, 1);
        grid12.add(sourceT, 1, 1);
        grid12.add(destination, 0, 2);
        grid12.add(destinationT, 1, 2);
        grid12.add(price, 0, 3);
        grid12.add(priceT, 1, 3);
        grid12.add(date, 0, 4);
        grid12.add(dateT, 1, 4);
        grid12.add(time, 0, 5);
        grid12.add(timeT, 1, 5);
        grid12.add(stops, 0, 6);
        grid12.add(stopsT, 1, 6);
        grid12.add(vehicle, 0, 7);
        grid12.add(vehicleT, 1, 7);
        grid12.add(type, 0, 8);
        grid12.add(typeT, 1, 8);
        grid12.add(availableSeats, 0, 9);
        grid12.add(availableSeatsT, 1, 9);
        grid12.add(submitAdd,0 ,10);
        grid12.add(backAdd,1 ,10);
        grid12.add(saveTrip, 0, 11);
        submitAdd.setOnAction(e->{

            tripp.addTrip(tripNOT.getText(), sourceT.getText(), destinationT.getText(), priceT.getText(), dateT.getText(), timeT.getText(), stopsT.getText(), vehicleT.getText(), typeT.getText(), availableSeatsT.getText());
            tripNOT.clear();
            sourceT.clear();
            destinationT.clear();
            priceT.clear();
            dateT.clear();
            timeT.clear();
            stopsT.clear();
            vehicleT.clear();
            typeT.clear();
            availableSeatsT.clear();
        });

        saveTrip.setOnAction(e->{

            tripp.save();
        });

        backAdd.setOnAction(e->{

            primaryStage.setScene(managerPage);
        });


        grid13.add(driver1, 0, 0);
        grid13.add(driver2, 1, 0);
        grid13.add(driver3, 2, 0);
        grid13.add(assignDriver, 0, 1);
        grid13.add(assignDriverT, 1, 1);
        grid13.add(submitD, 0, 2);
        grid13.add(back2MD, 1, 2);

        managerr.readFile();
        System.out.println(managerr.driversList[0]);
        driver1.setText(managerr.driversList[0]);
        driver2.setText(managerr.driversList[1]);
        driver3.setText(managerr.driversList[2]);

        submitD.setOnAction(e->{


             if(assignDriverT.getText().equals("1")){
                 number = "1";
             }
             else if(assignDriverT.getText().equals("2")){
                 number="2";
             }
             else if(assignDriverT.getText().equals("3")){
                 number = "3";
             }

             primaryStage.setScene(tripsManager);
        });

        back2MD.setOnAction(e->{

            primaryStage.setScene(tripsManager);
        });


        grid14.add(driverNameH,0,0);
        grid14.add(driverName2H,0,1);
        grid14.add(driverTripH,0,2);
        grid14.add(backH,0,3);

        driverTripH.setEditable(false);
        backH.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid15.add(driverNameF,0,0);
        grid15.add(driverName2F,0,1);
        grid15.add(driverTripF,0,2);
        grid15.add(backF,0,3);

        driverTripS.setEditable(false);
        backF.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid16.add(driverNameS,0,0);
        grid16.add(driverName2S,0,1);
        grid16.add(driverTripS,0,2);
        grid16.add(backS,0,3);
        driverTripS.setEditable(false);
        backS.setOnAction(e->{

            primaryStage.setScene(homepage);
        });

        grid17.add(searchTripsT,0,0);
        grid17.add(reviewTripsT,0,1);
        grid17.add(logoutCT,1,2);
        searchTripsT.setOnAction(e->{
            trip.clear();
            ArrayList <String> lines = tripp.getSa();
            String text="";
            for(String line : lines)
            {
                text = text + line +"\n";
            }
            trip.setText(text);
            tripp.clearList();
            primaryStage.setScene(searchTripCustomer);
        });

        reviewTripsT.setOnAction(e->{

            if(usernameC.getText().equals("youssef")){

                tripDetailY.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("tarek")){

                tripDetailT.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("badr")){

                tripDetailB.setText(passengerr.getTrip());
            }

            primaryStage.setScene(reviewTripCustomerT);
        });

        logoutCT.setOnAction(e->{

            primaryStage.setScene(homepage);
        });


        grid18.add(searchTripsB,0,0);
        grid18.add(reviewTripsB,0,1);
        grid18.add(logoutCB,1,2);
        searchTripsB.setOnAction(e->{
            trip.clear();
            ArrayList <String> lines = tripp.getSa();
            String text="";
            for(String line : lines)
            {
                text = text + line +"\n";
            }
            trip.setText(text);
            tripp.clearList();
            primaryStage.setScene(searchTripCustomer);
        });

        reviewTripsB.setOnAction(e->{

            if(usernameC.getText().equals("youssef")){

                tripDetailY.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("tarek")){

                tripDetailT.setText(passengerr.getTrip());
            }

            else if(usernameC.getText().equals("badr")){

                tripDetailB.setText(passengerr.getTrip());
            }

            primaryStage.setScene(reviewTripCustomerB);
        });

        logoutCB.setOnAction(e->{

            primaryStage.setScene(homepage);
        });


        grid19.add(tripDetailT,0,0);
        grid19.add(cancelTripT,0,1);
        grid19.add(backC2T, 1, 1);


        cancelTripT.setOnAction(e->{


            primaryStage.setScene(cancelSure);
        });

        backC2T.setOnAction(e->{

            primaryStage.setScene(customerPageT);


        });

        grid20.add(tripDetailB,0,0);
        grid20.add(cancelTripB,0,1);
        grid20.add(backC2B, 1, 1);

        cancelTripB.setOnAction(e->{

            primaryStage.setScene(cancelSure);
        });

        backC2B.setOnAction(e->{

            primaryStage.setScene(customerPageB);


        });
    }
}