package com.example.alternatif.aplicacion002;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {

    private EditText editTextPhone,editTextMail;
    private ImageButton imageButtonCall,imageButtonContacts,imageButtonFastMail,imageButtonMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        editTextPhone=findViewById(R.id.editTextPhone);
        editTextMail=findViewById(R.id.editTextMail);
        imageButtonCall=findViewById(R.id.imageButtonCall);
        imageButtonContacts=findViewById(R.id.imageButtonContacts);
        imageButtonFastMail=findViewById(R.id.imageButtonFastMail);
        imageButtonMail=findViewById(R.id.imageButtonMail);

        imageButtonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editTextPhone.getText().toString();
                if (number!=null && !number.isEmpty()){
                    Intent intentPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                    startActivity(intentPhone);
                }
                else{
                    Toast.makeText(FourActivity.this,"Insert a number",Toast.LENGTH_LONG).show();
                }
            }
        });

        imageButtonContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentContacts = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
                startActivity(intentContacts);
            }
        });

        imageButtonFastMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email="alternatif-3@hotmail.com";
                Intent intentFastMail = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"+email));
                startActivity(intentFastMail);
            }
        });

        imageButtonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = editTextMail.getText().toString();
                if (mail!=null && !mail.isEmpty()){
                    Intent intentMail = new Intent(Intent.ACTION_VIEW, Uri.parse(mail));
                    intentMail.setType("plain/text");
                    intentMail.putExtra(Intent.EXTRA_SUBJECT, "This is a Tittle");
                    intentMail.putExtra(Intent.EXTRA_TEXT,"Tihs is a text in the mail");
                    intentMail.putExtra(Intent.EXTRA_EMAIL, new String[] {"example@mail.com","example2@mail.com"});
                    Toast.makeText(FourActivity.this,"Mail sent",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(FourActivity.this,"Insert a Mail",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
