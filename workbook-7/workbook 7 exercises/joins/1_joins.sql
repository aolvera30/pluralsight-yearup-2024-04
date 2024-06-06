USE northwind;

SELECT p.ProductID
      ,p.ProductName
      ,p.UnitPrice
      ,c.CategoryName
FROM products AS p
INNER JOIN categories AS c ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName ASC, p.ProductName ASC;