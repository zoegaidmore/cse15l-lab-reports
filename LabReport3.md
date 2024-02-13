
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
public void testReversed() {
	int[] input1 = { };
	assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
}
```
This is the JUnit test code that was given in the original file, and it does not induce a failure. The empty array `{0}` is correctly reversed according to this test.

**The symptom, as the output of running the tests:**
![](FailureOutput.png)


**The bug, as the before-and-after code change required to fix it:**

Before fixing the bug:
```
static int[] reversed(int[] arr) {
	int[] newArray = new int[arr.length];
	for(int i = 0; i < arr.length; i += 1) {
		arr[i] = newArray[arr.length - i - 1];
	}
	return arr;
}
```

After fixing the bug:
```
static int[] reversed(int[] arr) {
	int[] newArray = new int[arr.length]; 
	for(int i = 0; i < arr.length; i += 1) {
		newArray[i] = arr[arr.length - i - 1];
    	}
	return newArray;
}
```

This change in code fixed the bug because the original code created a new empty array called `newArray`, then, in reverse order, added the elements of `newArray` to the original array `arr`. So, the elements of the empty array (all 0's) were added to the array `arr`, which was then returned. The returned array would always be all 0's.
The new code, however, added the elements of `arr` to the empty array `newArray` in reverse order. `newArray` is then returned, which is an array containing the elemtns of `arr` in reverse order. 

### Part 2:

**4 interesting command-line options or alternate ways to use the the `grep` command:**

For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a code block that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.


1. `-c`
	This command line argument returns the count of how many times the specific String is found in the specified file. This is useful 	because it can tell you if a certain String is even found in a file, and if so how many times. Paired with the `r` command line 	argument, you can see the name of every file and how many times the specified String is seen in it.


	```
	Zoes-MacBook-Air:technical zoegaidmore$ grep -c "this" biomed/1471-213X-3-2.txt
	4
	```

 
	```
	Zoes-MacBook-Air:technical zoegaidmore$ grep -c "base pair" plos/journal.pbio.0020001.txt
	0
	```

3. `-i`

4. `-m`

5. `-w`

**Sources:**
