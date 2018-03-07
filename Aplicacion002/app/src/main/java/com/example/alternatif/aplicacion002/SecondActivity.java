package com.example.alternatif.aplicacion002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textViewMain);

        //Tomar los datos del intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String Greeting = bundle.getString("Greete");
            Toast.makeText(SecondActivity.this,Greeting,Toast.LENGTH_LONG);
            textView.setText(Greeting);
        }
        else{
            Toast.makeText(SecondActivity.this,"It's Empty",Toast.LENGTH_LONG);
            textView.setText("Empty");
        }
    }
}
