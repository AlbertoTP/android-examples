package com.example.alternatif.aplicacion002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button btn;
    private final String Greete = "Hello from Activity 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Button clicked from the code!",Toast.LENGTH_LONG).show();
                //Acceder al segundo activity y mandar un string
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Greete",Greete);
                startActivity(intent);
            }
        });

    }

}
