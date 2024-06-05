USE northwind;

SELECT ProductID
	  ,ProductName
      , UnitPrice * UnitsInStock AS Inventory_Value
FROM northwind.products
ORDER BY Inventory_Value DESC, ProductName ASC;