//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Variables

        String firstName = " Nora ";
        String lastName = " Almarri ";
        int age = 27 ;
        int myAmount = 1000 ;

        System.out.println(firstName + lastName + age + myAmount + firstName);

        // Boolean
        boolean married = false;
        System.out.println(married);

        //String Interpolation
        double amount = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";

        System.out.printf("The amount is %f \n Would you like to Deposit or Withdraw the amount?", amount);

        //Arithmetic spice

        int amount2 = 5;
        int sum = amount2+amount2;

        System.out.printf("%d plus %d makes %d",amount2,amount2,sum);

        //String Methods
        String fullName = "John doe";
        String surName=fullName.split(" ")[fullName.split(" ").length-1];
        String firstName1 = fullName.substring(0, fullName.length() - surName.length());
        System.out.println(surName);

        int lengthOfSurName = surName.length();


        System.out.printf("My name is %s and my last name length is %d",firstName1,surName.length());


        //🌶 Does My Last Name Starts With The Letter d?

        char letterD = surName.charAt(0);

        if( letterD == 'd')

            System.out.println("\n\n"+ true);




    }
}