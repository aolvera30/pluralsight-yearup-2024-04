SELECT ProductID
	  ,ProductName
      ,UnitPrice
FROM northwind.products
WHERE  UnitsInStock = 0  AND UnitsOnOrder > 0
ORDER BY ProductName ASC;
