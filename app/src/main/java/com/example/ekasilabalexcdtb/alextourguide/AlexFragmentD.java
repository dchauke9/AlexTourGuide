package com.example.ekasilabalexcdtb.alextourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eKasiLab Alex CDTB on 19 Jul 2017.
 */

public class AlexFragmentD extends Fragment{
    public AlexFragmentD() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);

        TextView tv = (TextView)view.findViewById(R.id.textview);
        tv.setText("Fragment D");
        return  view;
    }
}
