package indg.com.cover2protect.views.activity.registration.otp_registration_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0012\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020\u001fH\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010#\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u0007H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\u0012\u00107\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u00109\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010:\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006;"}, d2 = {"Lindg/com/cover2protect/views/activity/registration/otp_registration_activity/Registration_OTPActivity;", "Lindg/com/cover2protect/base/BaseActivity;", "Lindg/com/cover2protect/helper/SMSBroadcastReceiver$OTPReceiveListener;", "Landroid/view/View$OnClickListener;", "Lindg/com/cover2protect/navigator/response_navigator;", "()V", "KEY_IS_RESOLVING", "", "RC_HINT", "", "finalotp", "id", "mCredentialsApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMCredentialsApiClient", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMCredentialsApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "mobile", "otpReceiver", "smsBroadcast", "Lindg/com/cover2protect/helper/SMSBroadcastReceiver;", "getSmsBroadcast", "()Lindg/com/cover2protect/helper/SMSBroadcastReceiver;", "viewModel", "Lindg/com/cover2protect/viewmodel/registration/RegistrationViewModel;", "getViewModel", "()Lindg/com/cover2protect/viewmodel/registration/RegistrationViewModel;", "setViewModel", "(Lindg/com/cover2protect/viewmodel/registration/RegistrationViewModel;)V", "getIntentdata", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "msg", "onOTPReceived", "otp", "onOTPTimeOut", "onSuccess", "", "requestHint", "resendOTP", "sendData", "otp_view", "sendDatatoViewmodel", "showinfo", "it", "showtoast", "startSMSListener", "app_DevDebug"})
public final class Registration_OTPActivity extends indg.com.cover2protect.base.BaseActivity implements indg.com.cover2protect.helper.SMSBroadcastReceiver.OTPReceiveListener, android.view.View.OnClickListener, indg.com.cover2protect.navigator.response_navigator {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.viewmodel.registration.RegistrationViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.common.api.GoogleApiClient mCredentialsApiClient;
    private final java.lang.String KEY_IS_RESOLVING = "is_resolving";
    private final int RC_HINT = 2;
    private indg.com.cover2protect.helper.SMSBroadcastReceiver.OTPReceiveListener otpReceiver;
    private java.lang.String mobile;
    private java.lang.String id;
    private java.lang.String finalotp;
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.helper.SMSBroadcastReceiver smsBroadcast = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.viewmodel.registration.RegistrationViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.viewmodel.registration.RegistrationViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.common.api.GoogleApiClient getMCredentialsApiClient() {
        return null;
    }
    
    public final void setMCredentialsApiClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.helper.SMSBroadcastReceiver getSmsBroadcast() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.Object data) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void sendDatatoViewmodel() {
    }
    
    @java.lang.Override()
    public void onOTPReceived(@org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
    }
    
    private final void sendData(java.lang.String otp_view) {
    }
    
    @java.lang.Override()
    public void onOTPTimeOut() {
    }
    
    private final void resendOTP() {
    }
    
    private final void startSMSListener() {
    }
    
    private final void requestHint() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getIntentdata() {
    }
    
    private final void showtoast(java.lang.String it) {
    }
    
    private final void showinfo(java.lang.String it) {
    }
    
    public Registration_OTPActivity() {
        super();
    }
}