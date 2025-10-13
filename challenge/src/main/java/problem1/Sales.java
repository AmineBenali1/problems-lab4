package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        // scan the number of sales people
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sales people : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSalePrice = sales[0];
        int maxSaleId = 0;
        int minSalePrice = sales[0];
        int minSaleId = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > maxSalePrice){
                maxSalePrice = sales[i];
                maxSaleId = i;
            }
            else{
                minSalePrice = sales[i];
                minSaleId = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        // Average sale
        System.out.println("Average sale: "+ sum/sales.length);
        // Maximum Sale
        System.out.println("Salesperson "+ (maxSaleId+1) + " had the highest sale with $"+ maxSalePrice);
        // Minimum Sale
        System.out.println("Salesperson "+ (minSaleId+1) + " had the lowest sale with $"+ minSalePrice);
        // qst 4
        System.out.println("Enter a value : ");
        int value = scan.nextInt();
        int totalExceeded = 0;
        for (int i=0; i<sales.length; i++){
            if(sales[i] > value){
                totalExceeded++;
                System.out.println("Salesperson "+ (i+1) +" with $"+ sales[i]+ " exceeded $"+ value);
            }
        }
        System.out.println("Total exceeders of $"+value+ " : "+ totalExceeded);

        // I substituted i by (i+1) in loops to avoid id 0


    }
}