package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    /**
     * onClick method diplay a message toast on the screen (and a test message) when submit button is clicked
     */
    private OnClickListener mListener = new OnClickListener() {
        public void onClick(View v) {
            displayGrading("Your current score is " + score);
            Toast.makeText(getApplicationContext(), "Your current score is " + score, Toast.LENGTH_SHORT).show();
        }
    };

    // Create an anonymous implementation of OnClickListener

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capture submit button from layout
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        //Register the onClick listener with the implementated button
        submitButton.setOnClickListener(mListener);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayGrading(String result) {
        TextView gradingView = (TextView) findViewById(R.id.quiz_grading);
        gradingView.setText(result);
    }
}
