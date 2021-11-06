package indg.com.cover2protect.data.database.model_db;

import java.lang.System;

@androidx.room.Entity(tableName = "MaisenseDevice")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b\u00a8\u0006$"}, d2 = {"Lindg/com/cover2protect/data/database/model_db/MaisenseDevice;", "", "()V", "AFIB", "", "getAFIB", "()Ljava/lang/String;", "setAFIB", "(Ljava/lang/String;)V", "Arrythmia", "getArrythmia", "setArrythmia", "Bp", "getBp", "setBp", "HRVLevel", "", "getHRVLevel", "()I", "setHRVLevel", "(I)V", "Heartrate", "getHeartrate", "setHeartrate", "date", "getDate", "setDate", "id", "getId", "setId", "rPWV", "getRPWV", "setRPWV", "synchedId", "getSynchedId", "setSynchedId", "app_DevDebug"})
public final class MaisenseDevice {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "heartrate")
    private java.lang.String Heartrate;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "rpwv")
    private java.lang.String rPWV;
    @androidx.room.ColumnInfo(name = "hrvlevel")
    private int HRVLevel;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "afib")
    private java.lang.String AFIB;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "arrythmia")
    private java.lang.String Arrythmia;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "bp")
    private java.lang.String Bp;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "date")
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "synchedid")
    private java.lang.String synchedId;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeartrate() {
        return null;
    }
    
    public final void setHeartrate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRPWV() {
        return null;
    }
    
    public final void setRPWV(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getHRVLevel() {
        return 0;
    }
    
    public final void setHRVLevel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAFIB() {
        return null;
    }
    
    public final void setAFIB(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArrythmia() {
        return null;
    }
    
    public final void setArrythmia(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBp() {
        return null;
    }
    
    public final void setBp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSynchedId() {
        return null;
    }
    
    public final void setSynchedId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public MaisenseDevice() {
        super();
    }
}