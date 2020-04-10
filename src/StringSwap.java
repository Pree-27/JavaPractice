
public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
        String y="Selenium";
        System.out.println("The value before swap: s: " +s );
		System.out.println("The value before swap: y: " +y );
		s=s+y;
		System.out.println("The value  s: " +s );
		y=s.substring(0, s.length()-y.length());
		System.out.println("The value  y: " +y );
		s=s.substring(y.length(), s.length());
		System.out.println("The value  s: " +s );
        
	}

}
