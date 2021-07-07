package com.example.sepedamotor;

import android.os.Parcel;
import android.os.Parcelable;

public class Motor implements Parcelable {
    private String name;
    private String harga;
    private String detail;
    private int photo;

    public Motor(){

    }

    protected Motor(Parcel in) {
        name = in.readString();
        harga = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }



    public static final Creator<Motor> CREATOR = new Creator<Motor>() {
        @Override
        public Motor createFromParcel(Parcel in) {
            return new Motor(in);
        }

        @Override
        public Motor[] newArray(int size) {
            return new Motor[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(harga);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
