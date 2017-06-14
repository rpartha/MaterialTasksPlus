package applications.rpartha.com.materialtasksplus.db;

/**
 * Created by tillu on 6/9/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDatabaseHelper extends SQLiteOpenHelper {

    public TaskDatabaseHelper(Context context){
        super(context, TaskContract.DB_NAME, null, TaskContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){

        //CREATE TABLE tasks (
        //       _id INTEGER PRIMARY KEY AUTOINCREMENT,
        //       title TEXT NOT NULL
        // );

        String createTable = "CREATE TABLE " + TaskContract.TaskEntry.TABLE
                                             + " ( "
                                             + TaskContract.TaskEntry._ID
                                             + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                                             + TaskContract.TaskEntry.COL_TASK_TITLE
                                             + " TEXT NOT NULL)";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
        sqLiteDatabase.execSQL("DROP IF TABLE EXISTS " + TaskContract.TaskEntry.TABLE);
        onCreate(sqLiteDatabase);
    }
}
