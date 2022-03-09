package com.example.myfacebookpage;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    protected String nameTextView;
    protected String dateTextView;
    protected String postTextView;
    protected String myTextComment;
    protected Drawable profileView;
    protected Drawable mainView;
    protected Button likeButton;
    protected Button commentButton;
    protected Button myShareButton;

    private ListView myPageMainListView;
    private List<Account> myAccounts = new ArrayList<>();
    private FacebookAdapter facebookAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.myfacebookpage.R.layout.activity_main);
        //find the list view.
        myPageMainListView = findViewById(R.id.myPageMainView);

        //get all the images from the drawable and send them to the constructor in Account.
    Drawable imageBeniProfile      = getDrawable(R.drawable.ic_image1); //Beni.
    Drawable imageBeniMainView     = getDrawable(R.drawable.ic_image4);
    Drawable imageGaliProfile      = getDrawable(R.drawable.ic_image2); //Gali.
    Drawable imageGaliMainView     = getDrawable(R.drawable.ic_image5);
    Drawable imageSoniaProfile     = getDrawable(R.drawable.ic_image3); //Sonia.
    Drawable imageSoniaMainView    = getDrawable(R.drawable.ic_image6);
    Drawable imageBenjaminProfile  = getDrawable(R.drawable.ic_image8); //Benjamin.
    Drawable imageBenjaminMainView = getDrawable(R.drawable.ic_image9);
    Drawable imageFunProfile       = getDrawable(R.drawable.ic_image7); //Fun.



        // Add the account info one by one to the list instance of Account.
        //num1
        myAccounts.add(new Account("Beni Saadon", "22/06/2020",
                "Computer Science student, and happily married \nIn addition, is Works as IT manager",
                "Very nice job, at least score '90' (: \n ---------- \n" +
                        "Beni you are the best \n ---------- \nnice",
                imageBeniProfile, imageBeniMainView, likeButton, commentButton,myShareButton));
        //num2
        myAccounts.add(new Account("Gali Saadon", "23/06/2020",
                "Law student and happily married to Beni Saadon",
                "A really beautiful and smart girl who knows how to sing and cook \n ---------- \n" +
                        "Amazing woman \n ---------- \nwow",
                imageGaliProfile, imageGaliMainView, likeButton, commentButton,myShareButton));
        //num3
        myAccounts.add(new Account("Sonia Saadon", "17/06/2020",
                "Mother and grandmother that are very loved", "" +
                "My best mother \n ---------- \nwow \n ---------- \nAmazing mom",
                imageSoniaProfile, imageSoniaMainView, likeButton, commentButton,myShareButton));
        //num4
        myAccounts.add(new Account("Fun LOL", "10/06/2020",
                "Why did the chicken commit suicide? To get to the other side. xd lol\n",
                "lol hhhhhh \n ---------- \nhhhhhhhhhhhhhhhh \n ---------- \nits so funy man",
                imageFunProfile, likeButton, commentButton,myShareButton));
        //num5
        myAccounts.add(new Account("Benjamin Netanyahu", "Yesterday",
                "Netanyahu meets with President Donald Trump in Jerusalem, May 2017","very nice man" +
                " \n ---------- \nThe best prime minister that exists",
                imageBenjaminProfile, imageBenjaminMainView, likeButton, commentButton,myShareButton));

        //create a new Adapter and I named him "facebookAdapter" it's connect the layout with the list and the this activity.
        facebookAdapter = (FacebookAdapter) new FacebookAdapter(this, R.layout.user, myAccounts);

        //set the Adapter to the list view that connect all together.
        myPageMainListView.setAdapter(facebookAdapter);
        myPageMainListView.deferNotifyDataSetChanged();



    }
}

