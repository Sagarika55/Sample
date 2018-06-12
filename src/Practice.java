import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		
		String s="thisisthhh";
		char [] a = s.toCharArray();
		
		for (int j=0;j <a.length; j++)
		{
				    String x= Character.toString(a[j]);
				    int c=0;
				for(int i=0;i<a.length;i++)
				{
					String v=Character.toString(a[i]);
					if(x.equals(v))
					{
						c=c+1;
					}
				}
				System.out.println(x + ": Appears " + c + " :times");
		}
	
	
	}
}
