import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {
    public static void main(String []args){
        Date d= new Date();

        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(sd.format(d));
        System.out.println(sdf.format(d));
        //System.out.println(sd.toString());
        System.out.println(d.toString());
    }
}
