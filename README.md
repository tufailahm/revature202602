
What is java ?
Java is a high-level, object-oriented, platform-independent programming language
Java follows the principle “Write Once, Run Anywhere (WORA)”, meaning Java programs compile into bytecode that can run on any system with a Java Virtual Machine (JVM).


Core Components of Java

JDK (Java Development Kit) – Tools to develop Java applications
JRE+JVM

JRE (Java Runtime Environment) – Libraries + JVM to run Java programs
-- only used to run java applications
-- JVM


JVM (Java Virtual Machine) – Executes Java bytecode and provides platform independence

Shall we install JVM separately ? No 


What is System.out.println?
System.out.println() is a Java statement used to print output to the console and then move the cursor to a new line.

out is a static variable of the System class.
It is an object of type PrintStream.
Represents the standard output stream (usually the console).

println()
println() is a method of the PrintStream class.
It prints the given value and adds a new line after printing.


How It Works Internally?
System   → Class
out      → static PrintStream object
println → method of PrintStream


What is main method in java?
The main method is the entry point of a Java application.
When you run a Java program, the JVM starts execution from the main method.

public static void main(String[] args) {
    // program execution starts here
}

public
Makes the method accessible to the JVM from anywhere.
If not public, the JVM cannot call it.


static
Allows the JVM to call main without creating an object of the class.
Execution starts before any object exists.

void
Indicates that the method does not return any value

main
Fixed method name recognized by the JVM.


Why we use java language ? Features of java ?
Platform Independent
Object-Oriented
Simple
Rubust
Secure
Multi Threaded
Architecture Neutral	 - Java programs are not tied to any specific CPU architecture.
Portable - Java programs can be moved across platforms without modification.
Rich API - Collections Framework, Streams API, File I/O, Networking, JDBC


Where Java Is Used?

Enterprise applications (Spring, Microservices)
Web applications
Android development
Banking & financial systems
Big data (Hadoop, Kafka)
Cloud-based applications


q) Versions of java and new features 

1996	- java 1.0	- platform indepedent

1998	- java 1.2	 - Swing, Collections framework
-----------------------------------------------------------------
New Framework:

Interfaces: Collection, List, Set, Map
Implementations: ArrayList, LinkedList, HashSet, HashMap
Legacy Integration:
Vector → implements List
Hashtable → implements Map
Stack → still extends Vector
Enumeration → replaced by Iterator
Legacy classes were retrofitted, not removed.

2000	- java 1.3 - Performance

2002	- Java 1.4	. NIO

2004	- java 5(1.5) - Generics, Annotation, enhanched for loop

2006	- java 6	  - Web services

2008	- java 7	 - try with resources

* 2014	- java 1.8 or 8(LTS)	- functional programming concepts , Functional Interfaces, Lambda expressions, Stream API , new Date time API,Nashron, Default and static method in interfaces, Optional Class
Java 8 is still very popular in enterprise systems.

2016	- java 9		- modular java app

2021	Java 17 (LTS) 	- Records, Sealed classes
Switch Expressions (Standard)
More expressive switch with return values.
int result = switch (day) {
    case MON, FRI -> 6;
    case TUE -> 7;
    default -> 0;
};

Text Blocks
String json = """
{
  "name": "Java",
  "version": 17
}
""";

Java 17 is an LTS release that introduces sealed classes, records, pattern matching, switch expressions, and stronger encapsulation for secure, modern Java development.


2023	Java 21(LTS)	- Virtual Threads

2025	 Java 25		- Latest version


Flexible Constructor Bodies: Developers can now place statements before the super() or this() constructor calls, offering greater flexibility and control over object initialization logic.
Compact Source Files and Instance Main Methods: This feature aims to smooth the on-ramp for beginners and script writers by allowing simpler top-level class declarations and main methods that do not need to be static, reducing boilerplate code.
Primitive Types in Patterns: Pattern matching has been expanded to work consistently across all primitive types (e.g., int, double) in instanceof and switch statements, not just reference types.





LTS (Long-Term Support) versions

Java 8
Java 11
Java 17
Java 21



Q) How java executes program

We compile and execute by  javac and java commands.
It generates a bytecode.

Bytecode is platform-independent

Happens inside the Java Development Kit (JDK)
When you run the program, the Java Virtual Machine (JVM) starts.

1) The Class Loader Subsystem loads:

Bootstrap Class Loader
Extension Class Loader
Application Class Loader

2) Bytecode Verification

JVM verifies:
No illegal memory access
Stack overflow safety
Bytecode format correctness
This ensures security and reliability.

3) Runtime Memory Allocation (JVM Memory Areas)

