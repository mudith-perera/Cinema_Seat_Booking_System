import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javafx.scene.control.Alert;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    public boolean  storeData(String[][] arr,int movieNo){
        //Initializing the connection with MongoDB
        try {
            //Hiding the mongodb logger details
            Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
            mongoLogger.setLevel(Level.SEVERE);

            //Initializing the client details
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            //Creating a new Database
            MongoDatabase database = mongoClient.getDatabase("Cinema_Seat_Booking_System");

            //Creating a new collection for trips
            MongoCollection collection = database.getCollection("Movie "+movieNo);
            collection.drop();
            MongoCollection collectionNew = database.getCollection("Movie "+movieNo);
            for (int i = 0; i < 50; i++) {
                String firstName = arr[i][0];
                String secondName = arr[i][1];
                Document namesAndSeats = new Document("seatNo", i+1);
                namesAndSeats.append("firstName",firstName);
                namesAndSeats.append("SecondName",secondName);

                collectionNew.insertOne(namesAndSeats);

            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public String[][] loadData(int movieNo){
        try{
            //Connection details
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            //Selecting the database
            MongoDatabase database = mongoClient.getDatabase("Cinema_Seat_Booking_System");

            //Creating the collection
            MongoCollection collection = database.getCollection("Movie "+movieNo);

            //Disabling the connection log messages
            Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
            Logger mongoCom = Logger.getLogger("com.mongodb");
            mongoCom.setLevel(Level.OFF);
            mongoLogger.setLevel(Level.OFF);
            //
            String[][] arr =  new String[50][2];

            //Creating a cursor to get document data from database
            MongoCursor<Document> cursor = collection.find().iterator();
            for (int i = 0; i < 50; i++) {
                //line by line will be retrieve to doc
                Document doc = cursor.next();
                arr[i][0]= doc.getString("firstName");
                arr[i][0]= doc.getString("SecondName");
            }
            System.out.println("Successfully Loaded");
            return arr;

        }catch (Exception e){
            System.out.println("Data loading failed");
            return null;
        }
    }
}
