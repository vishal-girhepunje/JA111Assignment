### Question-4

Zia constructions limited is offering construction services on the labour charge basis only as well as labour charge + Material charges.

their charges are as follow-
Labour charges: 250/- per square feet
Material charges: 350/- per square feet

It is up to their customer to choose is they want to get the work done on labour charges only or material + labour charges both. The Sample test cases are as follow-

***Sample Input-1***
Welcome to Zia constructions limited
Enter you construction area in per square feets 1000
Do you want to take material also [y/n]: y

***Output***
You total bill is: 600000

***Sample Input-2***
Welcome to Zia constructions limited
Enter you construction area in per square feets 1000
Do you want to take material also [y/n]: n

***Output***
You total bill is: 250000

Zia constructions limited has hired the rohan for writing a program to compute the total cost. Rohan wants to use method overloading to solve the same problem. Write code for the same.

```java
class ZiaConstructionsLimited{
  double getTotalCost(double totalArea, double labourCharges){
    //return the total bill cost up to two decimal places
  }
  
  double getTotalCost(double totalArea, double labourCharges, double materialCharges){
    //return the total bill cost up to two decimal places
  }
}

class ZiaConstructionsLimitedTester{
  public static void main(String args[]){
    ZiaConstructionsLimited zcl = new ZiaConstructionsLimited();
    System.out.println(zcl.getTotalCost(1500, 250));
    System.out.println(zcl.getTotalCost(1500, 250, 350));
  }
}
```