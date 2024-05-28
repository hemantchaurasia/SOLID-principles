# SOLID Principles


Understand the SOLID principles using the example of an e-commerce application:


Suppose we have an e-commerce application that allows users to purchase products from a catalog. We want to make sure our code is well-designed, maintainable, and scalable. Here's how we can apply the SOLID principles:

### Single Responsibility Principle (SRP):
A class should have only one reason to change. This principle suggests that a class should have only one responsibility or job. This way, if there is a change required in one aspect of the code, it will not affect the other unrelated aspects.

**Example:**
We create a class called **_ProductCatalog_** that is responsible for managing the products in the catalog. This class should have only one responsibility to manage the products. It should not be responsible for handling orders, managing customers, or any other unrelated tasks.



### Open-Closed Principle (OCP):
Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This principle suggests that you should design your code in a way that allows you to extend its behavior without modifying its source code.

**Example:**
We create an interface called **_IPriceCalculator_** that has a single method called **_CalculatePrice_**. This interface is open for extension because we can add new implementations of **_IPriceCalculator_** to support different types of discounts or promotions. It is closed for modification because the existing code that uses **_IPriceCalculator_** does not need to be modified when new implementations are added.



### Liskov Substitution Principle (LSP):
Objects of a superclass should be replaceable with objects of a subclass without breaking the program. This principle suggests that if you have a base class and a subclass, the subclass should be able to replace the base class without affecting the correctness of the program.

**Example:**
We create a class called **_PhysicalProduct_** that represents a physical product that can be shipped to a customer. We also create a class called **_DigitalProduct_** that represents a digital product that can be downloaded. Both classes inherit from a base class called **_Product_**. Because **_PhysicalProduct_** and **_DigitalProduct_** are subclasses of **_Product_**, they should be able to replace **_Product_** without affecting the behavior of the application.



### Interface Segregation Principle (ISP):
A client should not be forced to depend on methods it does not use. This principle suggests that you should design your interfaces in a way that clients only depend on the methods they actually use.

**Example:**
We create an interface called **_IOrderProcessor_** that has a single method called **_ProcessOrder_**. This interface is segregated because it contains only the methods that are needed by the classes that depend on it. For example, the **_CheckoutService_** class depends on **_IOrderProcessor_**, but it does not need to know about other methods that might be defined in **_IOrderProcessor_**.



### Dependency Inversion Principle (DIP): 
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions. This principle suggests that you should write your code in a way that high-level modules depend on abstractions rather than on low-level modules.

**Example:**
We create an interface called **_IProductRepository_** that defines the methods for managing products in the catalog. We also create a class called **_ProductRepository_** that implements **_IProductRepository_**. This allows us to decouple the **_ProductCatalog_** class from the implementation details of how products are stored in the database. The **_ProductCatalog_** class depends on the abstraction provided by **_IProductRepository_**, rather than directly depending on **_ProductRepository_**. This allows us to swap out different implementations of **_IProductRepository_** without affecting the behavior of the **_ProductCatalog_** class.
