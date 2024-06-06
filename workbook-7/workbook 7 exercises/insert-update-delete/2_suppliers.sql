USE northwind;


SELECT SupplierID
FROM Suppliers
WHERE CompanyName = 'New Supplier Inc.';



INSERT INTO Products (ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES ('New Product', 30, 1, '10 boxes x 20 bags', 20.00, 100, 0, 10, 0);

SELECT *
FROM Products
WHERE ProductName = 'New Product' AND SupplierID = 30;


DELETE FROM Products
WHERE ProductName IS NULL AND SupplierID IS NULL AND Discontinued IS NULL;

SELECT *
FROM Products
WHERE ProductName = 'New Product' AND SupplierID = 30;


SELECT *
FROM Products
WHERE ProductName IS NULL OR SupplierID IS NULL OR Discontinued IS NULL;


DELETE FROM Products
WHERE ProductName IS NULL AND SupplierID IS NULL AND Discontinued IS NULL;


SELECT *
FROM Products
WHERE ProductName IS NULL OR SupplierID IS NULL OR Discontinued IS NULL;


DELETE FROM Products
WHERE ProductID = (SELECT ProductID FROM Products WHERE ProductName IS NULL AND SupplierID IS NULL AND Discontinued IS NULL LIMIT 1);

