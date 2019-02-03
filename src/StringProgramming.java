import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringProgramming {
	
	public static void main(String[] args) {
		
		// convert into small
		//a:97 z=122
		//A:65 Z 90
		//0:48,1:49, 9:57
	
//		char s= 'Z';
//			
//		int ascii= Integer.valueOf(s);
//		System.out.println(ascii);
//		int add =ascii+32;
//		char cha=(char)add;
//		System.out.println(cha);
		
		
//		char s1='z';
//		int smallz=Integer.valueOf(s1);
//		System.out.println(smallz);
//		
//		int bigZ=smallz-32;
//		char num=(char)bigZ;
//		System.out.println(num);
		
//		char c='9';
//		
//		int ascii=Integer.valueOf(c);
//		System.out.println(ascii);
		
//		String s="dgjhlih57667";  //print only digits
//		char [] a=s.toCharArray();
//		String con="";
//		for(int i=0;i<=a.length-1;i++) 
//		{
//			Integer ascii=Integer.valueOf(a[i]);
//			
//			if(ascii >=48 && ascii <=57)
//			{
//				con=con+a[i];
//			}
//		}
//		System.out.println(con);
		
//		String s="asd13245&$45*@!"; //print only psecial charcaters
//		
//		char [] a =s.toCharArray();
//		String con="";
//	
//		
//		for (int i=0;i<=a.length-1;i++)
//		{
//			Integer ascii =Integer.valueOf(a[i]);
//			
//			if((ascii >=97 && ascii <=122)||(ascii >=65 && ascii <=90)||(ascii >=48 && ascii <=57))
//			{
//				
//				//System.out.println("nt special chracter");
//			}
//			else
//			{
//				
//				System.out.println("special chrcter:" + a[i]);
//			}
//			
//			
//		}
		
		//System.out.println(con);
		
		
//		String s="ASDFG"; // convert into lower case
//		
//		char [] a =s.toCharArray();
//		
//		String con="";
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			int ascii =Integer.valueOf(a[i]);
//			int add=ascii+32;
//			
//			char conv=(char)add;
//			con=con+conv;
//			
//		}
//		System.out.println(con);
//		
		
		
//		String s="sdfgff"; //convert into upper case
//		
//		char [] a =s.toCharArray();
//		
//		String con="";
//		for(int i=0;i<=a.length-1;i++)
//		{
//			int ascii=Integer.valueOf(a[i]);
//			int minus=ascii-32;
//			char conv=(char)minus;
//			con=con+conv;
//			
//		}
//		System.out.println(con);		
	
//		String s="asdsASD5643"; // print only chracter lower and upper both
//			
//		char [] a =s.toCharArray();
//		
//		String con="";
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			int ascii=Integer.valueOf(a[i]);
//			if((ascii >=97 && ascii <=122)|| (ascii >=65 && ascii<=90))
//			{
//				con=con+a[i];
//			}
//		}
//				
//			System.out.println(con);
		
//		String s="agdhgiiihvhgiiii"; // count how many i are there
//		
//		char [] a =s.toCharArray();
//		String rep="i";
//		int count=0;
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			String conv=Character.toString(a[i]);
//			if(conv.equals(rep))
//			{
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
//		String s="Sagaarika nayak";  // count all the repeatative chracters
//		char [] a= s.toCharArray();
//		int count=0;
//		
//		for(int j=0;j<=a.length-1;j++)
//		{
//		String f=Character.toString(a[j]);
//		//String c="a";
//
//		 for(int i=0;i<=a.length-1;i++)
//		 {
//			 String s1=Character.toString(a[i]);
//			 if(f.equals(s1))
//			 {
//				 count++;
//				
//			 }
//			 
//		 }
//		 System.out.println(count);
//		
//		}
		
		
//		String s="gfhjfj"; // reverse a string
//		char [] a =s.toCharArray();
//		String rev="";
//		for(int i=a.length-1;i>=0;i--)
//		{
//			rev=rev+a[i];
//		}
//		
//		System.out.println(rev);
		
		
//		int num=1234;  // reverse the number
//		String s=Integer.toString(num);
//		char [] a =s.toCharArray();
//		String con="";
//		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			con=con+a[i];
//		}
//		
//		int rev=Integer.parseInt(con);
//		
//		System.out.println(rev);
//		
		
//		String s="dfh rtrt tuu";  // reverse each word in a string
//		
//		String [] a =s.split(" ");
//		String rev="";
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			String word=a[i];
//			String out="";
//			for(int j=word.length()-1;j>=0;j--)
//			{
//				out=out+word.charAt(j);
//			}
//			rev=rev+out+" ";
//		}
//		
//		
//		System.out.println(rev);
		
		
		
//		String s="gsahdgjsa 56587 ghjg"; // when space is there
//		char [] a= s.toCharArray();
//		String d="";
//		for(int i =0;i<a.length-1;i++)
//		{
//		//take the ascii value of each character
//		Integer ascii=Integer.valueOf(a[i]);
//		if(ascii>=48 && ascii<=57)  // o ascii=47, 1=48, 9=57  // if only cracer print then (ascii <48 || ascii > 57)
//		{ 
//
//		//append the string
//		d=d+a[i];
//		}
//
//		if(ascii == 32)
//		{
//		d=d+"";
//		}
//
//		
//		} 
//		
//		System.out.println(d);
		
//		String s="gf yuy yuy"; //count teh no of words in a string
//		
//		int count=1;
//		
//		for(int i=0;i<s.length()-1;i++)
//		{
//			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
//			{
//				count++;
//			}
//		}
//				
//		System.out.println(count);
//		
		
//		String x="add"; // swap 
//		String y="reyd";
//		
//		
//		System.out.println("before swap:"+ x + " "+ y);
//		x=x+y;
//		y=x.substring(0,x.length()-y.length());
//		x=x.substring(y.length());
//		
//		System.out.println("after swap:"+ x +" "+ y);
		
		
//		int a=2; // number swap
//		int b=3;
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a +" "+b);
		
		
//		String s="fg hk hk"; // remove the space
//		
//		char [] a =s.toCharArray();
//		String con="";
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			int ascii=Integer.valueOf(a[i]);
//			if(ascii == 32)
//			{
//				con=con+"";
//			}
//			
//			if(ascii >=97 && ascii <=122)
//			{
//				con=con+a[i];
//			}
//		}
//		
//		
//		System.out.println(con);
//		
		
		 
//		String s="ghgdfj uy uyu"; //search space , insert Z //o/p: ghgdfjZuyZuyu
//		
//		char [] a =s.toCharArray();
//		
//		String con="";
//		//char Z;
//		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			int ascii=Integer.valueOf(a[i]);
//			
//			if(ascii == 32)
//			{
//				//char conv=(char)ascii;
//				//conv='Z';
//				a[i]='Z';
//				
//				//con=con+conv;
//			}
//			con=con+a[i];
//		}
//		
//		System.out.println(con);
//		
//		

		 
	}
		
}
	
	
