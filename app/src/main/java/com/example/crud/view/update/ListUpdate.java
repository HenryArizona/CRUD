package com.example.crud.view.update;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.crud.R;
import com.example.crud.controller.DBDataSource;
import com.example.crud.model.Book;
import java.util.ArrayList;

public class ListUpdate extends Activity {
    private DBDataSource dataSource;
    private ArrayList<Book> values;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_update);

        dataSource = new DBDataSource(this);
        dataSource.open();

        values = dataSource.readData();
        ArrayAdapter<Book> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, values
        );

        listView = findViewById(R.id.listBook);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                (parent, v, position, id) -> {
                    Book book = values.get(position);

                    Intent intent = new Intent(ListUpdate.this, UpdateData.class);
                    intent.putExtra("id", book.getBookId());
                    intent.putExtra("name", book.getBookName());
                    intent.putExtra("author", book.getBookAuthor());
                    startActivity(intent);

                    finish();
                }
        );
    }
}
