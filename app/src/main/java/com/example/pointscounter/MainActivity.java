/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.pointscounter;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsA(View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }


    public void twoPointsA(View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsB(View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }


    public void twoPointsB(View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }


}