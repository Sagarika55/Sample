
public class Test {
	

	public static void main(String[] args) {
		String s1="this is testing";
		String [] s2= s1.split(" ");
		String wordrev=" ";
		for(int i=0;i<s2.length;i++)
		{
			String word=s2[i];
			String reverse=" ";
			for(int j=word.length()-1;j>=0;j--) {
				reverse=reverse+word.charAt(j);
			}
			wordrev=wordrev+reverse+" ";
		}
		System.out.println(s1);
		System.out.println(wordrev);
		
		
		//---------------------------
		String s3="Testing";
		char [] s4=s3.toCharArray();
		for(int s=s4.length-1;s>=0;s--) {
			System.out.println(s4[s]);
		}
		//-------------------------
		
		String hi="testing";
		StringBuffer sb= new StringBuffer();
		sb.append(hi);
		sb=sb.reverse();
		System.out.println(sb);
		
		//-----------------------------
		
		String sd="thsi ghj iok";
		String [] sr= sd.split(" ");
		for(String sf:sr) {
			System.out.println(sf);
			
		}

		
	}
}
