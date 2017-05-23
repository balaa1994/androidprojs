package com.example.dev.jokezone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView ntextview;
    private EditText nedittext;
    private Button nbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ntextview= (TextView) findViewById(R.id.textview1);
        nedittext= (EditText) findViewById(R.id.editText1);
        nbutton= (Button) findViewById(R.id.button);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] jokes = {
                        "Team work is important; it helps to put the blame on someone else.",
                       " Dear alcohol, We had a deal where you would make me funnier, smarter, and a better dancer... I saw the video... we need to talk.",
                        "You're not fat, you're just... easier to see.",
                        "I named my hard drive dat ass so once a month my computer asks if I want to 'back dat ass up'."

                };
                String joke = "";
                Random randomgenerator=new Random();
                int randomnumber=randomgenerator.nextInt(4);
                    joke=jokes[randomnumber];
                nedittext.setText(joke);
            }
        };

        nbutton.setOnClickListener(listener);
    }
}
