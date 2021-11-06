package indg.com.cover2protect.views.fragments.History.AccountFragment;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010/\u001a\u00020\u0011H\u0002J\b\u00100\u001a\u00020\fH\u0002J\b\u00101\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020\u0006H\u0002J\u0010\u00104\u001a\u00020,2\u0006\u00103\u001a\u00020\u0006H\u0002J\b\u00105\u001a\u00020,H\u0002J\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020,H\u0002J\u0012\u00108\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u0011H\u0004J\u0010\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020\fH\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lindg/com/cover2protect/views/fragments/History/AccountFragment/AccountFragment;", "Lindg/com/cover2protect/base/BaseFragmentBinding;", "Lindg/com/cover2protect/databinding/FragmentAccountBinding;", "Landroid/view/View$OnClickListener;", "()V", "bColor", "", "bOpen", "bSave", "bStart", "binding", "bindingVariable", "", "getBindingVariable", "()I", "countStep", "curMac", "", "getCurMac", "()Ljava/lang/String;", "setCurMac", "(Ljava/lang/String;)V", "data", "deviceName", "layoutId", "getLayoutId", "llConnect", "Landroid/widget/LinearLayout;", "mIsBound", "mService", "Lcom/sxr/sdk/ble/keepfit/aidl/IRemoteService;", "mServiceCallback", "Lcom/sxr/sdk/ble/keepfit/aidl/IServiceCallback$Stub;", "mServiceConnection", "Landroid/content/ServiceConnection;", "macAddress", "messageHandler", "Landroid/os/Handler;", "pathLog", "sdf", "Ljava/text/SimpleDateFormat;", "sleepcount", "updateConnectStateHandler", "callRemoteConnect", "", "name", "mac", "callRemoteGetConnectedDevice", "callRemoteIsAuthrize", "callRemoteIsConnected", "callRemoteOpenBlood", "enable", "callRemoteSetHeartRateMode", "callgetCurSportData", "getIntentData", "initView", "onClick", "v", "Landroid/view/View;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "title", "content", "updateConnectState", "state", "Companion", "app_DevDebug"})
public final class AccountFragment extends indg.com.cover2protect.base.BaseFragmentBinding<indg.com.cover2protect.databinding.FragmentAccountBinding> implements android.view.View.OnClickListener {
    private com.sxr.sdk.ble.keepfit.aidl.IRemoteService mService;
    private boolean mIsBound;
    private final int countStep = 0;
    private final java.lang.String data = "";
    private android.widget.LinearLayout llConnect;
    private java.lang.String deviceName;
    private java.lang.String macAddress;
    private final java.lang.String pathLog = "/jyClient/log/";
    private final boolean bSave = true;
    private int sleepcount;
    private boolean bStart;
    private android.os.Handler updateConnectStateHandler;
    private boolean bColor;
    private final java.text.SimpleDateFormat sdf = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String curMac;
    private boolean bOpen;
    private indg.com.cover2protect.databinding.FragmentAccountBinding binding;
    private final android.content.ServiceConnection mServiceConnection = null;
    private final com.sxr.sdk.ble.keepfit.aidl.IServiceCallback.Stub mServiceCallback = null;
    private final android.os.Handler messageHandler = null;
    public static final indg.com.cover2protect.views.fragments.History.AccountFragment.AccountFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.String getCurMac() {
        return null;
    }
    
    protected final void setCurMac(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void getIntentData() {
    }
    
    protected final void updateConnectState(int state) {
    }
    
    protected final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    private final boolean callRemoteIsConnected() {
        return false;
    }
    
    private final java.lang.String callRemoteGetConnectedDevice() {
        return null;
    }
    
    private final void callRemoteConnect(java.lang.String name, java.lang.String mac) {
    }
    
    private final int callRemoteIsAuthrize() {
        return 0;
    }
    
    private final void callRemoteOpenBlood(boolean enable) {
    }
    
    private final void callRemoteSetHeartRateMode(boolean enable) {
    }
    
    private final void callgetCurSportData() {
    }
    
    public AccountFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lindg/com/cover2protect/views/fragments/History/AccountFragment/AccountFragment$Companion;", "", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}