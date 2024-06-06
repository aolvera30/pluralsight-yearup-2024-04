USE northwind;


DELETE FROM Products
WHERE ProductName = 'New Product' AND SupplierID = 30;


SELECT *
FROM Products
WHERE ProductName = 'New Product' AND SupplierID = 30;