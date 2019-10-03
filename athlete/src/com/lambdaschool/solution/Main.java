package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {

        AthleteCreationInjector injector;
        Processor app;

        //(VV) inside a TACI injector I'll need to create.
        //     ^^inside of THAT TrackAthleteCreationInjector...I'll pull in my processor, and then use construcor injection to pull in MyApplication.
        //TrackAthleteCreationInjector implements AthleteCreationInjector

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.display("Track");

        //HockeyAthleteCreationInjector implements AthleteCreationInjector
        // Create a Hockey Athlete
//        injector = new HockeyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();


        // Create a Rugby Athlete
//        injector = new RugbyAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();

        // Create a Baseball Athlete
//        injector = new BaseballAthleteCreationInjector();
//        app = injector.getProcess();
//        app.displayAthlete();

    }
}
