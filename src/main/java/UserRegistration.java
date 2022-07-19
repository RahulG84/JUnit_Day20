import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    //Method for first name
    public boolean firstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        return pattern.matcher(name).matches();
    }
    //Method for last name
    public boolean lastName (String name) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        return pattern.matcher(name).matches();
    }
    //Method for email
    public boolean email (String mail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        return pattern.matcher(mail).matches();
    }
    //Method for Mobile number verification
    public boolean mobileNumber (String mobNum) {
        Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
        return pattern.matcher(mobNum).matches();
    }
    //Method for password verification Rule1
    public boolean ruleOne (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        return pattern.matcher(password).matches();
    }
    //Method for password verification Rule2
    public boolean ruleTwo (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1,}[a-zA-Z]{7,}$");
        return pattern.matcher(password).matches();
    }
    //Method for password verification Rule3
    public boolean ruleThird (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}[a-zA-Z0-9]{7,}$");
        return pattern.matcher(password).matches();
    }
    //Method for password verification Rule4
    public boolean ruleFourth (String password){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@$!%*#?&]{1,}[a-zA-Z0-9@$!%*#?&]{7,}$");
        return pattern.matcher(password).matches();
    }
}
