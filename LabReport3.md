
# Lab Report 3 - Bugs and Commands

### Part 1:

Completed in reference to the bug in the `static int[] reversed(int[] arr)` method.

**A failure-inducing input for the buggy program, as a JUnit test and any associated code:**
```
@Test
public void testReversed1() {
int[] input1 = new int[]{1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }
```

**An input that doesn't induce a failure, as a JUnit test and any associated code:**
```
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
```
This is the JUnit test code that was given in the original file, and it does not induce a failure. The array `{3}` is correctly reversed according to this test.

**The symptom, as the output of running the tests:**

**The bug, as the before-and-after code change required to fix it:**
Before fixing the bug:
```
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
  }
}
```

After fixing the bug:
```
static int[] reversed(int[] arr) {
  int[] newArray = new int[arr.length]; //new arr = [0, 0, 0, 0, 0]
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
  return arr;
}
```

### Part 2:
