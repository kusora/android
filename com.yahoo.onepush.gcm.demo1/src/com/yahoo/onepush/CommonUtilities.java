package com.yahoo.onepush;

import android.content.Context;
import android.content.Intent;

public class CommonUtilities {

	 // give your server registration url here
    static final String SERVER_URL = "http://10.82.133.150:80/reg.php";
    static final String SERVER_RECEIVE_URL = "http://10.82.133.150:80/receive.php";
    //static final String SERVER_URL = "http://pretendedamended.corp.sg3.yahoo.com/";
 
    // Google project id
    static final String SENDER_ID = "504635955342";
 
    /**
     * Tag used on log messages.
     */
    static final String TAG = "AndroidHive GCM";
 
    static final String DISPLAY_MESSAGE_ACTION = "com.yahoo.onepush.DISPLAY_MESSAGE";
 
    static final String EXTRA_MESSAGE = "message";
 
    /**
     * Notifies UI to display a message.
     * <p>
     * This method is defined in the common helper because it's used both by
     * the UI and the background service.
     *
     * @param context application's context.
     * @param message message to be displayed.
     */
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}
