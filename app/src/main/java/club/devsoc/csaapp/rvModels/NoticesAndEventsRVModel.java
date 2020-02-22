package club.devsoc.csaapp.rvModels;

public class NoticesAndEventsRVModel {
    private String title, subtitle, category, body;
    private int profilePictureLocation; //holds the address of the image

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getProfilePictureLocation() {
        return profilePictureLocation;
    }

    public void setProfilePictureLocation(int profilePictureLocation) {
        this.profilePictureLocation = profilePictureLocation;
    }
}
