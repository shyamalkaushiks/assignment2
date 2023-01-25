package assignments;

public class uniquecharacter {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		String a="shyambaba";
		boolean flag=false;
	char[] af=a.toCharArray();
	//	System.out.println(af.length);
		
		for(int i=0;i<af.length;i++)
		{
			for(int j=i+1;j<af.length;j++)
			{
				if(af[i]==af[j])
				{
					flag=true;
					System.out.println("it is not unique and duplicate found at "+i);
					break;
				}
				
					
			}
		}
		if(flag==false)
		{
			System.out.print("it is a  unique string");
		}
		
	}

}
