# Design Patterns

This projects presents various design patterns.

## Creational Patterns

### [Factory Pattern](creational-patterns/factory-pattern) 

The Factory Design Pattern is one of the most commonly
used design patterns in object-oriented programming. It falls under the category of creational patterns, which
focus on mechanisms of object creation such that they are suitable to the situation at hand. The primary goal of
the Factory pattern is to allow for the creation of objects without specifying the exact class of object that will
be created.

*Core Principles* 
* *Encapsulation of Creation Logic:* The Factory pattern encapsulates the creation of objects. This abstraction removes the
responsibility of instantiation from client classes to a factory class.
* *Decoupling:* The pattern decouples the implementation of an object from its use. It promotes a loose coupling by ensuring
that application code is independent of the class implementations, making it easier to extend or change the dependencies
without altering the client.
* *Substitution:* Factories typically return an abstract type (like an interface or an abstract class), which means the
returned concrete objects can be swapped as long as they adhere to the interface contract.