public class PaymentHandler {
    public String onSuccess;
    public String onFailed;


    //check result of buy
    public static void onSuccess(){
        System.out.println("Your purchase was completed successfully");
    }
    public static void onFailed(){
        System.out.println("sorry , you don't have enough money");
        System.exit(0);

    }

    public static double pay(Product product){
       return product.calcPrice();
    }
}
