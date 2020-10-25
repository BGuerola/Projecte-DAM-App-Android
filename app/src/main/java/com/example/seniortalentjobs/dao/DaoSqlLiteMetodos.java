package com.example.seniortalentjobs.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import com.example.seniortalentjobs.utilidades.Utilidades;

public class DaoSqlLiteMetodos {

    public static void registrarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText  idEmp, EditText nomEmp, EditText idCand,
                                         EditText dataMiss, EditText missatge) {
        //ConexionSQLiteHelper conn=new ConexionSQLiteHelper(context,"bd_usuarios",null,1);

        SQLiteDatabase db = uno.getWritableDatabase();

        //insert into usuario (id,nombre,telefono) values (123,'Cristian','85665223')

/*        String insert="INSERT INTO "+ Utilidades.TABLA_USUARIO
                +" ( " +Utilidades.CAMPO_NOMBRE+","+Utilidades.CAMPO_CONTRASENYA+","+Utilidades.CAMPO_EMAIL+")" +
                " VALUES ("+nom.getText().toString()+", '"+contrase.getText().toString()+"','"
                +mail.getText().toString()+"')";

        db.execSQL(insert);*/

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_IDMENS, idMens.getText().toString());
        values.put(Utilidades.CAMPO_IDEMP, idEmp.getText().toString());
        values.put(Utilidades.CAMPO_NOMEMPRESA, nomEmp.getText().toString());
        values.put(Utilidades.CAMPO_IDCAND, idCand.getText().toString());
        values.put(Utilidades.CAMPO_DATAMISS, dataMiss.getText().toString());
        values.put(Utilidades.CAMPO_MENSAJE, missatge.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_MENSAJES, Utilidades.CAMPO_IDEMP, values);

        //Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }

    public static void consultarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText nomEmp, EditText idCand,
                                         EditText dataMiss, EditText missatge) {
        SQLiteDatabase db = uno.getReadableDatabase();
        String[] parametros= {idMens.getText().toString()};
        String[] campos={Utilidades.CAMPO_IDEMP,Utilidades.CAMPO_IDCAND};

        Cursor cursor =db.query(Utilidades.TABLA_MENSAJES,campos,Utilidades.CAMPO_IDMENS+"=?",parametros,null,null,null);
        cursor.moveToFirst();
        idEmp.setText(cursor.getString(0));
        nomEmp.setText(cursor.getString(1));
        idCand.setText(cursor.getString(2));
        dataMiss.setText(cursor.getString(3));
        missatge.setText(cursor.getString(4));

        cursor.close();
    }

    public static void actualizarMensajes (ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText nomEmp, EditText idCand,
                                           EditText dataMiss, EditText missatge) {

        SQLiteDatabase db = uno.getWritableDatabase();
        String[] parametros= {idMens.getText().toString()};

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_IDMENS, idMens.getText().toString());
        values.put(Utilidades.CAMPO_IDEMP, idEmp.getText().toString());
        values.put(Utilidades.CAMPO_NOMEMPRESA, nomEmp.getText().toString());
        values.put(Utilidades.CAMPO_IDCAND, idCand.getText().toString());
        values.put(Utilidades.CAMPO_DATAMISS, dataMiss.getText().toString());
        values.put(Utilidades.CAMPO_MENSAJE, missatge.getText().toString());

        db.update(Utilidades.TABLA_MENSAJES, values, Utilidades.CAMPO_IDMENS+"=?",parametros);
        db.close();
    }

    public static void eliminarMensajes(ConexionSQLiteHelper uno, EditText idMens, EditText idEmp, EditText nomEmp, EditText idCand,
                                        EditText dataMiss, EditText missatge) {

        SQLiteDatabase db = uno.getWritableDatabase();
        String[] parametros= {idMens.getText().toString()};

        db.delete(Utilidades.TABLA_MENSAJES, Utilidades.CAMPO_IDMENS+"=?",parametros);
    }

}
