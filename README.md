# SE_LAB_4

Q1)

Q2)

Q3)

Q4) Singleton and SOLID Principles:

1)Single Responsibility Principle:
The Singleton pattern tends to violate the Single Responsibility Principle by addressing two concerns simultaneously.

2)Open/Closed Principle:
On the positive side, the Singleton adheres to the Open/Closed Principle, allowing for extension without requiring modifications to its code.

3)Liskov Substitution Principle:
While the Singleton pattern itself doesn't breach the Liskov Substitution Principle, it is crucial to ensure that the Singleton behaves appropriately when used as a substitute for its base class.

4)Interface Segregation Principle:
In its standard form, the Singleton pattern doesn't heavily rely on interfaces, making Interface Segregation Principle (ISP) a secondary consideration. Interfaces are not a prominent feature in its typical implementation.

5)Dependency Inversion Principle:
The Dependency Inversion Principle (DIP) can be satisfied by the Singleton pattern if clients depend on abstractions like interfaces rather than directly on the concrete implementation of the Singleton. This abstraction promotes flexibility and decouples clients from specific implementation details.

