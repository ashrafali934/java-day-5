import java.util.*;
class PatternChar
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
	    {
		    for(int j=i;j<=n;j++)
		    {
			    System.out.print((char)(64+j)+" ");
		    }
		    System.out.println();
        }
    }
}            
   
