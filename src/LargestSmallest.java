
public class LargestSmallest {

	public static void main(String[] args) {
		int numbers[]= {2,34,56,1,-2,8,89};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
				
			}
			 
		}
		System.out.println("largest="+largest);
		System.out.println("Smallest="+smallest);

	}

}
