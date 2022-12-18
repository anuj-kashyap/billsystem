package restrauntsystem;

import java.util.Scanner;
    

    



public class billsystem {

    public static void main(String[] args) {}

    
    public static Scanner input=new Scanner(System.in);
    public static int choice,quantity=1;
    public static String again;
    public static float total=0,pay;
    public static void menu(){
        System.out.println("------------------------------------------");
        System.out.println("\tWELCOME TO THE RESTRAUNT");
        System.out.println("\tRestraunt Menu");
        System.out.println("\t1Burger   price  $60");
        System.out.println("\t2Pizza    price  $100");
        System.out.println("\t3Coffee   price  $50");
        System.out.println("\t4Cancel");


    }
        /**
         * 
         */
        public static void order() {
            System.out.println("1 to Burger || 2 to Pizza || 3 to coffee ");
            System.out.println("What you want ?");
            choice = input.nextInt();
            if(choice==1);{
                System.out.println("You choose burger");
                System.out.println("How many Burger you want : ");
                quantity = input.nextInt();
                total = total+(quantity*60);
                System.out.println("You want to buy again ");
                System.out.println("press Y for [Yess] and N for [Noo]");
                again = input.next();
                if (again.equalsIgnoreCase("y")) {
                    
                order();
                
                    System.out.println("Enter payment Method : ");
                    pay=input.nextFloat();
                    if (pay<total) {
                        System.out.println("You need add more money");
                        
                        
                 } else {
                    System.out.println("total"+total);
                    total=pay-total;
                    System.out.println("customer's return"+total+"tk");
                 }
                }

                        
                    
                    
            else if(choice==2);{
                System.out.println("You choose Pizza");
                System.out.println("How many Pizza you want : ");
                quantity = input.nextInt();
                total = total+(quantity*100);
                System.out.println("You want to buy again ");
                System.out.println("press Y for [Yess] and N for [Noo]");
                again = input.next();
                if (again.equalsIgnoreCase("y")) {
                    
                order();
                
                    System.out.println("Enter payment Method : ");
                    pay=input.nextFloat();
                    if (pay<total) {
                        System.out.println("You need add more money");
                        
                        
                 } else {
                    System.out.println("total"+total);
                    total=pay-total;
                    System.out.println("customer's return"+total+"tk");

                    
                
                 }
                }
                    else if(choice==3);{
                        System.out.println("You choose Coffee");
                        System.out.println("How many Coffee you want : ");
                        quantity = input.nextInt();
                        total = total+(quantity*50);
                        System.out.println("You want to buy again ");
                        System.out.println("press Y for [Yess] and N for [Noo]");
                        again = input.next();
                        if (again.equalsIgnoreCase("y")) {
                            
                        order();
                        
                            System.out.println("Enter payment Method : ");
                            pay=input.nextFloat();
                            if (pay<total) {
                                System.out.println("You need add more money");
                                
                                
                            }else {
                            System.out.println("total"+total);
                            total=pay-total;
                            System.out.println("customer's return"+total+"tk");
        
                            
                        
                        }
                    }else if(choice==4){
                        System.exit(0);

                    }
                }
            }
        }
    }

}







            
        
    
                

                
            

            
        
     
