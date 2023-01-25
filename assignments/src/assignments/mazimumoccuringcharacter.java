package assignments;


public class mazimumoccuringcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int count=1;
		int max=1;
		char aa =' ';
		String name="shyamalkaushiklll";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			 count=1; 
       for(int j=i+1;j<name.length();j++)
       {
    	   if(a[i]==a[j])
    	   {
    		   count++;
    	   }
    	   
       }
       if(max<count)
       {
    	max=count;
    	aa=a[i];
       }
       
		}
		System.out.println("the maximum occuring character is "+aa+" and occuring at times"+max);
}
}