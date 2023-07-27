package com.proyectoFinal.appFutbol.torneos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectoFinal.appFutbol.R;

import java.util.ArrayList;
import java.util.List;

public class TorneosVideos extends Fragment {

    private RecyclerView recyclerView;
    private MyRecyclerViewAdapter3 adapter;





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TorneosVideos() {
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
    public static TorneosVideos newInstance(String param1, String param2) {
        TorneosVideos fragment = new TorneosVideos();
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
        View view = inflater.inflate(R.layout.fragment_torneos, container, false);

        recyclerView = view.findViewById(R.id.recyclerView3);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyRecyclerViewAdapter3(getData()); // Aquí getData() es un método que proporciona los datos para mostrar en el RecyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }



    private List<Torneos> getData() {
        List<Torneos> data = new ArrayList<>();
        data.add(new Torneos("1", "1. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Torneos("2", "2. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Torneos("3", "3. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        data.add(new Torneos("1", "4. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Torneos("2", "5. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Torneos("3", "6. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        data.add(new Torneos("1", "7. Barcelona VS Deportivo", R.drawable.jugar));
        data.add(new Torneos("2", "8. Real Madrid VS Sevilla", R.drawable.jugar));
        data.add(new Torneos("3", "9. Manchester VS Liverpool", R.drawable.jugar));
        // Agrega más elementos según sea necesario
        return data;
    }

}