| Memory Area  | Purpose                          |
| ------------ | -------------------------------- |
| Method Area  | Class metadata, static variables |
| Heap         | Objects and instance variables   |
| Stack        | Method calls, local variables    |
| PC Register  | Current instruction              |
| Native Stack | Native (C/C++) calls             |


4) Execution Engine

The JVM executes bytecode using:

a. Interpreter
Executes bytecode line by line
Slower, but quick startup

b. JIT Compiler (Just-In-Time)
Converts frequently used bytecode into native machine code
Improves performance significantly

5) GC

6) Program run and output generated


** Java program runs by compiling source code into bytecode, which is loaded, verified, and executed by the JVM using interpreter and JIT compilation.



q) What is Garbage Collection in java ?

In java , we dont have any delete operator to remove memory. Automatic memory management in java using GC.

The Java Garbage Collector is a separate thread that runs alongside your Java program. This is a Deamon Thread, which means it is a long running thread, that will often be "asleep". It will occasionally "wake up" and perform some garbage collection. 

** It will find any objects in memory that are no longer being used, and freeing that memory so that other processes can use it again.

Garbage Collection is an automatic process of removing unused objects from heap memory.

q) Which memory areas are managed by Garbage Collector

Only heap memory is managed by the Garbage Collector.



q)What are the main components of JVM

Class Loader Subsystem
Runtime Data Areas
Execution Engine
Garbage Collector


** q)  Please explain memory Structure in java ?

Memory is separated into 2 regions: The Stack and The Heap.

The Stack is a organized structure that stores information about method/function calls as well as 
local variables.
method parameters

keys points
	fast memory access
	thread safe
	no gc


The Heap is an unstructured area of memory that stores Objects and instance variables.
	Gc works here

q) If an object is created inside a method, is it stored in Stack?
a) No. Only the reference is stored in Stack. The object itself is stored in Heap.




JDK :	Tools + compiler + JRE
JRE : 	JVM + core libraries
JVM : 	Executes the code

JDK - Top level - It containts JRE
	JRE  - Middle level -- It contains the JVM
		JVM Lowest level  Executes Java bytecode




OOPS
--------

Abstraction is the process of hiding implementation details and showing only the essential functionality to the user.

Abstract Classes
Interfaces


interface Payment {
    void pay();   // abstract method
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment through credit card");
    }
}


UserService service = new UserServiceImpl();

Abstraction in Java is achieved using abstract classes, interfaces, and by programming to interfaces rather than implementations.

Use abstract class when:
You need shared code and state

Use interface when:
You need multiple inheritance
You want loose coupling and flexibility

Encapsulation

The idea of Encapsulation is that Objects should restrict access to the data (state/properties) to be used in proper ways. For example, if an object has an `age` property, it should restrict access so that this property cannot be set to a negative value.

We accomplish Encapsulation through the use of the 4 access modifiers (`public`, `protected`, `private`, and `default`) along with public getter/setter methods to control the manipulation/access to the data.


Real-Time Example

A bank account:

Balance is private
You can only deposit or withdraw using methods
You cannot directly modify the balance
This is encapsulation.

Is encapsulation mandatory in Java?
No, but it is a best practice.

Can we achieve encapsulation without getters and setters?
Yes, by using controlled public methods.

Is encapsulation related to security?
Yes, it prevents unauthorized access to data.



Inheritance

The pillar of Inheritance stipulates that Classes are able to inherit properties and behaviors from a Parent class. In particular, subclasses are "more specific" versions of a parent class
 
Examples might be inheriting from a `Animal` class to define a `Dog` class. 
Or inheriting from a `Person` class to define a `Employee` class.

In Object Oriented Design, there are different types of Inheritance, such as "Multiple Inheritance" or "Multi-Level Inheritance". Multiple Inheritance is that a single class can inherit from multiple parent classes. Multi-Level Inheritance is that inheritance can chain across multiple generations. For Example, `Animal` - `Person` - `Student` - `MathStudent`

Java supports Multi-Level Inheritance, but does not support multiple Inheritance for classes. However, interfaces do support multiple inheritance. This is allowed through the various restrictions placed on interfaces. For example, interfaces can only have `public` and `abstract` methods (or must use the `default` or `static` keywords).

Product
PremiumProduct
RegularProduct extends Product,PremiumProduct		X not Allowed


Q) Java supports Multi-Level Inheritance, but does not support multiple Inheritance for classes. why ?
A) To avoid ambiguity , java does not support multiple inheritance.


Why Inheritance Is Needed

Code reusability
Avoids duplication
** Supports method overriding
** Enables runtime polymorphism

q) super keyword in java ?
a) Used to:
Call parent class method
Access parent class variables
Call parent class constructor


