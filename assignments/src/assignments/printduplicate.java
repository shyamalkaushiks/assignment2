package assignments;

public class printduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String user="shyamal";
char[] arr=user.toCharArray();

for(int i=0;i<arr.length;i++)
{
	boolean flag=false;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			flag=true;
			break;
		}
	}
	if(flag==true)
	{
		System.out.print("hey bro i am duplicate "+arr[i] );
		
	}
}
	}

}
