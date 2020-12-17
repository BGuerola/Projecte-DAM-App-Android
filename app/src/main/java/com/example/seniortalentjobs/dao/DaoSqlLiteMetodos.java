package com.example.seniortalentjobs.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.Toast;

import com.example.seniortalentjobs.utilidades.Commons;

public class DaoSqlLiteMetodos {

    public static void registrarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText  idEmp, EditText idCand,
                                         EditText dataMiss, EditText missatge) {

        SQLiteDatabase db = uno.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Commons.CAMPO_IDMENS, idMens.getText().toString());
        values.put(Commons.CAMPO_IDEMP, idEmp.getText().toString());
        values.put(Commons.CAMPO_IDCAND, idCand.getText().toString());
        values.put(Commons.CAMPO_DATAMISS, dataMiss.getText().toString());
        values.put(Commons.CAMPO_MENSAJE, missatge.getText().toString());

        Long idResultante = db.insert(Commons.TABLA_MENSAJES, Commons.CAMPO_IDMENS, values);
        db.close();
    }

    public static void consultarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText idCand,
                                         EditText dataMiss, EditText missatge) {
        SQLiteDatabase db = uno.getReadableDatabase();
        String[] parametros= {idMens.getText().toString()};
        String[] campos={Commons.CAMPO_IDEMP,Commons.CAMPO_IDCAND,Commons.CAMPO_DATAMISS,Commons.CAMPO_MENSAJE};

        try {
            Cursor cursor = db.query(Commons.TABLA_MENSAJES, campos, Commons.CAMPO_IDMENS + "=?", parametros, null, null, null);
            cursor.moveToFirst();
            idEmp.setText(cursor.getString(0));
            idCand.setText(cursor.getString(1));
            dataMiss.setText(cursor.getString(2));
            missatge.setText(cursor.getString(3));
            cursor.close();
        }catch (Exception e){
            System.out.println("El elemento no existe");
            missatge.setText("No existe mensaje");
            idEmp.setText(" ");
            idCand.setText(" ");
            dataMiss.setText(" ");
        }
        db.close();
    }

    public static void actualizarMensajes (ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText idCand,
                                           EditText dataMiss, EditText missatge) {

        SQLiteDatabase db = uno.getWritableDatabase();
        String[] parametros= {idMens.getText().toString()};

        ContentValues values = new ContentValues();
        values.put(Commons.CAMPO_IDMENS, idMens.getText().toString());
        values.put(Commons.CAMPO_IDEMP, idEmp.getText().toString());
        values.put(Commons.CAMPO_IDCAND, idCand.getText().toString());
        values.put(Commons.CAMPO_DATAMISS, dataMiss.getText().toString());
        values.put(Commons.CAMPO_MENSAJE, missatge.getText().toString());

        db.update(Commons.TABLA_MENSAJES, values, Commons.CAMPO_IDMENS+"=?",parametros);
        db.close();
    }

    public static void eliminarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText idCand,
                                        EditText dataMiss, EditText missatge) {

        SQLiteDatabase db = uno.getWritableDatabase();
        String[] parametros= {idMens.getText().toString()};

        db.delete(Commons.TABLA_MENSAJES, Commons.CAMPO_IDMENS+"=?",parametros);
        db.close();
    }
}
