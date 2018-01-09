package com.example.a207_1.mychat;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by 207-1 on 08/01/2018.
 */

public class Chat {
    private User sender;
    private String pesan;
    private Long tanggal;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference chatRef = database.getReference("chats");


    public void send(){
        Log.d("SEND>>>", this.getPesan());
        chatRef.push().setValue(this);
    }


    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public Long getTanggal() {
        return tanggal;
    }

    public void setTanggal(Long tanggal) {
        this.tanggal = tanggal;
    }


}
