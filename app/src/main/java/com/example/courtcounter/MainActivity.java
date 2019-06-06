package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0, scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the score for Team A
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 point.
     */
    public void addTwoForTeamA(View v) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 3 point.
     */
    public void addThreeForTeamA(View v) {
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v) {
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }

    /**
     * Resets the score to zero for both teams
     */

    public void resetBoth(View v) {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
