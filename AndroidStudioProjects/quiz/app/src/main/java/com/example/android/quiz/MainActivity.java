package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    private detailed_data obj = new detailed_data();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button ch1;
    private Button ch2;
    private Button ch3;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.questions);
        ch1 = (Button) findViewById(R.id.choice1);
        ch2 = (Button) findViewById(R.id.choice2);
        ch3 = (Button) findViewById(R.id.choice3);

        updateQuesion();

        //onClick listener method for button 1

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.getText()== mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuesion();

                    //display toast
                    Toast.makeText(MainActivity.this,"Correct answer",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong answer",Toast.LENGTH_SHORT).show();
                    updateQuesion();
                }
            }
        });

        //onClick listener method for button 2
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch2.getText()== mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuesion();

                    //display toast
                    Toast.makeText(MainActivity.this,"Correct answer",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong answer",Toast.LENGTH_SHORT).show();
                    updateQuesion();
                }
            }
        });

        //onClick listener method for button 3
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch3.getText()== mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuesion();

                    //display toast
                    Toast.makeText(MainActivity.this,"Correct answer",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong answer",Toast.LENGTH_SHORT).show();
                    updateQuesion();
                }
            }
        });
    }
    public void updateQuesion(){
        mQuestionView.setText(obj.getQuestion(mQuestionNumber));
        ch1.setText(obj.getchoice1(mQuestionNumber));
        ch2.setText(obj.getchoice2(mQuestionNumber));
        ch3.setText(obj.getchoice3(mQuestionNumber));

        mAnswer = obj.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    public void updateScore(int point) {
        mScoreView.setText(""+mScore);
    }

    public void quitProg(View view) {
        exit(0);
    }
}
