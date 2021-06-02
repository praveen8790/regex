import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public final String firstname= "^[A-Z][a-z]{3,}$";
    public final String lastname = "^[A-Z][a-z]{1,}$";
    public final String email = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9-](?:[a-z-]*[a-z])?\\.)+[a-z]{2,}(?:[a-z-]*[a-z]{3,})?";
    public final String mobilenumber = /*"^(?:(?:\\+|0{0,2})91(\\s*|[\\-])?|[0]?)?([6789]{2}([0-9]{8}))$";*/
                                        "[\\d]{2}[ ]?[\\d]{10}";
    public final String password = "(?=.*[!@#$%^&*(),.-_])(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}$";

    /*public static boolean regexCompiler(String regexp, String expr) throws RegexMismatchException {
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
    }*/
    public static Registration regexCompiler = (regexp, expr) -> {
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
    };
    public static void main(String[] args) throws RegexMismatchException {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstname = scanner.next();
        regexCompiler.regex(regex.firstname,firstname);
        System.out.println("enter last name");
        String lastname = scanner.next();
        regexCompiler.regex(regex.lastname,lastname);
        System.out.println("enter email");
        String email = scanner.next();
        regexCompiler.regex(regex.email,email);
        System.out.println("enter mobile number");
        String mobilenumber = scanner.nextLine();
        regexCompiler.regex(regex.mobilenumber,mobilenumber);
        System.out.println("enter password");
        String password = scanner.next();
        regexCompiler.regex(regex.password, password);
    }
}
