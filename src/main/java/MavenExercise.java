import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class MavenExercise {
public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("Enter a string: ");
    String input = sc.nextLine();
        if (StringUtils.isNumeric(input)) {
        System.out.println("You entered a number.");
        }else{
        System.out.println(input + ": is a string");
        }
    System.out.println(StringUtils.swapCase(input));
    System.out.println(StringUtils.reverse(input));
}
}
