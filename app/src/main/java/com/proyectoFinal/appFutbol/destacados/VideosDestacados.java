package com.proyectoFinal.appFutbol.destacados;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectoFinal.appFutbol.Destacados;
import com.proyectoFinal.appFutbol.R;

import java.util.ArrayList;
import java.util.List;

public class VideosDestacados extends Fragment {

    private RecyclerView recyclerView;
    private com.example.jordan.destacados.MyRecyclerViewAdapter2 adapter;





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VideosDestacados() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UltimosGoles.
     */
    // TODO: Rename and change types and number of parameters
    public static VideosDestacados newInstance(String param1, String param2) {
        VideosDestacados fragment = new VideosDestacados();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_videos_destacados, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new com.example.jordan.destacados.MyRecyclerViewAdapter2(getData()); // Aquí getData() es un método que proporciona los datos para mostrar en el RecyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }



    private List<Destacados> getData() {
        List<Destacados> data = new ArrayList<>();
        data.add(new Destacados("1", "1. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Destacados("2", "2. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Destacados("3", "3. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        data.add(new Destacados("1", "4. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Destacados("2", "5. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Destacados("3", "6. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        data.add(new Destacados("1", "7. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Destacados("2", "8. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Destacados("3", "9. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        return data;
    }

}