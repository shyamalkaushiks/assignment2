package assignments;


public class palindromechecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Integer num=2552;
		
		
		String a=num.toString();
	    String num2="";
		for(int i=a.length()-1;i>=0;i--)
		{
			num2=num2+a.charAt(i);
		}
		if(a.equals(num2))
		{
			System.out.println("yes i am palindrome");
		}
		else
		{
			System.out.println("not i am not palindrome");
		}
	
	
	
		
	}


}
