package com.pluralsight.services;

import com.pluralsight.models.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlActorsDao implements ActorsDao
{
    private DataSource dataSource;

    public MySqlActorsDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Actor> getActorsByLastName(String lastName) {
        List<Actor> actors = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    SELECT actor_id 
                        ,first_name
                        ,last_name 
                    FROM actor 
                    WHERE last_name = ?";
            """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lastName);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                actors.add(new Actor(
                        resultSet.getInt("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actors;
    }

    @Override
    public List<Actor> getActorsByFullName(String firstName, String lastName) {
        List<Actor> actors = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                    
                    SELECT actor_id
                        ,first_name
                        ,last_name 
                    FROM actor 
                    WHERE first_name = ? AND last_name = ?";
            """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                actors.add(new Actor(
                        resultSet.getInt("actor_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actors;
    }

}
