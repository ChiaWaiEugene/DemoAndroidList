package sg.edu.rp.c346.id20041877.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ToDoItem extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_item);


    }



    @Override
    public String {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy (EEEE) Week num: ww ");
        String date1 = format1.format(date);

        String str = date1;

        return str;
    }


}