package com.ctech.amir.beatbox;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected BeatBoxFragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
