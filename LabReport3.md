
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
This is the JUnit test code that was given in the original file, and it does not induce a failure. The empty array is correctly reversed according to this test.

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
The new code, however, added the elements of `arr` to the empty array `newArray` in reverse order. `newArray` is then returned, which is an array containing the elements of `arr` in reverse order. 




### Part 2:

**4 interesting command-line options or alternate ways to use the the `grep` command:**

For each of those options, give 2 examples of using it on files and directories from ./technical. Show each example as a code block that shows the command and its output, and write a sentence or two about what it’s doing and why it’s useful.



**1. `-c`:**

This command line argument returns the count of how many times the specific String is found in the specified file. This is useful 	because it can tell you if a certain String is even found in a file, and if so how many times. Paired with the `-r` command line 	argument, you can see the name of every file and how many times the specified String is seen in it.


**Example 1:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -c "this" biomed/1471-213X-3-2.txt
4
```


**Example 2:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -c "base pair" plos/journal.pbio.0020001.txt
0
```




**2. `-i`:**

This command line argument indicates to ignore the case of the String to search for. It returns the lines that contain the specified String, regarless of it's capitalization. So, searching for "CaT" returns the same thing as searching for "cat". This is useful because the default mode for the `grep` command is to be case-sensitive, meaning searching for "cat" would not turn up results for "CAT" or "Cat".


**Example 1:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -i "vAlLeY" government/Media/A_helping_hand.txt 
INLAND VALLEY March 9, 2002
She is trying to bring legal aid services to the Inland Valley
Inland valleys.
```
In this example, we see the word "valley" with three different combinations of cases: "VALLEY", "Valley", and "valley", and each of these versions were returned from a search for "vAlLeY".


**Example 2:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -i "THIS" biomed/1471-213X-3-2.txt
when over-expressed in Xenopus embryos. Wnts in this
Wnts in this class have been shown to signal in a
transformation of C57mg cells [ 12 ] . This data suggests
cellular contexts. This potential role of Wnt-5a as a tumor
signaling in this list include fibronectin [ 17 ] , IL-6 [
This fold change was similar to the data obtained from
transiently activate the Wnt/Ca 2+signaling pathway. This
derived from Rfz-2. This receptor has previously been shown
B). To our knowledge this is the first report to show that
```




**3. `-m`:**

This command line argument takes in a specific number of lines that indicates the maximum number of matches that the `grep` command will search for. So, if a file contains more than the specified amount of a specific String, it will only print out the specified maximum nubmer of lines containing this String. This is helpful because it stops us from having a ton of lines of code output that take up the entire terminal.


**Example 1:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -m 3 "this" biomed/1471-213X-3-2.txt
	when over-expressed in Xenopus embryos. Wnts in this
	Wnts in this class have been shown to signal in a
	signaling in this list include fibronectin [ 17 ] , IL-6 [
```
Above, in the `-c` examples, we saw that `biomed/1471-213X-3-2.txt` contained four counts of the word "this". However, here only three lines are printed, because the `-m` command line argument took in 3, indicating 3 as the maximum number of lines to be printed. 


**Example 2:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -m 5 "a" 911report/chapter-13.1.txt
	As presently configured, the national security institutions of the U.S. government
		are still the institutions constructed to win the Cold War. The United States
                confronts a very different world today. Instead of facing a few very dangerous
                adversaries, the United States confronts a number of less visible challenges that
                surpass the boundaries of traditional nation-states and call for quick, imaginative,
```




**4. `-w`:**

This command line argument returns only the lines that have the word given as an argument if that String is presented as a full word. So, a search for the word "the" would not turn up the lines containing "these" or "bathe", only "the" with a non-letter character before and after the word. This is useful becasue it allows you to look for a specific word on its own, which stops you from getting random results you didn't want just because the word you are searching for is inside another word. 


**Example 1:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -w "town" government/Media/5_Legal_Groups.txt 
town trying to find the right agency.
```
This shows `-w` in use because this file contains the word "downtown" as well as "town". So, a normal call to `grep` would return other lines besides the one output when using `-w`. This is the same file being searched using `grep` without `-w`:
```
Zoes-MacBook-Air:technical zoegaidmore$ grep "town" government/Media/5_Legal_Groups.txt 
disabilities have joined together to acquire a west-side downtown
parking, something that's hard to find downtown and which has been
town trying to find the right agency.
```


**Example 2:**
```
Zoes-MacBook-Air:technical zoegaidmore$ grep -w "law" government/Media/Annual_Fee.txt 
legal services to the poor to provide equal justice under the law,
expand its outreach in law schools, according to Murphy. She added
```
This shows `-w` in use because this file contains the word "lawyer" as well as "law". So, a normal call to `grep` would return other lines besides the one output when using `-w`. 




### Source:
[https://man7.org/linux/man-pages/man1/grep.1.html](https://man7.org/linux/man-pages/man1/grep.1.html)
