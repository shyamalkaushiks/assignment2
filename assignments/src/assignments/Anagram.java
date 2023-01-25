package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="cat";
String s2="at  c";
s1=s1.replace(" ","");
s2=s2.replace(" ","");
s1=s1.toLowerCase();
s2=s2.toLowerCase();
   char[] arr1=s1.toCharArray();
   char[] arr2=s2.toCharArray();
   Arrays.sort(arr1);
   Arrays.sort(arr2);
   
   boolean b1=Arrays.equals(arr1, arr2);
  if(b1==true)
  {
	  System.out.println("Anagram");
  }
  else
  {
	  System.out.println("Not Anagram");
  }
	}

}
