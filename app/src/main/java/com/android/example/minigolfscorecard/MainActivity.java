package com.android.example.minigolfscorecard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;
    int holePlayerOne = 0;
    int holePlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Displays the given score for Player One
    public void displayScorePlayerOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the actuel hole for Player One
    public void displayHolePlayerOne(int score) {
        TextView scoreView =  findViewById(R.id.player_one_hole);
        scoreView.setText(String.valueOf(score));
    }

    // Add Ponits from 1 to 7 for Player One
    public void addOnePointForOne(View view) {
        scorePlayerOne = scorePlayerOne + 1;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addTwoPointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 2;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addThreePointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 3;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addFourPointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 4;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addFivePointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 5;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addSixPointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 6;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    public void addSevenPointsForOne(View view) {
        scorePlayerOne = scorePlayerOne + 7;
        displayScorePlayerOne(scorePlayerOne);
        holePlayerOne = holePlayerOne + 1;
        displayHolePlayerOne(holePlayerOne);
    }

    //Displays the given score for Player Two
    public void displayScorePlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the actuel hole for Player One
    public void displayHolePlayerTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_hole);
        scoreView.setText(String.valueOf(score));
    }

    // Add Ponits from 1 to 7 for Player Two
    public void addOnePointForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 1;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addTwoPointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 2;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addThreePointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 3;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addFourPointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 4;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addFivePointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 5;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addSixPointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 6;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    public void addSevenPointsForTwo(View view) {
        scorePlayerTwo = scorePlayerTwo + 7;
        displayScorePlayerTwo(scorePlayerTwo);
        holePlayerTwo = holePlayerTwo + 1;
        displayHolePlayerTwo(holePlayerTwo);
    }

    // Reset the Score to 0
    public void reset(View v) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        holePlayerOne = 0;
        holePlayerTwo = 0;
        displayScorePlayerOne(scorePlayerOne);
        displayScorePlayerTwo(scorePlayerTwo);
        displayHolePlayerOne(holePlayerOne);
        displayHolePlayerTwo(holePlayerTwo);
    }
}
