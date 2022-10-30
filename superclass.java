import java.util.Scanner;
public class Superclass 
{
	
	
		String staffid,name,phone,salary;
		Scanner input=new Scanner(System.in);
		void read()
		{
			System.out.println("Enter the staff id:");
		    staffid=input.nextLine();
		    System.out.println("Enter the name:");
		    name=input.nextLine();
		    System.out.println("Enter the phone:");
		    phone=input.nextLine();
		    System.out.println("Enter the salary:");
		    salary=input.nextLine();
		}
	    void display()
	    {
	    	System.out.println("Staffid\t" + staffid);
	    	System.out.println("Name\t" + name);	
	    	System.out.println("Phone\t" + phone);	
	    	System.out.println("Salary\t" + salary);	
	    }
	    public static void main(String[] args) 
        {
                 Scanner input=new Scanner(System.in);
                 System.out.println("Enter the no of staff details:");
         	    int n=input.nextInt();
         	    Teaching steach[]=new Teaching[n];
         	    Technical stech[]=new Technical[n];
         	    contract scon[]=new contract[n];
         	    System.out.println("Enter the staff details:");
         	    System.out.println("Enter the teaching details:");
         	    for(int i=0;i<n;i++)
         	    {
         	    	steach[i]=new Teaching();
         	    	steach[i].read_Teaching();
                 }
         	    System.out.println("Enter the technical details:");
         	    for(int i=0;i<n;i++)
         	    {
         	    	stech[i]=new Technical();
         	    	stech[i].read_Technical();
                 }
         	    System.out.println("Enter the contract details:");
         	    for(int i=0;i<n;i++)
         	    {
         	    	scon[i]=new contract();
         	    	scon[i].read_contract();
                 }
         	    System.out.println("Staff details:");
         	    System.out.println("Teaching staff details:"); 
         	    for(int i=0;i<n;i++)
         	    	steach[i].dispaly();
         	    System.out.println("Technical staff details:"); 
         	    for(int i=0;i<n;i++)
         	    	stech[i].display();
         	    System.out.println("Contract staff details:"); 
         	    for(int i=0;i<n;i++)
         	    	scon[i].display();
        }

	 }   
	 class  Teaching extends Superclass
	 {
			String domain,publication;
			void read_Teaching()
			{
				super.read();
				System.out.println("Enter the domain:");
			    domain=input.nextLine();
			    System.out.println("Enter the publication:");
			    publication=input.nextLine();
			}
			void dispaly()
			{
				System.out.println("Domain\t" + domain);
				System.out.println("Publication\t" + publication);
			}
	  } 
	  class Technical extends Superclass
	  {
		  String skills;
		  void read_Technical()
		  {
			  super.read();
			  System.out.println("Enter the skills:");
			  skills=input.nextLine();
		  }
		  void display()
		  {
			  super.display();
			  System.out.println("Skills\t" + skills);  
		  }
	  }
      class contract extends Superclass
      {
			 String period;
			 void read_contract()
			 {
				 super.read();
				 System.out.println("Enter the period:");
				 period=input.nextLine(); 
			 }
			 void display()
			 {
				  super.display();
				  System.out.println("Period\t" + period);  
			 }
      }
	  
