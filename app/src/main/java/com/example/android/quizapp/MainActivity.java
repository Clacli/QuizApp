package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
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
            calculateScoreForBilberry();
            Log.v("MainActivity", "score is: " + score);
            calulateScoreForAsteraceae();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForPlantago();
            Log.v("MainActivity", "score is: " + score);
            calculateScoreForOleaceae();
            Log.v("MainActivity", "score is: " + score);
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
            calculateScoreForLythrum();
            Log.v("MainActivity", "score is: " + score);
            Toast.makeText(getApplicationContext(), "Your score is " + score, Toast.LENGTH_SHORT).show();
            displayGrading("Your current score is " + score);
        }
    };

//    private OnClickListener mResetListener = new OnClickListener() {   // TODO fix reset answer then enable reset button
//        public void onClick(View v) {
//            score = 0;
//            Toast.makeText(getApplicationContext(), "Your score is " + score, Toast.LENGTH_SHORT).show();
//            displayGrading("Your current score is " + score);
//            finish();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradingView = (TextView) findViewById(R.id.quiz_grading);

        //Capture submit button from layout
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        //Register the onClick listener with the implemented button
        submitButton.setOnClickListener(mListener);
//        //Capture reset button from layout
//        Button resetButton = (Button) findViewById(R.id.reset_button);
//        //Register the onClick listener with the implemented button
//        resetButton.setOnClickListener(mResetListener);
    }

    /**
     * This method calculate the score for the bilberry quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForBilberry() {
        // Figure out if the user has checked yes answer
        RadioButton noOption = findViewById(R.id.no_radio_button);
        boolean isNoChecked = noOption.isChecked();
        if (isNoChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Oleaceae quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForOleaceae() {
        // Figure out if the user has checked Oleaceae answer
        RadioButton oleaceaeOption = findViewById(R.id.oleaceae_radio_button);
        boolean isOleaceaeChecked = oleaceaeOption.isChecked();
        if (isOleaceaeChecked) {
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
     * This method calculate the score for the Lythrum quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForLythrum() {
        // Figure out if the user has checked yes answer
        RadioButton yesOption = findViewById(R.id.yes_radio_button);
        boolean isYesChecked = yesOption.isChecked();
        if (isYesChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Rosaceae quiz
     *
     * @return score of the quiz
     */
    private int calulateScoreForAsteraceae() {                    //TODO Translate, pics, header and landscape mode
        // Figure out if the user has checked carrot answer
        CheckBox carrotOption = findViewById(R.id.carrot_checkbox);
        boolean isCarrotChecked = carrotOption.isChecked();
        // Figure out if the user has checked daisy answer
        CheckBox daisyOption = findViewById(R.id.daisy_checkbox);
        boolean isDaisyChecked = daisyOption.isChecked();
        //Figure it out if the user has checked calendula answer
        CheckBox calendulaOption = findViewById(R.id.calendula_checkbox);
        boolean isCalendulaChecked = calendulaOption.isChecked();
        //Check if answer is correct
        if (!isCarrotChecked && isDaisyChecked && isCalendulaChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Rosaceae quiz
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
     * This method calculate the score for the Plantago quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForPlantago() {
        //Find the answer
        EditText plantagoView = (EditText) findViewById(R.id.plantago_edit);
        // Set keyboard button Done
        plantagoView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        String orangeAnswer = plantagoView.getText().toString();
        //Check if answer is correct to increase score by 1
        if (orangeAnswer.compareTo("Spike") == 0) {
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
        //Find the answer
        EditText orangeView = (EditText) findViewById(R.id.orange_edit);
        // Set keyboard button Done
        orangeView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        String orangeAnswer = orangeView.getText().toString();
        //Check if answer is correct to increase score by 1
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
        //Find the answer
        EditText crocusView = (EditText) findViewById(R.id.crocus_edit);
        // Set keyboard button Done
        crocusView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        String crocusAnswer = crocusView.getText().toString();
        //Check if answer is correct to increase score by 1
        if (crocusAnswer.compareTo("Saffron") == 0) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayGrading(String result) {    // TODO Fix result message "You answered to" + numberOfRightAnswers + Right anwer. You are a + (0-3 no idea 4-5 little 6-8 good 9-10 botany lover)
        gradingView.setText(result);                // TODO email intent result message you will love address kew garden site.
    }
}
