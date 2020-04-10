
public class swap {
	public static void main(String[] args)
	{
		int x=25;
		int y=36;
		/*System.out.println("The value before swap: x: " +x );
		System.out.println("The value before swap: y: " +y );
		int temp=x;
		x=y;
		y=temp;
		System.out.println("The value after swap: x: " +x );
		System.out.println("The value after swap: y: " +y );*/
		System.out.println("The value before swap: x: " +x );
		System.out.println("The value before swap: y: " +y );
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The value after swap: x: " +x );
		System.out.println("The value after swap: y: " +y );
        		
	}

}
