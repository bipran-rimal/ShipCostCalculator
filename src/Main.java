import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the price of the item: ");
        double priceOfItem=0;
        double shippingCost=0;
        double totalCost=0;
        priceOfItem= in.nextDouble();
        if (priceOfItem>100){
            System.out.println("The Shipping Cost is Free and your total Cost would be: "+ priceOfItem);
        }
        else{
            shippingCost=0.02*priceOfItem;
            totalCost=priceOfItem+shippingCost;
            System.out.println("Your shipping cost is: "+shippingCost+"That makes the total cost of your item: "+totalCost);
        }
    }
}