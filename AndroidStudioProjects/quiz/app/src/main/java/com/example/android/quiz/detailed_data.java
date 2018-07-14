package com.example.android.quiz;

public class detailed_data {
    private String mQuestions[] = {
            "What is the application class in android?",
            "How to fix crash using log cat in android?",
            "What is fragment in android?",
            "How many levels of securities are there in android?",
            "Which method returns the interrupted flag after that it sets the flag to false if it is true? ",
            "From the following statements which is a disadvantage of an java array? ",
            "How many reserved keywords are currently defined in the Java language? ",
            "Which method is used to change the name of a thread?",
            "Which constructor creates an empty string buffer with the specified capacity as length?"
    };
    private String[][] mChoice = {
            {"base class for all classes","java class","Anonymous class"},
            {"log cat contains the exception name along with the line number","gmail","google search"},
            {"layout","JSON","Peace of Activity"},
            {"android level security","App level security and kernel level security","java level security"},
            {" isInterrupted()"," static interrupted()","non static interrupted()"},
            {"An array can hold primitive types data","An array has its size that is known as array length","An array holds only one type of data"},
            {"49","48","47"},
            {"public String getName()","public void setName(String name)","public void getName()"},
            {"StringBuffer()","StringBuffer(String str)","StringBuffer(int capacity)"}
    };
    private String[] mCorrectAnswer = {"base class for all classes","log cat contains the exception name along with the line number","Peace of Activity","App level security and kernel level security","static interrupted()","An array holds only one type of data","49","public void setName(String name)","StringBuffer(int capacity)"};


    public String getQuestion(int a){

        String questions = mQuestions[a];
        return questions;
    }

    public String getchoice1(int a) {
        String choice0 = mChoice[a][0];
        return choice0;
    }
    public String getchoice2(int a) {
        String choice1 = mChoice[a][1];
        return choice1;
    }
    public String getchoice3(int a) {
        String choice2 = mChoice[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
