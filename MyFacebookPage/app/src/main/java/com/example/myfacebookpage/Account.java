package com.example.myfacebookpage;

import android.graphics.drawable.Drawable;
import android.widget.Button;


public class Account extends MainActivity {

    //default constructor
    public Account(String nameTextView, String dateTextView, String postTextView,String myTextComment,
                   Drawable profileView, Drawable mainView, Button likeButton,Button commentButton,Button myShareButton)
    {
        this.nameTextView  = nameTextView;
        this.dateTextView  = dateTextView;
        this.postTextView  = postTextView;
        this.myTextComment = myTextComment;
        this.profileView   = profileView;
        this.mainView      = mainView;
        this.likeButton    = likeButton;
        this.commentButton = commentButton;
        this.myShareButton =  myShareButton;
    }
    // constructor that set the current account without the main image view.
    public Account(String nameTextView, String dateTextView, String postTextView,String myTextComment,
                   Drawable profileView, Button likeButton, Button commentButton,Button myShareButton)
    {
        this.nameTextView = nameTextView;
        this.dateTextView = dateTextView;
        this.postTextView = postTextView;
        this.myTextComment = myTextComment;
        this.profileView = profileView;
        this.mainView = null;
        this.likeButton = likeButton;
        this.commentButton = commentButton;
    }


//gets and sets fuc'

    public String getMyTextComment() {
        return this.myTextComment;
    }

    public void setMyTextComment(String myTextComment) {
        this.myTextComment = myTextComment;
    }
   public String getNameTextView() {
        return nameTextView;
    }

    public void setNameTextView(String nameTextView) {
        this.nameTextView = nameTextView;
    }

    public String getDateTextView() {
        return dateTextView;
    }

    public void setDateTextView(String dateTextView) {
        this.dateTextView = dateTextView;
    }

    public String getPostTextView() {
        return postTextView + ". \n";
    }

    public void setPostTextView(String postTextView) {
        this.postTextView = postTextView;
    }

    public Drawable getProfileView() {
        return profileView;
    }

    public void setProfileView(Drawable profileView) {
        this.profileView = profileView;
    }

    public Drawable getMainView() {
        return mainView;
    }

    public void setMainView(Drawable mainView) {
        this.mainView = mainView;
    }

    public Button getLikeButton() {
        return likeButton;
    }

    public void setLikeButton(Button likeButton) {
        this.likeButton = likeButton;
    }

    public Button getCommentButton() {
        return commentButton;
    }

    public void setCommentButton(Button commentButton) {
        this.commentButton = commentButton;
    }
//the method ToString return only the text comment "list".
    @Override
    public String toString() {
        return "\nthe comments are:\n     \n" +
                getMyTextComment() + ".";
    }
}