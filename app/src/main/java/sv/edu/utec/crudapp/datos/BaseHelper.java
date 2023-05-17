package sv.edu.utec.crudapp.datos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {
    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="BDTIENDA.db";
    public static final String NOMBRE_TABLAPR="t_provedores";
    private static final String NOMBRE_TABLAcl="t_clientes";
    private static final String NOMBRE_TABLApr="t_productos";

    public BaseHelper(@Nullable Context context) {

        super(context, NOMBRE_BASE, null, VERSION_BASEDATOS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+NOMBRE_TABLAPR+" ("+
                "CODPROV INTEGER PRIMARY KEY AUTOINCREMENT ,"+
                "NOMPROV TEXT NOT NULL ,"+
                "TELPROV TEXT NOT NULL ,"+
                "CORPROV TEXT NOT NULL"
                +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+NOMBRE_TABLAPR);
        /*adicion de creacion base de datos 03052023*/
        onCreate(db);
        /*adicion de creacion base de datos 03052023*/
    }
}
