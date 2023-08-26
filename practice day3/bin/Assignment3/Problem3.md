### Question-3

Mr. Joseph is using the telecom services from company JOY infocom such that the JOY infocom is providing three types of services will following charges that are

Service  		Monthly Charges
Call service      300/-
Data service  	125/-
SMS service  	50/-

Users of JOY infocom are free to choose any service such that users may choose more than one service also. You need to write a body of getBillAmount() to calculate bill amounts based on the number of services used by the user.

***Sample Input-1***
Do you avail Call services: true
Do you avail Data services: true
Do you avail SMS services: true

**Output**
Your bill amount is: 475/-

***Sample Input-2***
Do you avail Call services: true
Do you avail Data services: true
Do you avail SMS services: false

**Output**
Your bill amount is: 425/-

***Sample Input-3***
Do you avail Call services: true
Do you avail Data services: false
Do you avail SMS services: false

***Output***
Your bill amount is: 300/-

<aside>
💡 Tip: As of now you don’t know how to take input so you may write input values in the code itself.

</aside>

```java
class JoyInfocom{
  double getBillAmount(boolean usingCallService, boolean
usingDataService, boolean usingSMSService){
    //write code to return bill amount up to two decimal places
  }
}

class JoyInfocomTester{
  public static void main(String args[]){
    JoyInfocom joy = new JoyInfocom();
    System.out.println(joy.getBillAmount(true, true, false));
    System.out.println(joy.getBillAmount(true, false, false));
    System.out.println(joy.getBillAmount(true, true, true));
  }
}
```

### Q