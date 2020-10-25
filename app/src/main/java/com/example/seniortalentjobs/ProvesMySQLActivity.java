package com.example.seniortalentjobs;

import android.os.Bundle;

import com.example.seniortalentjobs.dao.ConexionSQLiteHelper;
import com.example.seniortalentjobs.dao.DaoSqlLiteMetodos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProvesMySQLActivity extends AppCompatActivity {

    EditText campoIdMensaje, campoIdEmpresa,campoNomEmpresa,campoIdCandidato, campoDataMissatge, campoMissatge;
    //ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bdmensajes", null, 1);

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proves_my_s_q_l);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            campoIdMensaje= (EditText) findViewById(R.id.editmensajes);
            campoIdEmpresa= (EditText) findViewById(R.id.editidempresa);
            campoNomEmpresa= (EditText) findViewById(R.id.editnomempresa);
            campoIdCandidato= (EditText) findViewById(R.id.editidcandidatos);
            campoDataMissatge= (EditText) findViewById(R.id.editdatamissatges);
            campoMissatge= (EditText) findViewById(R.id.editmissatges);
    }

    public void Onclick (View view){
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bdmensajes", null, 1);
        DaoSqlLiteMetodos.registrarMensajes(conn, campoIdMensaje, campoIdEmpresa,campoNomEmpresa,campoIdCandidato,
                campoDataMissatge, campoMissatge);
        Toast.makeText(getApplicationContext(),"Registre realitzat",Toast.LENGTH_SHORT).show();
    }

    public void OnclickConsultarMensajes(View view){
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bdmensajes", null, 1);
            try {
                DaoSqlLiteMetodos.consultarMensajes(conn, campoIdMensaje, campoIdEmpresa,campoNomEmpresa,campoIdCandidato,
                        campoDataMissatge, campoMissatge);
            } catch (Exception e){
        Toast.makeText(getApplicationContext(),"El documento no existe",Toast.LENGTH_LONG).show();
        limpiarMensajes ();
    }
    }

    private void limpiarMensajes () {
        campoIdMensaje.setText("");
        campoIdEmpresa.setText("");
        campoNomEmpresa.setText("");
        campoIdCandidato.setText("");
        campoDataMissatge.setText("");
        campoMissatge.setText("");
    }

    public void OnclickActualizarMensajes(View view){
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bdmensajes", null, 1);
            DaoSqlLiteMetodos.actualizarMensajes(conn, campoIdMensaje, campoIdEmpresa,campoNomEmpresa,campoIdCandidato,
                    campoDataMissatge, campoMissatge);
            Toast.makeText(getApplicationContext(), "Ya se ha actualizado", Toast.LENGTH_LONG).show();
    }

}