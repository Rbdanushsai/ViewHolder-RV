package club.devsoc.csaapp.fragments.messiah;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import club.devsoc.csaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearCampusPlacesFragment extends Fragment {


    public NearCampusPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_near_campus_places, container, false);
    }

}
