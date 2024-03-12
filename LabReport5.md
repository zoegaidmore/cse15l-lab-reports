# Lab Report 5 - Putting it All Together

### Part 1 – Debugging Scenario 

**The original post from a student with a screenshot showing a symptom and a description of a guess at the bug/some sense of what the failure-inducing input is. (Don't actually make the post! Just write the content that would go in such a post)**

Hi there, my ListExamples.java code isn't passing my tests, and I'm not sure what's wrong.
![](Lab5Symptom.png)
I've attatched an image of the symptom of the bug. The test file tests the merge method with the arrays `["a", "b", "c"]` and `["a", "d"]`. Initially I thought that it was a problem in my iterating over the arrays, because it appears that the last element of the second array wasn't added to the merged array. However, I don't see any issues with my while loop.


**A response from a TA asking a leading question or suggesting a command to try (To be clear, you are mimicking a TA here.)**

Hello, you should try to write a few extra tests, to see if it is an issue with the iterator or something else. Maybe write a test where  the element that will be the last in the resulting array (the "greatest" element) is in the shorter of the two arrays.


**Another screenshot/terminal output showing what information the student got from trying that, and a clear description of what the bug is.**

I added the recommended test, and my new output was:
![](Lab5Symptom2.png)
So, it appears that the problem is not with my code that iterates through the second array, but rather the problem lies with adding elements to the array after all of the elements from *one* array are added, leaving only elements from the other. 


**The file & directory structure needed**
**The contents of each file before fixing the bug**
**The full command line (or lines) you ran to trigger the bug**
**A description of what to edit to fix the bug**
