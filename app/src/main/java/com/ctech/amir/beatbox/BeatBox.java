package com.ctech.amir.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

public class BeatBox {

    public static final String TAG = "BeatBox";

    public static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }
    private void loadSounds() {
        String[] soundNames;
        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "found " + soundNames.length + " sounds.");
        } catch (IOException ioe) {
            Log.e(TAG, "could not list assets in " + SOUNDS_FOLDER, ioe);
            return;
        }
    }
}
