package sg.edu.rp.c346.id19020844.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TooManyListenersException;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    CustomAdapter adapter;
    ArrayList<ToDoItem> tdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.ToDoList);

        tdList = new ArrayList<>();

        tdList.add(new ToDoItem("Go for movie", Calendar.getInstance()));
        tdList.add(new ToDoItem("Go for haircut", Calendar.getInstance()));

        adapter = new CustomAdapter(this, R.layout.row, tdList);

        lvToDo.setAdapter(adapter);
    }
}
