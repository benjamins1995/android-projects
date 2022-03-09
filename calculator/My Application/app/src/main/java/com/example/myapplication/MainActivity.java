package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public  class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final int intZero = 0;
    public static final String one = "1";
    public static final String two = "2";
    public static final String three = "3";
    public static final String four = "4";
    public static final String five = "5";
    public static final String six = "6";
    public static final String seven = "7";
    public static final String eigth = "8";
    public static final String nine = "9";
    public static final String zero = "0";
    public static final String minus = "-";
    public static final String plus = "+";
    public static final String equal = "=";
    public static final String clr = "";



    public void mat(View view) {
        TextView myTextView = findViewById(R.id.myTextView);

        Button Button0 = findViewById(R.id.myButton0);
        Button Button1 = findViewById(R.id.myButton1);
        Button Button2 = findViewById(R.id.myButton2);
        Button Button3 = findViewById(R.id.myButton3);
        Button Button4 = findViewById(R.id.myButton4);
        Button Button5 = findViewById(R.id.myButton5);
        Button Button6 = findViewById(R.id.myButton6);
        Button Button7 = findViewById(R.id.myButton7);
        Button Button8 = findViewById(R.id.myButton8);
        Button Button9 = findViewById(R.id.myButton9);

        Button myButtonClr = findViewById(R.id.myButtonClr);
        Button myButtonPlus = findViewById(R.id.myButtonPlus);
        Button myButtonMinus = findViewById(R.id.myButtonMinus);
        Button myButtonEqual = findViewById(R.id.myButtonEqual);

        Button0.setOnClickListener(this);
        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);
        Button3.setOnClickListener(this);
        Button4.setOnClickListener(this);
        Button5.setOnClickListener(this);
        Button6.setOnClickListener(this);
        Button7.setOnClickListener(this);
        Button8.setOnClickListener(this);
        Button9.setOnClickListener(this);

        myButtonClr.setOnClickListener(this);
        myButtonPlus.setOnClickListener(this);
        myButtonMinus.setOnClickListener(this);
        myButtonEqual.setOnClickListener(this);

    }
    public void clrAll()
    {
        TextView myTextView = findViewById(R.id.myTextView);
        arrLayout = clr;
        arrClear = clr;
        flag = intZero;
        afterOp = -2 ;
        beforeOp = -1 ;
        afterTheSecondOperator = -2 ;
        outToMyViewOne = intZero ;
        outToMyViewTwo = intZero ;
        minusFlag = intZero;
        plusFlag = intZero;
        myTextView.setText(arrLayout);

    }
    static String str = clr;
    static String arrClear = clr;
    static String arrLayout = clr;
    static int flag = intZero;
    static int afterOp = -2 ;
    static int beforeOp = -1 ;
    static int afterTheSecondOperator = -3;
    static int outToMyViewOne = intZero ;
    static int outToMyViewTwo = intZero ;
    public static  int minusFlag = intZero;
    public static  int plusFlag = intZero;
    public static  int mFlag = intZero;
    public static  int pFlag = intZero;




    @Override
    public void onClick(@org.jetbrains.annotations.NotNull View v) {
        TextView myTextView = findViewById(R.id.myTextView);


        switch (v.getId()) {
            case R.id.myButtonClr:
                clrAll();
                break;

            case R.id.myButton0:
                if (flag == intZero) {
                    arrClear = arrClear.concat(zero);
                    arrLayout = arrLayout.concat(zero);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton1:
                if (flag == intZero) {
                    arrClear = arrClear.concat(one);
                    arrLayout = arrLayout.concat(one);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton2:
                if (flag == intZero) {
                    arrClear = arrClear.concat(two);
                    arrLayout = arrLayout.concat(two);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton3:
                if (flag == intZero) {
                    arrClear = arrClear.concat(three);
                    arrLayout = arrLayout.concat(three);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton4:
                if (flag == intZero) {
                    arrClear = arrClear.concat(four);
                    arrLayout = arrLayout.concat(four);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton5:
                if (flag == intZero) {
                    arrClear = arrClear.concat(five);
                    arrLayout = arrLayout.concat(five);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton6:
                if (flag == intZero) {
                    arrClear = arrClear.concat(six);
                    arrLayout = arrLayout.concat(six);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton7:
                if (flag == intZero) {
                    arrClear = arrClear.concat(seven);
                    arrLayout = arrLayout.concat(seven);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton8:
                if (flag == intZero) {
                    arrClear = arrClear.concat(eigth);
                    arrLayout = arrLayout.concat(eigth);
                    myTextView.setText(arrLayout);
                } else flag = intZero;
                break;

            case R.id.myButton9:
                if (flag == intZero) {
                    arrLayout = arrLayout.concat(nine);
                    myTextView.setText(arrLayout);
                    arrClear = arrClear.concat(nine);
                } else flag = intZero;
                break;

            case R.id.myButtonPlus:
                if ((flag == intZero) || (plusFlag == 1)) {
                    if ((beforeOp == -1) && (afterOp == -2)) {
                        beforeOp = Integer.parseInt(arrClear);
                        arrLayout = arrClear;
                        //Clears the array to get the value of after operator.
                        arrClear = clr;
                        //a flag that count the numbers of time that we get in.
                        plusFlag = 1;
                        minusFlag = 1;
                        pFlag = 1;
                        // arr layout is only for printing the res.
                        arrLayout = arrLayout.concat(plus);
                        myTextView.setText(arrLayout);
                        Toast.makeText(MainActivity.this, "To perform two calculation operations please do not click the = sign", Toast.LENGTH_LONG).show();
                        flag = 1;
                        break;
                    } else {
                        afterOp = Integer.parseInt(arrClear);
                        arrClear = clr;
                        if ((afterOp != -2) && (plusFlag == 1)) {
                            arrLayout = arrLayout.concat(plus);
                            myTextView.setText(arrLayout);
                            Toast.makeText(MainActivity.this, "Up to 3 times", Toast.LENGTH_LONG).show();
                            plusFlag = 2;
                            flag = 1;
                        }
                    }
                } else clrAll();

                break;


            case R.id.myButtonMinus:
                if ((flag == intZero) || (minusFlag == 1)) {
                    if ((beforeOp == -1) && (afterOp == -2)) {
                        beforeOp = Integer.parseInt(arrClear);
                        arrLayout = arrClear;
                        //Clears the array to get the value of after operator.
                        arrClear = clr;
                        //a flag that count the numbers of time that we get in.
                        minusFlag = 1;
                        plusFlag = 1;
                        mFlag = 1;
                        // arr layout is only for printing the res.
                        arrLayout = arrLayout.concat(minus);
                        myTextView.setText(arrLayout);
                        Toast.makeText(MainActivity.this, "To perform two calculation operations please do not click the = sign", Toast.LENGTH_LONG).show();
                        flag = 1;


                    } else {
                        afterOp = Integer.parseInt(arrClear);
                        arrClear = clr;
                        if ((afterOp != -2) && (minusFlag == 1)) {
                            arrLayout = arrLayout.concat(minus);
                            myTextView.setText(arrLayout);
                            Toast.makeText(MainActivity.this, "Up to 3 times", Toast.LENGTH_LONG).show();
                            minusFlag = 2;
                            flag = 1;
                        }
                    }
                } else clrAll();
                break;


            case R.id.myButtonEqual:
                // the flag check if we inter operator after operator.
                if (flag == intZero) {
                    //for the view: arrLayout is only for printing not do mat.
                    arrLayout = arrLayout.concat(equal);
                    myTextView.setText(arrLayout);

                    //check if the val is enter.
                    if (afterOp == -2) {
                        afterOp = Integer.parseInt(arrClear);
                        arrClear = clr;
                    }

                    if ((beforeOp != -1) && (afterOp != -2))
                    //mean that we can get in.
                    {
                        flag = 1;
                        if ((plusFlag == 1) && (minusFlag == 1)) {
                            if (pFlag == 1) {
                                //the add fuc.
                                outToMyViewOne = beforeOp + afterOp;
                                str = String.valueOf(outToMyViewOne);
                                //Adds the results to the fake arr.
                                arrLayout = arrLayout.concat(str);
                                myTextView.setText(arrLayout);
                                Toast.makeText(MainActivity.this," It's Beni Saadon Application", Toast.LENGTH_LONG).show();

                            } else if (mFlag == 1) {
                                //the minus fuc.
                                outToMyViewOne = beforeOp - afterOp;
                                str = String.valueOf(outToMyViewOne);
                                //Adds the results to the fake arr.
                                arrLayout = arrLayout.concat(str);
                                myTextView.setText(arrLayout);
                                Toast.makeText(MainActivity.this," It's Beni Saadon Application", Toast.LENGTH_LONG).show();
                            }
                        } else if ((pFlag == 1) && (plusFlag == 2)) {
                            flag = 1;
                            afterTheSecondOperator = Integer.parseInt(arrClear);
                            arrClear = clr;
                            outToMyViewTwo = beforeOp + afterOp + afterTheSecondOperator;
                            str = String.valueOf(outToMyViewTwo);
                            arrLayout = arrLayout.concat(str);
                            myTextView.setText(arrLayout);
                            Toast.makeText(MainActivity.this," It's Beni Saadon Application", Toast.LENGTH_LONG).show();
                            break;

                        } else if ((minusFlag == 2) && (mFlag == 1)) {
                            flag = 1;
                            afterTheSecondOperator = Integer.parseInt(arrClear);
                            arrClear = clr;
                            outToMyViewTwo = ((beforeOp - afterOp) - afterTheSecondOperator);
                            str = String.valueOf(outToMyViewTwo);
                            arrLayout = arrLayout.concat(str);
                            myTextView.setText(arrLayout);
                            Toast.makeText(MainActivity.this," It's Beni Saadon Application", Toast.LENGTH_LONG).show();
                            break;

                        } else clrAll();
                    }
                    break;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }}




