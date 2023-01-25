package assignments;

public class panagraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		boolean flag=false;
		s1=s1.replace(" ","");
		
		int[] ar=new int[26];
		   char[] stringarr=s1.toCharArray();
		   for(int i=0;i<stringarr.length;i++)
		   {
			    int value=stringarr[i]-65;
			    
			    ar[value]++;    
		   }
		   for(int i=0;i<ar.length;i++)
		   {
			   if(ar[i]==0)
			   {
				   flag=true;
			   }
			   else
			   {
				 flag=false;  
			   }
		   }
		if(flag==false)
		{
			System.out.println("It is a panagraph String");
		}
		

	}

}
