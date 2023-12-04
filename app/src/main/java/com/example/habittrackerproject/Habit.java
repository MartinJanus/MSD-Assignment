package com.example.habittrackerproject;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "habit_table")
public class Habit {
    @PrimaryKey(autoGenerate = true)
    private int id;

    //habit name
    private String habitName;
    private String habitDescription;
//    private String startDate;
//    private String Duration;
    private boolean isCompleted;


    //Constructor Class

    public Habit(String habitName, String habitDescription){
        this.habitName = habitName;
        this.habitDescription = habitDescription;
    }

    //Getters and Setters
    public String getHabitName(){return habitName;}
    public void setHabitName(String habitName){this.habitName = habitName;}

    public String getHabitDescription(){return habitDescription;}
    public void setHabitDescription(String habitDescription){this.habitDescription = habitDescription;}

    @Override
    public String toString() {
        return habitName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    }
