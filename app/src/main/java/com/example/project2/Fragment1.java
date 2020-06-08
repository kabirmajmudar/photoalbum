package com.example.project2;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {


    Button m_btnMessage = null;
    EditText m_txtMessage = null;
    OnButtonPressListener buttonListener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    // In fragment class onCreateView actually inflates the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Fragment is part of the Viewgroup of the main activity
        // Inflate the layout for this fragment
        ViewGroup  root =  (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);

        m_btnMessage =  root.findViewById(R.id.btnMessage);
        m_txtMessage = root.findViewById(R.id.txtMessage);

        m_btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                buttonListener.onButtonPressListener(m_txtMessage.getText().toString());
            }
        });

        return root;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            buttonListener = (OnButtonPressListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onButtonPressed");
        }
    }

}
