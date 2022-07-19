import java.util.regex.*;
import java.util.*;
public class EmailValidator
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Email-Id.");
       int n=sc.nextInt();
       String ar[] = new String[n];
       sc.nextLine();
        for(int i=0;i<n;i++)
        {
        	 ar[i]=sc.next();
        }
        System.out.println("Enter the Email-Id which you want to search");
        String str = sc.next();
        int count =0;
                for(int i=0; i<n; i++) 
                {
                    if(str.equals(ar[i])) 
                    {
                        System.out.println("Email-Id (" + str + ") Status -- Found");
                        break;
                    }
                    count++;
                }
                if(count == n)
                {
                    System.out.println("Email-Id (" + str + ") Status -- Not Found");
                }
    }


}
