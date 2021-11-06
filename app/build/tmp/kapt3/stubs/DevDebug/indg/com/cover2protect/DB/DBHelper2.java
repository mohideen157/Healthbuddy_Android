package indg.com.cover2protect.DB;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJf\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006!"}, d2 = {"Lindg/com/cover2protect/DB/DBHelper2;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "allBMIData", "Landroid/database/Cursor;", "getAllBMIData", "()Landroid/database/Cursor;", "deleteBMIData", "", "UserId", "", "insertBMIDataS", "", "WeigthKg", "BMI", "BodyFat", "MuscleMass", "VisceralFat", "BodyWater", "BoneMass", "BMR", "Target", "ToLose", "DateOfReading", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "Companion", "app_DevDebug"})
public class DBHelper2 extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "c2phealth.db";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TABLE_NAME_BMI = "medcheck_BMI";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_1 = "WeigthKg";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_2 = "BMI";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_3 = "BodyFat";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_4 = "MuscleMass";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_5 = "VisceralFat";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_6 = "BodyWater";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_7 = "BoneMass";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_8 = "BMR";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_9 = "Target";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_10 = "ToLose";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_11 = "DateOfReading";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String COL_BMI_12 = "UserId";
    public static final indg.com.cover2protect.DB.DBHelper2.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override()
    public void onUpgrade(@org.jetbrains.annotations.NotNull()
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    public final void insertBMIDataS(@org.jetbrains.annotations.NotNull()
    java.lang.String WeigthKg, @org.jetbrains.annotations.NotNull()
    java.lang.String BMI, @org.jetbrains.annotations.NotNull()
    java.lang.String BodyFat, @org.jetbrains.annotations.NotNull()
    java.lang.String MuscleMass, @org.jetbrains.annotations.NotNull()
    java.lang.String VisceralFat, @org.jetbrains.annotations.NotNull()
    java.lang.String BodyWater, @org.jetbrains.annotations.NotNull()
    java.lang.String BoneMass, @org.jetbrains.annotations.NotNull()
    java.lang.String BMR, @org.jetbrains.annotations.NotNull()
    java.lang.String Target, @org.jetbrains.annotations.NotNull()
    java.lang.String ToLose, @org.jetbrains.annotations.NotNull()
    java.lang.String DateOfReading, @org.jetbrains.annotations.NotNull()
    java.lang.String UserId) {
    }
    
    /**
     * * Let's create a function to delete a given row based on the id.
     */
    public final int deleteBMIData(@org.jetbrains.annotations.NotNull()
    java.lang.String UserId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.database.Cursor getAllBMIData() {
        return null;
    }
    
    public DBHelper2(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    /**
     * * Let's create a companion object to hold our static fields.
     *     * A Companion object is an object that is common to all instances of a given
     *     * class.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006\u00a8\u0006!"}, d2 = {"Lindg/com/cover2protect/DB/DBHelper2$Companion;", "", "()V", "COL_BMI_1", "", "getCOL_BMI_1", "()Ljava/lang/String;", "COL_BMI_10", "getCOL_BMI_10", "COL_BMI_11", "getCOL_BMI_11", "COL_BMI_12", "getCOL_BMI_12", "COL_BMI_2", "getCOL_BMI_2", "COL_BMI_3", "getCOL_BMI_3", "COL_BMI_4", "getCOL_BMI_4", "COL_BMI_5", "getCOL_BMI_5", "COL_BMI_6", "getCOL_BMI_6", "COL_BMI_7", "getCOL_BMI_7", "COL_BMI_8", "getCOL_BMI_8", "COL_BMI_9", "getCOL_BMI_9", "DATABASE_NAME", "getDATABASE_NAME", "TABLE_NAME_BMI", "getTABLE_NAME_BMI", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTABLE_NAME_BMI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCOL_BMI_12() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}