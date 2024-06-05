SELECT ProductID
	  ,ProductName
      ,UnitPrice
FROM northwind.products
WHERE  UnitsInStock >= 100
ORDER BY UnitPrice DESC;
