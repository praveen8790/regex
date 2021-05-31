import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean regexCompiler(String regexp, String expr) throws RegexMismatchException {
        try {
            Pattern compile = Pattern.compile(regexp);
            Matcher matcher = compile.matcher(expr);
            boolean matches = matcher.matches();
            System.out.println(expr + matches);
            return matches;
        }
        catch (Exception exception) {
            throw new RegexMismatchException("enter valid input");
        }
    }
    public String firstName(){
        return "^[A-Z][a-z]{3,}$";
    }
    public String lastName(){
        return "^[A-Z][a-z]{2,}$";
    }

    public String email(){
        return "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9-](?:[a-z-]*[a-z])?\\.)+[a-z]{2,}(?:[a-z-]*[a-z]{3,})?";
    }
    public String mobileNumber(){
        return "^(?:(?:\\+|0{0,2})91(\\s*|[\\-])?|[0]?)?([6789]{2}([0-9]{8}))$";
    }
    public String password(){
        return "(?=.*[!@#$%^&*(),.-_])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
    }
    public static void main(String[] args) throws RegexMismatchException {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstname = scanner.next();
        Regex.regexCompiler(regex.firstName(),firstname);
        System.out.println("enter last name");
        String lastname = scanner.next();
        Regex.regexCompiler(regex.lastName(),lastname);
        System.out.println("enter email");
        String email = scanner.next();
        Regex.regexCompiler(regex.email(),email);
        System.out.println("enter mobile number");
        String mobilenumber = scanner.nextLine();
        Regex.regexCompiler(regex.mobileNumber(),mobilenumber);
        System.out.println("enter password");
        String password = scanner.next();
        Regex.regexCompiler(regex.password(), password);
    }
}
