package com.getmedcheck.activity.sugarMonitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/getmedcheck/activity/sugarMonitor/ActBgmDisplay;", "Lcom/getmedcheck/lib/MedCheckActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "dbHelper", "Lindg/com/cover2protect/DB/DBhelper;", "glucoseObj", "Lindg/com/cover2protect/baseAeglOrbs/ObjGlucose;", "getGlucoseObj", "()Lindg/com/cover2protect/baseAeglOrbs/ObjGlucose;", "setGlucoseObj", "(Lindg/com/cover2protect/baseAeglOrbs/ObjGlucose;)V", "listHistory", "Ljava/util/ArrayList;", "getListHistory", "()Ljava/util/ArrayList;", "getDBDataAll", "", "mGetSample", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "p0", "Landroid/view/MenuItem;", "onStart", "app_DevDebug"})
public final class ActBgmDisplay extends com.getmedcheck.lib.MedCheckActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    private final indg.com.cover2protect.DB.DBhelper dbHelper = null;
    @org.jetbrains.annotations.NotNull()
    public indg.com.cover2protect.baseAeglOrbs.ObjGlucose glucoseObj;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.ObjGlucose> listHistory = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem p0) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.baseAeglOrbs.ObjGlucose getGlucoseObj() {
        return null;
    }
    
    public final void setGlucoseObj(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.baseAeglOrbs.ObjGlucose p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.ObjGlucose> getListHistory() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void mGetSample() {
    }
    
    private final void getDBDataAll() {
    }
    
    public ActBgmDisplay() {
        super();
    }
}