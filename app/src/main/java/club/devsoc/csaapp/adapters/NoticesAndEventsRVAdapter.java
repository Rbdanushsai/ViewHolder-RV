package club.devsoc.csaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import club.devsoc.csaapp.R;
import club.devsoc.csaapp.rvModels.NoticesAndEventsRVModel;
import club.devsoc.csaapp.viewHolders.NoticesAndEventsRVViewHolder;

public class NoticesAndEventsRVAdapter extends RecyclerView.Adapter<NoticesAndEventsRVViewHolder> {
    private ArrayList<NoticesAndEventsRVModel> noticesAndEventsRVModelArrayList = new ArrayList<>();
    private Context context;


    public NoticesAndEventsRVAdapter(ArrayList<NoticesAndEventsRVModel> noticesAndEventsRVModels, Context context) {
        this.noticesAndEventsRVModelArrayList = noticesAndEventsRVModels;
        this.context = context;
    }

    @NonNull
    @Override
    public NoticesAndEventsRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_notices_and_events_rv, parent, false);
        NoticesAndEventsRVViewHolder noticesAndEventsRVViewHolder = new NoticesAndEventsRVViewHolder(view);
        return noticesAndEventsRVViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NoticesAndEventsRVViewHolder holder, int position) {
        holder.populate(noticesAndEventsRVModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return noticesAndEventsRVModelArrayList.size();
    }
}
