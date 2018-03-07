package com.example.alternatif.aplicacion002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1° forma, onclick desde xml, no es recomendable mezclar codigo de logica con codigo de interfaz

        //2° forma, desde codigo en java class
        //Uno a varios botones

        btn = findViewById(R.id.buttonMain);

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Button clicked from the code!",Toast.LENGTH_LONG).show();
            }
        });*/

        //3° forma
        btn.setOnClickListener(this);

    }

    //3° forma, implementar el boton
    //solo 1 boton


    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"Button clicked from the code!",Toast.LENGTH_LONG).show();
    }
}
