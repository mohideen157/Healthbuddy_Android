package indg.com.cover2protect.views.activity.scandevice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lindg/com/cover2protect/views/activity/scandevice/ScanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Lindg/com/cover2protect/events/device_select_listener;", "()V", "TAG", "", "adapter", "Lindg/com/cover2protect/adapter/device_list/devicelistadapter;", "binding", "Lindg/com/cover2protect/databinding/FragmentScanDeviceBinding;", "deviceList", "Ljava/util/ArrayList;", "Lcom/ficat/easyble/BleDevice;", "devicename", "macAddress", "manager", "Lcom/ficat/easyble/BleManager;", "ScanDevices", "", "SetDeviceIntent", "initBleManager", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSelect", "name", "address", "showAlertDialog", "layout", "", "showDevicesByRv", "startScan", "app_DevDebug"})
public final class ScanActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, indg.com.cover2protect.events.device_select_listener {
    private indg.com.cover2protect.databinding.FragmentScanDeviceBinding binding;
    private com.ficat.easyble.BleManager manager;
    private final java.util.ArrayList<com.ficat.easyble.BleDevice> deviceList = null;
    private indg.com.cover2protect.adapter.device_list.devicelistadapter adapter;
    private final java.lang.String TAG = "Cover2protect";
    private java.lang.String devicename;
    private java.lang.String macAddress;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initBleManager() {
    }
    
    private final void ScanDevices() {
    }
    
    private final void startScan() {
    }
    
    private final void showDevicesByRv() {
    }
    
    private final void SetDeviceIntent(java.lang.String devicename, java.lang.String macAddress) {
    }
    
    private final void showAlertDialog(int layout) {
    }
    
    public ScanActivity() {
        super();
    }
}