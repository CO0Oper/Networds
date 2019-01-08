package com.example.android.layoutprc05;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class WordData {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int wordId;

    @NonNull
    public String Word;

    @NonNull
    public int weight;

    @NonNull
    public String pronunciation;

    public String verb;

    public String verbt;

    public String verbi;

    public String noun;

    public String adj;

    public String adv;

    public String prep;

    public String conj;

    public String sentence;

    public String looklike;

    public String homoionym;

    public String antonym;
}
