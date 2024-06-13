package com.pluralsight.services;


import com.pluralsight.models.Film;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlFilmsDao implements FilmsDao {
    private DataSource dataSource;

    public MySqlFilmsDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Film> getFilmsByActor(int actorId) {
        List<Film> films = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String sql = """
                SELECT film.film_id
                    ,film.title
                FROM film
                JOIN film_actor ON film.film_id = film_actor.film_id
                WHERE film_actor.actor_id = ?
            """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, actorId);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                films.add(new Film(
                        resultSet.getInt("film_id"),
                        resultSet.getString("title")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }
}
