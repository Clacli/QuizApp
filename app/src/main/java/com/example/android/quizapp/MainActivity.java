package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradeAnswersAndDisplayScore(View view) {
        displayGrading("Your current score is " + score);
        // Show test message now(later message which accurately displays the results of the quiz) as a toast.
        Toast.makeText(this, "Your current score is " + score, Toast.LENGTH_LONG).show();
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayGrading(String result) {
        TextView gradingView = (TextView) findViewById(R.id.quiz_grading);
        gradingView.setText(result);
    }
}
