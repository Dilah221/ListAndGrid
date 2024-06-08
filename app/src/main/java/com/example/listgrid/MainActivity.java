package com.example.listgrid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Adapter adapter;
    private List<list> list;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.sycel);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager (new LinearLayoutManager(this));
        list = new ArrayList<>();
        list.add(new list("Judul 1", "Deskripsi 1", "https://maukuliah.ap-south-1.Linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"));
        list.add(new list("Judul 1", "Deskripsi 1", "https://maukuliah.ap-south-1.Linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"));
        list.add(new list("Judul 1", "Deskripsi 1", "https://maukuliah.ap-south-1.Linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"));

        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }
}