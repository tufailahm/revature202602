
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





Abstract class and Interface


Abstract classes and interfaces are the two main ways to achieve abstraction in Java. They define what a class must do, while hiding how it does it.

An abstract class is a class that cannot be instantiated and may contain abstract methods (without implementation) as well as concrete methods (with implementation)


abstract class Vehicle {
    abstract void start();   // abstract method

    void fuel() {             // concrete method
        System.out.println("Fuel added");
    }
}

//concrete class
class Car extends Vehicle
{
	void start()
	{
		 System.out.println("Car Started");
	}
}



Interface
What is an Interface?

An interface defines a contract.
It specifies what a class must do, not how.


interface Payment {
    void pay();   // abstract method
}


class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment through card");
    }
}


Payment p = new CardPayment();

** q)  Difference between Abstract class and interface ?

| Feature          | Abstract Class             | Interface                   |
| ---------------- | -------------------------- | --------------------------- |
| Instantiation    | Cannot create object       | Cannot create object        |
| Methods          | Abstract + concrete        | Abstract, (default, static)->JDK1.8   |
| Variables        | Instance variables allowed | Only constants              |
| Constructors     | Yes                        | No                          |
| Inheritance      | Single inheritance         | Multiple inheritance        |
| Access modifiers | Any                        | Public only (methods)       |
| Purpose          | Share code + abstraction   | Pure abstraction / contract |


When to Use Abstract Class

Use an abstract class when:
Classes share common code
You need instance variables
You need constructors
You want partial abstraction

When to Use Interface

Use an interface when:
You need multiple inheritance
You want loose coupling
You are designing APIs
You want full abstraction


Real time:

Controllers in spring boot uses interfaces
Services implement interfaces
Many design patterns uses interfaces and abstract class like factory design pattern, dao

** Where you have used in your poject ?
ans ) ProductDAO productDAO = new ProductDAOImpl();






q) Why they have introduced static and default methods in interface and what the difference between both? in detail.

package org.example;
interface Consumable
{
    int measure();
    void consume(int quantity);
}
 interface Liquid  {
    public default void prepare() {
        // pour to a cup
        System.out.println("Prepare the liquid");
    }
    static void addWater(){
        System.out.println("Water added");
    }
    int measure();
}
class Drink
        implements Consumable, Liquid {
    public void consume(int quantity) {}
    public int measure() {return 0 ;}

    @Override
    public void prepare() {
        System.out.println("Drink is prepared");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Drink d = new Drink();
        d.consume(100);
        d.measure();
        d.prepare();
        Liquid.addWater();
    }

}


static and default methods are there in JDK1.8 to support mainly backward compatibility, code reuse, and multiple inheritance conflicts.


A default method has a method body inside an interface.
Implementing classes are not forced to override it.

Static methods belong to the interface itself, not to instances.



Collections and Data Structures
----------------------------------------
Collections and streams

1) What is collection in java ?

In Java, a collection is an object that represents a group of elements and provides standard ways to store, retrieve, manipulate, and process data

2)can be used to store heterogenous data.
Yes

3) Why we need collection in java ?
Arrays have limitations:
Fixed size
No built-in methods for sorting, searching, resizing
No dynamic insertion or deletion

4)Collections overcome these problems by providing:
Dynamic size
*Ready-made data structures
*Utility methods for data operations


5)Why do I need a collection framework when I can create my own classes?
Advantages
Reduces design, coding and testing efforts and therefore saves lots of time.
Variety of classes to choose from in terms of performance and memory.
The collection interfaces at the top layer reduces the learning effort 
It fosters reuse when new collection classes are added.

Use case : I have add all the participants in the training and print in ascending order

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Riya");
        names.add("Arafa");
        names.add("Neha");
        names.add("Harish");
        names.add("Karthik");
        names.remove("Neha");
        System.out.println(names.contains("Riya"));

        Collections.sort(names);

        System.out.println(names);
    }





The Java Collections Framework is a set of interfaces, classes, and algorithms that work together.

