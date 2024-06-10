package com.pluralsight;

import java.sql.*;

public class Main
{
    public static void main(String[] args)
    {

        try
        {
            // load the MySQL Driver
           // Class.forName("com.mysql.cj.jdbc.Driver");


            // 1. open a connection to the database
            // use the database URL to point to the correct database
            Connection connection;
            connection =DriverManager.getConnection(
            "jdbc:mysql:/ / localhost:33o6/northwind",
                "root",
                "YUm15510n"
                );

            // 2. execute a statement
            String sql = """
                    SELECT Id
                        , Name
                        , CountryCode
                    FROM city;
                    """;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // 2 a. - read the results
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("Name");
                String country = resultSet.getString("CountryCode");

                System.out.printf("%3d  %-30s %s\n", id, name, country);
            }


            // 3. close the connection
            connection.close();



        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
    }
}
