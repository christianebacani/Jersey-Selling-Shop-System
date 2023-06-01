import java.util.Scanner;
public class JerseySellingShopSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {5999,6999,7999,8999,9999,10999,11999,19999};
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Welcome to Authentic Jersey Selling Shop!\n");
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        while(transaction){
            
        System.out.print("\n\tAVAILABLE JERSEYS\n\n");
        System.out.print("JERSEY\t\t\tPRICE\n\n");
        System.out.print("1.) Stephen Curry\tP 5,999\n\n");
        System.out.print("2.) Kevin Durant \tP 6,999\n\n");
        System.out.print("3.) Kyrie Irving \tP 7,999\n\n");
        System.out.print("4.) Luka Doncic  \tP 8,999\n\n");
        System.out.print("5.) Ja Morant    \tP 9,999\n\n");
        System.out.print("6.) Nikola Jokic \tP 10,999\n\n");
        System.out.print("7.) James Harden \tP 11,999\n\n");
        System.out.print("8.) Lebron James \tP 19,999\n\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        System.out.print("Enter quantity here : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1] * quantity;
        
        System.out.print("Do you want to buy more jerseys (y/n)?: ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            transaction = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change + "\n\n\n");
            
            
            
        }
              
        
        }
        
        
        
                
               
        
        
    }
}
