package com.example.myapplication;

import android.os.Handler;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myCardMemoryCheck {
    public static List<Integer> cards =new ArrayList<>();
    private static final int card1 = R.drawable.ic_image1;
    private static final int card2 = R.drawable.ic_image2;
    private static final int card3 = R.drawable.ic_image3;
    private static final int card4 = R.drawable.ic_image4;
    private static final int card5 = R.drawable.ic_image5;
    private static final int card6 = R.drawable.ic_image6;
    public static int firstCard=0, secondCard=0,countClicks=0,tries=5,correctMatch=0;
    private static ImageView previousCard,currentCard;
    private static int currentPosition,previousPosition;

    public static void shuffleList()
    { // shuffle the cards images
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        Collections.shuffle(cards);
    }
    public static void cardAnimates(final ImageView card, final int numOfCards)
    { //start the animation that switches sides after click on.
        card.animate()
                .withLayer()
                .rotationY(90)
                .setDuration(750)
                .withEndAction(new Runnable() {
            @Override
            public void run()
            {
                card.setImageResource(cards.get(numOfCards)); //changing the image
                card.setRotationY(-90);
                card.animate()
                        .withLayer()
                        .rotationY(0)
                        .setDuration(750)
                        .start();
            }
        });
    }

    public static boolean checkCards(ImageView card,int numberOfCard)
    { //if two card that was clicked are similar.
        boolean areSimilar = false;
        if(countClicks == 0)
        { //check if it the first one or the second was clicked.
            previousCard = card;
            previousPosition=card.getId();
            firstCard = cards.get(numberOfCard);
            countClicks++;
        }else{
            countClicks=0;
            currentCard=card;
            currentPosition=card.getId();
            secondCard = cards.get(numberOfCard);
            if(firstCard == secondCard && previousPosition!=currentPosition)
            {
                correctMatch++; 
                areSimilar = true;
            }
            else if(previousPosition!=currentPosition)
            { 
                tries--;
                areSimilar = false;
                cardAnimates(currentCard,numberOfCard);
                swapDelay();
            }
        }
        return areSimilar;
    }

    public static void switchTwoCards(final ImageView firstCard, final ImageView secondCard)
    {
        firstCard.animate().withLayer().rotationY(90).setDuration(750).withEndAction(new Runnable()
        {
            @Override
            public void run()
            {
                firstCard.setImageResource(R.drawable.ic_back);
                firstCard.setRotationY(-90);
                firstCard.animate().withLayer().rotationY(0).setDuration(750).start();
            }
        });
        secondCard
                .animate()
                .withLayer()
                .rotationY(90)
                .setDuration(750)
                .withEndAction(new Runnable()
        {
            @Override
            public void run()
            {
                secondCard.setImageResource(R.drawable.ic_back);
                secondCard.setRotationY(-90);
                secondCard
                        .animate()
                        .withLayer()
                        .rotationY(0)
                        .setDuration(750)
                        .start();
            }
        });
    }
    public static void swapDelay()
    { // method that delay the switch of the two cards for 2 seconds
        new Handler().postDelayed(new Runnable()
                {
            @Override
            public void run()
            {
                switchTwoCards(currentCard,previousCard);
            }
        }, 2000);

    }


}

