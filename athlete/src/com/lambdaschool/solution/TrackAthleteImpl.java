package com.lambdaschool.solution;

public class TrackAthleteImpl implements Athlete {
    @Override
    public void display(String sport) {
        System.out.println(sport + " Athlete");
    }
}
