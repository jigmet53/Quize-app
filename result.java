package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class result extends AppCompatActivity {
    Button b, b1;
    int intValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        b = findViewById(R.id.b);
        b1 = findViewById(R.id.b1);
        customm();
    }
    public void customm() {
        Intent mIntent = getIntent();
    intValue = mIntent.getIntExtra("Key", 1);
    LayoutInflater inflater = getLayoutInflater();
    View layout = inflater.inflate(R.layout.activity_result,
            (ViewGroup) findViewById(R.id.toast_layout_root));
    TextView toastTextView = (TextView) layout.findViewById(R.id.toastTextView);
    ImageView toastImageView = (ImageView) layout.findViewById(R.id.toastImageView);
    toastTextView.setText("Result=" + intValue+"/5");
    toastImageView.setImageResource(R.drawable.jigg);
    Toast toast = new Toast(getApplicationContext());
    toast.setDuration(Toast.LENGTH_LONG);
    toast.setView(layout);

}
        public void rate(View v)
    {
        Intent i = new Intent(getApplicationContext(), ratingbarr.class);
        startActivity(i);
    }

    public void neww(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}