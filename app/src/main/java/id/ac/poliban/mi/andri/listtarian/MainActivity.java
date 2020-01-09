package id.ac.poliban.mi.andri.listtarian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Tarian> tarians = new ArrayList<>();
    private ListView lvTarian;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTarian = findViewById(R.id.listview);

        tarians.addAll(DataTarian.getAllTarians());

        adapter = new AdapterTarian(tarians);

        lvTarian.setAdapter(adapter);

        lvTarian.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(tarians.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
