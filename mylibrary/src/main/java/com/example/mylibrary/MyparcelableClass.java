package com.example.mylibrary;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import androidx.annotation.NonNull;

public class MyparcelableClass implements Parcelable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected MyparcelableClass(Parcel in) {
    }

    public static final Creator<MyparcelableClass> CREATOR = new Creator<MyparcelableClass>() {
        @Override
        public MyparcelableClass createFromParcel(Parcel in) {
            return new MyparcelableClass(in);
        }

        @Override
        public MyparcelableClass[] newArray(int size) {
            return new MyparcelableClass[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // 模拟写入null值
        String NullString = null;
        dest.writeString(NullString);
        dest.writeInt(age);

        Log.d("MyparcelableClass","age = " +age);
    }
}
