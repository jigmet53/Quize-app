package com.example.quizeapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class quess extends AppCompatActivity {
    ProgressBar pb;
    int progress = 0;
    ProgressDialog progressDialog;
    ArrayList<String> list;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    Button s;
    String t,v;
    RadioGroup rg;
    int b=0;
    int c=0;
    int sc=1;
    TextView tv,tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quess);
        s= findViewById(R.id.s);
        tt= findViewById(R.id.tt);
        tv= findViewById(R.id.tv);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        rg=findViewById(R.id.rg);
        list = new ArrayList<String>();
        list.add("All the Questions");
        list.add("The World Largest desert is ?");
        list.add("Country that has the highest in Barley Production ?");
        list.add("The metal whose salts are sensitive to light is ?");
        list.add("The Central Rice Research Station is situated in ?");

    }


    public void click(View v)
    {

        final ProgressDialog progressDialog = new ProgressDialog(quess.this);
        progressDialog.setMessage("Loading...");
        progressDialog.setTitle("ProgressDialog");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.show();
        progressDialog.setCancelable(false);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                progressDialog.dismiss();
            }
        }).start();

        if(b==0)
        {


            if(((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                    .getText().toString().equals("Sindhi"))
            {
                c++;
            }
            sc++;
            tt.setText(sc+"/5");
            b++;
            tv.setText(list.get(b));
            r1.setText("Thar");
            r2.setText("Kalahari");
            r3.setText("Sahara");

        }
        else if(b==1)
        { if(((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                    .getText().toString().equals("Sahara"))
            {
              c++;
            }

            sc++;
            b++;
            tt.setText(sc+"/5");
            tv.setText(list.get(b));
            r1.setText("Russia");
            r2.setText("India");
            r3.setText("Brazil");
        }

        else if(b==2)
        {

            if(((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                    .getText().toString().equals("Russia"))
            {
              c++;
            }
            sc++;
            b++;
            tt.setText(sc+"/5");
            tv.setText(list.get(b));
            r1.setText("Silver");
            r2.setText("Zinc");
            r3.setText("Copper");
        }

        else if(b==3)
        {
            if(((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                    .getText().toString().equals("Silver"))
            {
               c++;
            }
            sc++;
            tt.setText(sc+"/5");
            b++;
            tv.setText(list.get(b));
            r1.setText("Chennai");
            r2.setText("Bangalore");
            r3.setText("Cuttack");
        }

        else if(b==4)
        {
            s.setVisibility(View.VISIBLE);

            if(((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                    .getText().toString().equals("Cuttack"))
            {
                c++;
            }
            b++;
        }

        else{
            Toast.makeText(this, "yes="+c
                    , Toast.LENGTH_SHORT).show();
        }
    }
    public void cl(View v)
    {Intent myIntent = new Intent(quess.this,result.class);

        myIntent.putExtra("Key", c);
        startActivity(myIntent);
    }
}