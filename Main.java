package RestrauntProject;
import java.util.Scanner;


public class Main {
	public static Scanner input = new Scanner(System.in);
	public static int choice,quantity=1;
	public static String again;
	public static double pay,total=0;
	public static void menu(){
		System.out.println("-------------------------------------");
		System.out.println("\tWELCOME TO THE RESTRAUNT");
		System.out.println("\tRestraunt Menu");
		System.out.println("\t1Burger    BDT    $60");
		System.out.println("\t2Pzza      BDT    $100");
		System.out.println("\t3Coffee    BDT    $50");
		System.out.println("t4Cancel");
		
		
	}
	public static void order() {
		System.out.println("1 to Burger || 2 to Pizza || 3 to Coffee");
		System.out.println("What do You want to Order");
		choice=input.nextInt();
		if(choice==1) {
		System.out.println("You Choose Burger");
		System.out.println("How many Burger you want to Order");
		quantity=input.nextInt();
		total=total+(quantity*60);
		System.out.println("You want to buy again");
		System.out.println("press Y for [yes] and N for [no]");
		again=input.next();
		if (again.equalsIgnoreCase("Y"))
		order();
		else {
			System.out.println("enter the payment amount");
			pay=input.nextDouble();
			if(pay<total)
			System.out.println("add more money");
			else {
				System.out.println("total"+total);
				total=pay-total;
				System.out.println("Customer's Return"+total+"tk");
			}
		}
		}
		else if(choice==2) {
			System.out.println("You Choose Pizza");
			System.out.println("How many Pizza you want to Order");
			quantity=input.nextInt();
			total=total+(quantity*100);
			System.out.println("You want to buy again");
			System.out.println("press Y for [yes] and N for [no]");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			else {
				System.out.println("enter the payment amount");
				pay=input.nextDouble();
				if(pay<total)
				System.out.println("add more money");
				else {
					System.out.println("total"+total);
					total=pay-total;
					System.out.println("Customer's Return"+total+"tk");
				}
			}
			}
		else if(choice==3) {
			System.out.println("You Choose Coffee");
			System.out.println("How many Coffee you want to Order");
			quantity=input.nextInt();
			total=total+(quantity*50);
			System.out.println("You want to buy again");
			System.out.println("press Y for [yes] and N for [no]");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
			order();
			else {
				System.out.println("enter the payment amount");
				pay=input.nextDouble();
				if(pay<total)
				System.out.println("add more money");
				else {
					System.out.println("total"+total);
					total=pay-total;
					System.out.println("Customer's Return"+total+"tk");
				}
			}
			}
		else if (choice==4) {
			System.exit(0);
		}
		else {
			System.out.println("choose food item");
			order();
		}
	}
	
		


	
	


   
                            
                        
   

	public static void main(String[] args) {
		menu();
		order();
	
		// TODO Auto-generated method stub

	}

}
