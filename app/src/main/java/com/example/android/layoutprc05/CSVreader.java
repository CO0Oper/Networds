package com.example.android.layoutprc05;

import com.csvreader.CsvReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVreader {

    Scanner sc = null;
    static ArrayList<WordCons> words = new ArrayList<>();

    public CSVreader() {
    }

    public int getSize(){
        return words.size();
    }

    public static void readFromCSV(InputStream inputStream) throws IOException {

        ArrayList<String[]> csvList = new ArrayList<>();

        String word, pronunciation, verb, verbt, verbi, noun,
                adj, adv, prep, conj, sentence, looklike, homoionym, antonym;
        int weight;

        /* Invoke using String path*/
        //CsvReader reader = new CsvReader("words.csv", ',', Charset.forName("utf-8"));

        /* Invoke using InputSteam*/
        CsvReader reader = new CsvReader(new InputStreamReader(inputStream,"UTF-8"));

        reader.readHeaders();

        while(reader.readRecord()) {

            csvList.add(reader.getValues());
        }
        reader.close();

            for(int row = 0; row < csvList.size(); row++) {
                //int row = ;
                if(csvList.get(row)[0]!=null && csvList.get(row)[0] != "") {
                    word = csvList.get(row)[0];
                }else {
                    return;
                }
                if(csvList.get(row)[1]!=null) {
                    //weight = Integer.parseInt(csvList.get(row)[1]);

                    weight = Integer.parseInt(csvList.get(row)[1]);
                }else {
                    weight = 0;
                }
                if(csvList.get(row)[2]!=null) {
                    pronunciation = csvList.get(row)[2];
                }else {
                    pronunciation = "";
                }
                if(csvList.get(row)[3]!=null) {
                    verb = csvList.get(row)[3];
                }else {
                    verb = "";
                }
                if(csvList.get(row)[4]!=null) {
                    verbt = csvList.get(row)[4];
                }else {
                    verbt = "";
                }
                if(csvList.get(row)[5]!=null) {
                    verbi = csvList.get(row)[5];
                }else {
                    verbi = "";
                }
                if(csvList.get(row)[6]!=null) {
                    noun = csvList.get(row)[6];
                }else {
                    noun = "";
                }
                if(csvList.get(row)[7]!=null) {
                    adj = csvList.get(row)[7];
                }else {
                    adj = "";
                }
                if(csvList.get(row)[8]!=null) {
                    adv = csvList.get(row)[8];
                }else {
                    adv = "";
                }
                if(csvList.get(row)[9]!=null) {
                    prep = csvList.get(row)[9];
                }else {
                    prep = "";
                }
                if(csvList.get(row)[10]!=null) {
                    conj = csvList.get(row)[10];
                }else {
                    conj = "";
                }
                if(csvList.get(row)[11]!=null) {
                    sentence = csvList.get(row)[11];
                }else {
                    sentence = "";
                }
                if(csvList.get(row)[12]!=null) {
                    looklike = csvList.get(row)[12];
                }else {
                    looklike = "";
                }
                if(csvList.get(row)[13]!=null) {
                    homoionym = csvList.get(row)[13];
                }else {
                    homoionym = "";
                }
                if(csvList.get(row)[14]!=null) {
                    antonym = csvList.get(row)[14];
                }else {
                    antonym = "";
                }

                WordCons wordcons = new WordCons(word, weight, pronunciation, verb, verbt, verbi, noun,
                        adj, adv, prep, conj, sentence, looklike, homoionym, antonym);
                //System.out.println(wordcons.output());

                words.add(wordcons);
                //System.out.println(words.get(0).output());
            }
        }
    }