Inheritance vs Composition

Inheritance
IS-A relationship
Tight coupling

Composition
HAS-A relationship
Loose coupling



Inheritance is the mechanism in Java where one class acquires the properties and methods of another class using the extends keyword.



Why Java does not support multiple inheritance using classes
to avoid diamond problem.

What is method overriding

Difference between extends and implements
class A 
class B extends A implements C,D
interface C 
interface D extends C


** What is method overriding
child class provides its own implementation of a method that is already defined in the parent class.
It is used to achieve runtime polymorphism in Java.
Method call is resolved at runtime, based on the object type.


The same method name, same parameters, but different implementation in child class.

q) Please give real time example where you have used method overrding in your poject ?
Product
	addReview()

PremiumProduct extends Product
	addReview()		//method overriding	

ans ) Object class providers general method which we can override in our class to suit our project requirements.
toString
equals
hashCode


Why Method Overriding Is Needed

To provide specific behavior in child class
To support runtime polymorphism
To customize inherited methods
To follow OOP principles


q) Overriding vs Overloading
Method Overriding
Occurs between parent and child classes
Resolved at runtime
Same method signature

Method Overloading
Occurs in same class
Resolved at compile time
Different parameters


q) Use of @Override Annotation
Helps compiler catch errors
Improves readability
Not mandatory but recommended


Method overriding is when a child class provides a specific implementation of a method that is already defined in its parent class, enabling runtime polymorphism.


Compile-time polymorphism is resolved at compile time.
It is achieved using method overloading.
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


Runtime polymorphism is resolved at runtime.
It is achieved using method overriding.


The method call is decided by the actual object, not the reference type.
This decision is made by the Java Virtual Machine during execution.


Compile-time polymorphism is resolved during compilation using method overloading.
Runtime polymorphism is resolved during execution using method overriding.







Explain static in java 


The static keyword in Java is used to create class-level members that belong to the class, not to objects.

It belongs to the class
Only one copy exists
It is shared across all objects of that class


Key points
Stored in Method Area (Metaspace)
Created when class is loaded
Shared across all objects


A static method belongs to the class, not to objects.

** Please explain static method , static variable , static block and static class


static 
{
	//called even before main, when the class is loaded
}

inner classes can only be static and can access only static variables and methods of outer class.

package org.example;

public class Demo {
    static int i=100;

     static class DecryptPassword
    {

    }
    static class ChangePassword extends  DecryptPassword
    {

    }
    class EncryptPassword extends  ChangePassword
    {

    }
}


q) Can we override static method ?
a) No static methods cannot be overridden.


Can static methods be overridden
No, they are method hidden, not overridden.

** Why main method is static
JVM can call it without creating an object.

Can static variables be final
Yes, constants are declared using static final.


Real time usage of static in java project?
Constants (Most Common Use)
Utility / Helper Classes
Logging (Industry Standard)
Main Method
Singleton Pattern
Count number of instances




String in java
----------------------------

Are strings mutable or immutable in Java?
String is immutable i.e once a String object is created, its value cannot be changed.


Why did Java make strings immutable?

1. Security 
Strings are heavily used in security-sensitive areas:

File paths
Database URLs
Usernames and passwords
Network connections
Class loading


Immutability ensures the value cannot be altered once validated.


2. String Constant Pool Optimization

Java stores string literals in the String Constant Pool.

String company1 = "Revature"
String company2 = "Revature"
company2="Oracle";

If String were mutable:
Changing one reference would change all references
This would break pooling and cause unpredictable behavior
Immutability makes string pooling safe and memory-efficient.




3. Thread Safety
Immutable objects are inherently thread-safe.

No synchronization required
Multiple threads can share the same String safely

String s1="neha"
String s2="neha"
Both s1 and s2 point to the same object.
sout(s1.equals(s2))	//true
sout(s1==s2)	//true


Difference between == and equals() for String

== compares object references.
equals() compares actual string content.


What happens when you write String s = "Java"

The JVM checks the String Constant Pool.
If the value exists, reference is reused.
Otherwise, a new string is created in the pool.


Why String is final
To prevent inheritance and ensure immutability.

Can we override methods of String class
No, because String class is final.

How many objects are created in this code
String s = new String("Java");

Two objects.
One in String Constant Pool.
One in Heap memory.

) Is String thread safe
Yes, because String is immutable.

Why String is preferred as key in HashMap
Because String is immutable and its hashcode does not change.

Can we synchronize String
Yes, but it is unnecessary because String is already thread safe.

**String is immutable, stored in string pool, thread safe, memory efficient, and widely used as keys and identifiers in Java applications.




