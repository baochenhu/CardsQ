package com.cardsq.cardsq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lzhu on 1/10/15.
 */
public class ReviewSetting {

    private List<ReviewStage> reviewStages = new ArrayList<ReviewStage>();

    public static final ReviewStage LEVEL1 = new ReviewStage("Just start", 1, new Date(2000));
    public static final ReviewStage LEVEL2 = new ReviewStage("Level 2", 2, new Date(4000));
    private static final ReviewStage LEVEL3 = new ReviewStage("Level 3", 3, new Date(6000));



    public ReviewSetting(){
        setupAsDefault();
    }


    public  void setupAsDefault(){
        reviewStages.clear();
        reviewStages.add(LEVEL1);
        reviewStages.add(LEVEL2);
        reviewStages.add(LEVEL3);
    }

    public List<ReviewStage> getReviewSetting(){
        return this.reviewStages;
    }

    public ReviewStage getReviewLevel(int level){
        if(level < 0 || level > this.reviewStages.size()){
            System.out.println("The input level doesn't exist");
        }
        return this.reviewStages.get(level-1);
    }
}
