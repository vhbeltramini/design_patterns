
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

<p align="center" style="padding-top: 20px; text-align: center">
<img src="https://miro.medium.com/max/437/0*dkcF7NijpcczHo82.png">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;">Basic structure example of this pattern</p>

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


<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-en.png?id=dccad3e628bd2b8f1856c99369ca6e5b">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Example from the <a href="https://refactoring.guru/design-patterns/chain-of-responsibility">Refactoring Guru</a> using a process of a request to a ordering system </p>

### Advantages of the Chain of Responsibility Pattern

- You can control the order in which requests are processed
- This pattern will lead you to implement two SOLID principles as well more easily
  - One of than will be the _Single Responsibility Principle_. This principle will be achieved as you decouple classes that are invoked from classes that are performing your operations.
  - Another principle is the _Open/Closed Principle_, as you will be able to implement more handlers and into your application without breaking existing code/process. 


### Structure

<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png?id=848f0fc8dca57a44974d63f8181f5406">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Basic structure example of this pattern</p>

1. The **Handler** will declare the interface common for all concrete handlers, he can have a method for setting the next handler of the chain but in many cases he will only have a single method for handling the request.
2. The **Base Handler** is not implemented always but all the boilerplate code that are used in all classes can be stored here.
3. The **Concrete Handlers** will be the response for the actual code for processing requests. Each of then must decide whether to finish the process of it or pass it for the next knot of the chain.
4. The **Client** will be responsible to compose the chain, he will be able to choose witch part of the chain will be iterated, and note that after ours previous steps we can initiate the chain from any point.

# Template Method

This design pattern is used to define a skeleton of an algorithm in a superclass but let her subclasses overwrite those methods for specifics steps os algorithms that will be need to implement all the business logic.  

- So this pattern is mostly used when we have an abstract class where all its subclasses have a lot of implementations in common, so we can break down an algorithm into a series of steps, turn these steps into methods, and put the call to these methods inside a single template method. 


### Template Method

<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/template-method/structure-indexed.png?id=4ced6107519bc66710d2f05c0f4097a1">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Basic structure example of this pattern</p>

1. The **Abstract Class** will declare all the steps used in to complete algorithm/business rules as abstract to the subclasses can implement they, and will have the templateMethod() that will call all the abstract steps implemented in the subclasses;
2. The **Concrete Classes** are the subclasses that will be overriding the steps used in the templateMethod.


### Advantages of the Template Method Pattern

- You will be able to override only certain parts of a large algorithm, so will be less affected by changes in other parts of the system.
- You can pull the duplicate code into a superclass.

# State Pattern 

**State** is a pattern that lets an object alter his behavior when its internal state changes. It appears almost like an object changed his class. A real world example of this pattern is like the buttons of a smartphone, they can change their behavior depending on the state of the phone 
- So the main idea is that on a system with a finite numbers of a state in a program, you will be able to work around with those states without having to write many IFs to do that.

<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/state/structure-en-indexed.png">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Basic structure example of this pattern</p>

1. **Context** will reference to one concrete state object and delegates to state-explicit work. this class speaks with the state object through the state interface. He will be able to set another state of the object.
2. The **State** interface proclaims the state-explicit techniques. These techniques should appear to be legit for all substantial states since you don't want to have useless code in your abstract/interface class that will be implemented by all of his children classes
3. **Concrete states** provide their own implementations for state-specific methods. To avoid repeating similar code across states, you can provide abstract intermediate classes that encapsulate some common behavior. 
4. Both the context and the concrete state can set the next state of the context and perform the actual state transition by replacing the state object associated with the context.

### Advantages of the Command Pattern

- Will let you organize code related to specific states of the object in different classes, so will be applying the _Single Responsibility Principle_.
- Let you add new states without changing an existing state or class so will be applying the _Open/Closed Principle_.
- Simplify your code by eliminating a bunch of state conditionals that would have to be implemented.

# Command Pattern
<p style="color: gray; margin-top: -15px; margin-bottom: 25px;" >Also known as: Action, Transaction</p>

**Command** is a behavior design pattern that transform a request in a stand-alone object with all the data that will let the programmer use those arguments to pass requests as a method arguments, to queue or delay a request’s execution, and support reversible operations

A good way to use this pattern is in systems with different entry points like a system interface or API's, and you can implement the command pattern to let all this entry points get in a common class to process that data "equally".

<p align="center" style="padding-top: 10px; text-align: center">
<img src="https://refactoring.guru/images/patterns/diagrams/command/structure-indexed.png?id=d3212d2fa754a85afe1acb35775fee3e">
</p>
<p align="center" style="color: gray; margin-top: -15px; text-align: center; margin-bottom: 25px;" >Basic structure example of this pattern</p>

1. The **Invoker/Sender** class will be responsible for the start of the request, he must have as well a field referencing to a command object. So the sender will call this class instead the receiver. And usually he will already have the command object, so he will not create him here.
2. The **Command** interface will usually just declare a single method for executing. that will be handled by his "child classes".
3. Those classes who implemented the command interface will implement various kinds of requests. They normally will not perform the work on its own, instead they will use for example Injected classes to do the "hard work", in the example above they are using a receiver.
4. The Receiver class contains some business logic. Almost any object can act as a receiver. Most commands only handle the details of how to route requests to receivers, while the receivers do the actual work themselves.
5. Clients create and configure concrete command objects. The client must pass all request parameters, including the receiver instance, to the command's constructor. Afterwards, the generated commands can be distributed to one or more senders.

### Advantages of the Command Pattern

- Will be applying the _Single Responsibility Principle_ of the SOLID principals, because will in be able to decouple classes that invoke operations from classes that perform these operations, and even decouple the classes that will have the proprieties of the object.
- Another SOLID principle that will be achieved by this pattern is the _Open/Closed_ Principle. because will let you introduce new process into the app without breaking any existing feature.
- Let you implement undo/redo, and assemble a set of simple commands into a complex one.

# References 

Strategy - https://refactoring.guru/design-patterns/strategy \
Chain of Responsibility - https://refactoring.guru/design-patterns/chain-of-responsibility \
Template Method - https://refactoring.guru/design-patterns/template-method
