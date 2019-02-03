import java.util.Arrays;

public class ArrayProgramming {
	
	public  static void arraysum()
	{
		int a [] = {3,2,5,4}; // sum the elements and provide output
		int sum = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
	
		System.out.println(sum);
	}
	
	public static void sortarray()
	{
		int [] a = {4,2,6,8,9};		
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	public static void Thirdhighestelementinarray()
	{
		int [] a = {4,9,8,2,1};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-3]);
		
	}
	
	public static void insertelementinaposition()
	{
		int a [] = {2,7,8,9};
		int index= 2 ; //3rd position
		int newvalue=1;
		
		for(int i=a.length-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=newvalue;
		
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void printduplicateinarray()
	{
		int [] a = {3,4,4,5,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
		
		
	}
	
	public static void evennumsummandoddnummulti()
	{
	
	int a[] = {1,2,3,4,5};// even num sum & odd num multi
	int sum=0;
	int mul=1;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i] % 2 == 0)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		
		else
		{
			mul=mul * a[i];
		}
	}
	System.out.println(sum);
	System.out.println(mul);
	
	}
	
	public static void evennumavgoddavg()
	{
		int [] a = {2,4,3,1}; // avg = sum/2counter
		
		int sumeven=0;
		int avg;
		int count=0;
		int countodd=0;
		
		int sumodd=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i] % 2 ==0)
			{
				sumeven=sumeven+a[i];
				count=count+1;
					
			}
			else
			{
				sumodd=sumodd+a[i];
				//countodd=countodd+1;
			}
		}
		System.out.println(sumeven/count);
		//System.out.println(sumodd/countodd); // same as next print
		System.out.println(sumodd/(a.length-count));
		
	}
	
	public static void avgofarray()
	{
		int [] a = {4,2,2,4};
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		int avg=sum/(a.length);
		System.out.println(avg);
	}
	
	
	

	public static void main(String[] args) {
	
		//ArrayProgramming.arraysum();
		
		//ArrayProgramming.sortarray();
		//ArrayProgramming.Thirdhighestelementinarray();
		//ArrayProgramming.printduplicateinarray();
		//ArrayProgramming.insertelementinaposition();
		//ArrayProgramming.evennumsummandoddnummulti();
		//ArrayProgramming.evennumavgoddavg();
		ArrayProgramming.avgofarray();
		
		
	}

}
