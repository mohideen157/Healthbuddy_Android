package indg.com.cover2protect.views.activity.deviceConnection.bpMonitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 42\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J@\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0012H\u0002J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0014J \u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001aH\u0014J\b\u00101\u001a\u00020\u001aH\u0014J\b\u00102\u001a\u00020\u001aH\u0014J\b\u00103\u001a\u00020\u001aH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lindg/com/cover2protect/views/activity/deviceConnection/bpMonitor/ActBpChooseDevice;", "Lcom/getmedcheck/lib/MedCheckActivity;", "Lindg/com/cover2protect/views/activity/deviceConnection/OnItemClickListener;", "Lcom/getmedcheck/lib/model/BleDevice;", "()V", "dbHelper", "Lindg/com/cover2protect/DB/DBhelper;", "listHistory", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/baseAeglOrbs/BpObj;", "getListHistory", "()Ljava/util/ArrayList;", "mBtnGetDBData", "Landroid/widget/Button;", "mBtnStartScan", "mBtnStopScan", "mDeviceHashMap", "Ljava/util/HashMap;", "", "mLlProgressLayout", "Landroid/widget/LinearLayout;", "mRvScanResult", "Landroidx/recyclerview/widget/RecyclerView;", "mScanResultAdapter", "Lindg/com/cover2protect/views/activity/deviceConnection/bpMonitor/AdapterBpDeviceScanner;", "getBPHistoryData", "", "initViews", "mPushBpData", "systolic", "diastolic", "heartRate", "ihb", "PhoneDateTime", "userId", "systemDateTime", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeviceScanResult", "scanResult", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "onItemClick", "view", "Landroid/view/View;", "object", "position", "", "onPermissionGrantedAndBluetoothOn", "onResume", "onStart", "startScan", "Companion", "app_DevDebug"})
public final class ActBpChooseDevice extends com.getmedcheck.lib.MedCheckActivity implements indg.com.cover2protect.views.activity.deviceConnection.OnItemClickListener<com.getmedcheck.lib.model.BleDevice> {
    private final java.util.HashMap<java.lang.String, com.getmedcheck.lib.model.BleDevice> mDeviceHashMap = null;
    private androidx.recyclerview.widget.RecyclerView mRvScanResult;
    private android.widget.Button mBtnStartScan;
    private android.widget.Button mBtnStopScan;
    private android.widget.Button mBtnGetDBData;
    private android.widget.LinearLayout mLlProgressLayout;
    private indg.com.cover2protect.views.activity.deviceConnection.bpMonitor.AdapterBpDeviceScanner mScanResultAdapter;
    private final indg.com.cover2protect.DB.DBhelper dbHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.BpObj> listHistory = null;
    private static final java.lang.String TAG = null;
    public static final indg.com.cover2protect.views.activity.deviceConnection.bpMonitor.ActBpChooseDevice.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<indg.com.cover2protect.baseAeglOrbs.BpObj> getListHistory() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void getBPHistoryData() {
    }
    
    private final void mPushBpData(java.lang.String systolic, java.lang.String diastolic, java.lang.String heartRate, java.lang.String ihb, java.lang.String PhoneDateTime, java.lang.String userId, java.lang.String systemDateTime) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDeviceScanResult(@org.jetbrains.annotations.NotNull()
    no.nordicsemi.android.support.v18.scanner.ScanResult scanResult) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.getmedcheck.lib.model.BleDevice object, int position) {
    }
    
    @java.lang.Override()
    protected void startScan() {
    }
    
    @java.lang.Override()
    protected void onPermissionGrantedAndBluetoothOn() {
    }
    
    public ActBpChooseDevice() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lindg/com/cover2protect/views/activity/deviceConnection/bpMonitor/ActBpChooseDevice$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_DevDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}