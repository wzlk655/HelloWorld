package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnl=findViewById(R.id.butn);
        final TextView txt=findViewById(R.id.txt);
        final RadioButton radioButton=findViewById(R.id.radioButton);
        final CheckBox checkBox=findViewById(R.id.checkBox);

        btnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(checkBox.isChecked())
                {
                    if(radioButton.isChecked())
                    {
                        txt.setText("What a wonderful world!");
                        Log.d("MainActivity","wonderful");
                    }
                    else
                    {
                        txt.setText("What a Terrible world!");
                        Log.d("MainActivity","terrible");
                    }
                }
                else
                {
                    txt.setText("conditions not fulfilled");
                    Log.d("MainActivity","unfulfilled conditions");
                }
            }
        });

        Log.d("MainActivity","hello anyway");
    }
}
