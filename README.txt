# Postfix-InfixCalculator
Daniel Cancelmo
Project 2
CSC 172 - Professor Pawlicki
I did not collaborate with anyone on this assignment.
ReadMe file

Instructions for running:
To run this program, run from the command line using CalculatorTest.java (it contains the main method). After beginning the execution of the program (java CalculatorTest), when prompted, on a new line type the name of the input file first and the name of the output file second, separated by a space and press enter. The program will read the input file, convert to postfix, calculate the values, and then print to the console and write the result to the output file. Each expression should be on a separate line of the input file. Valid expressions can contain: +, -, *, /, ^, (, ), <, >, =, &, |, !, %. If an invalid expression is entered (such as dividing by zero) the user will be informed in the output file and the command line but the program will continue onto the next lines and attempt to calculate them.
Note that % computes the modulo not the percentage.

Extra credit:
Calculator can handle modulo [%].
Calculator sends error message if the user enters invalid expressions such as if the user tries to divide by zero.
To demonstrate this extra test cases are included that show these in action in ‘extra_test.txt’ and it’s corresponding ‘extra_test_result.txt’
The output of ‘extra_test.txt’ is:
	Please type the input file name and the output file name separated by a space:
	extra_test.txt extra_test_result.txt
	1.0
	0.0
	0.0
	1.0
	Invalid arithmetic. Cannot compute value.
	Invalid arithmetic. Cannot compute value.
	Program complete.


Code Synopsis:
‘CalculatorTest.java’ scans in the file names from the user. The ‘shunt’ method of ‘ShuntYard.java’ is then called passing in these file names.
A Scanner for the input file and a PrintWriter for the output file are then established. If the file name does not exist, the user is informed and the program ends.
A while loop loops through the input file one line at a time. A for loop then loops through the expression one character at a time.
First parenthesis are checked for as they are highest priorities. Then numbers and the decimal point are added to the holder. This is done using a String named ‘numString’ the current char is checked to see if it is in numString. Operator precedence is then found and compared. This is done by calling on the ‘precedence’ method that uses a switch-case to assign a precedence value to each possible operator. Operators are enqueued accordingly. After looping through each character of an expression whatever remains on the stack is enqueued. Then the method ‘postFix’ is called which calculates and returns the double value. The postFix method  loops through the enqueue and calculates each postfix expression accordingly using an if-else-if chain to do so. The final value is then pushed onto the stack and returned to the shunt method. This value is then printed to the command line and written to the file. The program does this again for each line until the input file is complete. A try-catch statement catches and handles any invalid expressions such as dividing by zero. It tells the user an invalid expression was entered and then continues onto the next line of the file.
One major obstacle I overcame was figuring out how to handle numbers. I found it difficult to figure out that the current char was a number. Even more difficult when it contained a decimal point because I couldn’t just use a try-catch statement parsing it to an int to see if it is in fact an integer. My solution was a string named ‘numString’ that contained every numeral and the decimal point and to check if the current character is in that string.

Files included:
The main method is in ‘CalculatorTest.java’. ShuntYard.Java executes the Shunting-Yard algorithm and then calculates the postfix expressions. Two packages are included: ‘Queue’ and ‘Stack’. These contain the necessary classes and interfaces to create a properly functioning queue and stack respectively.
Included are examples of input for the code in ‘infix_expr_short.txt’ and the corresponding example output file ‘my_eval.txt’. As well as examples files to show the extra credit of modulo and handling invalid expressions like dividing by zero .extra_test.txt’ and the corresponding ‘extra_test_result.txt’.
Also included are ‘OUTPUT.txt’ containing an example of output from this program and this file ‘README.txt’.
