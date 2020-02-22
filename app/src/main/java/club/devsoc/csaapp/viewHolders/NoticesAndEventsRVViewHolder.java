package club.devsoc.csaapp.viewHolders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import club.devsoc.csaapp.R;
import club.devsoc.csaapp.rvModels.NoticesAndEventsRVModel;

public class NoticesAndEventsRVViewHolder extends RecyclerView.ViewHolder {
    private ImageView profilePhoto;
    private TextView titleTV, subtitleTV, categoryTV, bodyTV;
    private Button bookmark;

    public void populate(NoticesAndEventsRVModel noticesAndEventsRVModel){
        titleTV.setText(noticesAndEventsRVModel.getTitle());
        subtitleTV.setText(noticesAndEventsRVModel.getSubtitle());
        categoryTV.setText(noticesAndEventsRVModel.getCategory());
        bodyTV.setText(noticesAndEventsRVModel.getBody());
        profilePhoto.setImageResource(noticesAndEventsRVModel.getProfilePictureLocation());
    }
    public NoticesAndEventsRVViewHolder(@NonNull View itemView) {
        super(itemView);

        profilePhoto = itemView.findViewById(R.id.profile_photo);
        titleTV = itemView.findViewById(R.id.title);
        subtitleTV = itemView.findViewById(R.id.subtitle);
        categoryTV = itemView.findViewById(R.id.category);
        bodyTV = itemView.findViewById(R.id.body);
        bookmark = itemView.findViewById(R.id.bookmark);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for popping up a notice or event when clicked
            }
        });

        bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code to bookmark a particular notice or event
            }
        });
    }
}
