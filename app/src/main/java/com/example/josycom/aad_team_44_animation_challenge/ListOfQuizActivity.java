package com.example.josycom.aad_team_44_animation_challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.josycom.aad_team_44_animation_challenge.utilities.DataManager;

public class ListOfQuizActivity extends AppCompatActivity implements Animator.AnimatorListener{

    Animator rotate;
    CardView sportsCard;
    CardView affairsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_quiz);
        affairsCard = findViewById(R.id.affairs_card);
        sportsCard = findViewById(R.id.sports_card);

        Animation a = AnimationUtils.loadAnimation(this,R.anim.move_animation);
        affairsCard.setAnimation(a);
        sportsCard.setAnimation(a);
    }

    public void sportsClick(View view) {
        DataManager.ourInstance = null;
        Animation rotation = AnimationUtils.loadAnimation(ListOfQuizActivity.this,R.anim.rotate_animation);
        sportsCard.setAnimation(rotation);
        startActivity(new Intent(this, SportQuizActivity.class));
        overridePendingTransition(R.anim.rotate_animation,R.anim.animate_zoom_exit);
    }

    public void currentAffairsClick(View view) {
        DataManager.ourInstance = null;
        Animation rotation = AnimationUtils.loadAnimation(ListOfQuizActivity.this,R.anim.rotate_animation);
        affairsCard.setAnimation(rotation);
        startActivity(new Intent(this,CurrentAffairsActivity.class));
        overridePendingTransition(R.anim.rotate_animation,R.anim.animate_zoom_exit);
    }

    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {

    }

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}
