package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String btx1, btx2, btx3, btx4, btx5, btx6, btx7, btx8, btx9;
    int flag = 0;
    int counTer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inIt();


    }

    private void inIt(){


        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);

    }

    public void startNewGame(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                b1.setText("");

                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                flag = 0;
                counTer = 0;


            }
        },
                5000);


    }

    public void cLick(View vew){
        Button currentButton = (Button) vew;

//        counTer = counTer + 1;or
//        counTer += 1;

        if(currentButton.getText().toString().equals("")){
            counTer++;
        if (flag == 0){

            currentButton.setText("X");
            flag = 1;
        }
        else {
            currentButton.setText("O");
            flag = 0;
        }

        if(counTer > 4) {
            btx1 = b1.getText().toString();
            btx2 = b2.getText().toString();
            btx3 = b3.getText().toString();
            btx4 = b4.getText().toString();
            btx5 = b5.getText().toString();
            btx6 = b6.getText().toString();
            btx7 = b7.getText().toString();
            btx8 = b8.getText().toString();
            btx9 = b9.getText().toString();

            if (btx1.equals(btx2) && btx2.equals(btx3) && !btx1.equals("")) {
                Toast.makeText(this, "winner is" + btx1, Toast.LENGTH_SHORT).show();

                startNewGame();


            } else if (btx4.equals(btx5) && btx5.equals(btx6) && !btx4.equals("")) {
                Toast.makeText(this, "winner is" + btx4, Toast.LENGTH_SHORT).show();
                startNewGame();


            } else if (btx7.equals(btx8) && btx8.equals(btx9) && !btx7.equals(" ")) {
                Toast.makeText(this, "winner is" + btx7, Toast.LENGTH_SHORT).show();
                startNewGame();
            } else if (btx1.equals(btx4) && btx4.equals(btx7) && !btx1.equals("")) {
                Toast.makeText(this, "winner is" + btx4
                        , Toast.LENGTH_SHORT).show();

                startNewGame();

            } else if (btx2.equals(btx5) && btx5.equals(btx8) && !btx2.equals("")) {
                Toast.makeText(this, "winner is" + btx2, Toast.LENGTH_SHORT).show();
                startNewGame();

            } else if (btx3.equals(btx6) && btx6.equals(btx9) && !btx3.equals("")) {
                Toast.makeText(this, "winner is" + btx3, Toast.LENGTH_SHORT).show();
                startNewGame();


            } else if (btx1.equals(btx5) && btx5.equals(btx9) && !btx1.equals("")) {
                Toast.makeText(this, "winner is" + btx1, Toast.LENGTH_SHORT).show();
                startNewGame();


            } else if (btx3.equals(btx5) && btx5.equals(btx7) && !btx3.equals("")) {
                Toast.makeText(this, "winner is" + btx3, Toast.LENGTH_SHORT).show();
                startNewGame();

            } else if (counTer == 9) {

                startNewGame();

            }


        }

        }





    }
}