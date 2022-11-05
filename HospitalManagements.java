import classes.*;
import interfaces.*;
import java.util.*;
import java.io.*;
public class HospitalManagements
{
    static String newline=System.getProperty("line.separator");
    static File DD= new File("Docs.txt");
    static File EE= new File("Patients.txt");
    static File FF= new File("Medicines.txt");
    static File GG= new File("Labs.txt");
    static File HH= new File("Facilities.txt");
    public static void main(String args[])
    {  

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        facility[] f = new facility[20];
        medical[] m = new medical[100];
        
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 20; i++)
            f[i] = new facility();
        for (i = 0; i < 100; i++)
            m[i] = new medical();
      
        Scanner input = new Scanner(System.in);
        int choice, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1;
        while (status == 1)
        {
	   count1 = 0; count2 = 0;count3 = 0; count4 = 0; count5 = 0;
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities   ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {

                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
							
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                       		 try
                       		 {
                       		     FileWriter output = new FileWriter(DD,true);
                            	     BufferedWriter buffer = new BufferedWriter(output);
                                     PrintWriter printWriter=new PrintWriter(buffer);
                                     if(DD.exists()==false)
                                     	DD.createNewFile();                           
					for(int jj=0;jj<count1;jj++)
					{
						printWriter.println(d[jj].did + "\t" + d[jj].dname + "  \t" + d[jj].specilist + "     \t" + d[jj].appoint + "    \t" + d[jj].doc_qual + "       \t" + d[jj].droom+newline);
					}
				        printWriter.close();
                                  }
                                 catch(Exception e)
                                 {
                                  e.getStackTrace();
                                  }
                                   break;
                                }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
				        try {
 				            
				            Scanner filescanner = new Scanner(DD);
			                    while (filescanner.hasNext()) {
			                    System.out.println(filescanner.nextLine());
 				            }
 				          }
  				        catch (Exception e)
  				        {	
				         e.getStackTrace();
 				        }
					break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
							count1 = 0; count2 = 0;count3 = 0; count4 = 0; count5 = 0;
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
				try
                       		 {
                       		     FileWriter output = new FileWriter(EE,true);
                            	     BufferedWriter buffer = new BufferedWriter(output);
                                     PrintWriter printWriter=new PrintWriter(buffer);
                                     if(EE.exists()==false)
                                     	EE.createNewFile();
					for(int jj=0;jj<count2;jj++){
						printWriter.println(p[jj].pid + "\t" + p[jj].pname + " \t" + p[jj].disease + "     \t" + p[jj].Gender + "      \t" +  "\t" + p[jj].age+newline);						
					}
                                     printWriter.close();
                                  }
                                  catch(Exception e)
                                  {
                                  e.getStackTrace();
                                  }
                                 break;
                              }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                   
				        try {
 				            int cnt=0;
				            Scanner filescanner = new Scanner(EE);
			                    while (filescanner.hasNext()) {
			                    System.out.println(filescanner.nextLine());
 				            }
 				          }
  				        catch (Exception e)
  				        {	
				         e.getStackTrace();
 				        }
					break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
							count1 = 0; count2 = 0;count3 = 0; count4 = 0; count5 = 0;
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
				try
                       		 {
                       		     FileWriter output = new FileWriter(FF,true);
                            	     BufferedWriter buffer = new BufferedWriter(output);
                                     PrintWriter printWriter=new PrintWriter(buffer);
                                     if(FF.exists()==false)
                                     	FF.createNewFile();
				       for(int jj=0;jj<count3;jj++)
					{
                                          printWriter.println(m[jj].med_name + "  \t" + m[jj].med_comp + "    \t" + m[jj].exp_date + "     \t" + m[jj].med_cost+newline);
                                        }
                                     printWriter.close();
                                  }
                                  catch(Exception e)
                                  {
                                  e.getStackTrace();
                                  }
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
				        try {
 				            int cnt=0;
				            Scanner filescanner = new Scanner(FF);
			                    while (filescanner.hasNext()) {
			                    System.out.println(filescanner.nextLine());
 				            }
 				          }
  				        catch (Exception e)
  				        {	
				         e.getStackTrace();
 				        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
							count1 = 0; count2 = 0;count3 = 0; count4 = 0; count5 = 0;
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count4].new_feci();count4++;
				try
                       		 {
                       		     FileWriter output = new FileWriter(GG,true);
                            	     BufferedWriter buffer = new BufferedWriter(output);
                                     PrintWriter printWriter=new PrintWriter(buffer);
                                     if(GG.exists()==false)
                                     	GG.createNewFile();
				     for(int jj=0;jj<count4;jj++)
                                     {
                                        printWriter.println(l[jj].fecility + "\t\t" + l[jj].lab_cost+newline);
                                     }
                                     printWriter.close();
                                  }
                                  catch(Exception e)
                                  {
                                  e.getStackTrace();
                                  }
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Fecilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                       	  try {
 				            int cnt=0;
				            Scanner filescanner = new Scanner(GG);
			                    while (filescanner.hasNext()) {
			                    System.out.println(filescanner.nextLine());
 				            }
 				          }
  				        catch (Exception e)
  				        {	
				         e.getStackTrace();
 				        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
							count1 = 0; count2 = 0;count3 = 0; count4 = 0; count5 = 0;
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f[count5].add_feci();count5++;
				try
                       		 {
                       		     FileWriter output = new FileWriter(HH,true);
                            	     BufferedWriter buffer = new BufferedWriter(output);
                                     PrintWriter printWriter=new PrintWriter(buffer);
                                     if(HH.exists()==false)
                                     	HH.createNewFile();
                                     for(int jj=0;jj<count5;jj++)
			             {
                                     	printWriter.println(f[jj].fec_name+newline);
                                     }
                                     printWriter.close();
                                  }
                                  catch(Exception e)
                                  {
                                  e.getStackTrace();
                                  }
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Hospital  Facility are:");
                                        System.out.println("--------------------------------------------------------------------------------");
                                      try {
 				            int cnt=0;
				            Scanner filescanner = new Scanner(HH);
			                    while (filescanner.hasNext()) {
			                    System.out.println(filescanner.nextLine());
 				            }
 				          }
  				        catch (Exception e)
  				        {	
				         e.getStackTrace();
 				        }   
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
