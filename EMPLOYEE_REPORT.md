 ### Before you start:
 
>Try not to read ahead.  
>  
>Do one task at a time. The trick is to learn to work incrementally.  This is more about seeing how you work than how fast you work. 
>
>Focus on the pattern of Red->Green->Refactor 
>>(write a failing test, write just enough code to make that test pass, and look for refactoring opportunities)
 >
 >Work how you would normally work day-to-day (ask questions of your pair partner, google, etc) 
## Employee Report:
  
>  
>You’re building an employee management system of a local grocery store. You must create a report listing what employees are working on a given day.
>  
### Hints:  
 - We'll start with the simplest test case of all employees  
 - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about  
 - **Remember to pause after each passing test and look for opportunities to refactor your code to increase cleanliness, readability and maintainability** 
 
&nbsp;

**Requirement -** Return report of all Employees in the database
  
&nbsp;    
    
&nbsp;    

**Requirement -** Sort report by hire date, preferring Employees with seniority

&nbsp;    
    
&nbsp;  

**Requirement -** Report should exclude Employees who have the given day off

&nbsp;    
    
&nbsp;  

**Requirement -** Only Employees 18 or older can work on Fridays

&nbsp;    
    
&nbsp;  

**Requirement -** The shop is closed on Wednesdays. If a report is requested for Wednesday, an error should be thrown with message like "Closed on Wednesdays"
    
&nbsp;    
    
&nbsp;  

**Requirement -** The shop is considering opening on Wednesdays. Enhance the report so the Wednesday error message includes Employees who would have the day off like "Closed on Wednesdays, Bob and Jim would not be working"
    
&nbsp;    
    
&nbsp;  

**Requirement -** Enhance the report to take in a boolean if alcohol sales are needed. Only employees 21 or older can sell alcohol.
   
&nbsp;    
    
&nbsp;  

**Requirement -** The shop is now staying open 10 hours on weekends. Employees under 18 cannot make more than $100 a day for tax reasons. If they would make more, do not schedule them for that day.