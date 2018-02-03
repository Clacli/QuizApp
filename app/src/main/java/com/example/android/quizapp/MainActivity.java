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
            calulateScoreForRosaceae();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForOrange();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForAhillea();
            Log.v("MainActivity", "score is: " + score);
            calulateScoreForFennel();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForCrocus();
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
     * This method calculate the score for the Apiaceae quiz
     *
     * @return score of the quiz
     */
    private int calulateScoreForRosaceae() {
        // Figure out if the user has checked caraway answer
        CheckBox appleOption = findViewById(R.id.apple_checkbox);
        boolean isAppleChecked = appleOption.isChecked();
        // Figure out if the user has checked cumin answer
        CheckBox cornelianCherryOption = findViewById(R.id.cornelian_cherry_checkbox);
        boolean isCornelianCherryChecked = cornelianCherryOption.isChecked();
        //Figure it out if the user has checked estragon answer
        CheckBox hawthornOption = findViewById(R.id.hawthorn_checkbox);
        boolean isHawthornChecked = hawthornOption.isChecked();
        //Check if answer is correct
        if (isAppleChecked && !isCornelianCherryChecked && isHawthornChecked) {
            score = score + 1;
        }
        return score;
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
     * This method calculate the score for the Orange quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForOrange() {
        //Find the user's name
        EditText orangeView = (EditText) findViewById(R.id.orange_edit);
        String orangeAnswer = orangeView.getText().toString();
        if (orangeAnswer.compareTo("Citrus") == 0) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Crocus quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForCrocus() {
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
