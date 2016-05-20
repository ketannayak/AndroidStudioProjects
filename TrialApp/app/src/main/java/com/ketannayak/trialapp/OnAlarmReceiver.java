package com.ketannayak.trialapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OnAlarmReceiver extends BroadcastReceiver {
    private static final int NOTIFY_ME_ID=1337;

    @Override
    public void onReceive(Context ctxt, Intent intent) {

        NotificationManager mgr=
                (NotificationManager)ctxt.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent notificationIntent = new Intent(ctxt, MyActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent i = PendingIntent.getActivity(ctxt, 0,
                notificationIntent, 0);


        Notification note=new Notification.Builder(ctxt)
                .setContentTitle("Ramnathi Stuti")
                .setContentText("Time for Daily Prayer!")
                .setSmallIcon(R.drawable.ic_info_black_24dp)
                .setWhen(System.currentTimeMillis())
                .setDefaults(-Notification.DEFAULT_SOUND)
                .setContentIntent(i)
                .build();

        /**

        PendingIntent contentIntent=PendingIntent.getActivity(ctxt, 0,
                new Intent(ctxt, MyActivity.class),
                0);

         */

        note.flags|=Notification.FLAG_AUTO_CANCEL;

        mgr.notify(NOTIFY_ME_ID, note);

    }
}
