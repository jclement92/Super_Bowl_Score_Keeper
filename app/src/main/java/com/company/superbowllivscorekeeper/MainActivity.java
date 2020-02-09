package com.company.superbowllivscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Class variables
    private static final int TOUCHDOWN = 6;
    private static final int ONE_POINT_CONVERSION = 1;
    private static final int TWO_POINT_CONVERSION = 2;
    private static final int SAFETY = 3;

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 6 points to Team A's current score.
     *
     * @param view the view that is called
     */
    public void teamATouchdown(View view) {
        teamAScore = teamAScore + TOUCHDOWN;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds 2 points to Team A's current score.
     *
     * @param view the view that is called
     */
    public void teamATwoPointConv(View view) {
        teamAScore = teamAScore + TWO_POINT_CONVERSION;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds 1 point to Team A's current score.
     *
     * @param view the view that is called
     */
    public void teamAOnePointConv(View view) {
        teamAScore = teamAScore + ONE_POINT_CONVERSION;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds 3 points to Team A's current score.
     *
     * @param view the view that is called
     */
    public void teamASafety(View view) {
        teamAScore = teamAScore + SAFETY;
        displayForTeamA(teamAScore);
    }


    /**
     * Adds 6 points to Team B's current score.
     *
     * @param view the view that is called
     */
    public void teamBTouchdown(View view) {
        teamBScore = teamBScore + TOUCHDOWN;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds 2 points to Team B's current score.
     *
     * @param view the view that is called
     */
    public void teamBTwoPointConv(View view) {
        teamBScore = teamBScore + TWO_POINT_CONVERSION;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds 1 point to Team B's current score.
     *
     * @param view the view that is called
     */
    public void teamBOnePointConv(View view) {
        teamBScore = teamBScore + ONE_POINT_CONVERSION;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds 3 points to Team B's current score.
     *
     * @param view the view that is called
     */
    public void teamBSafety(View view) {
        teamBScore = teamBScore + SAFETY;
        displayForTeamB(teamBScore);
    }

    /**
     * Resets Team A's score and Team B's score to 0.
     *
     * @param view The reset Button
     */
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

}
