package com.example.pc_win_10.parcialdispos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    private Toolbar toolbar;
    producto obj;
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.menu);
        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void irProducto(View h){
        obj = new producto();
        android.support.v4.app.FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.add(R.id.frameMenu,obj);
        transition.commit();

    }
    

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cliente:
                Toast.makeText(this, "Cliente", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.producto:

                return  true;
            case R.id.venta:
                Toast.makeText(this, "Venta", Toast.LENGTH_SHORT).show();
                return  true;


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }


    }


}
