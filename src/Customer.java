import java.util.Arrays;

public class Customer {

    public static String [][] movieOne = new String[50][2];
    public static String [][] movieTwo = new String[50][2];
    public static String [][]  movieThree = new String[50][2];

    public Customer(String fName, String sName, int seatNo,int movieNo){
        switch (movieNo){
            case 1:
                movieOne[seatNo-1][0] = fName;
                movieOne[seatNo-1][1] = sName;
                System.out.println("m1");
                printArray(movieOne);
                break;
            case 2:
                movieTwo[seatNo-1][0] = fName;
                movieTwo[seatNo-1][1] = sName;
                System.out.println("m2");
                printArray(movieTwo);
                break;
            case 3:
                movieThree[seatNo-1][0] = fName;
                movieThree[seatNo-1][1] = sName;
                System.out.println("m3");
                printArray(movieThree);
                break;
        }
    }
    public static void printArray(String[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }

    public static String[][] getMovieOne(){
        return movieOne;
    }
    public static String[][] getMovieTwo(){
        return movieTwo;
    }
    public static String[][] getMovieThree(){
        return movieThree;
    }
}
