package com.cardsq.cardsq.database;

import com.cardsq.cardsq.R;
import com.cardsq.cardsq.entity.Card;
import com.cardsq.cardsq.entity.Deck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhu on 1/10/15.
 */
public class Factory {


    public static List<Card> getCardList(){
        List<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Hit it off", "I don't know why they can't just hit it off."));
        cards.add(new Card("Root for someone or something", "To express your support for the success of someone or something."));
        cards.add(new Card("人生潮起潮落，残酷而美丽", "Life has its ups and downs. It can be both brutal and beautiful."));
        cards.add(new Card("Life has its ups and downs. It can be both brutal and beautiful.", "人生潮起潮落，残酷而美丽"));
        cards.add(new Card("人生潮起潮落，残酷而美丽", "Life has its ups and downs. It can be both brutal and beautiful. " +
                "Life has its ups and downs. It can be both brutal and beautiful."));
        return cards;
    }

    public static List<Deck> getDeckList(){
        List<Deck> decks = new ArrayList<Deck>();
        decks.add(new Deck("Lanuage", "Cards to learn some language", R.drawable.pig,null, null, getCardList()));
        decks.add(new Deck("Accounting concepts", "This is a collection of account terms", R.drawable.pig, null, null, new ArrayList<Card>()));

        return decks;

    }

}
