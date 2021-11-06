package indg.com.cover2protect.DB;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ>\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eJ>\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eJ\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fH\u0016J6\u0010#\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006&"}, d2 = {"Lindg/com/cover2protect/DB/DBhelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Lcom/getmedcheck/lib/MedCheckActivity;", "(Lcom/getmedcheck/lib/MedCheckActivity;)V", "allBGMData", "Landroid/database/Cursor;", "getAllBGMData", "()Landroid/database/Cursor;", "allData", "getAllData", "deleteData", "", "id", "", "insertBGMData", "", "Date", "Mmol", "High", "Low", "Type", "User_id", "SystemDate", "insertBPData", "SYS_mmHg", "DIA_mmHg", "PUL", "IHB", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "updateData", "", "Companion", "app_DevDebug"})
public class DBhelper extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "c2phealthfit.db";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TABLE_NAME_BP = "medcheck_BP";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TABLE_NAME_BGM = "medcheck_BGM";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_1 = "ID";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_2 = "SYS_mmHg";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_3 = "DIA_mmHg";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_4 = "PUL";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_5 = "IHB";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BP_6 = "Date";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BGM_1 = "Date";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BGM_2 = "Mmol";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BGM_3 = "High";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BGM_4 = "Low";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BGM_5 = "Type";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_USER_ID = "UserId";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_SYSTEM_DATE = "SystemDate";
    public static final indg.com.cover2protect.DB.DBhelper.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    public final void insertBPData(@org.jetbrains.annotations.NotNull()
    java.lang.String SYS_mmHg, @org.jetbrains.annotations.NotNull()
    java.lang.String DIA_mmHg, @org.jetbrains.annotations.NotNull()
    java.lang.String PUL, @org.jetbrains.annotations.NotNull()
    java.lang.String IHB, @org.jetbrains.annotations.NotNull()
    java.lang.String Date, @org.jetbrains.annotations.NotNull()
    java.lang.String User_id, @org.jetbrains.annotations.NotNull()
    java.lang.String SystemDate) {
    }
    
    public final void insertBGMData(@org.jetbrains.annotations.NotNull()
    java.lang.String Date, @org.jetbrains.annotations.NotNull()
    java.lang.String Mmol, @org.jetbrains.annotations.NotNull()
    java.lang.String High, @org.jetbrains.annotations.NotNull()
    java.lang.String Low, @org.jetbrains.annotations.NotNull()
    java.lang.String Type, @org.jetbrains.annotations.NotNull()
    java.lang.String User_id, @org.jetbrains.annotations.NotNull()
    java.lang.String SystemDate) {
    }
    
    /**
     * * Let's create  a method to update a row with new field values.
     */
    public final boolean updateData(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String SYS_mmHg, @org.jetbrains.annotations.NotNull()
    java.lang.String DIA_mmHg, @org.jetbrains.annotations.NotNull()
    java.lang.String PUL, @org.jetbrains.annotations.NotNull()
    java.lang.String IHB, @org.jetbrains.annotations.NotNull()
    java.lang.String Date) {
        return false;
    }
    
    /**
     * * Let's create a function to delete a given row based on the id.
     */
    public final int deleteData(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor getAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor getAllBGMData() {
        return null;
    }
    
    public DBhelper(@org.jetbrains.annotations.NotNull()
    com.getmedcheck.lib.MedCheckActivity context) {
        super(null, null, null, 0);
    }
    
    /**
     * * Let's create a companion object to hold our static fields.
     *     * A Companion object is an object that is common to all instances of a given
     *     * class.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006\u00a8\u0006%"}, d2 = {"Lindg/com/cover2protect/DB/DBhelper$Companion;", "", "()V", "COL_BGM_1", "", "getCOL_BGM_1", "()Ljava/lang/String;", "COL_BGM_2", "getCOL_BGM_2", "COL_BGM_3", "getCOL_BGM_3", "COL_BGM_4", "getCOL_BGM_4", "COL_BGM_5", "getCOL_BGM_5", "COL_BP_1", "getCOL_BP_1", "COL_BP_2", "getCOL_BP_2", "COL_BP_3", "getCOL_BP_3", "COL_BP_4", "getCOL_BP_4", "COL_BP_5", "getCOL_BP_5", "COL_BP_6", "getCOL_BP_6", "COL_SYSTEM_DATE", "getCOL_SYSTEM_DATE", "COL_USER_ID", "getCOL_USER_ID", "DATABASE_NAME", "getDATABASE_NAME", "TABLE_NAME_BGM", "getTABLE_NAME_BGM", "TABLE_NAME_BP", "getTABLE_NAME_BP", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTABLE_NAME_BP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTABLE_NAME_BGM() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BP_6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BGM_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BGM_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BGM_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BGM_4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BGM_5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_USER_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_SYSTEM_DATE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}