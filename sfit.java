package system;
import java.util.*; 
public class paragraph
{
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter a string: "+"\r\n");
		String s1=sc.nextLine();   
		System.out.println("\nYou have entered: "+s1+"\r\n");
		String word = "SFIT";
		String temp[] = s1.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++)
		{
			if (word.equals(temp[i]))
				count++;
		}
		System.out.println("The string is: " + s1+"\r\n");
		System.out.println("The word " + word + " occurs " + count + " times in the above string"+"\r\n");
		String replaceString=s1.replaceAll("SFIT","St. Francis Institute of Technology"); 
		System.out.println(replaceString);
		String wd = "", large="";    
		String[] wds = new String[100];    
		int length = 0;    
        s1 = s1 + " ";       
        for(int i = 0; i < s1.length(); i++)
        {         
        	if(s1.charAt(i) != ' ')
        	{    
        		wd = wd + s1.charAt(i);    
        	}    
        	else
        	{        
              wds[length] = wd;
              length++;
              wd = "";    
        	}
        }             
       large = wds[0];    
       for(int k = 0; k < length; k++)
       {    
    	   if(large.length() < wds[k].length())    
           large = wds[k];    
       }    
       System.out.println("Largest word: " + large+"\r\n"); 
       String c="*";
       String l=large;
       l=c+l+c;
       System.out.println("after appending with '*': "+large+"\r\n");
       String modified_dc=s1.replaceAll(large,l);
       System.out.println(modified_dc);
	}
}
