package com.kidsapp.fiver1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class ScoringPage extends AppCompatActivity {
    int a;
    ImageView rewords_img,reward_star;
    TextView reward_text;
    private RewardedAd rewardedAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_page);
        a= getIntent().getExtras().getInt("Wrong");
        rewords_img= (ImageView) findViewById(R.id.reword_img);
        reward_star =(ImageView) findViewById(R.id.reward_star);
        reward_text= (TextView) findViewById(R.id.reward_text);

        rewardedAd = new RewardedAd(this,
                getResources().getString(R.string.reward_ad));
        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
            }

            @Override
            public void onRewardedAdFailedToLoad(LoadAdError adError) {
                // Ad failed to load.
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);
        if (rewardedAd.isLoaded()) {
            Activity activityContext = ScoringPage.this;
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                    if(a>=7){
                        rewords_img.setImageResource(R.drawable.zeroscore);
                        reward_star.setImageResource(R.drawable.reward_star1);
                        reward_text.setText("Play Again.. !!! ");
                    }
                    else if(a<7 && a>3){
                        rewords_img.setImageResource(R.drawable.smile_reward);
                        reward_star.setImageResource(R.drawable.reward_start2);
                        reward_text.setText("No Bad Play Again! ");
                    }
                    else if(a<3){
                        rewords_img.setImageResource(R.drawable.reward_2323917_2155564);
                        reward_star.setImageResource(R.drawable.reawar_start3);
                        reward_text.setText("Congratulations Well Played");
                    }
                }

                @Override
                public void onUserEarnedReward(@NonNull RewardItem reward) {
                    // User earned reward.
                    if(a>=7){
                        rewords_img.setImageResource(R.drawable.zeroscore);
                        reward_star.setImageResource(R.drawable.reward_star1);
                        reward_text.setText("Play Again.. !!! ");
                    }
                    else if(a<7 && a>3){
                        rewords_img.setImageResource(R.drawable.smile_reward);
                        reward_star.setImageResource(R.drawable.reward_start2);
                        reward_text.setText("No Bad Play Again! ");
                    }
                    else if(a<3){
                        rewords_img.setImageResource(R.drawable.reward_2323917_2155564);
                        reward_star.setImageResource(R.drawable.reawar_start3);
                        reward_text.setText("Congratulations Well Played");
                    }
                }

                @Override
                public void onRewardedAdFailedToShow(AdError adError) {
                    // Ad failed to display.
                    if(a>=7){
                        rewords_img.setImageResource(R.drawable.zeroscore);
                        reward_star.setImageResource(R.drawable.reward_star1);
                        reward_text.setText("Play Again.. !!! ");
                    }
                    else if(a<7 && a>3){
                        rewords_img.setImageResource(R.drawable.smile_reward);
                        reward_star.setImageResource(R.drawable.reward_start2);
                        reward_text.setText("No Bad Play Again! ");
                    }
                    else if(a<=3){
                        rewords_img.setImageResource(R.drawable.reward_2323917_2155564);
                        reward_star.setImageResource(R.drawable.reawar_start3);
                        reward_text.setText("Congratulations Well Played");
                    }
                }
            };
            rewardedAd.show(activityContext, adCallback);
        } else {
            Log.d("TAG", "The rewarded ad wasn't loaded yet.");
        }



        AdsClass aa= new AdsClass(ScoringPage.this);
//        aa.showintertialeAds();
//        aa.rewardedads();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ScoringPage.this,FinalmainScreen.class));
        finish();
        super.onBackPressed();

    }
}