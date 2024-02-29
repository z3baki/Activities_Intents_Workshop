package com.example.laboratory_activites_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String Extra_Message = "messageSend";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get message on Create Message Activity
        setContentView(R.layout.receive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(Extra_Message);
        TextView messageView =  findViewById(R.id.message);
        messageView.setText(messageText);

    }

}