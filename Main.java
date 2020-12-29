import authentication.AuthenticationUtils;
import authentication.User;
import message.MessageHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double yourMoney;
        String yourOrder, userName,yourPassword;

        // login
        System.out.println(MessageHelper.yourUserName);
        userName=new Scanner(System.in).nextLine();

        System.out.println(MessageHelper.yourPassword);
        yourPassword=new Scanner(System.in).nextLine();

        // check Identity
        User user=new User("Setayesh66","setayesh");
        if (AuthenticationUtils.isValidatePassword(yourPassword)==false){
            System.exit(0);
        }

//        if (userName.equals(user.getUserName()) || yourPassword.equals(user.getPassword())){
//            System.out.println("Correct");
//        }
//        else {
//            System.out.println("inCorrect");
//            System.exit(0);
//        }

     // products
    LapTop lapTop =new LapTop();
    lapTop.setName("lopTop");
    lapTop.setPrice(2000);
    lapTop.setRate(1);
    lapTop.getWeight();
    lapTop.calcPrice();


    JavaCourse javaCourse=new JavaCourse();
    javaCourse.setName("javaCourse");
    javaCourse.setPrice(50);
    javaCourse.setRate(1);
    javaCourse.calcPrice();


    //get Initial money
        System.out.println(MessageHelper.yourMoney);
        yourMoney=new Scanner(System.in).nextDouble();


        BankAccount bankAccount=new BankAccount();
        bankAccount.balance(yourMoney);

     //get order
     System.out.println(MessageHelper.yourOrder);
     yourOrder=new Scanner(System.in).nextLine();

     //check products
     if (yourOrder.equals("lapTop")){
     bankAccount.payMoneyOfLapTop(yourMoney);
     }

     else if (yourOrder.equals("javaCourse")){
     bankAccount.payMoneyOfJavaCourse(yourMoney);
     }
     else {
         System.out.println("Oops, we don't have " + yourOrder);
     }
    }}
