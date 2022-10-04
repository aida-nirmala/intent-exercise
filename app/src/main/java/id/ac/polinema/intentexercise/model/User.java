package id.ac.polinema.intentexercise.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String sfullname;
    private String snim;
    private String spass;
    private String scopass;
    private String shomepage;
    private String sabout;

    public User(String sfullname, String snim, String spass, String scopass, String shomepage, String sabout) {
        this.sfullname = sfullname;
        this.snim = snim;
        this.spass = spass;
        this.scopass = scopass;
        this.shomepage = shomepage;
        this.sabout = sabout;
    }

    public void setSfullname(String sfullname) {
        this.sfullname = sfullname;
    }

    public void setSnim(String snim) {
        this.snim = snim;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    public void setScopass(String scopass) {
        this.scopass = scopass;
    }

    public void setShomepage(String shomepage) {
        this.shomepage = shomepage;
    }

    public void setSabout(String sabout) {
        this.sabout = sabout;
    }

    public String getSfullname() {
        return sfullname;
    }

    public String getSnim() {
        return snim;
    }

    public String getSpass() {
        return spass;
    }

    public String getScopass() {
        return scopass;
    }

    public String getShomepage() {
        return shomepage;
    }

    public String getSabout() {
        return sabout;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sfullname);
        dest.writeString(this.snim);
        dest.writeString(this.spass);
        dest.writeString(this.scopass);
        dest.writeString(this.shomepage);
        dest.writeString(this.sabout);
    }

    public void readFromParcel(Parcel source) {
        this.sfullname = source.readString();
        this.snim = source.readString();
        this.spass = source.readString();
        this.scopass = source.readString();
        this.shomepage = source.readString();
        this.sabout = source.readString();
    }

    protected User(Parcel in) {
        this.sfullname = in.readString();
        this.snim = in.readString();
        this.spass = in.readString();
        this.scopass = in.readString();
        this.shomepage = in.readString();
        this.sabout = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}







