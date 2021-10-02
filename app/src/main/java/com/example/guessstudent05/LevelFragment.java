package com.example.guessstudent05;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LevelFragment extends Fragment {

    LevelAdapter adapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_level, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter(view);
        getList();
    }

    public ArrayList<GameModel> getList() {
        ArrayList<GameModel> list = (ArrayList<GameModel>) getArguments().getSerializable("model");
        return list;
    }

    private void initAdapter(View view) {
        recyclerView = view.findViewById(R.id.level_recycler);
        adapter = new LevelAdapter();
        recyclerView.setAdapter(adapter);
    }
}