# SE_LAB_4

<h2>Questions</h2>
<h3>Question 1</h3>

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

