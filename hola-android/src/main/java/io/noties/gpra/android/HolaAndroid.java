package io.noties.gpra.android;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

public abstract class HolaAndroid {

    public static void saySomething(@NonNull Context context) {
        Log.e("HolaAndroid", context.getString(R.string.ha_message));
    }

    private HolaAndroid() {
    }
}
