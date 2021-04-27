package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quize_ques <s> extends AppCompatActivity {
    TextView tv = findViewById(R.id.tv);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_ques);
    }

}

        /*

int i=1;
    public void click(View v)
    {

        if(i==1)
        {
            String s="How many name are there for bottel";
            tv.setText(s);
            i++;

        }
        else if(i==2)
        {
            String s="How many name are there for boy";
            tv.setText(s);
            i++;

        }

        else if(i==3)
        {
            String s="How many name are there for girls";
            tv.setText(s);
            i++;

        }
        else if(i==4)
        {
            String s="How many name are there for dog";
            tv.setText(s);
            i++;

        }

    }
}*/