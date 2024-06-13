package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

public class ActorAddView extends ViewBase
{
    public Actor getNewActor()
    {
        System.out.println();
        System.out.println("Add new actor");
        System.out.println("-".repeat(40));
        System.out.print("Enter the first name: ");
        String firstName = in.nextLine().strip();
        System.out.print("Enter the last name: ");
        String lastName = in.nextLine().strip();

        return new Actor(0, firstName, lastName);
    }
}
