package indg.com.cover2protect.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u001cH\u0002J#\u0010%\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\'2\u0006\u0010(\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020\u001cJ\u0006\u0010+\u001a\u00020\u001cR\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u00078gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lindg/com/cover2protect/base/BaseActivityBinding;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "Lindg/com/cover2protect/base/BaseFragmentBinding$Callback;", "()V", "bindingVariable", "", "getBindingVariable", "()I", "isNetworkConnected", "", "()Z", "layoutId", "getLayoutId", "mProgressDialog", "Landroid/app/ProgressDialog;", "<set-?>", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "hasPermission", "permission", "", "hideKeyboard", "", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentAttached", "onFragmentDetached", "tag", "performDataBinding", "requestPermissionsSafely", "permissions", "", "requestCode", "([Ljava/lang/String;I)V", "showLoading", "skip_Click", "app_DevDebug"})
public abstract class BaseActivityBinding<T extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity implements indg.com.cover2protect.base.BaseFragmentBinding.Callback {
    private android.app.ProgressDialog mProgressDialog;
    @org.jetbrains.annotations.Nullable()
    private T viewDataBinding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final T getViewDataBinding() {
        return null;
    }
    
    private final void setViewDataBinding(T p0) {
    }
    
    public abstract int getBindingVariable();
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    public final boolean isNetworkConnected() {
        return false;
    }
    
    @java.lang.Override()
    public void onFragmentAttached() {
    }
    
    @java.lang.Override()
    public void onFragmentDetached(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final boolean hasPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final void hideKeyboard() {
    }
    
    public final void hideLoading() {
    }
    
    public final void skip_Click() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final void requestPermissionsSafely(@org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, int requestCode) {
    }
    
    public final void showLoading() {
    }
    
    private final void performDataBinding() {
    }
    
    public BaseActivityBinding() {
        super();
    }
}