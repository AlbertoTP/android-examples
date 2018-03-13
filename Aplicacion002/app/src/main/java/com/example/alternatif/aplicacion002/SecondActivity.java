package com.example.alternatif.aplicacion002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonThirdAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textViewMain);
        buttonThirdAct = findViewById(R.id.buttonThirdAct);

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

        buttonThirdAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
