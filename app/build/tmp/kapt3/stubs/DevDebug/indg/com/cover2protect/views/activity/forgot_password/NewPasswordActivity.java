package indg.com.cover2protect.views.activity.forgot_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lindg/com/cover2protect/views/activity/forgot_password/NewPasswordActivity;", "Lindg/com/cover2protect/base/BaseActivityBinding;", "Lindg/com/cover2protect/databinding/ActivityNewPasswordBinding;", "Landroid/view/View$OnClickListener;", "Lindg/com/cover2protect/presenter/OTPResponse;", "()V", "binding", "bindingVariable", "", "getBindingVariable", "()I", "layoutId", "getLayoutId", "mobile", "", "viewmodel", "Lindg/com/cover2protect/viewmodel/forgotpasswordvm/ForgotPasswordViewModel;", "getViewmodel", "()Lindg/com/cover2protect/viewmodel/forgotpasswordvm/ForgotPasswordViewModel;", "setViewmodel", "(Lindg/com/cover2protect/viewmodel/forgotpasswordvm/ForgotPasswordViewModel;)V", "OnError", "", "error", "OnOTP", "otp", "OnSuccess", "message", "Validation", "isValidPassword", "", "password", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "it", "app_DevDebug"})
public final class NewPasswordActivity extends indg.com.cover2protect.base.BaseActivityBinding<indg.com.cover2protect.databinding.ActivityNewPasswordBinding> implements android.view.View.OnClickListener, indg.com.cover2protect.presenter.OTPResponse {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPasswordViewModel viewmodel;
    private java.lang.String mobile;
    private indg.com.cover2protect.databinding.ActivityNewPasswordBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPasswordViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPasswordViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    private final void showToast(java.lang.String it) {
    }
    
    @java.lang.Override()
    public void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void OnOTP(@org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void Validation() {
    }
    
    public NewPasswordActivity() {
        super();
    }
}