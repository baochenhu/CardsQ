package com.cardsq.cardsq.decklist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cardsq.cardsq.R;
import com.cardsq.cardsq.entity.Deck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzhu on 1/10/15.
 */
public class DeckListArrayAdapter extends ArrayAdapter<Deck> {

    private Activity context;
    private List<Deck> deckList = new ArrayList<Deck>();

    public DeckListArrayAdapter(Activity context, int textViewResourceId,
                                   List<Deck> deckList) {
        super(context, textViewResourceId, deckList);
        this.deckList = deckList;
        this.context = context;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.deck_list_item, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.deckName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.deckImage);
        Deck deck = deckList.get(position);
        txtTitle.setText(deck.getTitle());
        imageView.setImageResource(deck.getImageId());
        return rowView;
    }

}
