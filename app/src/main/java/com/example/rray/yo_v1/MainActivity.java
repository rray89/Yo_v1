package com.example.rray.yo_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find EditText and buttons declared in activity_main
        final EditText nameEdit = (EditText) findViewById(R.id.editName);
        final Button button1 = (Button) findViewById(R.id.btn_1);
        final Button button2 = (Button) findViewById(R.id.btn_2);
        final Button button3 = (Button) findViewById(R.id.btn_3);
        final Button button4 = (Button) findViewById(R.id.btn_4);


        //set onClickListener for four buttons
        //when click, show a toast that display text on button and text in EditText
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, button1.getText() + " " + nameEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, button2.getText() + " " + nameEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, button3.getText() + " " + nameEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, button4.getText() + " " + nameEdit.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
