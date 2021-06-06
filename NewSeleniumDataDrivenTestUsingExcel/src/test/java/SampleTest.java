import java.io.IOException;
import java.util.ArrayList;

public class SampleTest {

    public static void main(String[] args) throws IOException {

        DataDriver d = new DataDriver();
        ArrayList<String> data = d.getData("Sheet1","add profile","TestCases");

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));

    }
}
