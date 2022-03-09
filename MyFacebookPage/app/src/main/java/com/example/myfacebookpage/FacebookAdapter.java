package com.example.myfacebookpage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;


public class FacebookAdapter extends ArrayAdapter {

    private List<Account> myCurrentAccount = new ArrayList<>();
    private Context activity;
    private View convertView;
    private Account currentAccount;
    private int position;
    private int layoutId;
    private final int zero = 0;
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;




    public FacebookAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.myCurrentAccount = objects;
        this.activity = context;
        this.layoutId = resource;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        this.convertView = convertView;
        this.position = position;
        //get the convertView with the inflater fuc' that are give me the views from the xml

        LayoutInflater inflater = LayoutInflater.from(this.activity);
        convertView = inflater.inflate(this.layoutId, parent, false);

        //get back the current account find by the position.
        currentAccount = this.myCurrentAccount.get(position);

        //find the view, and bring him from the user xml according the layout id.
        TextView nameTextView  = convertView.findViewById(R.id.nameTextView);
        TextView dateTextView  = convertView.findViewById(R.id.dateTextView);
        TextView postTextView  = convertView.findViewById(R.id.postTextView);
        TextView myTextComment = convertView.findViewById(R.id.myTextComment);
        ImageView profileView  = convertView.findViewById(R.id.profileView);
        ImageView mainView     = convertView.findViewById(R.id.mainView);
        Button likeButton      = convertView.findViewById(R.id.likeButton);
        Button commentButton   = convertView.findViewById(R.id.commentButton);
        Button myShareButton   = convertView.findViewById(R.id.myShareButton);

        //set the current image that we get from the constructor from drawable.
        if(currentAccount.profileView != null) profileView.setImageDrawable(currentAccount.profileView);
        if(currentAccount.mainView != null) mainView.setImageDrawable(currentAccount.mainView);


        /*One more, for the comment its a frame like its sound, it Get the frame layout.
        Why do I need her?
        --> So we can do things Like making the screen white (in the frame) So the image will be hidden and the text will appears
        {
        */FrameLayout frameLayoutForComments = convertView.findViewById(R.id.frameLayoutForComments);
        //set the Current commentString to the textView and set the frame to 'GONE State' until been press.
        myTextComment.setText(currentAccount.toString());
        frameLayoutForComments.setVisibility(View.GONE);
    //  } like its in the scope :) lol.

        //set the text view that we get before from the xml.
        postTextView.setText(currentAccount.getPostTextView());
        dateTextView.setText(currentAccount.getDateTextView());
        nameTextView.setText(currentAccount.getNameTextView());

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override //when call by the Click Listener fuc and change the color of the like button text color.
            public void onClick(View v) {
               Button likeButton = (Button) v;
                if (likeButton.getCurrentTextColor() == Color.BLUE) {
                    likeButton.setTextColor(Color.BLACK);
                } else
                    likeButton.setTextColor(Color.BLUE);
            }
        });

        // when click the comment button is sets the text view to visible.
        commentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentAccount.toString() != null)
                    frameLayoutForComments.setBackgroundColor(Color.WHITE);
                    frameLayoutForComments.setVisibility(View.VISIBLE);

            }
        });
        myShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button myShareButton = (Button) v;
                if (myShareButton.getCurrentTextColor() == Color.RED) {
                    myShareButton.setTextColor(Color.BLACK);
                } else
                    myShareButton.setTextColor(Color.RED);
            }
        });

        FacebookAdapter.this.notifyDataSetChanged();
        return convertView;
    }
}
