package com.example.sinotl.guofufinance.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.sinotl.guofufinance.R;

/**
 * Created by Gonloy on 2015/7/30.
 */
public class SanBiaoZhiTou extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.sbzt_fragment, container, false);
        return ll;
    }
}