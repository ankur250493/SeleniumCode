import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Palindrome {
    public static void main(String[] args) {
        String s = "mad6am";
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            temp = temp + s.charAt(i);

            System.out.println(s.charAt(i));
        }
        System.out.println(temp);
        if (s.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
