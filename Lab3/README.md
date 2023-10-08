#  Java Laboratory Work №3: E-commerce System

This Java application serves as a foundational e-commerce system. Within the architecture, products are cataloged, and functionalities for carts and order management are provided. Each product possesses the following key attributes:

- **ID**
- **Name**
- **Price**

## Features

### Product Class
- **Attributes**: Includes id, name, and price.
- **Constructor**: Initializes product details.
- **Display**: Overrides the `toString()` method to present product details.

### Cart Class
- **Storage**: Employs an `ArrayList<Product>` to store products.
- **Addition**: Implements the `addProduct(Product product)` method to include products.
- **Removal**: Facilitates product removal via the `removeProduct(Product product)` method.
- **Retrieval**: Fetches the product list through the `getProducts()` method.

### Order Class
- **Composition**: Encompasses an order ID, an assortment of products, and an order status.
- **Initialization**: Constructs new orders.
- **Status Retrieval**: Fetches order status via the `getStatus()` method.

## Testing

### Cart Tests
- **Addition**: `CartTest.testAddProduct()` ascertains the correct addition of products.
- **Removal**: `CartTest.testRemoveProduct()` certifies product removal functionality.
- **List Copy**: `CartTest.testGetProductsReturnsCopy()` ensures a copied product list is returned.

### Order Tests
- **Order Status**: `OrderTest.testOrderStatus()` confirms the accuracy of order status.
- **Product Retrieval**: `OrderTest.testOrderProducts()` validates the accurate retrieval of associated products.

## Demonstration
In the primary application class:
- Products are added to a cart and presented.
- The mechanism for product removal from the cart is exhibited.
- A fresh order, based on cart products, is formulated and showcased.
