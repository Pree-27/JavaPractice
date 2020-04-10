
public class reverseString {
	public static void main(String[] args) {
		String s ="selenium";
		System.out.println(s);
		String rev = "";
		int len=s.length();
		/*for(int i=len-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		 System.out.println("The Reversed String= " + rev);
		 */
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
