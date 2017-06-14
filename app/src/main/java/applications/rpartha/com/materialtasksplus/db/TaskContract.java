package applications.rpartha.com.materialtasksplus.db;

/**
 * Created by tillu on 6/9/2017.
 */

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "applications.rpartha.com.simpletasks.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}