Is map is a part of collection ?
ans : No , it is not a part of collection


Collection

Package: java.util
Parent interface for: List, Set, Queue
Stores elements only (no key-value pairs)
Provides standard methods shared by all collections

** q) 
Collection
 ├── List (accept duplicate value)
 │    ├── ArrayList	 (iteration is faster) - not thread safe hence is it faster
 │    ├── LinkedList ( frequent insertion and deletion)
 │    └── Vector - thread safe and sync (slower)
 ├── Set ( not accept duplicate value)
 │    ├── HashSet ( no order is gureenteed)
 │    ├── LinkedHashSet ( as you enter)
 │    └── TreeSet (sorted)
 └── Queue
      ├── PriorityQueue
      └── Deque


Common Methods of Collection

add(E e) – add an element
remove(Object o) – remove an element
size() – number of elements
isEmpty() – check if empty
contains(Object o) – check presence
iterator() – iterate elements
clear() – remove all elements
addAll(Collection c) – bulk add
removeAll(Collection c) – bulk remove


q) Store five marks of the students and print the maximum marks

        List<Integer> marks = new ArrayList<Integer>();

        marks.add(98);
        marks.add(45);
        marks.add(87);
        marks.add(23);
        marks.add(43);

       int highest = Collections.max(marks);
        System.out.println("Topper marks is :"+highest);

q) Find number 45 

Collections.sort(marks);
int result=  Collections.binarySearch(45,marks);


Collections is class in java.util package that has lots of useful static methods
Collections
Utility class
Provides only static methods to operate on collections


q)q) Find the maximum length, and if multiple strings have the same maximum length, print all of them.

   List<String> words = new ArrayList<String>();
        words.add("Monday");
        words.add("Holiday");
        words.add("Revature");
        words.add("HelloAll");
        words.add("Hi");
        words.add("GoodMorn");

        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }


     for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }


q) Is collection mutable or immutable ?
Yes, most collections in Java are mutable by default.
But Java also provides unmodifiable and immutable collections.


Most implementations in the Java Collections Framework are mutable, meaning you can add, remove, or update elements after creation.

Examples

ArrayList
LinkedList
HashSet
HashMap
q) How can you make a collection as immutable ?

Unmodifiable Collections (Read-Only View)

You can create a read-only view of a mutable collection using Collections.unmodifiableXxx()







q) . Immutable Collections (Truly Immutable, Java 9+)

Java 9 introduced immutable collection factory methods.

Examples
List<String> list = List.of("Java", "Spring");
Set<Integer> set = Set.of(1, 2, 3);
Map<Integer, String> map = Map.of(1, "One");

Cannot add, remove, or update elements
No null elements allowed
Truly immutable

Real time : Store website preference of a logged in user 

List.of("raghul","yellow","20","english")



q) Difference between synchronized and immutable collections? Are they same ?
** No, both are not same.

What are Synchronized Collections?

Synchronized collections are mutable collections where access is controlled using synchronization, so that only one thread can modify or access the collection at a time.


** q) 
q) Explain the difference between ArrayList and LinkedList.

a) ArrayList
Backed by a dynamic array
Elements stored in contiguous memory

LinkedList
Implemented as a doubly linked list
Each element (node) stores:

data
reference to previous node
reference to next node


| Operation                 | ArrayList            | LinkedList                |
| ------------------------- | -------------------- | ------------------------- |
| Get by index (`get(i)`)   | Fast O(1)            | Slow O(n)                 |
| Add at end                | Fast amortized O(1)  | Fast O(1)                 |
| Add at beginning / middle | Slow O(n) (shifting) | Fast O(1) after traversal |
| Remove from middle        | Slow O(n)            | Fast O(1) after traversal |
| Memory usage              | Less                 | More (extra pointers)     |


Use ArrayList when:
You need frequent access by index
Reads are more than writes
Memory efficiency matters

Use LinkedList when:
Frequent insertions and deletions in middle
Queue or deque operations are common
You often add/remove at beginning or end



