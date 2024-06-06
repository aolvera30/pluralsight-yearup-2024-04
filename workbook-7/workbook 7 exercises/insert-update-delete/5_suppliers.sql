USE northwind;


SELECT ProductID, ProductName, UnitPrice
FROM Products
WHERE SupplierID = 30
ORDER BY ProductName ASC;
