package com.example.simpleaddition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button b1;
    TextView tv1;
    int n1,n2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.num1);
        et2 = (EditText)findViewById(R.id.num2);
        b1 = (Button)findViewById(R.id.add);
        tv1 = (TextView)findViewById(R.id.res);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt((et2.getText().toString()));
                sum = n1+n2;
                tv1.setText(Integer.toString(sum));

            }
        });
    }
}
