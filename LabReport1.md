# Lab Report 1: Remote Access and FileSystem

**For `cd` command:**

1. An example of using the command with no arguments.
![Image](cd1.png)
Before this command was run, the working directory was `/home`. This didn't change after the command was run.

Because no arguments were given and we called `cd`, we did not change the directory. Having no arguments meant that we didn't give the name of a file to change the directory to, so nothing was output and the directory didn't change (this is visible on the line below where the `cd` command was called, where we can see that nothing after the ~ has changed. 

2. An example of using the command with a path to a directory as an argument.
![Image](cd2...png)
Before this command was run, the working directory was `/home`. After the command was run, the working directory was `/home/lecture1`.

Nothing was given as an output, however we can see that our command changed the directory because in the line underneath the command, we can see that the ~ is followed by `/lecture1`, indicating that the directory has been changed to `/home/lecture1`.

3. An example of using the command with a path to a file as an argument.
![Image](cd3.png)
Before the `cd en-us.txt/` command was run, the directory was `/home/lecture1/messages`. The command did not change the working directory.

The output after this command was `bash: cd: en-us.txt/: Not a directory`. We recieved this output becasue you can not change the directory to a file, you can only change the directory to a directory. This is why this command didn't change the directory.


**For `ls` command:**

1. An example of using the command with no arguments.
![Image](ls1.png)
Before this command was run, the working directory was `/home`. After it was run, the working directory was the same (this command does not change the working directory).

The output after this command was `lecture1`. This was output because the `ls` command outputs what is included in the specified directory. In this case, there was no argument, so the `ls` command was called on the `/home` file. It output the file which was inside this file: `lecture1`.

2. An example of using the command with a path to a directory as an argument.
![Image](ls2.png)
Before this command was run, the working directory was `/home`. After it was run, the working directory was the same (this command does not change the working directory).

The output after this command was `Hello.class  Hello.java  messages  README`. This was output because the `ls` command was called on the `lecture1/`. So, it output all of the files, folders and pages inside of it, which are `Hello.class`, `Hello.java`, `messages`, and `README`.

3. An example of using the command with a path to a file as an argument.
![Image](ls3.png)
Before this command was run, the working directory was `/home`. After it was run, the working directory was the same (this command does not change the working directory).

The output after this command was `lecture1/messages/en-us.txt`. This is because the `ls` command was called on a specific file itself, rather than a folder that has contents. So, the command prints the file itself that was given as input. 


**For `cat` command:**

1. An example of using the command with no arguments.

2. An example of using the command with a path to a directory as an argument.

3. An example of using the command with a path to a file as an argument.

