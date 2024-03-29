import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class GuiFunctions {
    /////////////////////////////////////// Creating GUI for Login (Start) ////////////////////////////////////////
    public void logIn(){
        Stage stage = new Stage();
        stage.setTitle("Cinema Seat Booking System");stage.setResizable(false);
        stage.getIcons().add(new Image("Resourses/icon.jpg"));

        //adding a grid pane
        GridPane gridPane = new GridPane();
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));
        gridPane.setStyle("-fx-background-image: url('Resourses/Login.png');-fx-background-cover: contain;-fx-background-repeat: no-repeat;");

        //Creating elements
        Label lblLoginStage     = new Label("  Login");
        Label lblUsername       = new Label("Username : ");
        Label lblPwd            = new Label("Password : ");
        Label lblDisplayInfo    = new Label("");
        TextField txtUsername   = new TextField();
        PasswordField txtPwd    = new PasswordField();
        Button btnLogin         = new Button("Login");

        //adding elements to Grid pane
        gridPane.add(lblLoginStage,2,1);
        gridPane.add(lblUsername,1,3);
        gridPane.add(txtUsername,2,3);
        gridPane.add(lblPwd,1,5);
        gridPane.add(txtPwd,2,5);
        gridPane.add(lblDisplayInfo,2,6);
        gridPane.add(btnLogin,3,6);

        //Styling grid pane elements
        lblLoginStage.setStyle("-fx-font-weight: bold;-fx-font-size: 28px;");
        lblUsername.setStyle("-fx-font-weight: bold;");
        lblPwd.setStyle("-fx-font-weight: bold;");
        lblDisplayInfo.setStyle("-fx-text-fill: red;-fx-font-weight: bold;");
        GridPane.setHalignment(lblDisplayInfo,HPos.CENTER);

        //username and password validations
        btnLogin.setOnAction(actionEvent -> {
            String username = txtUsername.getText();
            String pwd = txtPwd.getText();
            if (username.equals("admin") && pwd.equals("admin")){
                stage.close();
                checkLogin(true);

            }else{
                lblDisplayInfo.setText("Invalid Credentials!");
            }
        });

        //Creating a javafx scene
        Scene scene = new Scene(gridPane, 350, 300);
        stage.setScene(scene);
        stage.show();
    }
    //////////////////////////////////////// Creating GUI for Login (End) ///////////////////////////////////////

    //////////////////////////////// Used to call mainMenu() inside logIn() (Start) /////////////////////////////
    public void checkLogin(boolean checkVal){
        if (checkVal == true){
            mainMenu();
        }
    }
    ////////////////////////////// Used to call mainDisplay() inside logIn() (End) //////////////////////////////

    //Creating a stage for the menu
    Stage stageMenu = new Stage();
    ///////////////////////////////////// Creating Dynamic Main Window (Start) //////////////////////////////////
    public void mainMenuStage(GridPane gridPane,int closeStatus){
        stageMenu.setTitle("Cinema Seat Booking System");
        stageMenu.setResizable(false);
        stageMenu.getIcons().add(new Image("Resourses/icon.jpg"));

        //Creating a javafx scene for menu
        Scene scene = new Scene(gridPane, 700, 600);
        stageMenu.setScene(scene);
        stageMenu.show();
        if (closeStatus==1){
            stageMenu.close();
        }
    }
    ///////////////////////////////////// Creating Dynamic Main Window (End) ////////////////////////////////////

    /////////////////////////////////////// Creating Menu Window (Start) ////////////////////////////////////////
    public void mainMenu(){
        GridPane mainGridPane = new GridPane();
        //horizontal gap in pixels
        mainGridPane.setHgap(20);
        //vertical gap in pixels
        mainGridPane.setVgap(20);
        //margins around the whole grid
        mainGridPane.setPadding(new Insets(10, 15, 15, 10));
        mainGridPane.setStyle("-fx-background-image: url('Resourses/menu.png');-fx-background-size:cover;-fx-background-repeat: no-repeat;");
        //adding labels, text boxes and buttons
        Button btnAddUser       = new Button(" Add User ");
        Button btnViewSeats     = new Button(" View Seats ");
        Button btnRemove        = new Button(" Remove ");
        Button btnChangeMovie   = new Button(" Change Movie ");
        Button btnFind          = new Button(" Find ");
        Button btnLoad          = new Button(" Load Data ");
        Button btnSave          = new Button(" Save Data ");
        Button btnLogout        = new Button("");

        //styles
        btnAddUser.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnViewSeats.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnRemove.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnChangeMovie.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnFind.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnLoad.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnSave.setStyle("-fx-font-size: 2em;-fx-pref-width:200px;-fx-font-size: 12pt;-fx-font-weight: bold;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        btnLogout.setStyle("-fx-pref-width:60px;-fx-pref-height:40px;-fx-background-image: url(Resourses/logout.png);" +
                "-fx-background-size: 30px 30px;-fx-background-repeat: no-repeat;-fx-background-position: center;-fx-focus-color:transparent;-fx-faint-focus-color: transparent;");
        GridPane.setHalignment(btnLogout, HPos.RIGHT);

        //adding to the grid pane
        mainGridPane.add(btnAddUser,5,5);
        mainGridPane.add(btnViewSeats,9,5);
        mainGridPane.add(btnRemove,5,8);
        mainGridPane.add(btnChangeMovie,9,8);
        mainGridPane.add(btnFind,5,11);
        mainGridPane.add(btnSave,5,14);
        mainGridPane.add(btnLoad,9,14);
        mainGridPane.add(btnLogout,9,17);

        mainMenuStage(mainGridPane,0);

        btnAddUser.setOnAction(actionEvent -> {
            mainMenuStage(seatLayout(),0);
        });
        btnViewSeats.setOnAction(actionEvent -> {
            mainMenuStage(sceneSelectMovie(),0);
        });

        btnSave.setOnAction(actionEvent -> {
            DbConnection dbConnection = new DbConnection();
            dbConnection.storeData(Customer.getMovieOne(),1);
            dbConnection.storeData(Customer.getMovieTwo(),2);
            if (dbConnection.storeData(Customer.getMovieThree(),3)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Success!");
                alert.setContentText("Data Successfully Stored!");
                alert.getDialogPane().setGraphic(new ImageView("Resourses/success.png"));
                alert.show();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Data Storing Error!");
                alert.show();
            }

        });

        btnLoad.setOnAction(actionEvent -> {
            DbConnection dbConnection = new DbConnection();
            String[][] arr1 = new String[50][2];
            String[][] arr2 = new String[50][2];
            String[][] arr3 = new String[50][2];
            arr1=dbConnection.loadData(1);
            arr2=dbConnection.loadData(2);
            arr3=dbConnection.loadData(3);

            if (arr1!=null){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Success!");
                alert.setContentText("Data Successfully Loaded!");
                alert.getDialogPane().setGraphic(new ImageView("Resourses/success.png"));
                alert.show();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Data Loading Failed!");
                alert.show();
            }

            for (int i = 0; i < 50; i++) {
                String fName = arr1[i][0];
                String sName = arr1[i][1];
                Customer customer = new Customer(fName,sName,i+1,1);
            }
            for (int i = 0; i < 50; i++) {
                String fName = arr2[i][0];
                String sName = arr2[i][1];
                Customer customer = new Customer(fName,sName,i+1,2);
            }
            for (int i = 0; i < 50; i++) {
                String fName = arr3[i][0];
                String sName = arr3[i][1];
                Customer customer = new Customer(fName,sName,i+1,3);
            }
        });

        btnLogout.setOnAction(actionEvent -> {
            mainMenuStage(sceneSelectMovie(),1);
            logIn();
        });
    }
    //////////////////////////////////////// Creating Menu Window (End) /////////////////////////////////////////

    /////////////////////////////////////// Creating Seat Layout (Start) ////////////////////////////////////////
    public GridPane seatLayout(){
        GridPane gridPane = new GridPane();
        //Adding styles to the grid pane
        gridPane.setStyle("-fx-background-image: url('Resourses/menu.png');-fx-background-size:cover;" +
                "-fx-background-repeat: no-repeat;");
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));

        //Creating a button array to display seats
        Button[] btnArray = new Button[50];

        //Creating a button to go back to main menu
        Button btnBack = new Button("Back");
        gridPane.add(btnBack,3,16);
        btnBack.setOnAction(actionEvent -> {
            mainMenu();
        });

        //x is column index and y is row index
        int x = 0, y = 0;

        //Creating a loop to handle button processes
        for (int i = 0; i < 50; i++) {
            btnArray[i] = new Button("" + (i + 1));
            btnArray[i].setStyle("-fx-focus-color: #DFFF00;-fx-faint-focus-color: #DFFF00;-fx-font-weight: bold;");

            //Adding buttons to the grid pane
            gridPane.add(btnArray[i],(x+4),(y+9));
            x += 1;
            //When x = 10 the row changes
            if (x == 10) {
                y += 1;
                x = 0;
            }
            int finalX = i;
            int finalI = i;
            btnArray[i].setOnAction(event -> {
                stageAdd(finalI+1);
            });
        }
        return gridPane;
    }
    /////////////////////////////////////// Creating Seat Layout (End) ///////////////////////////////////////

    ///////////////////////////////////// Creating User Add Menu (Start) /////////////////////////////////////
    public void stageAdd(int seatNo){
        //Creating a stage for adding customers to the seat
        Stage stage = new Stage();
        stage.setTitle("Add Customer");
        stage.setResizable(false);
        stage.getIcons().add(new Image("Resourses/icon.jpg"));

        //Creating a grid pane
        GridPane gridPane = new GridPane();
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));
        gridPane.setStyle("-fx-background-image: url('Resourses/Login.png');-fx-background-size:cover;-fx-background-repeat: no-repeat;");

        //Creating Elements
        Label lblFirstName          = new Label("Enter First Name   : ");
        TextField txtFirstName      = new TextField();
        Label lblSecondName         = new Label("Enter Second Name  : ");
        TextField txtSecondName     = new TextField();
        Label lblSeatNo             = new Label("Seat No      : ");
        TextField txtSeatNo         = new TextField();
        Label lblMovieNo            = new Label("Enter Movie No     : ");
        TextField txtMovieNo        = new TextField();
        Button btnBack              = new Button(" Back ");
        Button btnSave              = new Button(" Save ");
        Label lblMovieOneInfo       = new Label("");
        Label lblMovieTwoInfo       = new Label("");
        Label lblMovieThreeInfo     = new Label("");

        //adding elements to grid pane
        gridPane.add(lblFirstName,3,4);
        gridPane.add(txtFirstName,4,4);
        gridPane.add(lblSecondName,3,5);
        gridPane.add(txtSecondName,4,5);
        gridPane.add(lblSeatNo,3,6);
        gridPane.add(txtSeatNo,4,6);
        gridPane.add(lblMovieNo,3,7);
        gridPane.add(txtMovieNo,4,7);
        gridPane.add(lblMovieOneInfo,4,9);
        gridPane.add(lblMovieTwoInfo,4,10);
        gridPane.add(lblMovieThreeInfo,4,11);
        gridPane.add(btnBack,3,8);
        gridPane.add(btnSave,4,8);

        //Setting styles
        lblMovieOneInfo.setStyle("-fx-text-fill: red;-fx-font-weight: bold;");
        lblMovieTwoInfo.setStyle("-fx-text-fill: red;-fx-font-weight: bold;");
        lblMovieThreeInfo.setStyle("-fx-text-fill: red;-fx-font-weight: bold;");
        lblFirstName.setStyle("-fx-font-weight: bold;");
        lblSecondName.setStyle("-fx-font-weight: bold;");
        lblSeatNo.setStyle("-fx-font-weight: bold;");
        lblMovieNo.setStyle("-fx-font-weight: bold;");

        //Checking already booked seats
        Functions functions = new Functions();
        if (functions.notNullCheck(Customer.getMovieOne(),(seatNo-1))){
            lblMovieOneInfo.setText("Seat "+seatNo+" is Booked For Movie 1");
        }else{
            lblMovieOneInfo.setText("");
        }
        if (functions.notNullCheck(Customer.getMovieTwo(),(seatNo-1))){
            lblMovieTwoInfo.setText("Seat "+seatNo+" is Booked For Movie 2");
        }else{
            lblMovieTwoInfo.setText("");
        }
        if (functions.notNullCheck(Customer.getMovieThree(),(seatNo-1))){
            lblMovieThreeInfo.setText("Seat "+seatNo+" is Booked For Movie 3");
        }else{
            lblMovieThreeInfo.setText("");
        }

        txtSeatNo.setEditable(false);
        txtSeatNo.setText(""+seatNo);
        btnBack.setOnAction(actionEvent -> {
            stage.close();
        });

        btnSave.setOnAction(actionEvent -> {
            //rangeCheck
            int movieNo=1;
            try {
                movieNo = Integer.parseInt(txtMovieNo.getText());
                if(Functions.rangeCheck(1,3,movieNo)){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Range Must be 1-3!");
                    alert.show();
                }else{
                    //Get inputs from text fields
                    String firstName = (txtFirstName.getText()).toLowerCase();
                    String secondName = (txtSecondName.getText()).toLowerCase();
                    //Creating an object for customer class

                    Customer customer = new Customer(firstName,secondName,seatNo,movieNo);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Success!");
                    alert.setContentText(firstName+" Saved to Movie "+movieNo+ " Seat no: "+seatNo);
                    alert.getDialogPane().setGraphic(new ImageView("Resourses/success.png"));
                    alert.show();
                    stage.close();
                }

            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please Enter only a Number for Movie Number!");
                alert.show();
            }

        });

        Scene scene = new Scene(gridPane,400,450);
        stage.setScene(scene);
        stage.show();
    }
    ///////////////////////////////////// Creating User Add Menu (End) /////////////////////////////////////
    public GridPane sceneSelectMovie(){
        GridPane gridPane = new GridPane();
        //Adding styles to the grid pane
        gridPane.setStyle("-fx-background-image: url('Resourses/menu.png');-fx-background-size:cover;" +
                "-fx-background-repeat: no-repeat;");
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));

        //Creating 3 Buttons to display Movie numbers
        Button btnMovieOne = new Button("Movie 1");
        Button btnMovieTwo = new Button("Movie 2");
        Button btnMovieThree = new Button("Movie 3");
        Button btnBack = new Button(" Back ");

        //styling buttons
        btnMovieOne.setStyle("-fx-font-size: 2em;-fx-pref-width:150px;-fx-font-size: 12pt;-fx-font-weight: bold;");
        btnMovieTwo.setStyle("-fx-font-size: 2em;-fx-pref-width:150px;-fx-font-size: 12pt;-fx-font-weight: bold;");
        btnMovieThree.setStyle("-fx-font-size: 2em;-fx-pref-width:150px;-fx-font-size: 12pt;-fx-font-weight: bold;");

        //adding buttons to the grid pane
        gridPane.add(btnMovieOne,4,11);
        gridPane.add(btnMovieTwo,5,11);
        gridPane.add(btnMovieThree ,6,11);
        gridPane.add(btnBack,2,21);

        btnMovieOne.setOnAction(actionEvent -> {
            mainMenuStage(sceneView(1),0);
        });
        btnMovieTwo.setOnAction(actionEvent -> {
            mainMenuStage(sceneView(2),0);
        });
        btnMovieThree.setOnAction(actionEvent -> {
            mainMenuStage(sceneView(3),0);
        });
        btnBack.setOnAction(actionEvent -> {
            mainMenu();
        });

        return gridPane;
    }
    public GridPane sceneView(int movieNo){
        GridPane gridPane = new GridPane();
        //Adding styles to the grid pane
        gridPane.setStyle("-fx-background-image: url('Resourses/menu.png');-fx-background-size:cover;" +
                "-fx-background-repeat: no-repeat;");
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));
        //Creating a button array to display seats
        Button[] btnArray = new Button[50];

        //Creating a button to go back to main menu
        Button btnBack = new Button("Back");
        gridPane.add(btnBack,3,16);
        btnBack.setOnAction(actionEvent -> {
            mainMenuStage(sceneSelectMovie(),0);
        });

        //x is column index and y is row index
        int x = 0, y = 0;

        //Creating a loop to handle button processes
        for (int i = 0; i < 50; i++) {
            btnArray[i] = new Button("" + (i + 1));
            btnArray[i].setStyle("-fx-focus-color: transparent;-fx-faint-focus-color: transparent;-fx-font-weight: bold;");

            //Showing only booked seats
            switch (movieNo){
                case 1:
                    String[][] movieOneArr = Customer.getMovieOne();
                    if ((movieOneArr[i][0])==null){
                        btnArray[i].setStyle("-fx-background-color: #CB4335;-fx-text-fill: White;");
                        btnArray[i].setDisable(true);
                    }
                    break;
                case 2:
                    String[][] movieTwoArr = Customer.getMovieTwo();
                    if ((movieTwoArr[i][0])==null){
                        btnArray[i].setStyle("-fx-background-color: #CB4335;-fx-text-fill: White;");
                        btnArray[i].setDisable(true);
                    }
                    break;
                case 3:
                    String[][] movieThreeArr = Customer.getMovieThree();
                    if ((movieThreeArr[i][0])==null){
                        btnArray[i].setStyle("-fx-background-color: #CB4335;-fx-text-fill: White;");
                        btnArray[i].setDisable(true);
                    }
                    break;
            }

            //Adding buttons to the grid pane
            gridPane.add(btnArray[i],(x+4),(y+9));
            x += 1;
            //When x = 10 the row changes
            if (x == 10) {
                y += 1;
                x = 0;
            }
            int finalI = i;
            btnArray[i].setOnAction(event -> {
                //sceneAdd(finalI+1);
                stageView(movieNo,finalI);
            });
        }



        return gridPane;
    }
    public void stageView(int movieNo,int seatNo){
        Stage stage = new Stage();
        stage.setTitle("Add Customer");
        stage.setResizable(false);
        stage.getIcons().add(new Image("Resourses/icon.jpg"));

        //Creating a grid pane
        GridPane gridPane = new GridPane();
        //horizontal gap in pixels
        gridPane.setHgap(20);
        //vertical gap in pixels
        gridPane.setVgap(20);
        //margins around the whole grid
        gridPane.setPadding(new Insets(10, 15, 15, 10));
        gridPane.setStyle("-fx-background-image: url('Resourses/Login.png');-fx-background-size:cover;" +
                "-fx-background-repeat: no-repeat;");

        //Creating Elements
        Label lblFirstName          = new Label("First Name\t\t: ");
        Label lblFirstNameShow          = new Label();
        Label lblSecondName         = new Label("Second Name\t\t: ");
        Label lblSecondNameShow         = new Label();
        Label lblSeatNo             = new Label("Seat No\t\t\t: ");
        Label lblSeatNoShow             = new Label();
        Label lblMovieNo            = new Label("Movie No\t\t\t: ");
        Label lblMovieNoShow            = new Label();
        Button btnBack              = new Button(" Back ");

        //adding elements to grid pane
        gridPane.add(lblFirstName,3,3);
        gridPane.add(lblFirstNameShow,4,3);
        gridPane.add(lblSecondName,3,4);
        gridPane.add(lblSecondNameShow,4,4);
        gridPane.add(lblSeatNo,3,5);
        gridPane.add(lblSeatNoShow,4,5);
        gridPane.add(lblMovieNo,3,6);
        gridPane.add(lblMovieNoShow,4,6);
        gridPane.add(btnBack,3,8);

        btnBack.setOnAction(actionEvent -> {
            stage.close();
        });

        //assigning values
        String[][] arrMovie;
        switch (movieNo){
            case 1:
                arrMovie = Customer.getMovieOne();
                lblFirstNameShow.setText(arrMovie[seatNo][0]);
                lblSecondNameShow.setText(arrMovie[seatNo][1]);
                if(lblFirstNameShow.getText()!=null){
                    lblSeatNoShow.setText(Integer.toString(seatNo+1));
                    lblMovieNoShow.setText(Integer.toString(movieNo));
                }
                break;
            case 2:
                arrMovie = Customer.getMovieTwo();
                lblFirstNameShow.setText(arrMovie[seatNo][0]);
                lblSecondNameShow.setText(arrMovie[seatNo][1]);
                if(lblFirstNameShow.getText()!=null){
                    lblSeatNoShow.setText(Integer.toString(seatNo+1));
                    lblMovieNoShow.setText(Integer.toString(movieNo));
                }
                break;
            case 3:
                arrMovie = Customer.getMovieThree();
                lblFirstNameShow.setText(arrMovie[seatNo][0]);
                lblSecondNameShow.setText(arrMovie[seatNo][1]);
                if(lblFirstNameShow.getText()!=null){
                    lblSeatNoShow.setText(Integer.toString(seatNo+1));
                    lblMovieNoShow.setText(Integer.toString(movieNo));
                }
                break;
        }

        Scene scene = new Scene(gridPane,300,300);
        stage.setScene(scene);
        stage.show();

    }

    public void sceneRemove(){

    }
    public void sceneChangeMovie(){

    }
    public void sceneFind(){

    }
    public void sceneLogout(){

    }
    public void mainScene(GridPane gridPane){

    }

}
