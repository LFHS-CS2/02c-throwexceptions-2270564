[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3144848&assignment_repo_type=AssignmentRepo)
In BankAccount.java,

1. Change ```withdraw``` to throw an ```IllegalArgumentException``` if the balance would go negative. (This exception already exists.)

2. Create a class called ```InsufficientFundsException``` that extends ```RuntimeException```.

3. Change ```withdraw2``` to throw an ```InsufficientFundsException``` if the balance would go negative. Notice that you do NOT need to change the method's header.

4. Create a class called ```InsufficientFundsException2``` that extends ```Exception```.

5. Change ```withdraw3``` to throw an ```InsufficientFundsException```if the balance would go negative. Notice that you DO need to change the method's header to explicitly show that it is throwing ```InsufficientFundsException2``` which is not a ```RuntimeException```.

