
public class RemoveJunk {
	public static void main(String[] args) {
		
		String s="$%%^^ Hi Regular expression 3@$%@^4";
		s=s.replaceAll("[^0-9A-Za-z]", "");
		System.out.println(s);
		
	}

}
