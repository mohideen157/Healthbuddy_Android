package indg.com.cover2protect.views.activity.deviceConnection.bpMonitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lindg/com/cover2protect/views/activity/deviceConnection/bpMonitor/ActBpDisplay;", "Lcom/getmedcheck/lib/MedCheckActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "dbHelper", "Lindg/com/cover2protect/DB/DBhelper;", "listHistory", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/baseAeglOrbs/BpObj;", "getListHistory", "()Ljava/util/ArrayList;", "listPulse", "", "getListPulse", "getDBDataAll", "", "mUpdateDatas", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "p0", "Landroid/view/MenuItem;", "onStart", "app_DevDebug"})
public final class ActBpDisplay extends com.getmedcheck.lib.MedCheckActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    private final indg.com.cover2protect.DB.DBhelper dbHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.BpObj> listHistory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.Integer> listPulse = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.BpObj> getListHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getListPulse() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void mUpdateDatas() {
    }
    
    private final void getDBDataAll() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public ActBpDisplay() {
        super();
    }
}