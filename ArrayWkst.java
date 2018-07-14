
public class ArrayWkst {

  /* Part 1. Reducers */
//Complete the method to return a sum of all the elements in the given array
  public static int reduceSum(int[] a) {
	  int sum = 0;
	  for (int i = 0; i < a.length; i++) {
		  sum = sum + a[i];
	  }
	  return sum;
  }
//Return a product of all the elements in the given array
  public static int reduceProduct(int[] a) {
	  int product = 0;
	  for (int i = 0; i < a.length; i++) {
		  product = product * a[i];
	  }
	  return product;
  }
//Return the number of times a given element is found in an array
  public static int reduceCount(int[] a, int n) {
	  int count = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] == n) {
			  count++;
		  }
	  }
	  return count;
  }
//Return the number of odd numbers found in an array
  public static int reduceCountOdds(int[] a) {
	  int oddNumbers = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] % 2 == 1) {
			  oddNumbers++;
		  }
	  }
	  return oddNumbers;
  }
//Return the smallest element in an array
  public static int reduceMin(int[] a) {
	  int smallestInt = 0;
	  int currentInt;
	  for (int i = 0; i < a.length; i++) {
		  currentInt = a[i];
		  for (i = 0; i < a.length; i++) {
			  if (currentInt <= a[i]) {
				  smallestInt = currentInt;
			  }
			  else if (a[i] < currentInt) {
				  smallestInt = a[i];
			  }
		  }
	  }
	  return smallestInt;
  }

//Return the largest element in an array
  public static int reduceMax(int[] a) {
	  int largestInt = 0;
	  int currentInt;
	  for (int i = 0; i < a.length; i++) {
		  currentInt = a[i];
		  for (i = 0; i < a.length; i++) {
			  if (currentInt >= a[i]) {
				  largestInt = currentInt;
			  }
			  else if (a[i] > currentInt) {
				  largestInt = a[i];
			  }
		  }
	  }
	  return largestInt;
  }

  /* Part 2. Logical Tests */

//See if a given element is found in an array
  public static boolean contains(int[] a, int n) {
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] == n) {
			  return true;
		  }
	  }
	  return false;
  }

  //See if every element in an array is equal to a given int n
  public static boolean every(int[] a, int n) {
	  int count = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] != n) {
			  count++;
		  }
	  }
	  if (count == 0) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

//See if two arrays are equal to each other
  public static boolean equals(int[] a, int[] b) {
	  int count = 0;
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] != b[i]) {
			  count++;
		  }
	  }
	  if (count == 0) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }

  /* Part 3. Stringify and Clone */

//Make an array into a String representation
  public static String stringify(int[] a) {
	  char [] array = new char[a.length];
	  for (int i = 0; i < a.length; i++) {
		  char aChar = (char) a[i];
		  a[i] = aChar;
	  }
	  String arrayString = array.toString();
	  return arrayString;
  }

//Print each element of an array
  public static void print(int[] a) {
	  for (int i = 0; i < a.length; i++) {
		  System.out.println(a[i]);
	  }
  }

//Clone a given array
  public static int[] clone(int[] a) {
	  int [] clonedArray = new int [a.length];
	  for (int i = 0; i < clonedArray.length; i++) {
		  clonedArray[i] = a[i];
	  }
	  return clonedArray;
  }

  /* Part 4. Mappers */

//Return a new array that is the square of each element of the original array
  public static int[] mapSquare(int[] a) {
	  int[] newArray = new int[a.length];
	  for (int i = 0; i < a.length; i++) {
		  newArray[i] = a[i] * a[i];
	  }
	  return newArray;
  }

//Return a new array that adds the element n to each element of the original array
  public static int[] mapAdd(int[] a, int n) {
	  int[] newArray = new int[a.length];
	  for (int i = 0; i < a.length; i++) {
		  newArray[i] = a[i] + n;
	  }
	  return newArray;
  }

//Return a new array that multiples each element of the original array by n
  public static int[] mapMultiply(int[] a, int n) {
	  int[] newArray = new int[a.length];
	  for (int i = 0; i < a.length; i++) {
		  newArray[i] = a[i] * n;
	  }
	  return newArray;
  }

  /* Part 5. Utilities */

//Reverse a given array
  public static int[] reverse(int[] a) {
	  int[] reversedArr = new int[a.length];
	  for (int i = 0, j = a.length - 1; i < a.length && j >= 0; i++, j--) {
		  reversedArr[i] = a[j];
	  }
	  return reversedArr;
  }

//Reverse a given array without using a new array
  public static int[] reverseInPlace(int[] a) {
	  for (int front = 0, end = a.length - 1; front < (a.length / 2) && end >= (a.length / 2); front++, end--) {
		  int currFront = a[front];
		  int currEnd = a[end];
		  a[end] = currFront;
		  a[front] = currEnd;
	  }
	  return a;
  }

//Add array b to the end of array a and then return the resulting array
  public static int[] concatenate(int[] a, int[] b) {
	  int combinedLength = a.length + b.length;
	  int [] newArray = new int[combinedLength];
	  for (int i = 0; i < a.length; i++) {
		  newArray[i] = a[i];
	  }
	  for (int j = a.length, i = 0; j < combinedLength && i < b.length; j++, i++) {
		  newArray[j] = b[i];
	  }
	  return newArray;
  }

//Return an array that includes the element at the start index, and excludes
//the element in the end position
  public static int[] subarray(int[] a, int start, int end) {
	  int [] newArray = new int [1];
	  newArray[0] = a[start];
	  return newArray;
	  // is that what this is asking for ????
  }

//Return the original array without the element n
  public static int[] without(int[] a, int n) {
	  for (int i = 0; i < a.length; i++) {
		  if (a[i] == n) {
			  a[i] = a[i+1];
		  }
	  }
	  int [] newArray = new int [a.length - 1];
	  for (int i = 0; i < newArray.length; i++) {
		  newArray[i] = a[i];
	  }
	  return newArray;
  }

//Create a new array with array b interwoven with array a
//e.g. a[0] b[0] a[1] b[1] etc.
  public static int[] interleave(int[] a, int[] b) {
	  int count = 0;
	  int [] newArray = new int [a.length + b.length];
	  while (count < newArray.length + 2) {
		  for (int i = 0; i < b.length; i++) {
			  newArray[count] = a[i];
			  count++;
			  newArray[count] = b[i];
			  count++;
		  }
	  }
	  return newArray;
	  // assuming that b and a are the same sizes ??
  }

//Insert array b into array a at the position given by the offset
  public static int[] splice(int[] a, int offset, int[] b) {
	  int [] newArray = new int[a.length + b.length];
	  for (int i = 0; i < offset; i++) {
		  newArray[i] = a[i];
	  }
	  for (int i = 0, j = offset; i < b.length && j < b.length; i++, j++) {
		  newArray[j] = b[i];
	  }
	  for (int i = b.length + offset, j = offset; i < newArray.length && j < a.length; i++, j++) {
		  newArray[i] = a[j];
	  }
	  return newArray;
  }
}
