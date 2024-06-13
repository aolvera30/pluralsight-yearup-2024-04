package com.pluralsight.services;

import com.pluralsight.models.Film;
import java.util.List;

public interface FilmsDao {
    List<Film> getFilmsByActor(int actorId);
}