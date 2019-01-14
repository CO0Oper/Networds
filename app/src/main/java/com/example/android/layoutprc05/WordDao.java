package com.example.android.layoutprc05;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

@Dao
public interface WordDao {

    @Query("SELECT wordId, weight FROM WORD_TABLE ORDER BY weight ASC")
    void getWeight();
}
