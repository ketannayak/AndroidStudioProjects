package com.omkartech.RamnathStuti;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class NotificationReceiver extends BroadcastReceiver {

    private static final int NOTIFY_ME_ID=1337;

    @Override
    public void onReceive(Context ctxt, Intent intent) {

        NotificationManager mgr=
                (NotificationManager)ctxt.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent notificationIntent = new Intent(ctxt, MainActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent i = PendingIntent.getActivity(ctxt, 0,
                notificationIntent, 0);


        Notification note = new Notification.Builder(ctxt)
                    .setContentTitle("Ramnathi Stuti")
                    .setContentText("Time for Daily Prayer!")
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setWhen(System.currentTimeMillis())
                    .setDefaults(-Notification.DEFAULT_SOUND)
                    .setContentIntent(i)
                    .build();


        note.flags|=Notification.FLAG_AUTO_CANCEL;

        mgr.notify(NOTIFY_ME_ID, note);

    }
}
