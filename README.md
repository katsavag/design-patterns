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

* *Encapsulation of Creation Logic:* The Factory pattern encapsulates the creation of objects. This abstraction removes
  the
  responsibility of instantiation from client classes to a factory class.
* *Decoupling:* The pattern decouples the implementation of an object from its use. It promotes a loose coupling by
  ensuring
  that application code is independent of the class implementations, making it easier to extend or change the
  dependencies
  without altering the client.
* *Substitution:* Factories typically return an abstract type (like an interface or an abstract class), which means the
  returned concrete objects can be swapped as long as they adhere to the interface contract.


## Behavioral Patterns


### [Command Pattern](behavioral/command-pattern)

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all
information about the request. This transformation lets you pass requests as a method arguments, delay or queue a
request's execution, and support undoable operations.

Here's a brief analysis of the Command Pattern:

* **Encapsulation of Requests:** The Command Pattern encapsulates a request as an object, thereby letting you
  parameterize clients with queues, requests, operations, and also allows you to support undoable operations.

* **Decoupling:** The pattern decouples the object that invokes the operation from the one that knows how to perform it.
  This provides a separation between responsibilities. The invoker is responsible for invoking the command at some
  point, and the command knows how to perform the action.

* **Flexibility:** The Command Pattern allows for the commands to be manipulated like any other object. They can be
  stored, passed around, and extended as needed.

* **Control over Timing:** The Command Pattern allows you to control when and how a command is executed. This can be
  useful in a variety of scenarios, such as adding a delay before executing the command, or saving the command's state
  for later execution.
