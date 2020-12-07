package com.kidsapp.fiver1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class FinalmainScreen extends AppCompatActivity {

    int num=1;
    MediaPlayer mediaPlayer;
    ImageView stopmus;
    private RewardedAd rewardedAd;
    private InterstitialAd mInterstitialAd;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
        else {
            showSystemUI();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalmain_screen);
        stopmus= (ImageView) findViewById(R.id.imageView10);
        mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
       // mediaPlayer.start(); // no need to call prepare(); create() does that for you

//        Ads Start
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.Intusitus_ad));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
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

    }

    @Override
    protected void onResume() {
        super.onResume();
//        mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
//        mediaPlayer.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        mediaPlayer.release();

    }

    @Override
    protected void onRestart() {
        mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
        super.onRestart();
    }

    public void sequenceact(View view) {
       // startActivity(new Intent(FinalmainScreen.this,Sequencegame.class));
    }

    public void numberact(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });

        Intent ii= new Intent(FinalmainScreen.this,NumbersAct.class);
        //ii.putExtra("Seq","numbers");
        ii.putExtra("value",37);
        startActivity(ii);
    }

    public void showemoact(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });
        Intent ii= new Intent(FinalmainScreen.this, EmoQuestionsActivity.class);
        //ii.putExtra("Seq","emo");
        ii.putExtra("value",17);
        startActivity(ii);
    }

    public void showgellery(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
        startActivity(new Intent(FinalmainScreen.this,Show_ImagesMain.class));

    }

    public void showcoloract(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });
        Intent ii= new Intent(FinalmainScreen.this,Colours_question_act.class);
        //ii.putExtra("Seq","colour");
        ii.putExtra("value",12);
        startActivity(ii);
           }

    public void animalact(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        } mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });
        Intent ii= new Intent(FinalmainScreen.this,Animals_question.class);
        //ii.putExtra("Seq","animals");
        ii.putExtra("value",99);
        startActivity(ii);
         }

    public void fruitsAct(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());


            }

        });
        Intent ii= new Intent(FinalmainScreen.this,FoodActivity.class);
        // ii.putExtra("Seq","food");
        ii.putExtra("value",32);
        startActivity(ii);
    }

    public void travelAct(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });
        Intent ii= new Intent(FinalmainScreen.this,TravelAct.class);
        //ii.putExtra("Seq","transport");
        ii.putExtra("value",72);
        startActivity(ii);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();System.exit(0);
    }

    public void puzzlemain(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });
        startActivity(new Intent(FinalmainScreen.this,Puzzlemainscreen.class));

    }

    public void stopmusic(View view) {
//        if(num==1){
//        mediaPlayer.release();
//        num++;
//        stopmus.setImageResource(R.drawable.soundbtn);
//        }
//        else if(num%2==0){
//            mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
//            mediaPlayer.start(); // no need to call prepare(); create() does that for you
//            stopmus.setImageResource(R.drawable.soundoff);
//            num++;
//        }
//        else {
//            mediaPlayer.release();
//            num++;
//            stopmus.setImageResource(R.drawable.soundbtn);
//        }
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        } else {
            mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
            mediaPlayer.start();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
//        mediaPlayer=null;
    }


    public void showthings(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
        Intent ii= new Intent(FinalmainScreen.this,Vehicals_Act.class);
        //ii.putExtra("Seq","transport");
        ii.putExtra("value",172);
        startActivity(ii);
    }
    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    public void Undercontruction(View view) {
        if (rewardedAd.isLoaded()) {
            Activity activityContext = FinalmainScreen.this;
            RewardedAdCallback adCallback = new RewardedAdCallback() {
                @Override
                public void onRewardedAdOpened() {
                    // Ad opened.
                }

                @Override
                public void onRewardedAdClosed() {
                    // Ad closed.
                }

                @Override
                public void onUserEarnedReward(@NonNull RewardItem reward) {
                    // User earned reward.
                }

                @Override
                public void onRewardedAdFailedToShow(AdError adError) {
                    // Ad failed to display.
                }
            };
            rewardedAd.show(activityContext, adCallback);
        } else {
            Log.d("TAG", "The rewarded ad wasn't loaded yet.");
        }
        Toast.makeText(this, "For Complete Version of this app you have to pay..", Toast.LENGTH_SHORT).show();


    }
}