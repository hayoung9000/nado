package com.example.lg.nado;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.lg.nado.MainActivity.list;

/**
 * Created by LG on 2017-07-16.
 */

public class celebrityActivity extends Fragment{
    String a=null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.celebrity, container, false);
    }

    /*public void p() {
        for (int i = 0; i < list.size(); i++) {
             a = list.get(i);
        }
    }*/

}
