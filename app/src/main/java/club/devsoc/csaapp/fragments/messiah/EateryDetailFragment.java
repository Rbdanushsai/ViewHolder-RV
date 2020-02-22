package club.devsoc.csaapp.fragments.messiah;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import club.devsoc.csaapp.R;

/**
 * A simple {@link Fragment} subclass.
 *
 * This fragment will contain the individual eatery details
 */


public class EateryDetailFragment extends Fragment {


    public EateryDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eatery_detail, container, false);
    }

}