Q: Is LinkedList always faster for insert and delete?
No. Traversal still takes O(n). It is faster only after reaching the position

** ArrayList uses a dynamic array and provides fast random access, while LinkedList uses a doubly linked list and is better suited for frequent insertions and deletions but slower for retrieval.


Set
------------------------
Set is an interface in the Java Collections Framework that represents a collection of unique elements.
It does not allow duplicates and models a mathematical set.

Set
 ├── HashSet ( No order guarantee, Allows one null)
 ├── LinkedHashSet (Preserves insertion order, Allows one null, slighlty slower than hashset)
 └── TreeSet (Sorted order (natural or via Comparator, No nulls, Slower)


q) How set ensures uniqueness ?
Uniqueness is ensured using equals() and hashCode() (for HashSet/LinkedHashSet)

 TreeSet uses compareTo() or Comparator

Set allows no positional access


package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmailStore {

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();

        emails.add("tufail@gmail.com");
        emails.add("jay@gmail.com");
        emails.add("neha@gmail.com");
        emails.add("aman@gmail.com");
        emails.add("tarun@gmail.com");

        System.out.println(emails);

    }
}



Map
-------
Map is an interface in the Java Collections Framework used to store key–value pairs.

Each key is unique, and each key maps to exactly one value.



Key Characteristics
Stores data as key → value
Keys must be unique
Values can be duplicated
Order depends on implementation
Map is not a subtype of Collection



Map
 ├── HashMap (no order is guareented), one null key, not thread safe and not synchronized, faster
 ├── LinkedHashMap (insertion order), Slightly slower than HashMap
 ├── TreeMap (sorted - on keys), Does not allow null keys
 ├── Hashtable (legacy) -thread safe and synchronized, slower and outdated
 └── ConcurrentHashMap



q) Difference between HashTable and HashMap

 HashMap (no order is guareented), one null key, not thread safe and not sync, faster
Hashtable (legacy) -thread safe and sync  slower and outdated

q) HashMap internal working

Internally, a HashMap uses:

An array of buckets
Each bucket holds a linked list


Node {
  int hash;
  K key;
  V value;
  Node next;
}

HashMap<String,Integer> scores = new HashMap<String,Integer>();
scores.put("Harish",99);
scores.put("Riya",93);
scores.put("Harish",23);

sout(scores.get("Harish")); //prints 23


Step 1: scores.put("Harish",99);
--Write
Step 1: Hash Calculation
When you insert a key:
map.put(key, value);
HashMap calculates:
hash = hash(key.hashCode())

Step 2: Index Calculation
Bucket index is calculated as:
index = (n - 1) & hash
Where n is the array size (default 16).

Step 3: Store Entry
If bucket is empty → store the entry
If bucket has entries:		//scores.put("Riya",93);
Compare keys using equals()
If key already exists → update value	//scores.put("Harish",23);
Else → add new node to linked list (or tree)


q) What is bucket in hashmap ?
A bucket in a HashMap is a slot (index) in the internal array where key–value pairs are stored.
Each bucket can hold one or more entries when collisions occur.


Collision
Multiple keys map to the same bucket
Entries are stored as:
Linked List (default)
Red-Black Tree (Java 8+ optimization)


| Condition       | Value |
| --------------- | ----- |
| Nodes in bucket | > 8   |
| Table size      | ≥ 64  |


Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
map.put("C", 3);

Each key is hashed
Keys land in different or same buckets based on hash
Retrieval uses the same bucket logic

--------------Reading
---------Read
How get() Works Internally
map.get(key);


Steps:
Compute hash of key
Find bucket index
Traverse bucket:
Compare hash
Compare keys using equals()
Return value if found, else return null



q) How collision can happen , if keys cannot be same ?
a) 

scores.put("Harish",99);
scores.put("Riya",93);
scores.put("Harish",23);

sout(scores.get("Harish")); //prints 23



class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 1; // same hash for all objects → collision
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Employee e) {
            return this.id == e.id;
        }
        return false;
    }
}

