# design-pattern ~ GoF


## Creational -> The design patterns that deal with the creation of an object.

| Pattern Name 	|  Description 	|  Used in Java 	| Real time Application |
|------------------	|---	|---	|---	|
| [Abstract Factory](#abstract-factory) 	|  Allows us to create a Factory for factory classes. 	|  (1)javax.xml.parsers.DocumentBuilderFactory#newInstance() (2)javax.xml.transform.TransformerFactory#newInstance() <br>(3) javax.xml.xpath.XPathFactory#newInstance() 	|   	|
| [Singleton](#singleton)        	|The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created.   	|  (1)java.lang.StringBuilder#append() (unsynchronized) <br> (2)java.lang.StringBuffer#append() (synchronized) 	|   	|
| [Prototype](#prototype)        	|  Creating a new object instance from another similar instance and then modify according to our requirements. 	|   	|   	|
| [Factory Method](#factory-method)   	|   The factory pattern takes out the responsibility of instantiating a object from the class to a Factory class.	| (1) java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern. <br>(2) valueOf() method in wrapper classes like Boolean, Integer etc.  	|   	|
| [Builder](#builder)          	|  Creating an object step by step and a method to finally get the object instance. 	|   	|   	|

<br>

## Structural -> The design patterns in this category deals with the class structure such as Inheritance and Composition.

| Pattern Name 	|  Description 	|  Used in Java 	| Real time Application |
|------------------	|---	|---	|---	|
| [Proxy](#proxy) 	| Provide a surrogate or placeholder for another object to control access to it.  	|   	|
| [Composite](#composite)        	| Used when we have to implement a part-whole hierarchy. For example, a diagram made of other pieces such as circle, square, triangle, etc.  	|   	|
| [Decorator](#decorator)        	| The decorator design pattern is used to modify the functionality of an object at runtime.  	|   	|
| [Façade](#fa%c3%a7ade)   	|  Creating a wrapper interfaces on top of existing interfaces to help client applications. 	|   	|
| [Adapter](#adapter)          	|Provides an interface between two unrelated entities so that they can work together.   	|  (1)java.util.Arrays#asList()<br>(2)java.io.InputStreamReader(InputStream) (returns a Reader)<br>(3)java.io.OutputStreamWriter(OutputStream) (returns a Writer) 	|
| [Flyweight](#flyweight)          	|  Caching and reusing object instances, used with immutable objects. For example, string pool. 	| All the wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern. The best example is Java String class String Pool implementation.  	|
| [Bridge](#bridge)          	| The bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client program.  	|   	|

<br>

## Behavioral -> This type of design patterns provide solution for the better interaction between objects, how to provide lose coupling, and flexibility to extend easily in future.

| Pattern Name 	|  Description 	|  Used in Java 	| Real time Application |
|------------------	|---	|---	|---	|
| [Chain of Responsibility](#chain-of-responsibility) 	| used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.  	|   try-catch block 	| ATM Dispense machine
| [Iterator](#iterator)        	| used to provide a standard way to traverse through a group of Objects.  	| We all know that Collection framework Iterator is the best example of iterator pattern implementation but do you know that java.util.Scanner class also Implements Iterator interface.  	|
| [State](#state)        	| 	State design pattern is used when an Object change it’s behavior based on it’s internal state.  	|   	|
| [Visitor](#visitor)   	|  Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. 	|   	|
| [Template](#template)          	| used to create a template method stub and defer some of the steps of implementation to the subclasses.  	| (1)All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.<br>(2)All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.  	|
| [Command](#command)          	|  Command Pattern is used to implement lose coupling in a request-response model. 	| Runnable interface (java.lang.Runnable) and Swing Action (javax.swing.Action) uses command pattern  	|
| [Memento](#memento)          	| The memento design pattern is used when we want to save the state of an object so that we can restore later on.  	|   	|
| [Mediator](#mediator)          	|  used to provide a centralized communication medium between different objects in a system. 	| (1)java.util.Timer class scheduleXXX() methods<br>(2)Java Concurrency Executor execute() method.<br>(3)java.lang.reflect.Method invoke() method.  	|
| [Strategy](#strategy)          	|  Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime. 	|   	|
| [Observer](#observer)          	|  useful when you are interested in the state of an object and want to get notified whenever there is any change. 	|   	|

<br>

## Abstract Factory

-  Creates an instance of several families of classes
Example : HP, Samsung and Dell laptops are uses Intel and AMD processor.

javax.xml.parsers.DocumentBuilderFactory#newInstance()

## Singleton

- A class of which only a single instance can exist
Example : President of a country

java.lang.Runtime#getRuntime()

## Prototype

- A fully initialized instance to be copied or cloned
Example : initial status of chess game

java.lang.Object#clone()

## Factory Method

- Creates an instance of several derived classes.
Example : In an organisation HR works as factory method. Here development team request type of resource need to HR. Based on request type, HR provide resource to Development team.

java.util.Calendar#getInstance()

## Builder

- Separates the construction of a complex object from its representation so that the same construction process can create different representations
Example : Kitchen is a Factory, Chef is a Builder where waiter tell to chef "pizza with cheese, onion". Here chef exposed attributes but hidden implementation.

java.lang.StringBuilder

<hr /> 

## Proxy

- An object representing another object
Example : check book leaf, credit card, debit card are proxy for Money and a customer representative to order a product.

java.rmi.*, the whole API actually.

## Composite

- Gives an unified interface to a leaf and composite.
Example : File System in Operating Systems, Directories are composite and files are leaves. System call Open is single interface for both composite and leaf.

## Decorator

- Gives additional feature to leaf, while giving unified interface.
Example : 1) Adding discounts on an order 2) gun is a deadly weapon on it's own. But you can apply certain "decorations" to make it more accurate, silent and devastating.

All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.


## Façade

- Simplifies multiple complex components with single interface
Example : Control Panel

javax.faces.context.ExternalContext, which internally uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, et

## Adapter

- Provides different interface for an interface.
Example : Power Adapters

java.util.Arrays#asList()


## Flyweight

- A fine-grained instance used for efficient sharing
Example : Dial tone

java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short and Long)

## Bridge

- Decouple an abstraction from its implementation so that the two can vary independently.


<hr />

## Chain of Responsibility

- A way of passing a request between a chain of objects
Example : Loan or Leave approval process

javax.servlet.Filter#doFilter()

## Iterator

- Sequentially access the elements of a collection
Example : Next/Previous buttons on TV

All implementations of java.util.Iterator & java.util.Enumeration

## State

- Alter an object's behavior when its state changes
Example : A fan wall control

## Observer

- A way of notifying change to a number of classes
Example : Bidding or auction

Publish/Subscribe JMS API

## Visitor

- Defines a new operation to a class without change
Example : Taxi

## Template

- Defer the exact steps of an algorithm to a subclass
Example : A blue print

All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.
JMSTemplate HibernateTemplate and JdbcTemplate in Spring

## Command

- Encapsulate a command request as an object
Example : The "Guest Check" at a diner is an example of a Command pattern. The waiter or waitress takes an order or command from a customer and encapsulates that order by writing it on the check. The order is then queued for a short order cook. Note that the pad of "checks" used by each waiter is not dependent on the menu, and therefore they can support commands to cook many different items.

All implementations of java.lang.Runnable

## Memento

- Capture and restore an object's internal state
Example : save the state in a game & Undo/Redo operation in Windows

All implementations of java.io.Serializable

## Mediator

- Defines simplified communication between classes
Example : Air Traffic Controller(ATC)

## Strategy

- A Strategy defines a set of algorithms that can be used interchangeably.
Example : Modes of transportation

java.util.Comparator#compare(), executed by among others Collections#sort().
javax.servlet.http.HttpServlet, the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them (and not to get hold of them as instance variables!).
javax.servlet.Filter#doFilter()

## Reference
- https://sourcemaking.com/design_patterns
- https://www.journaldev.com/31902/gangs-of-four-gof-design-patterns
