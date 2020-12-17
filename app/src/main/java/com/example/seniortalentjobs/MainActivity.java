package com.example.seniortalentjobs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.seniortalentjobs.dao.DaoRetrofitMetodos;
import com.example.seniortalentjobs.utilidades.Commons;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    DaoRetrofitMetodos provesRetrofit = new DaoRetrofitMetodos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        SharedPreferences prefs = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String b = prefs.getString("email", "No existe información");
        //navigationView.setNavigationItemSelectedListener();
        ImageView fotousuario= (ImageView) navigationView.getHeaderView(0).findViewById(R.id.imageView);
        TextView txtV_Username = (TextView) navigationView.getHeaderView(0).findViewById(R.id.tituloheader);
        TextView txtV_Email = (TextView) navigationView.getHeaderView(0).findViewById(R.id.subtituloheader);
        fotousuario.setImageResource(R.drawable.logohorizontal);
        txtV_Username.setText(Commons.nomUsuari);
        txtV_Email.setText(b);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_buscarofertas, R.id.nav_candidaturas, R.id.nav_alertas, R.id.nav_notificaciones,
                R.id.nav_ofertasfavoritas, R.id.nav_mensajes, R.id.nav_micv)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void tornaraAutenticacio(MenuItem item) {
        Intent intent = new Intent(this, AutenticacioActivity.class);
        startActivity(intent);
    }
}