package mx.edu.ittepic.miriambarajas.tpdm_u2_practica1_garayperezmarco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AseguradoraBD extends SQLiteOpenHelper {
    public AseguradoraBD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PROPIETARIO(TELEFONO VARCHAR(20) PRIMARY KEY NOT NULL," +
                "NOMBRE VARCHAR(200), FECHA VARCHAR(200) )");
        db.execSQL("CREATE TABLE SEGURO( IDSEGURO VARCHAR(20) PRIMARY KEY NOT NULL," +
                "DESCRIPCION VARCHAR(200) NOT NULL, FECHA VARCHAR(20), TIPO INT, TELEFONO VARCHAR(20)," +
                "FOREIGN KEY (TELEFONO) REFERENCES PROPIETARIO (TELEFONO))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
