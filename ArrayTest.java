
public class TestRunner {

  public static void main(String[] args) {

  //  TestRunner.testReduceSum();
    TestRunner.testSplice();

    // TODO: add additional static methods (and calls!)
    // for each of the other parts of the assignment.

  }

  public static void testReduceSum() {
    System.out.println("=======================");
    System.out.println("   1.1 reduceSum       ");
    System.out.println("=======================");

    System.out.println("1. reduceSum - expected: 0 - actual: " + ArrayUtils.reduceSum(new int[] {}));
    System.out.println("2. reduceSum - expected: 1 - actual: " + ArrayUtils.reduceSum(new int[] { 1 }));
    System.out.println("3. reduceSum - expected: 5 - actual: " + ArrayUtils.reduceSum(new int[] { 2, 3 }));
    System.out.println("4. reduceSum - expected: 15 - actual: " + ArrayUtils.reduceSum(new int[] { 4, 5, 6 }));
  }
  public static void testSplice(){
  int[] a = new int[] {1, 2, 3};
  int[] b = new int[] {9, 9};
  ArrayUtils.print(ArrayUtils.splice(a, 0, b));
  System.out.print("-> {9, 9, 1, 2, 3}");
  ArrayUtils.print(ArrayUtils.splice(a, 1, b));
  System.out.print("-> {1, 9, 9, 2, 3}");
  ArrayUtils.print(ArrayUtils.splice(b, 1, a));
  System.out.print("-> {9, 1, 2, 3, 9}");
  ArrayUtils.print(ArrayUtils.splice(b, 2, a));
  System.out.print("{9, 9, 1, 2, 3}");
  }

}
