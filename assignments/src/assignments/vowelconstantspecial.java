package assignments;

public class vowelconstantspecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="shyamal8kaushik";
String names=name.toLowerCase();
Integer vowel = 0;
Integer constant = 0;
Integer specialcharacter=0;
for(int i=0;i<names.length();i++)
{
char ch=names.charAt(i);
if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
{
	if(ch=='a' ||ch=='e' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
	{
	vowel++;
	}
	else
	{
		constant++;	
	}
}

else if((ch>='0' && ch<='9')||ch==' ' )
{
	specialcharacter++;
}
	

}
System.out.println(vowel);
System.out.println(constant);
System.out.println(specialcharacter);
}
}
