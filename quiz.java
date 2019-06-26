package com.example.nic.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
TextView t1;
RadioButton r1,r2,r3;
Button button;
RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        t1=(TextView)findViewById(R.id.t1);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        radiogroup=(RadioGroup)findViewById(R.id.radiogroup);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radiogroup.getCheckedRadioButtonId();
                if (r2.isChecked()) {
                    Toast.makeText(quiz.this, "true", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(quiz.this, "false", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
