
# design-patterns
- This project was created to learn and reaffirm knowledge related to design pattern. Was used java to create some examples and this file to try gather
  all definitions related to the several existent design patterns 

# What is Design Patterns
Design patterns are generics projects solutions to solve recurring problems in object orient development

# Strategy Pattern

The basic idea of this pattern is to be a behavioral design patter that you to select easily a concrete algorithm in your application 
from a previously set of algorithms used on that specific process.   

Another good and straight definition is from the ‘Gang of Four’ book: “The Strategy Pattern is used to create an interchangeable family of algorithms 
from which the required process is chosen at run-time”.

So this pattern approach is used when you have many possible algorithms for one action, like when you are calculating taxes or different types 
of fees you can separate each one possible algorithm in a different class. 

<p align="center">UML diagram of the patter </p>
<p align="center">
<img src="https://miro.medium.com/max/437/0*dkcF7NijpcczHo82.png">
</p>

### Advantages of the Strategy Pattern

- First will make your code more clean because you will avoid using to many conditional statements;
- And even more clean code as you will separate the concerns into different classes.
- Will be more easy to switch between the different strategies/algorithms because you will be implementing polymorphism in the interfaces.










# References 

Strategy - https://refactoring.guru/design-patterns/strategy