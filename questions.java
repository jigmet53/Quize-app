package com.example.quizeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class questions {
    public int getQid() {
        return qid;
    }

    public boolean isAnswer() {
        return answer;
    }

    public questions(int qid, boolean answer) {
        this.qid = qid;
        this.answer = answer;
    }

    private  int qid;
    private boolean answer;
}


/*
public class quize_ques extends AppCompatActivity {
    Button n;
    Button s ;
    TextView tv;
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    int cq=0;
    int c=0;
    /*questions[]questions= new questions[]
            {new questions(R.string.ques1,true),
                    new questions(R.string.ques2,true),
                    new questions(R.string.ques3,true),
                    new questions(R.string.ques4,true),
                    new questions(R.string.ques5,true),


            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_ques);
        n=findViewById(R.id.n);
        s=findViewById(R.id.s);
        tv=findViewById(R.id.tv);
    }
    public void click(View v)
    {
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        if (selectedRadioButtonId != -1) {
            selectedRadioButton = findViewById(selectedRadioButtonId);
            String t = selectedRadioButton.getText().toString();
            if(t.equals("r1") && cq==0)
            {
                c++;
            }
            else if(t.equals("r2") && cq==1)
            {
                c++;
            }

            else if(t.equals("r3") && cq==2)
            {
                c++;
            }
            else if(t.equals("r1") && cq==3)
            {
                c++;
            }
            else if(t.equals("r2") && cq==4)
            {
                c++;
            }
        } //else {
        //textView.setText("Nothing selected from the radio group");
        //  }



        //   cq=(cq+1) %questions.length;
        //checkans();
        updateq();

    }

    //  private void checkans() {

    //   }

    private void updateq() {
        // tv.setText(questions[cq].getQid());
    }

    Toast toast = Toast.makeText(getApplicationContext(),
            ""+c,
            Toast.LENGTH_SHORT);
}*/