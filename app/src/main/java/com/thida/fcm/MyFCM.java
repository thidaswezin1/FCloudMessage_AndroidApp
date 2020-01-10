package com.thida.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import androidx.annotation.NonNull;

public class MyFCM extends FirebaseMessagingService {
    private static final String TAG = "MyFCM";
    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        if(remoteMessage.getNotification()!=null){
            Log.e(TAG,"Title "+remoteMessage.getNotification().getTitle());
            Log.e(TAG,"Body "+remoteMessage.getNotification().getBody());
        }
        if(remoteMessage.getData().size()>0){
            Log.e(TAG,"Data "+remoteMessage.getData());
        }
    }
}
