package com.example.nitishsingh.andriod72;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // declaration
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//here we are creating the main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //here we are creating the on click method
               
                //here we are using intent to go the another screen
                Intent intent=new Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI);
                //here we are satarting the activity
                startActivity(intent);


            }
        });
    }
}
