package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    private OnClickListener mListener = new OnClickListener() {
        public void onClick(View v) {
            calculateScoreForBilberry();
            calulateScoreForAsteraceae();
            calculateScoreForPlantago();
            calculateScoreForOleaceae();
            calulateScoreForRosaceae();
            calculateScoreForOrange();
            calculateScoreForAhillea();
            calulateScoreForCarrot();
            calculateScoreForCrocus();
            calculateScoreForLythrum();
            Toast.makeText(getApplicationContext(), createMessage(score), Toast.LENGTH_LONG).show();
            score = 0;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capture submit button from layout
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        //Register the onClick listener with the implemented button
        submitButton.setOnClickListener(mListener);
    }

    /**
     * This method calculate the score for the bilberry quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForBilberry() {
        // Figure out if the user has checked yes answer
        RadioButton noOption = findViewById(R.id.no_radio_button);
        boolean isNoAnswerChecked = noOption.isChecked();
        if (isNoAnswerChecked) {
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
        RadioButton yesOption = findViewById(R.id.affirmative_radio_button);
        boolean isYesAnswerChecked = yesOption.isChecked();
        if (isYesAnswerChecked) {
            score = score + 1;
        }
        return score;
    }

    /**
     * This method calculate the score for the Rosaceae quiz
     *
     * @return score of the quiz
     */
    private int calulateScoreForAsteraceae() {
        // Figure out if the user has checked fennel answer
        CheckBox fennelOption = findViewById(R.id.fennel_checkbox);
        boolean isFennelChecked = fennelOption.isChecked();
        // Figure out if the user has checked daisy answer
        CheckBox daisyOption = findViewById(R.id.daisy_checkbox);
        boolean isDaisyChecked = daisyOption.isChecked();
        //Figure it out if the user has checked calendula answer
        CheckBox calendulaOption = findViewById(R.id.calendula_checkbox);
        boolean isCalendulaChecked = calendulaOption.isChecked();
        //Check if answer is correct
        if (!isFennelChecked && isDaisyChecked && isCalendulaChecked) {
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
    private int calulateScoreForCarrot() {
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
        if (orangeAnswer.compareTo(getString(R.string.spike)) == 0) {
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
        if (orangeAnswer.compareTo(getString(R.string.citrus)) == 0) {
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
        if (crocusAnswer.compareTo(getString(R.string.saffron)) == 0) {
            score = score + 1;
        }
        return score;
    }

    /**
     * Create a message displayed as a toast after submission
     *
     * @param scoreOfTest submitted
     * @return the message
     */

    private String createMessage(int scoreOfTest) {
        String message;
        int numberOfCorrectAnwers = scoreOfTest;
        if (scoreOfTest == 0) {
            message = String.format(getString(R.string.score_0), scoreOfTest);
        } else if (score == 1) {
            message = String.format("%s%d", getString(R.string.score_1), score);
        } else if (scoreOfTest >= 2 && scoreOfTest <= 9) {
            message = String.format(getString(R.string.score_2_to_9), numberOfCorrectAnwers, scoreOfTest);
        } else {
            message = String.format(getString(R.string.score_10), scoreOfTest);
        }
        return message;
    }

}
