package com.cardsq.cardsq.setting;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cardsq.cardsq.R;

import java.util.ArrayList;

/**
 * MainSettingFragment shows the setting list
 *
 *
 * Created by lzhu on 1/10/15.
 */
public class MainSettingFragment extends Fragment implements AbsListView.OnItemClickListener {
    /**
     * The fragment's ListView/GridView.
     */
    private AbsListView listView;
    private String [] settingTitles;
    private MainSettingListAdapter adapter;
    private ArrayList<MainSettingListItem> settingItemList;
    private OnFragmentInteractionListener mListener;


    // TODO: Rename and change types and number of parameters
    public static MainSettingFragment newInstance() {
        MainSettingFragment fragment = new MainSettingFragment();
        return fragment;
    }
    public MainSettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        settingTitles = getResources().getStringArray(R.array.main_setting_list);

        settingItemList = new ArrayList<MainSettingListItem>();

        for(String s : settingTitles) {
            settingItemList.add(new MainSettingListItem(s));
        }

        adapter = new MainSettingListAdapter(getActivity(), settingItemList);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_setting_list, container, false);
        listView = (ListView) view.findViewById(android.R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(1);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mListener) {
            // Notify the active callbacks interface (the activity, if the
            // fragment is attached to one) that an item has been selected.
            mListener.onFragmentInteraction(position);
        }
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(int position);
    }



}
