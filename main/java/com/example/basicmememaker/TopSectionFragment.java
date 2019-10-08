package com.example.basicmememaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TopSectionFragment extends Fragment {

    private EditText TopMemeText;
    private EditText BottomMemeText;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createClick(String top, String bottom );
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()) ;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        TopMemeText = view.findViewById(R.id.TopMemeText);
        BottomMemeText = view.findViewById(R.id.BottomMemeText);

        final Button button = view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    public void buttonClicked(View view){
        activityCommander.createClick(TopMemeText.getText().toString(), BottomMemeText.getText().toString());


    }
}
