package array;

import java.util.Arrays;

public class Predict_the_Output {

  // 1️⃣ Access last element using length
  public static void predict1() {

    System.out.println("Method 1: Access last element using length");

    int arr[] = {10, 20, 30, 40};

    System.out.println(arr[arr.length - 1]); // Output: 40

    System.out.println();
  }


  // 2️⃣ Post-increment behavior
  public static void Post_Increment() {

    System.out.println("Method 2: Post Increment Example");

    int arr[] = {5, 10, 15};

    int i = 0;

    System.out.println(arr[i++]); // prints arr[0] = 5
    System.out.println(arr[i]); // now i = 1 → prints arr[1] = 10

    System.out.println();
  }


  // 3️⃣ Default values of array
  public static void Default_Values_Trick() {

    System.out.println("Method 3: Default Values in Array");

    int arr[] = new int[4];

    System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]
    System.out.println(arr[2]); // 0

    System.out.println();
  }


  // 4️⃣ Loop Boundary Trap (Handled safely)
  public static void Loop_Boundary_Trap() {

    System.out.println("Method 4: Loop Boundary Trap Example");

    int arr[] = {1, 2, 3, 4};

    try {

      for (int i = 0; i <= arr.length; i++) {

        System.out.print(arr[i] + " ");
      }

    } catch (Exception e) {

      System.out.println("\nException Occurred: " + e);

      System.out.println("Reason: Index exceeds array length");
    }

    System.out.println();
  }


  // 5️⃣ Array Reference Trick
  public static void Array_Reference_Trick() {

    System.out.println("Method 5: Array Reference Behavior");

    int a[] = {1, 2, 3};

    int b[] = a; // both reference same array

    b[0] = 10;

    System.out.println("Value of a[0] after modifying b[0]: " + a[0]);

    System.out.println();
  }

  public static void Multiple_Increment_Trick() {
    int arr[] = {10,20,30,40};

    int i = 1;

    arr[i++] = arr[++i];

    System.out.println(arr[1]); // Output 20
    
    /*
     * Step-by-step: i = 1
     * 
     * Right side executes first: ++i → 2 arr[2] = 30
     * 
     * Left side: arr[i++] → arr[2]
     * 
     * So: arr[2] = 30
     * 
     * Array unchanged at index 1
     */
  }

  // MAIN METHOD
  public static void main(String[] args) {

    predict1();

    Post_Increment();

    Default_Values_Trick();

    Loop_Boundary_Trap();

    Array_Reference_Trick();
  }
}
