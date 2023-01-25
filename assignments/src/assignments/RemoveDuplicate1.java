package assignments;



public class RemoveDuplicate1 {


	public static void main(String[] args) {
String s1="rama";
char[] arr1=s1.toCharArray();
StringBuilder sb1=new StringBuilder();


for(int i=0;i<arr1.length;i++)
{
	boolean flag=false;	
	for(int j=i+1;j<arr1.length;j++)
	{
		if(arr1[i]==arr1[j])
		{
		flag=true;	
		break;
		}
		
	}
	if(flag==false)
	{
	sb1.append(arr1[i]);	
	}
	
	
}
	System.out.println("the ubnique character is"+ sb1);
	}
}
