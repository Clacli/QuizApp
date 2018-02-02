package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    private TextView gradingView;

    private OnClickListener mListener = new OnClickListener() {
        public void onClick(View v) {
            calculateScoreForAhillea();
            Log.v("MainActivity", "score is: " + score);
            calulateScoreForFennel();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForSaffron();
            Log.v("MainActivity", "score is: " + score);
            Toast.makeText(getApplicationContext(), "Your current score is " + score, Toast.LENGTH_SHORT).show();
            displayGrading("Your current score is " + score);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradingView = (TextView) findViewById(R.id.quiz_grading);

        //Capture submit button from layout
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        //Register the onClick listener with the implemented button
        submitButton.setOnClickListener(mListener);
    }

    /**
     * This method calculate the score for the Achillea quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForAhillea() {
        // Figure out if the user has checked Asteraceae answer
        RadioButton asteraceaeOption = findViewById(R.id.asteraceae_radio_button);
        boolean isAsteraceaeChecked = asteraceaeOption.isChecked();
        if (isAsteraceaeChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Apiaceae quiz
     *
     * @return score of the quiz
     */
    private int calulateScoreForFennel() {
        // Figure out if the user has checked caraway answer
        CheckBox carawayOption = findViewById(R.id.caraway_checkbox);
        boolean isCarawayChecked = carawayOption.isChecked();
        // Figure out if the user has checked cumin answer
        CheckBox cuminOption = findViewById(R.id.cumin_checkbox);
        boolean isCuminChecked = cuminOption.isChecked();
        //Figure it out if the user has checked estragon answer
        CheckBox estragonOption = findViewById(R.id.estragon_checkbox);
        boolean isEstragonChecked = estragonOption.isChecked();
        //Check if answer is correct
        if (isCarawayChecked && isCuminChecked && !isEstragonChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Apiaceae quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForSaffron() {
        //Find the user's name
        EditText crocusView = (EditText) findViewById(R.id.crocus_edit);
        String crocusAnswer = crocusView.getText().toString();
        if (crocusAnswer.compareTo("Saffron") == 0) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayGrading(String result) {
        gradingView.setText(result);
    }
}
