
public class Test {
	

	public static void main(String[] args) {
		
		String s="MADAM";
		char [] ar=s.toCharArray();
		String reverse = "";
		for(int i=ar.length-1;i>=0;i--) {
			reverse= reverse + ar[i];
			System.out.println(reverse);
		}
		
	System.out.println(reverse);
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
///////////////////////////////////////////
		
//Fibonacci series
		
		//0,1,1,2,3,5,8,13
		
		int a=0;
		int b=1;
		int c=0;
		
		int last=13;
		System.out.println(a);   //0
		System.out.println(b);   //1
		
		while(c<last)
		{	
			c=a+b;                    // 0+1=1  //2 /3
			System.out.println(c);   //1  //2
			a=b;                    // 1//1
			b=c;                    // 1//2
			
		}
		
		//Reverse number
		
		int intrev=123;
		int mod=intrev% 10;
		int len=Integer.toString(intrev).length();
		int inte=0;
		String revnum="";
		for(int f=0; f<len;f++)
		{
		
		
		inte=intrev-mod;
		int inte2=0;
		inte2=inte/10;
		
		//System.out.println(inte2);
		
		//System.out.println(mod);
		
		
		revnum=revnum+mod;
		intrev = inte2;
		System.out.println(revnum);
		
		}
		}
	
	//gjhkjh
	}

