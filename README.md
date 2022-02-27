
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

<p style="padding-top: 20px; text-align: center">
<img src="https://miro.medium.com/max/437/0*dkcF7NijpcczHo82.png">
</p>
<p style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >UML diagram of the patter</p>


### Advantages of the Strategy Pattern

- First will make your code more clean because you will avoid using to many conditional statements;
- And even more clean code as you will separate the concerns into different classes.
- Will be more easy to switch between the different strategies/algorithms because you will be implementing polymorphism in the interfaces.
- You can apply the _Open/Closed Principle_, because you will be able to implement new strategies without having to change the context

# Chain of Responsibility Pattern 
<p style="color: gray; margin-top: -15px; margin-bottom: 25px;" >Also known as: CoR, Chain of Command</p>

Chain of Responsibility is a behavioral design pattern that allows you to route requests to a series of handlers. After receiving a request, each handler 
decides whether to process the request or forward it to the next handler in the chain.

So this pattern relies on transforming specific behaviors into stand-alone objects called **_handlers_**. And this pattern also suggest that you link those handles into a chain. 
Each chained handler has a field that stores a reference to the next handler in the chain. The request travels down the chain until all handlers have had a chance to process it. But 
the "best part" is that each handler can decide not to pass the request further down the chain and effectively stop any further processing.


<p style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-en.png?id=dccad3e628bd2b8f1856c99369ca6e5b">
</p>
<p style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Example from the <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">Refactoring Guru</a> using a process of a request to a ordering system </p>

### Advantages of the Chain of Responsibility Pattern

- You can control the order in which requests are processed
- This pattern will lead you to implement two SOLID principles as well more easily
  - One of than will be the _Single Responsibility Principle_. This principle will be achieved as you decouple classes that are invoked from classes that are performing your operations.
  - Another principle is the _Open/Closed Principle_, as you will be able to implement more handlers and into your application without breaking existing code/process. 

<p style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png?id=848f0fc8dca57a44974d63f8181f5406">
</p>
<p style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >UML diagram example of the patter</p>






# References 

Strategy - https://refactoring.guru/design-patterns/strategy \
Chain of Responsibility - https://refactoring.guru/design-patterns/chain-of-responsibility