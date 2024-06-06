USE northwind;

SELECT p.ProductID
      ,p.ProductName
	  ,p.UnitPrice
      , s.CompanyName AS SupplierName
FROM Products AS p
JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName ASC;