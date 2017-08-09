package com.rdhomeseeker.dharam.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    EditText edit_text;
    Button btn_one;
    Button btn_two;
    Button btn_three;
    Button btn_four;
    Button btn_five;
    Button btn_six;
    Button btn_seven;
    Button btn_eight;
    Button btn_nine;
    Button btn_zero;
    Button btn_point;
    Button btn_equal;
    Button btn_plus;
    Button btn_minus;
    Button btn_mul;
    Button btn_divide;

    Integer c;
    String a="",b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.tv);
        edit_text = (EditText)findViewById(R.id.edit_text);
        btn_one =(Button)findViewById(R.id.btn_one);
        btn_two =(Button)findViewById(R.id.btn_two);
        btn_three =(Button)findViewById(R.id.btn_three);
        btn_four =(Button)findViewById(R.id.btn_four);
        btn_five =(Button)findViewById(R.id.btn_five);
        btn_six =(Button)findViewById(R.id.btn_six);
        btn_seven =(Button)findViewById(R.id.btn_seven);
        btn_eight =(Button)findViewById(R.id.btn_eight);
        btn_nine =(Button)findViewById(R.id.btn_nine);
        btn_zero =(Button)findViewById(R.id.btn_zero);
        btn_point =(Button)findViewById(R.id.btn_point);
        btn_equal =(Button)findViewById(R.id.btn_equal);
        btn_plus =(Button)findViewById(R.id.btn_plus);
        btn_minus =(Button)findViewById(R.id.btn_minus);
        btn_mul =(Button)findViewById(R.id.btn_mul);
        btn_divide =(Button)findViewById(R.id.btn_divide);

        btn_divide.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_zero.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_one.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one :
                a=tv.getText().toString();
                tv.setText(a+"1");
                break;
            case R.id.btn_two :
                a=tv.getText().toString();
                tv.setText(a+"2");
                break;
            case R.id.btn_three :
                a=tv.getText().toString();
                tv.setText(a+"3");
                break;
            case R.id.btn_four :
                a=tv.getText().toString();
                tv.setText(a+"4");
                break;
            case R.id.btn_five :
                a=tv.getText().toString();
                tv.setText(a+"5");
                break;
            case R.id.btn_six :
                a=tv.getText().toString();
                tv.setText(a+"6");
                break;
            case R.id.btn_seven :
                a=tv.getText().toString();
                tv.setText(a+"7");
                break;
            case R.id.btn_eight :
                a=tv.getText().toString();
                tv.setText(a+"8");
                break;
            case R.id.btn_nine :
                a=tv.getText().toString();
                tv.setText(a+"9");
                break;
            case R.id.btn_zero :
                a=tv.getText().toString();
                tv.setText(a+"0");
                break;
            case R.id.btn_plus :
                String s1;
                s1=a;
                //a=tv.getText().toString();
                tv.setText("+");
                tv.setText("");
                c= Integer.parseInt(s1)+Integer.parseInt(a);
                break;
            case R.id.btn_minus :
                String s2;
                s2=a;
                //a=tv.getText().toString();
                tv.setText("-");
                tv.setText("");
                c= Integer.parseInt(s2)-Integer.parseInt(a);
                break;

            case R.id.btn_mul :
                String s3;
                s3=a;
                //a=tv.getText().toString();
                tv.setText("*");
                tv.setText("");
                c= Integer.parseInt(s3)*Integer.parseInt(a);
                break;
            case R.id.btn_divide :
                String s4;
                s4=a;
                //a=tv.getText().toString();
                tv.setText("/");
                tv.setText("");
                c= Integer.parseInt(s4)/Integer.parseInt(a);
                break;
            case R.id.btn_equal :
                String s5;
                s5=a;
                //a=tv.getText().toString();
                tv.setText("/");
                tv.setText("");

                break;

        }
    }
}
