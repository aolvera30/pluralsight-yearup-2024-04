USE northwind;
SELECT SupplierID, COUNT(*) AS NumberOfItems
FROM Products
GROUP BY SupplierID;