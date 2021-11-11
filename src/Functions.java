
public class Functions {
    public boolean notNullCheck(String[][] arr,int seatNo){
        if(arr[seatNo][0]==null){
            return false;
        }else {
            return true;
        }
    }

    public static boolean rangeCheck(int start,int end,int check){
        return(check < start || check > end);
    }
}
