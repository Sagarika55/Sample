import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Practice {
	


	public static void main(String[] args) {
		
		
		
	/*print zeros to the end 	
		int [] a= {2,4,5,0,0,9,0};
		String s="";
		String t="";
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				s=s+a[i];
			}
			
			if(a[i]==0)
			{
				t=t+a[i];
			}
		
		}
				
		System.out.println(s+t);*/
		//abcshgjk

		int [] a= {3,4,5,6};
		String s="";
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		int a1=Integer.parseInt(s);
		int [] b= {3,4,5};
		String s1="";
		for(int i=0;i<b.length;i++)
		{
			s1=s1+b[i];
		}
		
		int b1=Integer.parseInt(s1);
		
		int sum =a1+b1;
		System.out.println(sum);
		String conv=Integer.toString(sum);
		
		char [] f=conv.toCharArray();
		for(int i1=0;i1<f.length;i1++)
		{
			System.out.println(f[i1]);
		}
	}
	}
