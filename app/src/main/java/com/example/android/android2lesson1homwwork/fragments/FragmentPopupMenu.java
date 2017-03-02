package com.example.android.android2lesson1homwwork.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.android2lesson1homwwork.R;

/**
 * Created by admin on 01.03.2017.
 */

    public class FragmentPopupMenu extends Fragment {

    //werwr
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View View =
                inflater.inflate(R.layout.fragment_popup_menu, container, false);
        return View;
    }
}


