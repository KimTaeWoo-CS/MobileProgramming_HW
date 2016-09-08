import java.util.*;

public class Sorting {
	
	public static void main(String[] args) {
		int arr[] = new int[5];
	     Scanner scan = new Scanner(System.in);

	    System.out.println("5가지 값을 입력하세요");
	     
	     for(int i = 0; i < 5; i++)
	    {
	       arr[i] = scan.nextInt();
	    }

	    int temp = 0;

	    for(int i = 0 ; i < 5 ; i++)
	    {
	       for(int k = i ; k < 5 ; k++)
	       {
	            if(arr[i] < arr[k])
	         {
	            temp = arr[i];
	            arr[i] = arr[k];
	            arr[k] = temp;
	         }
	      }
	    }
	 
	    System.out.println("결과는");
	    for(int i = 0 ; i < 5 ; i++)
	    {
	       System.out.println(arr[i]);
	     }
	}

}
