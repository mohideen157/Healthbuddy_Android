package indg.com.cover2protect.views.activity.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0002J)\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010/2\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007\u00a2\u0006\u0002\u00101R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00062"}, d2 = {"Lindg/com/cover2protect/views/activity/login/LoginActivity;", "Lindg/com/cover2protect/base/BaseActivityBinding;", "Lindg/com/cover2protect/databinding/ActivityLoginBinding;", "Landroid/view/View$OnClickListener;", "()V", "PERMISSIONS", "", "", "[Ljava/lang/String;", "REQUEST_EXTERNAL_STORAGE", "", "binding", "bindingVariable", "getBindingVariable", "()I", "countryCodePicker", "Lcom/rilixtech/CountryCodePicker;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "getHeaderData", "()Lindg/com/cover2protect/util/HeaderData;", "setHeaderData", "(Lindg/com/cover2protect/util/HeaderData;)V", "layoutId", "getLayoutId", "showprofile", "", "viewmodel", "Lindg/com/cover2protect/viewmodel/loginviewmodel/LoginViewModel;", "getViewmodel", "()Lindg/com/cover2protect/viewmodel/loginviewmodel/LoginViewModel;", "setViewmodel", "(Lindg/com/cover2protect/viewmodel/loginviewmodel/LoginViewModel;)V", "GetDataShowProfile", "", "changeStatusBarColor", "forgot_password_Click", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showtoast", "it", "verifyPermissions", "activity", "Landroid/app/Activity;", "permissions", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "app_DevDebug"})
public final class LoginActivity extends indg.com.cover2protect.base.BaseActivityBinding<indg.com.cover2protect.databinding.ActivityLoginBinding> implements android.view.View.OnClickListener {
    private indg.com.cover2protect.databinding.ActivityLoginBinding binding;
    private final int REQUEST_EXTERNAL_STORAGE = 1;
    private java.lang.String[] PERMISSIONS;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel viewmodel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.util.HeaderData headerData;
    private boolean showprofile;
    private com.rilixtech.CountryCodePicker countryCodePicker;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void forgot_password_Click() {
    }
    
    public final boolean verifyPermissions(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.HeaderData getHeaderData() {
        return null;
    }
    
    public final void setHeaderData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void GetDataShowProfile() {
    }
    
    private final void showtoast(java.lang.String it) {
    }
    
    private final void changeStatusBarColor() {
    }
    
    public LoginActivity() {
        super();
    }
}