### Question-2

Mr. Ghanshyam & Ms. Richa have decided to purchase watches from ABC corporations such that ABC corporations used to have different pricing components customer wise. The mandatory components are- cost price, profit percentage & GST.

For women citizen they are offering discount of 2% on total bill amount and

For senior citizen (of 60 years or more) they are offering discount of 3%

The ABC Corporation has two types of watched with pricing structure as follow-
Watch Type: Titan
cost price = 7999
profit percentage = 12.5%
GST = 7.5%

Watch Type: Rolex
cost price = 10999
profit percentage = 13.5%
GST = 12.5%

***Sample input-1***
Enter age 25
Enter gender female
Enter watch type (Titan/Rolex): Titan

***Output***
The total bill amount is 9406.82

***Sample input-2***
Enter age 65
Enter gender male
Enter watch type (Titan/Rolex): Rolex

***Output***
The total bill amount is 13442.98

***Sample input-3***
Enter age 61
Enter gender female
Enter watch type (Titan/Rolex): Rolex

***Output***
The total bill amount is 13165.80

***Sample input-4***
Enter age 25
Enter gender male
Enter watch type (Titan/Rolex): Titan

***Output***
The total bill amount is 9598.80

<aside>
💡 Tip: As of now you don’t know how to take input so you may write input values in the code itself.

</aside>

```java
class WatchPriceCalculator{
  double getWatchPrice(String watchType, int age, String gender){
    //code to computer and return the price of watch up to two decimal places
  }
}

public class WatchPriceTester {
  public static void main(String args[]){
    WatchPriceCalculator wcOne = new WatchPriceCalculator();

    //for watch type = Titan, gender = "female", age = 25
    System.out.println(wcOne.getWatchPrice("Titan", 25, "female"));

    //for watch type = Rolex, gender = "male", age = 65
    System.out.println(wcOne.getWatchPrice("Rolex", 65, "male"));

    //for watch type = Rolex, gender = "female", age = 61
    System.out.println(wcOne.getWatchPrice("Rolex", 61, "female"));

    //for watch type = Titan, gender = "male", age = 25
    System.out.println(wcOne.getWatchPrice("Titan", 25, "male"));
  }
}
```

