package com.example.ayush.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;
    int wicketsTeam1 = 0;
    int wicketsTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add one run to Team 1.
     */

    public void addOneForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }


    /**
     * Add one run to Team 2.
     */
    public void addOneForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Add two runs to Team1.
     */
    public void addTwoForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Add two runs to Team2.
     */
    public void addTwoForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Add three runs to Team1.
     */
    public void addThreeForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }


    /**
     * Add three runs to Team1.
     */
    public void addThreeForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }


    /**
     * Add four runs to Team1.
     */
    public void addFourForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 4;
        displayForTeam1(scoreTeam1);
    }


    /**
     * Add four runs to Team2.
     */
    public void addFourForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 4;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Add six runs to Team1.
     */
    public void addSixForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 6;
        displayForTeam1(scoreTeam1);
    }


    /**
     * Add six runs to Team1.
     */
    public void addSixForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 6;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Add WICKETS to Team1.
     */
    public void addOneWicketForTeam1(View view) {


        wicketsTeam1 = wicketsTeam1 + 1;

        if (wicketsTeam1 < 11) {
            wicketsForTeam1(wicketsTeam1);
        }
    }

    /**
     * Add WICKETS to Team2.
     */
    public void addOneWicketForTeam2(View view) {
        wicketsTeam2 = wicketsTeam2 + 1;

        if (wicketsTeam2 < 11) {
            wicketsForTeam2(wicketsTeam2);
        }

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreteam1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreteam2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wickets for Team 1.
     */
    public void wicketsForTeam1(int wickets1) {
        TextView wicketView = (TextView) findViewById(R.id.wicketsteam1);
        wicketView.setText(String.valueOf(wickets1));
    }

    /**
     * Displays the given wickets for Team 1.
     */
    public void wicketsForTeam2(int wickets2) {
        TextView wicketView = (TextView) findViewById(R.id.wicketsteam2);
        wicketView.setText(String.valueOf(wickets2));
    }


    /**
     * Reset the score for both teams.
     */
    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        wicketsTeam1 = 0;
        wicketsTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
        wicketsForTeam2(wicketsTeam2);
        wicketsForTeam1(wicketsTeam1);
    }


}
