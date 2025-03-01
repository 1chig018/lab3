

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) { //change the loop to half for swapping
      int reverse = arr[i]; //swapping the ith and ith last elements
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = reverse;    
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray; //return the right thing which is newArray not arr
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    boolean droped = false; //indicate if has dropped lowest
    for(double num: arr) {
      if(num != lowest || droped) { sum += num; //if not lowest or has dropped, add sum
    }else{
      droped = true; //first time if lowest maintain true
    }
    }
    return sum / (arr.length - 1);
  }


}

