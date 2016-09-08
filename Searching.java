import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
 		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		 int num = 0;
		 System.out.println("어떤 숫자");
		 num = scan.nextInt();
	        binarySearch(num, arr);
	    }
	 
	    public static void binarySearch(int iKey, int arr[]) {
	        int mid;
	        int left = 0;
	        int right = arr.length - 1;
	 
	        while (right >= left) {
	            mid = (right + left) / 2;

	            if (iKey == arr[mid]) {
	            	mid ++;
	                System.out.println(iKey + "는 " + mid + "번째 숫자");
	                break;
	            }
	 
	            if (iKey < arr[mid]) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	 
	        }
	    }
}