Map<Employee, String> map = new HashMap<>();

map.put(new Employee(1), "Alice");
map.put(new Employee(2), "Bob");
map.put(new Employee(3), "Charlie");

System.out.println(map.size()); // 3


Bucket[1]
 ├── (Employee 1 → Alice)
 ├── (Employee 2 → Bob)
 └── (Employee 3 → Charlie)




q) How you iterate map
a) 
import java.util.HashMap;
import java.util.Map;

public class Scores {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put("Harish",99);
        scores.put("Riya",93);
        scores.put("Harish",23);
        System.out.println(scores.get("Harish")); //prints 23
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


q) Difference between Comparable & Comparator ?

Comparable 	
java.lang
used for sorting in the same class model
compareTo(Product p1)
Can be used for sort only one columns

Comparator 
java.util
Separate Comparator
compare(Product p1,Prodicu p2)
multiple sorting


Streams in java 
q) What is streams and we need streams
A Stream is a sequence of elements that supports functional-style operations to process data declaratively.
Streams do not store data; they operate on data from a source (like a collection, array, or I/O channel).


q) print all the names that starts with A

        ArrayList<String> names = new ArrayList<String>();
        names.add("Riya");
        names.add("Arafa");
        names.add("Neha");
        names.add("Harish");
        names.add("Karthik");
        names.remove("Neha");


names.stream().filter(n -> n.startsWith("A")).forEach(System.out::println)


q) we need streams
a) Streams are needed to process collections in a cleaner, more readable, and efficient way using functional programming, while avoiding boilerplate loops and complex logic.

Introduced in Java 8
Works on collections, arrays, files, etc.
Supports lambda expressions
Lazy evaluation (operations run only when needed)
Immutable (does not modify the source)
Can be sequential or parallel

A stream operation is a pipeline with three parts:
Source – collection, array, stream generator
Intermediate operations – transform data
Terminal operation – produce a result


q) How do you create streams in java ?
a) Creating Streams

From a Collection:
list.stream();


From an Array:
Arrays.stream(arr);

Using Stream.of():
Stream.of(1, 2, 3);




q) Explain more Intermediate operations ?
a) Intermediate Operations (Lazy)

These return a new Stream.

filter() – select elements
map() – transform elements
sorted() – sort
distinct() – remove duplicates
limit() – restrict size





import java.util.ArrayList;
import java.util.List;

public class Streams1Demo {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Monday");
        words.add("Holiday");
        words.add("Revature");
        words.add("HelloAll");
        words.add("Hi");
        words.add("Riya");
        words.add("GoodMorn");

        words.stream().filter(s -> s.startsWith("R")).map(String::toUpperCase).forEach(System.out::println);


        words.stream().filter(s -> s.startsWith("R")).count();
    }
}

Terminal Operations (Eager)

These trigger execution and return a result.

forEach()
collect()
count()
findFirst()
anyMatch()
reduce()



Collectors
-----------------
List<String> result =
    list.stream()
        .filter(s -> s.length() > 4)
        .collect(Collectors.toList());



Streams vs Collection
| Aspect       | Stream   | Collection     |
| ------------ | -------- | -------------- |
| Stores data  | No       | Yes            |
| Traversal    | One-time | Multiple times |
| Evaluation   | Lazy     | Eager          |
| Modification | No       | Yes            |


package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindMaximumUsingStreams {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();

        marks.add(98);
        marks.add(45);
        marks.add(87);
        marks.add(23);
        marks.add(43);

        Optional<Integer> result = marks.stream().max(Integer::compareTo);
        //get method in streams are used to extract the value inside the optional
        System.out.println(result.get());
    }
}


Filterng and collect demo
------------------------------
	case 11 :
System.out.println("Display product by product is (desc)");
allProducts = productDAO.findAllProduct();
List<Product> sortedByIdList = allProducts.stream().sorted((p1,p2) -> Integer.compare(p2.getProductId() , p1.getProductId())).toList();
System.out.println(sortedByIdList);



