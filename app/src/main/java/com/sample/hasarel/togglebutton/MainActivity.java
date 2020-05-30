package com.sample.hasarel.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Ui Components
    private ToggleButton mTgToggle1,mTgToggle2;
    private Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTgToggle1 = findViewById(R.id.activity_tg_toggleButton1);
        mTgToggle2 = findViewById(R.id.activity_tg_toggleButton2);
        mBtnClick = findViewById(R.id.activity_btn_click_here);
        mBtnClick.setOnClickListener(this);
        mTgToggle1.setOnClickListener(this);
        mTgToggle2.setOnClickListener(this);
    }

    private void clickButton(){

        StringBuilder result = new StringBuilder();

        result.append("ToggleButton1 : ").append(mTgToggle1.getText());
        result.append("\nToggleButton2 : ").append(mTgToggle2.getText());

        //Displaying the message in toast
        Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
    }

    private void clickToggleButton1(){

        //Displaying the message in toast
        Toast.makeText(MainActivity.this,"Toggle Button One Click",Toast.LENGTH_LONG).show();
    }

    private void clickToggleButton2(){

        //Displaying the message in toast
        Toast.makeText(MainActivity.this,"Toggle Button Two Click",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_btn_click_here:
                clickButton();
                break;
            case R.id.activity_tg_toggleButton1:
                clickToggleButton1();
                break;
            case R.id.activity_tg_toggleButton2:
                clickToggleButton2();
                break;
            default:
                break;
        }
    }
}