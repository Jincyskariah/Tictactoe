package com.example.tictactoe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout txtviewlayout;
    private TextView txtplyer1;
    private TextView txtplyer2;
    private Button reset;
    private Guideline guideline;
    private Guideline guideline2;
    private Guideline guideline3;
    private Guideline guideline4;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn6;
    private Button btn9;
    private Button btn8;
    private Button btn7;
    private Button btn5;
    int count=1;
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    int count8=0;
    int count9=0;
    int countpt1=0;
    int countpt2=0;
    AlertDialog.Builder builder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //count1 is to set the click
               if (count1 == 0) {
                   //count is to setText
                   if (count % 2 == 0) {
                       btn1.setText("O");


                   } else {
                       btn1.setText("X");
                   }

                   count++;
               }
               else{

               }
               count1++;
               winner();
           }


       });

         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (count2 == 0) {

                     if (count % 2 == 0) {
                         btn2.setText("O");


                     } else {
                         btn2.setText("X");
                     }
                     count++;
                 }
                 else {

                 }
                 count2++;
                 winner();
             }

         });
         btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (count3 == 0) {

                     if (count % 2 == 0) {
                         btn3.setText("O");

                     } else {
                         btn3.setText("X");
                     }
                     count++;
                 }
                 else {

                 }
                 count3++;
                 winner();
             }
         });

         btn4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(count4==0){

                 if(count%2==0){
                     btn4.setText("O");


                 }
                 else {
                     btn4.setText("X");

                 }
                 count++;
                 }
                 else {

                 }
                 count4++;
                 winner();
             }

         });
         btn5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(count5==0){

                 if(count%2==0){
                     btn5.setText("O");


                 }
                 else {
                     btn5.setText("X");
                 }
                 count++;
             }
                 count5++;
                 winner();
             }

         });
         btn6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (count6 == 0) {
                     if (count % 2 == 0) {
                         btn6.setText("O");
                     } else {
                         btn6.setText("X");
                     }
                     count++;
                 }
                 count6++;
                 winner();

             }
         });
         btn7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(count7==0){
                 if(count%2==0){
                     btn7.setText("O");

                 }
                 else {
                     btn7.setText("X");
                 }
                 count++;
             }
                 count7++;
                 winner();
             }

         });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count8==0){
                if(count%2==0){
                    btn8.setText("O");

                }
                else {
                    btn8.setText("X");
                }
                count++;
            }
                count8++;
                winner();
            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count9 == 0) {
                    if (count % 2 == 0) {
                        btn9.setText("O");

                    } else {








                        btn9.setText("X");
                    }
                    count++;
                }
                count9++;
                winner();
            }
        });
        //to reset all buttons
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=1;
                count1=0;
                count2=0;
                count3=0;
                count4=0;
                count5=0;
                count6=0;
                count7=0;
                count8=0;
                count9=0;
                countpt1=0;
                countpt2=0;
                txtplyer1.setText("");
                txtplyer2.setText("");



            }
        });


    }
    private void winner(){
        //get and store the values to string
        String butn1=btn1.getText().toString();
        String butn2=btn2.getText().toString();
        String butn3=btn3.getText().toString();
        String butn4=btn4.getText().toString();
        String butn5=btn5.getText().toString();
        String butn6=btn6.getText().toString();
        String butn7=btn7.getText().toString();
        String butn8=btn8.getText().toString();
        String butn9=btn9.getText().toString();


        if(butn1.equals("X")&& butn2.equals("X")&& butn3.equals("X")){
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn4.equals("X")&& butn5.equals("X")&& butn6.equals("X")){
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn7.equals("X")&& butn8.equals("X")&& butn9.equals("X")){
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn1.equals("X")&& butn5.equals("X")&& butn9.equals("X")){
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn3.equals("X")&& butn5.equals("X")&& butn8.equals("X")) {
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn1.equals("X")&& butn4.equals("X")&& butn7.equals("X")) {
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn2.equals("X")&& butn5.equals("X")&& butn8.equals("X")) {
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        else if(butn3.equals("X")&& butn6.equals("X")&& butn9.equals("X")) {
            Toast.makeText(this, "X wins", Toast.LENGTH_SHORT).show();
            showalert("X");
            countpt1++;

        }
        //....................................................................

        if(butn1.equals("O")&& butn2.equals("O")&& butn3.equals("O")){
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;
        }
        else if(butn4.equals("O")&& butn5.equals("O")&& butn6.equals("O")){
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn7.equals("O")&& butn8.equals("O")&& butn9.equals("O")){
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn1.equals("O")&& butn5.equals("O")&& butn9.equals("O")){
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn3.equals("O")&& butn5.equals("O")&& butn8.equals("O")) {
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn1.equals("O")&& butn4.equals("O")&& butn7.equals("O")) {
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn2.equals("O")&& butn5.equals("O")&& butn8.equals("O")) {
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }
        else if(butn3.equals("O")&& butn6.equals("O")&& butn9.equals("O")) {
            Toast.makeText(this, "O wins", Toast.LENGTH_SHORT).show();
            showalert("O");
            countpt2++;

        }

        }
        private void showalert(String player){
            //Uncomment the below code to Set the message and title from the strings.xml file
            builder.setMessage(player+"  wins") .setTitle("tictactoe");


            //Setting message manually and performing action on button click
            builder.setMessage(player+"  wins.Play Again?")
                    .setCancelable(false)
                    .setPositiveButton("play", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            if(countpt1>0) {

                                txtplyer1.setText("player1:" +countpt1);
                            }
                            else {
                                txtplyer2.setText("player2:" +countpt2);
                            }
                            btn1.setText("");
                            btn2.setText("");
                            btn3.setText("");
                            btn4.setText("");
                            btn5.setText("");
                            btn6.setText("");
                            btn7.setText("");
                            btn8.setText("");
                            btn9.setText("");
                             count1=0;
                             count2=0;
                             count3=0;
                             count4=0;
                             count5=0;
                             count6=0;
                             count7=0;
                             count8=0;
                             count9=0;
                             count=1;
                            dialog.dismiss();



                            Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("quit", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            //  Action for 'NO' Button
                            dialog.cancel();
                            finish();
                            Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("Tic TacToe");
            alert.show();
        }

    private void initView() {
        txtviewlayout = (RelativeLayout) findViewById(R.id.txtviewlayout);
        txtplyer1 = (TextView) findViewById(R.id.txtplyer1);
        txtplyer2 = (TextView) findViewById(R.id.txtplyer2);
        reset = (Button) findViewById(R.id.reset);
        guideline = (Guideline) findViewById(R.id.guideline);
        guideline2 = (Guideline) findViewById(R.id.guideline2);
        guideline3 = (Guideline) findViewById(R.id.guideline3);
        guideline4 = (Guideline) findViewById(R.id.guideline4);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn6 = (Button) findViewById(R.id.btn6);
        btn9 = (Button) findViewById(R.id.btn9);
        btn8 = (Button) findViewById(R.id.btn8);
        btn7 = (Button) findViewById(R.id.btn7);
        btn5 = (Button) findViewById(R.id.btn5);
        builder=new AlertDialog.Builder(MainActivity.this);


    }
}
