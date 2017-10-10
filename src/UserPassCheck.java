import java.util.Scanner;
/**
 * evaluates an entered username and password
 * @author Patrick H.
 * @since 2017-10-10
 * @version 1.0
 */
public class UserPassCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Your Username:");
        String usr = sc.next();
        System.out.println("Please Enter Your Password:");
        String pass = sc.next();
        //for reference: the correct username is admin & password is letmein
        if (usr.equals("admin") && pass.equals("letmein")){
            System.out.println("Welcome " + usr + "!");
        }
        else{
            System.out.println("Wrong Username or Password!");
        }
    }
}
