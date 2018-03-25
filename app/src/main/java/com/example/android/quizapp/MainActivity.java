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

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String NO_BILBERRY_ANSWER = "noAnswer";
    private static final String OLEACEAE_OPTION_ANSWER = "oleaceaeAnswer";
    private static final String ASTERACEAE_OPTION_ANSWER = "asteraceaeAnswer";
    private static final String YES_LYTHRUM_ANSWER = "yesAnswer";
    private static final String FENNEL_ANSWER = "fennel";
    private static final String DAISY_ANSWER = "daisy";
    private static final String CALENDULA_ANSWER = "calendula";
    private static final String APPLE_ANSWER = "apple";
    private static final String CORNELIAN_CHERRY_ANSWER = "cornelianCherry";
    private static final String HAWTHORN_ANSWER = "hawthorn";
    private static final String CARAWAY_ANSWER = "caraway";
    private static final String CUMIN_ANSWER = "cumin";
    private static final String ESTRAGON_ANSWER = "estragon";
    private static final String PLANTAGO_MEDIA_SPIKE = "spikePlantago";
    private static final String CITRUS_ANSWER = "citrusAnswer";
    private static final String SAFFRON_CROCUS_ANSWER = "saffronCrocus";
    //Bind views with Butter Knife and cast views in layout
    //RadioButtons
    @BindView(R.id.no_radio_button)
    RadioButton noOption;
    @BindView(R.id.oleaceae_radio_button)
    RadioButton oleaceaeOption;
    @BindView(R.id.asteraceae_radio_button)
    RadioButton asteraceaeOption;
    @BindView(R.id.affirmative_radio_button)
    RadioButton yesOption;
    //CheckBoxes referring to Asteraceae question
    @BindView(R.id.fennel_checkbox)
    CheckBox fennelOption;
    @BindView(R.id.daisy_checkbox)
    CheckBox daisyOption;
    @BindView(R.id.calendula_checkbox)
    CheckBox calendulaOption;
    //CheckBoxes referring to Rosaceae question
    @BindView(R.id.apple_checkbox)
    CheckBox appleOption;
    @BindView(R.id.cornelian_cherry_checkbox)
    CheckBox cornelianCherryOption;
    @BindView(R.id.hawthorn_checkbox)
    CheckBox hawthornOption;
    //CheckBoxes referring to Wild Carrot question
    @BindView(R.id.caraway_checkbox)
    CheckBox carawayOption;
    @BindView(R.id.cumin_checkbox)
    CheckBox cuminOption;
    @BindView(R.id.estragon_checkbox)
    CheckBox estragonOption;
    //EditText
    @BindView(R.id.plantago_edit)
    EditText plantagoView;
    @BindView(R.id.orange_edit)
    EditText orangeView;
    @BindView(R.id.crocus_edit)
    EditText crocusView;

    private int score;

    // Create an anonymous implementation of OnClickListener
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
        ButterKnife.bind(this);

        //Capture submit button from layout
        final Button submitButton;
        submitButton = (Button) findViewById(R.id.submit_button);
        //Register the onClick listener with the implemented button
        submitButton.setOnClickListener(mListener);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        noOption.setChecked(savedInstanceState.getBoolean(NO_BILBERRY_ANSWER));
        oleaceaeOption.setChecked(savedInstanceState.getBoolean(OLEACEAE_OPTION_ANSWER));
        asteraceaeOption.setChecked(savedInstanceState.getBoolean(ASTERACEAE_OPTION_ANSWER));
        yesOption.setChecked(savedInstanceState.getBoolean(YES_LYTHRUM_ANSWER));
        fennelOption.setChecked(savedInstanceState.getBoolean(FENNEL_ANSWER));
        daisyOption.setChecked(savedInstanceState.getBoolean(DAISY_ANSWER));
        calendulaOption.setChecked(savedInstanceState.getBoolean(CALENDULA_ANSWER));
        appleOption.setChecked(savedInstanceState.getBoolean(APPLE_ANSWER));
        cornelianCherryOption.setChecked(savedInstanceState.getBoolean(CORNELIAN_CHERRY_ANSWER));
        hawthornOption.setChecked(savedInstanceState.getBoolean(HAWTHORN_ANSWER));
        carawayOption.setChecked(savedInstanceState.getBoolean(CARAWAY_ANSWER));
        cuminOption.setChecked(savedInstanceState.getBoolean(CUMIN_ANSWER));
        estragonOption.setChecked(savedInstanceState.getBoolean(ESTRAGON_ANSWER));
        //restores answers displayed in free form text
        String resPlantago = savedInstanceState.getString(PLANTAGO_MEDIA_SPIKE);
        plantagoView.setText(resPlantago);
        String resCitrus = savedInstanceState.getString(CITRUS_ANSWER);
        orangeView.setText(resCitrus);
        String resCrocus = savedInstanceState.getString(SAFFRON_CROCUS_ANSWER);
        crocusView.setText(resCrocus);
    }

    @Override
    public void onSaveInstanceState(Bundle outstate) {
        super.onSaveInstanceState(outstate);
        outstate.putBoolean(NO_BILBERRY_ANSWER, noOption.isChecked());
        outstate.putBoolean(OLEACEAE_OPTION_ANSWER, oleaceaeOption.isChecked());
        outstate.putBoolean(ASTERACEAE_OPTION_ANSWER, asteraceaeOption.isChecked());
        outstate.putBoolean(YES_LYTHRUM_ANSWER, yesOption.isChecked());
        outstate.putBoolean(FENNEL_ANSWER, fennelOption.isChecked());
        outstate.putBoolean(DAISY_ANSWER, daisyOption.isChecked());
        outstate.putBoolean(CALENDULA_ANSWER, calendulaOption.isChecked());
        outstate.putBoolean(APPLE_ANSWER, appleOption.isChecked());
        outstate.putBoolean(CORNELIAN_CHERRY_ANSWER, cornelianCherryOption.isChecked());
        outstate.putBoolean(HAWTHORN_ANSWER, hawthornOption.isChecked());
        outstate.putBoolean(CARAWAY_ANSWER, carawayOption.isChecked());
        outstate.putBoolean(CUMIN_ANSWER, cuminOption.isChecked());
        outstate.putBoolean(ESTRAGON_ANSWER, estragonOption.isChecked());
        outstate.putString(PLANTAGO_MEDIA_SPIKE, plantagoView.getText().toString());
        outstate.putString(CITRUS_ANSWER, orangeView.getText().toString());
        outstate.putString(SAFFRON_CROCUS_ANSWER, crocusView.getText().toString());
    }


    /**
     * This method calculate the score for the bilberry quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForBilberry() {
        // Figure out if the user has checked yes answer
        boolean isNoAnswerChecked = noOption.isChecked();
        if (isNoAnswerChecked) {
            score++;
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
        boolean isOleaceaeChecked = oleaceaeOption.isChecked();
        if (isOleaceaeChecked) {
            score++;
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
        boolean isAsteraceaeChecked = asteraceaeOption.isChecked();
        if (isAsteraceaeChecked) {
            score++;
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
        boolean isYesAnswerChecked = yesOption.isChecked();
        if (isYesAnswerChecked) {
            score++;
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
        boolean isFennelChecked = fennelOption.isChecked();
        // Figure out if the user has checked daisy answer
        boolean isDaisyChecked = daisyOption.isChecked();
        //Figure it out if the user has checked calendula answer
        boolean isCalendulaChecked = calendulaOption.isChecked();
        //Check if answer is correct
        if (!isFennelChecked && isDaisyChecked && isCalendulaChecked) {
            score++;
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
        boolean isAppleChecked = appleOption.isChecked();
        // Figure out if the user has checked cumin answer
        boolean isCornelianCherryChecked = cornelianCherryOption.isChecked();
        //Figure it out if the user has checked estragon answer
        boolean isHawthornChecked = hawthornOption.isChecked();
        //Check if answer is correct
        if (isAppleChecked && !isCornelianCherryChecked && isHawthornChecked) {
            score++;
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
        boolean isCarawayChecked = carawayOption.isChecked();
        // Figure out if the user has checked cumin answer
        boolean isCuminChecked = cuminOption.isChecked();
        //Figure it out if the user has checked estragon answer
        boolean isEstragonChecked = estragonOption.isChecked();
        //Check if answer is correct
        if (isCarawayChecked && isCuminChecked && !isEstragonChecked) {
            score++;
        }
        return score;
    }

    /**
     * This method calculate the score for the Plantago quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForPlantago() {
        // Set keyboard button Done
        plantagoView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        //Find the answer to free form text question
        String plantagoAnswer = plantagoView.getText().toString();
        //Check if answer is correct to increase score by 1
        if (plantagoAnswer.compareTo(getString(R.string.spike)) == 0) {
            score++;
        }
        return score;
    }

    /**
     * This method calculate the score for the Orange quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForOrange() {
        // Set keyboard button Done
        orangeView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        //Find the answer to free form text question
        String orangeAnswer = orangeView.getText().toString();
        //Check if answer is correct to increase score by 1
        if (orangeAnswer.compareTo(getString(R.string.citrus)) == 0) {
            score++;
        }
        return score;
    }

    /**
     * This method calculate the score for the Crocus quiz
     *
     * @return score of the quiz
     */
    private int calculateScoreForCrocus() {
        // Set keyboard button Done
        crocusView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        //Find the answer to free form text question
        String crocusAnswer = crocusView.getText().toString();
        //Check if answer is correct to increase score by 1
        if (crocusAnswer.compareTo(getString(R.string.saffron)) == 0) {
            score++;
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
        int numberOfCorrectAnswers = scoreOfTest;
        if (scoreOfTest == 0) {
            message = String.format(getString(R.string.score_0), scoreOfTest);
        } else if (score == 1) {
            message = String.format("%s%d", getString(R.string.score_1), score);
        } else if (scoreOfTest >= 2 && scoreOfTest <= 9) {
            message = String.format(getString(R.string.score_2_to_9), numberOfCorrectAnswers, scoreOfTest);
        } else {
            message = String.format(getString(R.string.score_10), scoreOfTest);
        }
        return message;
    }

}
