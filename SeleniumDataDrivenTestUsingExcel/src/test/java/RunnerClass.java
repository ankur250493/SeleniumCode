import java.io.IOException;
import java.util.ArrayList;

public class RunnerClass {

    public static void main(String[] args) throws IOException {
        DataDrivenTest d = new DataDrivenTest();
        ArrayList<String> data = d.DataTest("Add Profile");
        System.out.println(data.get(1));
    }
}
