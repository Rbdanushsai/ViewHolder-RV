package club.devsoc.csaapp.fragments.noticesAndEvents;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import club.devsoc.csaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoticesAndEventsFragment extends Fragment {


    public NoticesAndEventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notices_and_events, container, false);
    }

}
