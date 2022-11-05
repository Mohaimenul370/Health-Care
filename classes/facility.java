package classes;
import interfaces.*;
import java.util.Scanner;
public class facility 
{
   public String fec_name;
   public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
}