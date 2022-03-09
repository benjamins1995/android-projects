package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity 
{
    //it's Beni Saadon App
    TextView pointsToCard,pointsText,triesLeft;
    private final int image1=R.id.imageView1;
    private final int image2=R.id.imageView2;
    private final int image3=R.id.imageView3;
    private final int image4=R.id.imageView4;
    private final int image5=R.id.imageView5;
    private final int image6=R.id.imageView6;
    private final int image7=R.id.imageView7;
    private final int image8=R.id.imageView8;
    private final int image9=R.id.imageView9;
    private final int image10=R.id.imageView10;
    private final int image11=R.id.imageView11;
    private final int image12=R.id.imageView12;
    private  Handler cardHandler;
    myCardMemoryCheck manager= new myCardMemoryCheck();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager.shuffleList(); //shuffle the cards
        pointsToCard =findViewById(R.id.scoreNum);
        pointsText=findViewById(R.id.scoreText);
        triesLeft=findViewById(R.id.triesNum);
        cardHandler=new Handler();
    }

    public void cardClickSwitch(View view)
    {
        final ImageView image=(ImageView) view;
        int photo=image.getId();
        if(manager.tries>0) { // it will work only if the tries are greater than zero.
            switch (photo)
            {
                case image1:
                    manager.cardAnimates(image, 0);
                    if (manager.checkCards(image, 0)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image2:
                    manager.cardAnimates(image, 1);
                    if (manager.checkCards(image, 1)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image3:
                    manager.cardAnimates(image, 2);
                    if (manager.checkCards(image, 2)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image4:
                    manager.cardAnimates(image, 3);
                    if (manager.checkCards(image, 3)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image5:
                    manager.cardAnimates(image, 4);
                    if (manager.checkCards(image, 4)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image6:
                    manager.cardAnimates(image, 5);
                    if (manager.checkCards(image, 5)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image7:
                    manager.cardAnimates(image, 6);
                    if (manager.checkCards(image, 6)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image8:
                    manager.cardAnimates(image, 7);
                    if (manager.checkCards(image, 7)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image9:
                    manager.cardAnimates(image, 8);
                    if (manager.checkCards(image, 8)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image10:
                    manager.cardAnimates(image, 9);
                    if (manager.checkCards(image, 9)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image11:
                    manager.cardAnimates(image, 10);
                    if (manager.checkCards(image, 10)) {
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
                case image12:
                    manager.cardAnimates(image, 11);
                    if (manager.checkCards(image, 11)){
                        pointsToCard.setText(String.valueOf(manager.correctMatch));
                    } else {
                        triesLeft.setText(String.valueOf(manager.tries));
                    }
                    break;
            }
        }
        else{ triesLeft.setText("Game Over"); // if the tries are 0  print "Game Over".
          ViewPropertyAnimator viewPropertyAnimator = triesLeft.animate().scaleY(5).scaleY(5);


        }
    }

}