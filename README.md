
# SimuBank

SimuBank is a simple project made in Java to practice issuing exceptions. The project consists of a simulation of account creation with withdrawal and deposit methods. methods with value checks and throwing exceptions.


## Methods



```JAVA
     public void deposit(Double amount) {
        this.withdrawLimit += amount;
    }

    public void withdraw(Double amount) throws ErrorsAccount {
        if(amount > withdrawLimit) {
            throw new ErrorsAccount("Withdraw error: The amount exceeds withdraw limit!");
        }
        if(withdrawLimit > balance) {
            throw new ErrorsAccount("Withdraw error: not enough balance! ");
        }
        this.balance -= amount;
    }

    public class ErrorsAccount extends Exception {
        public ErrorsAccount(String message) {
            super(message);
        }
    }
```



## Functionalities

- Withdrawal and deposit
- Account creation
- Withdrawal limit amount.

