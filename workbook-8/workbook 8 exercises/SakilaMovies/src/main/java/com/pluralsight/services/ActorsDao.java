package com.pluralsight.services;

import com.pluralsight.models.Actor;
import java.util.List;

public interface ActorsDao {
    List<Actor> getActorsByLastName(String lastName);
    List<Actor> getActorsByFullName(String firstName, String lastName);
}
