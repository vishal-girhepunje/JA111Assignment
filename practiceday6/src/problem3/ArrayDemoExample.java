package problem3;

public class ArrayDemoExample {
	static int[] getEvenOddCount(int arr[]) {
	    //create an array with two elements
	    //The value at index 0 is for counting of even elements
	    //The value at index 1 is for counting of odd elements
	    int brr[] = {0, 0};

	    for(int a: arr)
	      if(a % 2 == 0)
	        brr[0]++;
	      else
	        brr[1]++;

	    //return array
	    return brr;
	  }

	  public static void main(String[] args) {
	    //Create an array
	    int arr[] = {1, 5, 9, 4, 12, 14, 3};
	    int brr[] = getEvenOddCount(arr);
	    System.out.println("Total even elements " + brr[0]);
	    System.out.println("Total odd elements " + brr[1]);
	  }
}
