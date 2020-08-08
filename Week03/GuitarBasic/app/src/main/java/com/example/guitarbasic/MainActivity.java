package com.example.guitarbasic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drawer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.a_chords:
                Toast.makeText(this, "A Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent1= new Intent(MainActivity.this, AscaleChords.class);
                startActivity(intent1);
                return true;
            case R.id.b_chords:
                Toast.makeText(this, "B Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent2= new Intent(MainActivity.this, BscaleChords.class);
                startActivity(intent2);
                return true;
            case R.id.c_chords:
                Toast.makeText(this, "C Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent3= new Intent(MainActivity.this, CscaleChords.class);
                startActivity(intent3);
                return true;

            case R.id.d_chords:
                Toast.makeText(this, "D Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity.this, DscaleChords.class);
                startActivity(intent4);
                return true;
            case R.id.e_chords:
                Toast.makeText(this, "E Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(MainActivity.this, EscaleChords.class);
                startActivity(intent5);
                return true;
            case R.id.f_chords:
                Toast.makeText(this, "F Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(MainActivity.this, FscaleChords.class);
                startActivity(intent6);
                return true;
            case R.id.g_chords:
                Toast.makeText(this, "G Chords Selected", Toast.LENGTH_SHORT).show();
                Intent intent7 = new Intent(MainActivity.this, GscaleChords.class);
                startActivity(intent7);
                return true;
            case R.id.home:
                Toast.makeText(this, "You Are in Home!!!", Toast.LENGTH_SHORT).show();
//                Intent intent8 = new Intent(MainActivity.this, MainActivity.class);
//                startActivity(intent8);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}