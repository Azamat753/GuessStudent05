package com.example.guessstudent05;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class StartFragment extends Fragment {
    ArrayList<GameModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.start_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendArrayModel();
            }
        });
    }

    private void sendArrayModel() {
        GameModel model1 = new GameModel("1 уровень",
                "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Сноуден");
        GameModel model2 = new GameModel("2 уровень",
                "https://static.dw.com/image/48299247_303.jpg",
                "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/214/550/3.jpg",
                "https://icdn.lenta.ru/images/2019/10/23/14/20191023144102516/square_320_7f4e7ebca6193a6af0eeb414b58bdce0.jpg",
                "https://bigasia.ru/upload/iblock/b03/b034e5975ae5a1b118386b9858a581a4.png",
                "Шпион");

        list.add(model1);
        list.add(model2);

        Bundle bundle = new Bundle();
        bundle.putSerializable("model", list);
        LevelFragment fragment = new LevelFragment();
        fragment.setArguments(bundle);

        getParentFragmentManager()
                .beginTransaction()
                .replace(R.id.container_main, fragment)
                .commit();
    }
}