package com.proyectoFinal.appFutbol.torneos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectoFinal.appFutbol.R;

import java.util.List;

public class MyRecyclerViewAdapter3 extends RecyclerView.Adapter<MyRecyclerViewAdapter3.ViewHolder> {

    private List<Torneos> data;

    public MyRecyclerViewAdapter3(List<Torneos> data) {

        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Torneos golesItem = data.get(position);
        String textoGoles = golesItem.getTexto();
        holder.number.setText(textoGoles);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView number, description;
        ImageButton imageButton;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.matchNumberTextView);
            description = itemView.findViewById(R.id.matchInfoTextView);
            imageButton = itemView.findViewById(R.id.playVideoButton);
        }
    }
}

