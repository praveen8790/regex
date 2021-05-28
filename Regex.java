import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean regexCompiler(String regexp, String expr){
        Pattern compile = Pattern.compile(regexp);
        Matcher matcher = compile.matcher(expr);
        boolean matches = matcher.matches();
        return matches;
    }
    public String firstName(){
        return "^[A-Z][a-z]{3,}$";
    }
    public String lastName(){
        return "^[A-Z][a-z]{3,}$";
    }

    public String email(){
        return "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9-](?:[a-z-]*[a-z])?\\.)+[a-z]{3,}(?:[a-z-]*[a-z]{3,})?";
    }
    public static void main(String[] args) {
        Regex regex = new Regex();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first name");
        String firstname = scanner.next();
        regex.regexCompiler(regex.firstName(),firstname);
        String lastname = scanner.next();
        regex.regexCompiler(regex.lastName(),lastname);
        String email = scanner.next();
        regex.regexCompiler(regex.email(),email);





    }
}
