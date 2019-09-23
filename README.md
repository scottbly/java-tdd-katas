 ### Before you start:
 
>Try not to read ahead.  
>  
>Do one task at a time. The trick is to learn to work incrementally.  This is more about seeing how you work than how fast you work. 
>  
>Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata  
>
>Focus on the pattern of Red->Green->Refactor 
>>(write a failing test, write just enough code to make that test pass, and look for refactoring opportunities)
 >
 >Work how you would normally work day-to-day (ask questions of your pair partner, google, etc) 
## String Calculator: Create a simple String Calculator with a method signature:  
  
#### int add(String numbers){}  
>  
>The method can take up to two numbers, separated by commas, and will return their sum.  
for example “” or “1” or “1,2” as inputs.  
>  
### Hints:  
 - Start with the simplest test case of an empty string and move to one and then two numbers  
 - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about  
 - **Remember to pause after each passing test and look for opportunities to refactor your code to increase cleanliness, readability and maintainability** 
 
&nbsp;

**Business requirement -** Passing an empty string returns zero: **stringCalculator.add("") -> 0**  
  
&nbsp;    
    
&nbsp;    
    
**Business requirement -** Passing a single number returns that number: **stringCalculator.add("5") = 5** 
  
&nbsp;    
   
&nbsp;    
     
**Business requirement -** Passing two numbers separated by a comma returns the sum: **stringCalculator.add("4,2") = 6**  

&nbsp;

&nbsp;    
     
### The business has been using your calculator for a few months now, and has requested some additional features...
  
&nbsp;  
  
&nbsp;    
      
**Enhancement request -** Allow the Add method to handle an unknown amount of numbers: **stringCalculator.add("4,2,1") = 7**  
  
&nbsp;

&nbsp;    
    
**Enhancement request -** Calling Add with a negative number will throw an exception with message like **“negatives not allowed”**  
  
&nbsp;

&nbsp;    
    
**Enhancement request -** Calling Add with a negative number will include **all negatives passed in in the exception message**
  
&nbsp;

&nbsp;    
    
**Enhancement request -** Allow the Add method to take in an operand of +  : **stringCalculator.add("4,2,+") = 6**  
  
&nbsp;

&nbsp;    
    
**Enhancement request -** Allow the Add method to take in an operand of - :  **stringCalculator.add("4,2,-") = 2** 
  
&nbsp;

&nbsp;    
      
**Enhancement request -** Allow the Add method to take in an operand of * :   **stringCalculator.add("4,2,*") = 8**  
  
&nbsp;

&nbsp;    
    
**Enhancement request -** Allow the Add method to take in an operand of / :   **stringCalculator.add("4,2,/") = 2**  
  
&nbsp;

&nbsp;    
    
### Congrats, you've made a reverse polish notation calculator!