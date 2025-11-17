import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelIntroduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr.length+"Total elements");
		System.out.println(arr[0]+"first element");
        System.out.println(arr[arr.length-1]+"last lement");
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
        

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 ==0)
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				System.out.println(arr[i]+ "This number is odd number");
			}
		}
		ArrayList<String> a= new ArrayList<String>();
		a.add("Jothi");
		a.add("Loves");
		a.add("Karthik");
		a.add("Verymuch");
		System.out.println(a.get(3));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		// Array list contains the value
		System.out.println(a.contains("Jothi"));
		String[] name= {"Jothi","Karthik","LovesMore"};
		List<String> name1=Arrays.asList(name);
		name1.contains("LovesMore");
		String s1=new String("Welcome");
		
		String s2="Jothi Loves Karthik";
		String[] s3=s2.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		String[] s4=s2.split("Loves");
		System.out.println(s4[0]);
		System.out.println(s4[1].trim());
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i));
		}
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			System.out.println(s2.charAt(i));
		}
		
		
		
		
		
		
	}

}
