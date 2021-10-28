package classes;
import interfaces.*;
import java.util.Scanner;
public class patient
{
 public   String pid, pname, disease, Gender;
 public   int age;
    public void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("Gender:-");
        Gender = input.nextLine();
       
        System.out.print("age:-");
        age = input.nextInt();
    }
   public void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + Gender + "      \t" +  "\t" + age);
    }
}