# SOLID Principles


## Understand the SOLID principles using the simple of an e-commerce application example

Suppose we have an e-commerce application that allows users to purchase products from a catalog. We want to make sure our code is well-designed, maintainable, and scalable. Here's how we can apply the SOLID principles:

<font size="5" color="Red">**S**</font><b>ingle Responsibility Principle (SRP):</b> A class should have only one reason to change. This principle suggests that a class should have only one responsibility or job. This way, if there is a change required in one aspect of the code, it will not affect the other unrelated aspects.

Ex:
We create a class called <font color="cyan">**ProductCatalog**</font> that is responsible for managing the products in the catalog. This class should have only one responsibility: to manage the products. It should not be responsible for handling orders, managing customers, or any other unrelated tasks.

<font size="5" color="Red">**O**</font><b>pen-Closed Principle (OCP):</b> Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This principle suggests that you should design your code in a way that allows you to extend its behavior without modifying its source code.

Ex:
We create an interface called <font color="cyan">**IPriceCalculator**</font> that has a single method called <font color="cyan">**CalculatePrice**</font>. This interface is open for extension because we can add new implementations of <font color="cyan">**IPriceCalculator**</font> to support different types of discounts or promotions. It is closed for modification because the existing code that uses <font color="cyan">**IPriceCalculator**</font> does not need to be modified when new implementations are added.

<font size="5" color="Red">**L**</font><b>iskov Substitution Principle (LSP):</b> Objects of a superclass should be replaceable with objects of a subclass without breaking the program. This principle suggests that if you have a base class and a subclass, the subclass should be able to replace the base class without affecting the correctness of the program.

Ex:
We create a class called <font color="cyan">**PhysicalProduct**</font> that represents a physical product that can be shipped to a customer. We also create a class called <font color="cyan">**DigitalProduct**</font> that represents a digital product that can be downloaded. Both classes inherit from a base class called <font color="cyan">**Product**</font>. Because <font color="cyan">**PhysicalProduct**</font> and <font color="cyan">**DigitalProduct**</font> are subclasses of <font color="cyan">**Product**</font>, they should be able to replace <font color="cyan">**Product**</font> without affecting the behavior of the application.

<font size="5" color="Red">**I**</font><b>nterface Segregation Principle (ISP):</b> A client should not be forced to depend on methods it does not use. This principle suggests that you should design your interfaces in a way that clients only depend on the methods they actually use.

Ex:
We create an interface called **IOrderProcessor** that has a single method called <font color="cyan">**ProcessOrder**</font>. This interface is segregated because it contains only the methods that are needed by the classes that depend on it. For example, the <font color="cyan">**CheckoutService**</font> class depends on <font color="cyan">**IOrderProcessor**</font>, but it does not need to know about other methods that might be defined in <font color="cyan">**IOrderProcessor**</font>.

<font size="5" color="Red">**D**</font>ependency Inversion Principle (DIP):</b> High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. This principle suggests that you should write your code in a way that high-level modules depend on abstractions rather than on low-level modules.

Ex:
We create an interface called <font color="cyan">**IProductRepository**</font> that defines the methods for managing products in the catalog. We also create a class called <font color="cyan">**ProductRepository**</font> that implements <font color="cyan">**IProductRepository**</font>. This allows us to decouple the <font color="cyan">**ProductCatalog**</font> class from the implementation details of how products are stored in the database. The <font color="cyan">**ProductCatalog**</font> class depends on the abstraction provided by <font color="cyan">**IProductRepository**</font>, rather than directly depending on <font color="cyan">**ProductRepository**</font>. This allows us to swap out different implementations of <font color="cyan">**IProductRepository**</font> without affecting the behavior of the <font color="cyan">**ProductCatalog**</font> class.
