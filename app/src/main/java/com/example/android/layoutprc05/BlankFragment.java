package com.example.android.layoutprc05;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;


public class BlankFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_SHOW_TEXT = "text";

    private String mContentText;

    private TextView mTextView;

    CSVreader c;

    public BlankFragment() {
        // Required empty public constructor
    }

//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @return A new instance of fragment BlankFragment.
//     */
//    public static BlankFragment newInstance(String param1) {
//        BlankFragment fragment = new BlankFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_SHOW_TEXT, param1);
//        fragment.setArguments(args);
//        return fragment;
//    }

    /**
     *  Create a new fragment.
     * @return
     */
    public static BlankFragment newFragment() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mContentText = getArguments().getString(ARG_SHOW_TEXT);
        }

        //String filePath = new InputStreamReader(getResources().openRawResource(R.raw.words));
        c = new CSVreader();
        try {
            c.readFromCSV(getResources().openRawResource(R.raw.words));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //readCsvFile();

        //c = new CSVreader();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        //mContentText = c.words.get(0).printinOrder();


        String mContentText = "The size is : " + c.getSize();
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView contentTv = rootView.findViewById(R.id.fragment_words);
        contentTv.setText(mContentText);
        return rootView;
    }

}
