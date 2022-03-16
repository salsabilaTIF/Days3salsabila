package com.example.Days3salsabila;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SEKOLAH extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listSKLH = new String[]{"MAN 2 PEKANBARU", "MAN 1 PEKANBARU", "SMA 1 PEKANBARU"
                , "SMA 2 PEKANBARU", "SMK 1 PEKANBARU"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listSKLH));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilhan = o.toString();
        tampilkanpilhan(pilhan);
    }

    private void tampilkanpilhan(String pilhan) {
        try {
            Intent a = null;
            if (pilhan.equals("MAN 2 PEKANBARU")){
                a = new Intent(this, MAN2PKU.class);


            } else if (pilhan.equals("MAN 1 PEKANBARU")) {
                a = new Intent(this, PolsekTMPN.class);

            } else if (pilhan.equals("SMA 1 PEKANBARU")) {
                a = new Intent(this, PolsekTR.class);

            } else if (pilhan.equals("SMA 2 PEKANBARU")) {
                a = new Intent(this, PolsekMDAU.class);

            } else if (pilhan.equals("SMK 1 PEKANBARU")) {
                a = new Intent(this, PolsekBKTRYA.class);
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
