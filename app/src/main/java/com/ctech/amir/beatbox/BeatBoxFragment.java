package com.ctech.amir.beatbox;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ctech.amir.beatbox.databinding.FragmentBeatBoxBinding;


public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        // use the DataBindingUtil to inflate our layout
        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_beat_box, container, false);

        // configure the recycler view to use a gridlayoutManager with 3 colums
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));

        return binding.getRoot();
    }
}
