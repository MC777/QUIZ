package com.example.mck.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {

    int score;
    ProgressBar prg;
    int progressStatus;
    int checkerOne;
    int checkerTwo;
    int checkerThree;
    int checkerFour;
    int checkerFive;
    int checkerSix;
    int checkerSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prg = findViewById(R.id.progressBar);
        prg.setProgress(progressStatus);

        /**
         * Progress tracker 2
         */
        EditText aTwoOneEditText = findViewById(R.id.AnswerTwoOne);
        aTwoOneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if (checkerTwo < 1) {
                        checkerTwo = checkerTwo + 1;
                        progressStatus = progressStatus + 14;
                        prg.setProgress(progressStatus);
                    }
                }
            }
        });

        aTwoOneEditText = findViewById(R.id.AnswerTwoOne);
        final EditText finalATwoOneEditText = aTwoOneEditText;
        aTwoOneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    findViewById(R.id.AnswerTwoOne).clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(finalATwoOneEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });


        /**
         * Progress tracker 5
         */
        EditText aFiveOneEditText = findViewById(R.id.AnswerFiveOne);
        aFiveOneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if (checkerFive < 1) {
                        checkerFive = checkerFive + 1;
                        progressStatus = progressStatus + 14;
                        prg.setProgress(progressStatus);
                    }
                }
            }
        });

        aFiveOneEditText = findViewById(R.id.AnswerFiveOne);
        final EditText finalAFiveOneEditText = aFiveOneEditText;
        aFiveOneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    findViewById(R.id.AnswerFiveOne).clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(finalAFiveOneEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });

        /**
         * Progress tracker 6
         */

        EditText aSixOneEditText = findViewById(R.id.AnswerSixOne);
        aSixOneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if (checkerSix < 1) {
                        checkerSix = checkerSix + 1;
                        progressStatus = progressStatus + 14;
                        prg.setProgress(progressStatus);
                    }

                }
            }
        });

        aSixOneEditText = findViewById(R.id.AnswerSixOne);
        final EditText finalASixOneEditText = aFiveOneEditText;
        aSixOneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    findViewById(R.id.AnswerSixOne).clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(finalASixOneEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });

        /**
         * Progress tracker 7
         */
        EditText aSevenOneEditText = findViewById(R.id.AnswerSevenOne);
        aSevenOneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    if (checkerSeven < 1) {
                        checkerSeven = checkerSeven + 1;
                        progressStatus = progressStatus + 14;
                        prg.setProgress(progressStatus);
                    }
                }
            }
        });

        aSevenOneEditText = findViewById(R.id.AnswerSevenOne);
        final EditText finalASevenOneEditText = aFiveOneEditText;
        aSevenOneEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    findViewById(R.id.AnswerSevenOne).clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(finalASevenOneEditText.getWindowToken(), 0);
                    return true;
                }
                return false;
            }
        });

    }

    /**
     * Progress tracker 1
     */
    public void changeProgress1(View view) {
        RadioButton aOneOneRadio = findViewById(R.id.AnswerOneOne_RadioButton);
        RadioButton aOneTwoRadio = findViewById(R.id.AnswerOneOTwo_RadioButton);
        RadioButton aOneThreeRadio = findViewById(R.id.AnswerOneThree_RadioButton);
        RadioButton aOneFourRadio = findViewById(R.id.AnswerOneFour_RadioButton);
        RadioButton aOneFiveRadio = findViewById(R.id.AnswerOneFive_RadioButton);
        boolean answerOneOne = aOneOneRadio.isChecked();
        boolean answerOneTwo = aOneTwoRadio.isChecked();
        boolean answerOneThree = aOneThreeRadio.isChecked();
        boolean answerOneFour = aOneFourRadio.isChecked();
        boolean answerOneFive = aOneFiveRadio.isChecked();
        checkerOne = checkerOne + 1;

        boolean test = checkerOne < 2;
        if ((answerOneOne || answerOneTwo || answerOneThree || answerOneFour || answerOneFive) && test) {
            progressStatus = progressStatus + 14;
            prg.setProgress(progressStatus);
        }
    }

    /**
     * Progress tracker 3
     */
    public void changeProgress3(View view) {
        CheckBox aThreeOneChexBox = findViewById(R.id.t1);
        CheckBox aThreeTwoChexBox = findViewById(R.id.t2);
        CheckBox aThreeThreeChexBox = findViewById(R.id.t3);
        CheckBox aThreeFourChexBox = findViewById(R.id.t4);
        boolean answerThreeOne = aThreeOneChexBox.isChecked();
        boolean answerThreeTwo = aThreeTwoChexBox.isChecked();
        boolean answerThreeThree = aThreeThreeChexBox.isChecked();
        boolean answerThreeFour = aThreeFourChexBox.isChecked();
        checkerThree = checkerThree + 1;

        boolean test3 = checkerThree < 2;
        if ((answerThreeOne || answerThreeTwo || answerThreeThree || answerThreeFour) && test3) {
            progressStatus = progressStatus + 16;
            prg.setProgress(progressStatus);
        }
    }


    /**
     * Progress tracker 4
     */
    public void changeProgress4(View view) {
        RadioButton aFourOneRadio = findViewById(R.id.AnswerFourOne_RadioButton);
        RadioButton aFourTwoRadio = findViewById(R.id.AnswerFourTwo_RadioButton);
        boolean answerFourOne = aFourOneRadio.isChecked();
        boolean answerFourTwo = aFourTwoRadio.isChecked();
        checkerFour = checkerFour + 1;

        boolean test4 = checkerFour < 2;
        if ((answerFourOne || answerFourTwo) && test4) {
            progressStatus = progressStatus + 14;
            prg.setProgress(progressStatus);
        }
    }


    public void Submit(View view) {

        Button subButton = findViewById(R.id.button_submit);
        RadioButton aOneOneRadio = findViewById(R.id.AnswerOneOne_RadioButton);
        RadioButton aOneTwoRadio = findViewById(R.id.AnswerOneOTwo_RadioButton);
        RadioButton aOneThreeRadio = findViewById(R.id.AnswerOneThree_RadioButton);
        RadioButton aOneFourRadio = findViewById(R.id.AnswerOneFour_RadioButton);
        RadioButton aOneFiveRadio = findViewById(R.id.AnswerOneFive_RadioButton);
        CheckBox aThreeOneChexBox = findViewById(R.id.t1);
        CheckBox aThreeTwoChexBox = findViewById(R.id.t2);
        CheckBox aThreeThreeChexBox = findViewById(R.id.t3);
        CheckBox aThreeFourChexBox = findViewById(R.id.t4);
        RadioButton aFourOneRadio = findViewById(R.id.AnswerFourOne_RadioButton);
        RadioButton aFourTwoRadio = findViewById(R.id.AnswerFourTwo_RadioButton);
        EditText aTwoOneEditText = findViewById(R.id.AnswerTwoOne);
        EditText aFiveOneEditText = findViewById(R.id.AnswerFiveOne);
        EditText aSixOneEditText = findViewById(R.id.AnswerSixOne);
        EditText aSevenOneEditText = findViewById(R.id.AnswerSevenOne);

        /**
         * Answer 1 for RadioButtons
         */
        boolean answerOneFour = aOneFourRadio.isChecked();
        if (answerOneFour) {
            score += 1;
        }

        /**
         * Answer 2 for TextField
         */
        if (aTwoOneEditText.getText().toString().equals("29")) {
            score += 1;
        }

        /**
         * Answer 3 for Check Box
         */
        if (aThreeOneChexBox.isChecked() && aThreeTwoChexBox.isChecked() && aThreeFourChexBox.isChecked() && !aThreeThreeChexBox.isChecked()) {
            score += 1;
        } else {
            score += 0;
        }
        /**
         * Answer 4 for RadioButtons
         */
        boolean answerFourTwo = aFourTwoRadio.isChecked();

        if (answerFourTwo) {
            score += 1;
        }

        /**
         * Answer 5 for TextField
         */
        if (aFiveOneEditText.getText().toString().equals("27")) {
            score += 1;
        }

        /**
         * Answer 6 for TextField
         */
        if (aSixOneEditText.getText().toString().equals("96")) {
            score += 1;
        }

        /**
         * Answer 7 for TextField
         */
        if (aSevenOneEditText.getText().toString().equals("2")) {
            score += 1;
        }

        /**
         * Locking answers
         */
        aOneOneRadio.setEnabled(false);
        aOneTwoRadio.setEnabled(false);
        aOneThreeRadio.setEnabled(false);
        aOneFourRadio.setEnabled(false);
        aOneFiveRadio.setEnabled(false);
        aTwoOneEditText.setEnabled(false);
        aThreeOneChexBox.setEnabled(false);
        aThreeTwoChexBox.setEnabled(false);
        aThreeThreeChexBox.setEnabled(false);
        aThreeFourChexBox.setEnabled(false);
        aFourOneRadio.setEnabled(false);
        aFourTwoRadio.setEnabled(false);
        aFiveOneEditText.setEnabled(false);
        aSixOneEditText.setEnabled(false);
        aSevenOneEditText.setEnabled(false);

        subButton.setEnabled(false);

        double scorePerc = Math.round((double) score / 7 * 100);
        Toast.makeText(this, "Your score: " + scorePerc + " %" + "\nCorrect Answers: " + score + "\nWrong Answers: " + (7 - score), Toast.LENGTH_LONG).show();
    }

    public void Reset(View view) {
        score = 0;

        Button subButton = findViewById(R.id.button_submit);
        RadioButton aOneOneRadio = findViewById(R.id.AnswerOneOne_RadioButton);
        RadioButton aOneTwoRadio = findViewById(R.id.AnswerOneOTwo_RadioButton);
        RadioButton aOneThreeRadio = findViewById(R.id.AnswerOneThree_RadioButton);
        RadioButton aOneFourRadio = findViewById(R.id.AnswerOneFour_RadioButton);
        RadioButton aOneFiveRadio = findViewById(R.id.AnswerOneFive_RadioButton);
        CheckBox aThreeOneChexBox = findViewById(R.id.t1);
        CheckBox aThreeTwoChexBox = findViewById(R.id.t2);
        CheckBox aThreeThreeChexBox = findViewById(R.id.t3);
        CheckBox aThreeFourChexBox = findViewById(R.id.t4);
        RadioButton aFourOneRadio = findViewById(R.id.AnswerFourOne_RadioButton);
        RadioButton aFourTwoRadio = findViewById(R.id.AnswerFourTwo_RadioButton);
        EditText aTwoOneEditText = findViewById(R.id.AnswerTwoOne);
        EditText aFiveOneEditText = findViewById(R.id.AnswerFiveOne);
        EditText aSixOneEditText = findViewById(R.id.AnswerSixOne);
        EditText aSevenOneEditText = findViewById(R.id.AnswerSevenOne);
        /**
         * Unlocking answers
         */
        aOneOneRadio.setEnabled(true);
        aOneTwoRadio.setEnabled(true);
        aOneThreeRadio.setEnabled(true);
        aOneFourRadio.setEnabled(true);
        aOneFiveRadio.setEnabled(true);
        aTwoOneEditText.setEnabled(true);
        aThreeOneChexBox.setEnabled(true);
        aThreeTwoChexBox.setEnabled(true);
        aThreeThreeChexBox.setEnabled(true);
        aThreeFourChexBox.setEnabled(true);
        aFourOneRadio.setEnabled(true);
        aFourTwoRadio.setEnabled(true);
        aFiveOneEditText.setEnabled(true);
        aSixOneEditText.setEnabled(true);
        aSevenOneEditText.setEnabled(true);
        subButton.setEnabled(true);
        /**
         * Clearing answers
         */
        RadioGroup radioGroup2 = findViewById(R.id.radio_group2);
        radioGroup2.clearCheck();
        aTwoOneEditText.setText("");
        aThreeOneChexBox.setChecked(false);
        aThreeTwoChexBox.setChecked(false);
        aThreeThreeChexBox.setChecked(false);
        aThreeFourChexBox.setChecked(false);
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.clearCheck();
        aFiveOneEditText.setText("");
        aSixOneEditText.setText("");
        aSevenOneEditText.setText("");
        subButton.setEnabled(true);

        checkerOne = 0;
        checkerTwo = 0;
        checkerThree = 0;
        checkerFour = 0;
        checkerFive = 0;
        checkerSix = 0;
        checkerSeven = 0;
        progressStatus = 0;
        prg.setProgress(0);
        Toast.makeText(this, "Your answers have been cleaned. You could try again. ", Toast.LENGTH_SHORT).show();
    }
}