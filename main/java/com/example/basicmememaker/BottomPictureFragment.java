package com.example.basicmememaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BottomPictureFragment extends Fragment {
    private TextView TopText;
    private TextView BottomText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        TopText = view.findViewById(R.id.TopText);
        BottomText = view.findViewById(R.id.BottomText);
        return view;
    }

    public void setOnclickedText(String top, String bottom) {
        TopText.setText(top);
        BottomText.setText(bottom);
    }
}
