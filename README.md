# SE_LAB_4
<h2>Project Report</h2>
<p>
In this project we tried to approach the project through the things we learned in the previous lab experiments like TDD and also via different design patterns.
</p>
<p>
First we analyzed the requirements. There was a need for flexibility in shipping strategies and package states.
</p>
<p>
Then we adopted a TDD approach to ensure robustness and maintainability through the development process.
</p>
<p>
We created the initial test classes (DeliveredStateTest, InTransitStateTest, …) we used the updateState() method. We implemented these test cases so that we would ensure that the states are updated/prinnted correctly.
</p>
<p>
We also created a mock class to help us with the tests that we were running. More specifically to assist in testing by verifying method invocations.
</p>
<p>
Then, we implemented the “ExpressShippingStrategy” and “StandardShippingStrategy” and other classes other than test classes to implement our requirements.
</p>
<p>
We implemented the package class with the methods to set the shipping strategy and package state to perform package shipping and state updates. Then we added the related tests for related verification.
</p>
<p>
Then it's time for package class implementation and then verify it with the PackageTest class. After that we debugged and refined the code until it worked properly and passed all the tests.
</p>
<p>
We have considered TDD and SOLID principles all along coding and implementing the project. We made sure that the changes that were made their way to the expected outcome.
We also added additional mock classes for further verification between the package class and its dependencies.
</p>
<p>In order to run the project you have to run the ShippingSystem.java file. That's our version of the main.java file in the project.</p>
<h2>Pictures</h2>

![image_2023_11_22T18_06_13_565Z.png](pics/image_2023_11_22T18_06_13_565Z.png)
![image_2023_11_22T18_11_28_273Z.png](pics/image_2023_11_22T18_11_28_273Z.png)

<h2>Questions</h2>
<h3>Question 1</h3>
<h4>Creational Patterns</h4>
<p>
Purpose: Focuses on the process of object creation, providing flexibility in instantiation.
Examples: Singleton ensures a single instance, Factory Method lets subclasses alter created object types, Abstract Factory creates families of related objects.
</p>
<h4>Structural Patterns</h4>
<p>
Purpose: Deals with class and object composition to form larger structures.
Examples: Adapter allows using an existing class interface as another, Decorator attaches responsibilities dynamically, Composite composes objects into tree structures.
</p>
<h4>Behavioral Patterns</h4>
<p>
Purpose: Defines communication between classes or objects.
Examples: Observer defines a one-to-many dependency, Strategy defines a family of algorithms and makes them interchangeable, Command encapsulates a request as an object, allowing for parameterization of clients, and more.


<h3>Question 2</h3>
<p>Both the Strategy and State design patterns fall within the category of behavioral patterns, which govern how objects collaborate and communicate. While the Strategy pattern highlights the use of interchangeable algorithms, the State pattern is centered around altering an object's behavior in response to changes in its internal state.</p>

<h3>Question 3</h3>
<p>Applying the Singleton pattern to our current system package offers an effective way to manage class instances. This creational design pattern guarantees a single instance for a class, enabling centralized access to this unique instance. It ensures that the class has only one instance, facilitating global access throughout the system.</p>

<p>Implementation Details: To implement the Singleton pattern for this project, a Package class is required. In this class, a concealed instance of the package serves as a field, and the class declares the static method getInstance(). This method consistently returns the same instance of the class every time it is invoked. If no instance exists, a new Package is constructed and set as the static instance available in the class. If it already exists, the existing instance is returned. The constructor of the Package class (representing the Singleton) should be concealed from the client code, ensuring that calling the getInstance method remains the sole method of obtaining the Singleton object.</p>

<h3>Question 4</h3>
<p>Singleton and SOLID Principles:</p>

<p>1)Single Responsibility Principle:
The Singleton pattern tends to violate the Single Responsibility Principle by addressing two concerns simultaneously.</p>

<p>2)Open/Closed Principle:
On the positive side, the Singleton adheres to the Open/Closed Principle, allowing for extension without requiring modifications to its code.</p>

<p>3)Liskov Substitution Principle:
While the Singleton pattern itself doesn't breach the Liskov Substitution Principle, it is crucial to ensure that the Singleton behaves appropriately when used as a substitute for its base class.
</p>

<p>4)Interface Segregation Principle:
<p>In its standard form, the Singleton pattern doesn't heavily rely on interfaces, making Interface Segregation Principle (ISP) a secondary consideration. Interfaces are not a prominent feature in its typical implementation.</p>

<p>5)Dependency Inversion Principle:</p>
<p>The Dependency Inversion Principle (DIP) can be satisfied by the Singleton pattern if clients depend on abstractions like interfaces rather than directly on the concrete implementation of the Singleton. This abstraction promotes flexibility and decouples clients from specific implementation details.</p>

