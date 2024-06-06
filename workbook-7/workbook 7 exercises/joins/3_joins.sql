USE northwind;

SELECT p.ProductID
      ,p.ProductName
	  ,p.UnitPrice
      ,c.CategoryName
      ,s.CompanyName AS SupplierName
FROM Products AS p
JOIN Categories AS c ON p.CategoryID = c.CategoryID
JOIN Suppliers AS s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName ASC;