package com.cardsq.cardsq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 
 * A Deck is a list of cards.
 * 
 * Created by lzhu on 1/10/15.
 */
public class Deck {

    
    private UUID id;
    private String title;
    private String description;
    private Integer imageId;
    private Date createdAt;
    private Date updatedAt;
    private UUID creatorId;
    private UUID currentOwnerId;

    
    private List<Card> cardList;

    public Deck(){
        cardList = new ArrayList<Card>();
    }

    public Deck(String title, String description, Integer imageId,
                   UUID creatorId, UUID currentOwnerId, List<Card> cardList){
        this.title = title;
        this.description = description;
        this.imageId = imageId;
        this.creatorId = creatorId;
        this.currentOwnerId = currentOwnerId;
        this.cardList = cardList;
    }



    public boolean addACard(Card card){
        cardList.add(card);
        return true; //successful added
    }


    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(UUID creatorId) {
        this.creatorId = creatorId;
    }

    public void setCardList(List<Card> cardList){
        this.cardList = cardList;
    }

    public List<Card> getCardList(){
        return cardList;
    }
}