Using Collectors
--------------------------
List<Product> sortProductPriceAsc	 =
										allProd.stream().sorted((p1,p2) -> Integer.compare(p2.getPrice() , p1.getPrice())).collect(Collectors.toList());
					System.out.println(sortProductPriceAsc);


Parallel Streams
----------------------

Parallel Streams allow a stream pipeline to be executed concurrently using multiple threads.
They split the data into chunks and process them in parallel using the ForkJoinPool.


list.parallelStream();

list.stream().parallel();


How Parallel Streams Work (Internally)

Data source is split into multiple parts
Tasks are distributed across threads
Each thread processes a chunk
Results are combined at the end

By default, they use:
ForkJoinPool.commonPool()
Thread count ≈ number of CPU cores


| Aspect      | Sequential Stream | Parallel Stream            |
| ----------- | ----------------- | -------------------------- |
| Execution   | Single thread     | Multiple threads           |
| Order       | Maintained        | Not guaranteed             |
| Performance | Predictable       | Faster for large CPU tasks |
| Complexity  | Simple            | More complex               |
| Best for    | Small datasets    | Large datasets             |


*Parallel streams process stream elements concurrently using multiple threads to improve performance, but they should be used only for large, CPU-bound, and stateless operations.




1. What is a Stream in Java
   A Stream is a sequence of elements that allows functional-style operations to process data from a source such as a collection or array.



2. Are streams data structures
   No. Streams do not store data. They only process data from a source.



3. Difference between Stream and Collection
   Collection is used to store data, while Stream is used to process data.
   Collections can be traversed multiple times, streams can be consumed only once.



4. What are intermediate operations
   Intermediate operations return a new stream and are executed lazily.

Examples: filter, map, sorted, distinct

5. What are terminal operations
   Terminal operations trigger execution of the stream pipeline and produce a result.

Examples: forEach, collect, count, findFirst, reduce


6. What is lazy evaluation in streams
   Intermediate operations are not executed until a terminal operation is invoked.



7. Can we reuse a stream
   No. Once a terminal operation is called, the stream is consumed and cannot be reused.



8. Do streams modify the original collection
   No. Streams are immutable and do not modify the source collection.



** 9. Difference between map and filter
   filter selects elements based on a condition.
   map transforms elements from one form to another.



10. What is collect in streams
    collect is a terminal operation used to convert a stream into a collection or another data structure.



11. Difference between forEach and forEachOrdered
    forEach does not guarantee order, especially in parallel streams.
    forEachOrdered maintains the encounter order.



12. What is Optional in streams
    Optional is a container object used to represent the presence or absence of a value, avoiding null checks.



13. Is it safe to call get on Optional
    No. Calling get on an empty Optional throws NoSuchElementException.
    Use orElse or orElseThrow instead.



14. What is reduce
    reduce is a terminal operation that combines stream elements into a single result.



15. Difference between map and flatMap
    map transforms each element into one result.
    flatMap flattens nested structures into a single stream.



16. What are parallel streams
    Parallel streams process elements concurrently using multiple threads.



17. When should parallel streams be used
    For large datasets, CPU-bound tasks, and stateless operations.



18. When should parallel streams be avoided
    For small datasets, I O operations, shared mutable state, and order-sensitive tasks.



19. Difference between sequential and parallel streams
    Sequential streams use a single thread.
    Parallel streams use multiple threads.



20. What is short-circuiting in streams
    Operations like findFirst and anyMatch stop processing once a result is found.



21. Difference between Collectors.toList and Stream.toList
    Collectors.toList usually returns a mutable list.
    Stream.toList returns an unmodifiable list.



22. Are streams thread-safe
    Streams are safe to use, but operations must be stateless when using parallel streams.



23. Can we modify external variables inside streams
    It is not recommended, as it can cause unpredictable behavior.



24. Can streams handle infinite data
    Yes, using iterate or generate with limit.



25. Why were streams introduced in Java
    Streams were introduced to support functional programming, reduce boilerplate code, improve readability, and enable easy parallel processing.

















