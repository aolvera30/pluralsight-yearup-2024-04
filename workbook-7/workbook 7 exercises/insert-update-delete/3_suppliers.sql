USE northwind;

SELECT p.ProductID, p.ProductName, s.CompanyName AS SupplierName
FROM Products AS p
JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName ASC;