package com.kidsapp.fiver1;

import android.content.Context;
import android.util.Log;

public class AdsClass {
    private static final String TAG = "TAG";
    Context context;
//    private InterstitialAd interstitialAd ;
//    private RewardedVideoAd rewardedVideoAd;

    public AdsClass(Context context) {
        this.context = context;
    }

    public void showintertialeAds() {
//        interstitialAd = new InterstitialAd(context, "VID_HD_16_9_46S_APP_INSTALL#3060121600926480_3060122207593086");
//        interstitialAd = new InterstitialAd(context, "3060121600926480_3060122207593086");

//        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
//            @Override
//            public void onInterstitialDisplayed(Ad ad) {
//                // Interstitial ad displayed callback
//                Log.e(TAG, "Interstitial ad displayed.");
//            }
//
//            @Override
//            public void onInterstitialDismissed(Ad ad) {
//                // Interstitial dismissed callback
//                Log.e(TAG, "Interstitial ad dismissed.");
//            }
//
//            @Override
//            public void onError(Ad ad, AdError adError) {
//                // Ad error callback
//                Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
//            }
//
//            @Override
//            public void onAdLoaded(Ad ad) {
//                // Interstitial ad is loaded and ready to be displayed
//                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
//                // Show the ad
//                interstitialAd.show();
//            }
//
//            @Override
//            public void onAdClicked(Ad ad) {
//                // Ad clicked callback
//                Log.d(TAG, "Interstitial ad clicked!");
//            }
//
//            @Override
//            public void onLoggingImpression(Ad ad) {
//                // Ad impression logged callback
//                Log.d(TAG, "Interstitial ad impression logged!");
//            }
//        };

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
//        interstitialAd.loadAd(
//                interstitialAd.buildLoadAdConfig()
//                        .withAdListener(interstitialAdListener)
//                        .build());
//    }

//    public void rewardedads(){
////        rewardedVideoAd = new RewardedVideoAd(context, "VID_HD_16_9_46S_APP_INSTALL#3060121600926480_3060141687591138");
//        rewardedVideoAd = new RewardedVideoAd(context, "3060121600926480_3060141687591138");
//
//        RewardedVideoAdListener rewardedVideoAdListener = new RewardedVideoAdListener() {
//            @Override
//            public void onError(Ad ad, AdError error) {
//                // Rewarded video ad failed to load
//                Log.e(TAG, "Rewarded video ad failed to load: " + error.getErrorMessage());
//            }
//
//            @Override
//            public void onAdLoaded(Ad ad) {
//                // Rewarded video ad is loaded and ready to be displayed
//                Log.d(TAG, "Rewarded video ad is loaded and ready to be displayed!");
//            }
//
//            @Override
//            public void onAdClicked(Ad ad) {
//                // Rewarded video ad clicked
//                Log.d(TAG, "Rewarded video ad clicked!");
//            }
//
//            @Override
//            public void onLoggingImpression(Ad ad) {
//                // Rewarded Video ad impression - the event will fire when the
//                // video starts playing
//                Log.d(TAG, "Rewarded video ad impression logged!");
//            }
//
//            @Override
//            public void onRewardedVideoCompleted() {
//                // Rewarded Video View Complete - the video has been played to the end.
//                // You can use this event to initialize your reward
//                Log.d(TAG, "Rewarded video completed!");
//
//                // Call method to give reward
//                // giveReward();
//            }
//
//            @Override
//            public void onRewardedVideoClosed() {
//                // The Rewarded Video ad was closed - this can occur during the video
//                // by closing the app, or closing the end card.
//                Log.d(TAG, "Rewarded video ad closed!");
//            }
//        };
//        rewardedVideoAd.loadAd(
//                rewardedVideoAd.buildLoadAdConfig()
//                        .withAdListener(rewardedVideoAdListener)
//                        .build());
//    }

    }
}
