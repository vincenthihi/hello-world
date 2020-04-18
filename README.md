# hello-world
CS108: Exam 2

In my Unit Test, 

Interface Multiplier & Divider:
- I created a interface with method signatures for the next class to handle.

Class Calculator:
-Created a field called total which equaled 1
-created Getters&Setters to grab the protected int variable "Total"
-The heavy duty of the code. I used this class to formulate equations for the int y for multiply and divide.
There was one problem though, because we cannot divide by zero, we must place a throws exception within the code, which I specified within my code comments itself. 

Class MiniCalculator:
- used to return the value of total once the math has been done within the unit test.

Class UNIT TEST:
-I created methods as state from the prompt, and added test at the end of each name.
-Proceeded to instantiate the MiniCalculator which inherited the Calculator class for it to be able to do the calculations
-I called the methods by using ".multiply" or ".divide" with the object I created for example testM.multiply(); and plugged in whatever number comes to mind. 
-I implemented the try catch and finally block within the divideTest and calculateTest methods in order to catch the exception if zero were a divisor which cannot be done.

-Vincent Nguyen
