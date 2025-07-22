package nl.xservices.plugins;

import static android.content.Intent.EXTRA_CHOSEN_COMPONENT;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ShareChooserPendingIntent extends BroadcastReceiver {
    public static String chosenComponent = null;
    @Override
    public void onReceive(Context context, Intent intent) {
      Bundle extras = intent.getExtras();
        if (extras != null) {
            ShareChooserPendingIntent.chosenComponent = extras.get(EXTRA_CHOSEN_COMPONENT).toString();
        }
    }
}
