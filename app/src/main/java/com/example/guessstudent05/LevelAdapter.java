package com.example.guessstudent05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder> {
    
    ArrayList<GameModel> list;
    ItemListener listener;
    public LevelAdapter(ArrayList<GameModel> list,ItemListener listener) {
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @NotNull
    @Override
    public LevelViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_level, parent, false);
        return new LevelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull LevelAdapter.LevelViewHolder holder, int position) {
        holder.onFill(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LevelViewHolder extends RecyclerView.ViewHolder {
        Button button;

        public LevelViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.level_btn);
        }

        public void onFill(GameModel model) {
            button.setText(model.level);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.itemClick(model);
                }
            });
        }
    }

    interface ItemListener{
        void itemClick(GameModel model);
    }
}
