import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {

        System.out.println("Welcome to User Registration System Problem\n");

        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate E-mail Address ");
        System.out.println("Enter 4 : to validate Mobile Number ");
        System.out.println("Enter 5 : to validate Password Rule 1 ");
        System.out.println("Enter 6 : to validate Password Rule 2 ");
        System.out.println("Enter 7 : to validate Password Rule 3 ");
        System.out.println("Enter 8 : to validate Password Rule 4 ");

        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        String name = " ";
        String mail = " ";
        String mobNum = " ";
        String password = " ";

        switch (choice) {
            case 1:
                System.out.println("Enter the first name: ");
                name = scanner.next();
                user.firstName(name);

                break;
            case 2:
                System.out.println("Enter the last name: ");
                name = scanner.next();
                user.lastName(name);
                break;
            case 3:
                System.out.println("Enter the email: ");
                mail = scanner.next();
                user.email(mail);
                break;
            case 4:
                System.out.println("Enter the mobile number with country code: ");
                mobNum = scanner.next();
                user.mobileNumber(mobNum);
                break;
            case 5:
                System.out.println("Enter characters for first rule: ");
                mail = scanner.next();
                user.ruleOne(password);
                break;
            case 6:
                System.out.println("Enter characters for second rule: ");
                mail = scanner.next();
                user.ruleTwo(password);
                break;
            case 7:
                System.out.println("Enter value for third rule: ");
                mail = scanner.next();
                user.ruleThird(password);
                break;
            case 8:
                System.out.println("Enter value for fourth rule: ");
                mail = scanner.next();
                user.ruleFourth(password);
                break;
            default:
                System.out.println("Invalid! Select a valid number");
        }
    }
}
