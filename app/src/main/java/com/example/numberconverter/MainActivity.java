package com.example.numberconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout1;
    EditText ed_input1;
    RadioButton b2d, d2b;
    TextView T_view1, T_view2;
    Button but_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CONVERT(View v)
    {
        layout1 = (RelativeLayout) findViewById(R.id.layout1);
        ed_input1 = (EditText) findViewById(R.id.ed_input1);
        b2d = (RadioButton) findViewById(R.id.R_but1);
        d2b = (RadioButton) findViewById(R.id.R_but2);
        T_view1 = (TextView) findViewById(R.id.T_view1);
        T_view2 = (TextView) findViewById(R.id.T_view2);
        but_1 = (Button) findViewById(R.id.but_1);

        String input_string = String.valueOf(ed_input1.getText());
        int input_int = Integer.parseInt(input_string);

        if (b2d.isChecked()) {
            layout1.setBackgroundColor(Color.MAGENTA);
            T_view1.setText(deimaltoBinary(input_int));
            b2d.setChecked(true);
        }
        else {
            layout1.setBackgroundColor(Color.YELLOW);
            T_view1.setText(binarytoDecimal(input_string));
            d2b.setChecked(true);
        }
    }

    private String deimaltoBinary(int intput_int)
    {
        String binary = Integer.toBinaryString(intput_int);
        return binary;
    }

    private String binarytoDecimal(String intput_str)
    {
        int decimal = Integer.parseInt(intput_str, 2);
        return String.valueOf(decimal);
    }
}