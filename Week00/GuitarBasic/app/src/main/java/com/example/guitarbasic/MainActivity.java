package com.example.guitarbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendCheck(View view) {
        EditText et1 = findViewById(R.id.firstString);
        EditText et2 = findViewById(R.id.secondString);
        EditText et3 = findViewById(R.id.thirdString);
        EditText et4 = findViewById(R.id.forthString);
        EditText et5 = findViewById(R.id.fifthString);
        EditText et6 = findViewById(R.id.sixthString);

        String ck1 = et1.getText().toString();
        String ck2 = et2.getText().toString();
        String ck3 = et3.getText().toString();
        String ck4 = et4.getText().toString();
        String ck5 = et5.getText().toString();
        String ck6 = et6.getText().toString();

        TextView tv = findViewById(R.id.displayTv);
        TextView tv2 = findViewById(R.id.firstTv);
        TextView tv3 = findViewById(R.id.secondTv);
        TextView tv4 = findViewById(R.id.thirdTv);
        TextView tv5 = findViewById(R.id.forthTv);
        TextView tv6 = findViewById(R.id.fifthTv);
        TextView tv7 = findViewById(R.id.sixthTv);

        int counter = 0;
        if (ck1.equals("e") || (ck1.equals("E"))){
            counter++;
            tv2.setText("");
        }
        else{
            tv2.setText("Wrong Entry!");
        }
        if(ck2.equals("b") || (ck2.equals("B"))){
            counter++;
            tv3.setText("");
        }
        else{
            tv3.setText("Wrong Entry!");
        }
        if (ck3.equals("g") || (ck3.equals("G"))){
            counter++;
            tv4.setText("");
        }
        else{
            tv4.setText("Wrong Entry!");
        }
        if (ck4.equals("d") || (ck4.equals("D"))){
            counter++;
            tv5.setText("");
        }
        else{
            tv5.setText("Wrong Entry!");
        }
        if (ck5.equals("a") || (ck5.equals("A"))){
            counter++;
            tv6.setText("");
        }
        else{
            tv6.setText("Wrong Entry!");
        }
        if (ck6.equals("e") || (ck6.equals("E"))){
            counter++;
            tv7.setText("");
        }
        else{
            tv7.setText("Wrong Entry!");
        }

        if (counter == 6) {
            tv.setText("You Have Enough Knowledge!");
            counter = 0;
        }
        else{
            tv.setText("Practice More!");
            counter = 0;
        }

    }
}