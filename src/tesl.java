
public class tesl {

	public static void main(String[] args) {
	String s="Hello World";
	//char [] a= s.toCharArray();
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	/*System.out.println(sb.deleteCharAt(2));*/
	
	//StringBuilder sb = new StringBuilder("Soumendra");
//int i = sb.indexOf("S");
//System.out.println(i);
System.out.println(sb.insert(2, "cat"));

	
	/*for(int i=0;i<a.length;i++)
	{
		if(i!=2)
		{
			sb.append(a[i]);
		}
	}*/
	
	System.out.println(sb);
	//o/p: Helo world
	
	
	

	}

}
