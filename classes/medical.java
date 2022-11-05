package classes;
import interfaces.*;
import java.util.Scanner;

public class medical implements Utilities
{
   public String med_name, med_comp, exp_date;
   public int med_cost, count;
   public void new_medi()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("comp:-");
        med_comp = input.nextLine();
        System.out.print("exp_date:-");
        exp_date = input.nextLine();
        System.out.print("cost:-");
        med_cost = input.nextInt();
        System.out.print("no of unit:-");
        count = input.nextInt();
    }
}
