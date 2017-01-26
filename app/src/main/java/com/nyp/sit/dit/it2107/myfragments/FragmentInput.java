package com.nyp.sit.dit.it2107.myfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentInput.OnFragmentAListener} interface
 * to handle interaction events.
 */
public class FragmentInput extends Fragment {

    Button fragABtn;
    EditText fragAET;


    private OnFragmentAListener mListener;

    public FragmentInput() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_input, container, false);
        fragABtn = (Button) rootView.findViewById(R.id.fragBtnSwitch);
        fragAET = (EditText) rootView.findViewById(R.id.fragET);

        fragABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onButtonPressed(fragAET.getText().toString());
            }
        });

        return rootView;


        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_input, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentAListener) {
            mListener = (OnFragmentAListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentAListener {
        // TODO: Update argument type and name
        public void onButtonPressed(String userInput);
    }
}
