package indg.com.cover2protect.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u00182\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010-\u001a\u00020 H\u0016J\u001a\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u00100\u001a\u00020 R0\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0019\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00062"}, d2 = {"Lindg/com/cover2protect/base/BaseFragmentBinding;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lindg/com/cover2protect/base/BaseActivityBinding;", "baseActivity", "getBaseActivity", "()Lindg/com/cover2protect/base/BaseActivityBinding;", "setBaseActivity", "(Lindg/com/cover2protect/base/BaseActivityBinding;)V", "bindingVariable", "", "getBindingVariable", "()I", "isNetworkConnected", "", "()Z", "layoutId", "getLayoutId", "mProgressDialog", "Landroid/app/ProgressDialog;", "mRootView", "Landroid/view/View;", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "hideKeyboard", "", "hideLoading", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onViewCreated", "view", "showLoading", "Callback", "app_DevDebug"})
public abstract class BaseFragmentBinding<T extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private indg.com.cover2protect.base.BaseActivityBinding<?> baseActivity;
    private android.view.View mRootView;
    @org.jetbrains.annotations.Nullable()
    private T viewDataBinding;
    private android.app.ProgressDialog mProgressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.base.BaseActivityBinding<?> getBaseActivity() {
        return null;
    }
    
    private final void setBaseActivity(indg.com.cover2protect.base.BaseActivityBinding<?> p0) {
    }
    
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
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void hideKeyboard() {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public BaseFragmentBinding() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lindg/com/cover2protect/base/BaseFragmentBinding$Callback;", "", "onFragmentAttached", "", "onFragmentDetached", "tag", "", "app_DevDebug"})
    public static abstract interface Callback {
        
        public abstract void onFragmentAttached();
        
        public abstract void onFragmentDetached(@org.jetbrains.annotations.NotNull()
        java.lang.String tag);
    }
}