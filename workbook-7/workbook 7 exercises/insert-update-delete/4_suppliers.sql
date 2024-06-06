USE northwind;

UPDATE Products
SET UnitPrice = UnitPrice * 1.15
WHERE ProductName = 'New Product' AND SupplierID = 30;

SELECT ProductID, ProductName, UnitPrice
FROM Products
WHERE ProductName = 'New Product' AND SupplierID = 30;
