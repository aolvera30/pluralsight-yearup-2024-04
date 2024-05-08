package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void checkIn_WhenRoomIsNotOccupied_ShouldMakeRoomOccupiedAndDirty()
    {
        // Arrange-this is where you set up all variables that you will need to execute the test
        Room room = new Room(2,100.0,false,false);

        //Act- This is the one method call that you are testing in this test scenario
        room.checkIn();

        //Assert- This is where you write code to verify that your method under test performed as expected
        assertTrue(room.isOccupied(), "Room should be occupied after check-in");
        assertTrue(room.isDirty(), "Room should be dirty after check-in");

    }

    @Test
    public void checkOut_WhenRoomIsOccupied_ShouldMakeRoomUnoccupiedAndClean()
    {
        // Arrange - set up
        Room room = new Room(2,100,true,true);

        // Act - THE ONE action that I am testing
        room.checkOut(); //guest checks out

        // Assert - verify that the action worked as expected
        assertFalse(room.isOccupied(), "Room should be unoccupied after check-out");
        assertFalse(room.isDirty(), "Room should be clean after check-out");

    }

    @Test
    public void roomIsDirty_shouldBe_cleaned()
    {
        // Arrange - set up
        Room room = new Room(2,100,true,true); // Creating an occupied and dirty room

        // Act - THE ONE action that I am testing
        room.cleanRoom();

        //Assert - verify that the action worked as expected
        assertFalse(room.isDirty(),"Room is clean! ");

    }

}