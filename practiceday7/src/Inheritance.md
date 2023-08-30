Inheritance

- Inheritance is a mechanism by which one object acquired properties of another object.
- In enhances code reusability and keep the code DRY that leads to easy maintenance and scalability of the code.
- It is used to define create specific implementation from a general implementation.
- It is used to define is-a relationship which is Unidirectional.

      E.g. House is a Building. But Building is not a House.
      
      
      
      ## **Constructor calling and inheritance**

1. An object of sub class has all the variables and methods of super class so the object of sub class can be called object of super class.
2. All instance members and class members are getting inherited in the sub-class but constructor is not inherited.
3. When an object of subclass is created then constructor of super class as well as of sub class will be called and constructors are called in the order of derivation i.e. they are called from super-class to sub-class.



## Method Overriding

- If a sub class has a method whose signature (means return-type method-name(para-list)) is same as that of its super class (but not body) then we say that sub class has overridden the method of super class.
- Method overriding is used to redefine (not adding) the behavior of super class means overriding does not add any new method in sub class.
- If overridden method is called inside the subclass body then version defined in the subclass will be called always and to access the version of super class in the sub class body we have to use super keyword.
- when overriding method in the subclass then use @Override annotation with method signature so that compiler will check if method signature in super class and sub class is same or not. If not same then compiler will report error.



## **The final keyword**

It has three uses-

### **To create named constant**

- The variable has to be precede with the final keyword
- If instance variable is declared with final keyword then it can be initialized at the time of declaration or in the constructor but not at both places simultaneously.
- Once the value is provided to final variable (int constructor or declaration) then no change is allowed means you can't write it on LHS of = operator.