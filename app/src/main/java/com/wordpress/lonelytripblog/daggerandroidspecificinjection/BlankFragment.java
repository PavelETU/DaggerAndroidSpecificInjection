package com.wordpress.lonelytripblog.daggerandroidspecificinjection;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    @Inject
    DummyObjectToInjectInFragment dummyObjectToInjectInFragment;


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        App.getAppMainComponent().inject(this);
        super.onAttach(context);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ((TextView)view.findViewById(R.id.fragment_text)).setText(dummyObjectToInjectInFragment.getTextToShow());
        return view;
    }

}