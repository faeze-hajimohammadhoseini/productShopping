public class BankAccount  {

   public double balance;
   public double withdrawal;



   public void balance(double yourMoney) {
      this.balance=yourMoney;
      System.out.println("Your Balance is : " + yourMoney);
   }

    //calculate price of products and return balance
   public void payMoneyOfLapTop(double yourMoney) {
      this.withdrawal=(yourMoney-2000);
      if (this.withdrawal>0){
         PaymentHandler.onSuccess();
      }
      else {
         PaymentHandler.onFailed();
      }
      System.out.println(" now your balance is : " +this.withdrawal);
   }


   public void payMoneyOfJavaCourse(double yourMoney) {
     this.withdrawal=(yourMoney-50);

      if (this.withdrawal>0){
         PaymentHandler.onSuccess();
         JavaCourse.DownloadLink();
      }
      else {
         PaymentHandler.onFailed();
      }
      System.out.println(" now your balance is : " +this.withdrawal);
   }




}
