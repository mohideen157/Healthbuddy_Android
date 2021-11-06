package indg.com.cover2protect.views.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lindg/com/cover2protect/views/application/Cover2ProtectApp;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "TAG", "", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "activityInjector", "initdb", "", "isNetworkAvailable", "", "onCreate", "CustomEventListener", "app_DevDebug"})
public final class Cover2ProtectApp extends android.app.Application implements dagger.android.HasActivityInjector {
    private final java.lang.String TAG = "Cover2Protect";
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initdb() {
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
    
    public Cover2ProtectApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lindg/com/cover2protect/views/application/Cover2ProtectApp$CustomEventListener;", "Lindg/com/cover2protect/util/crash_handle/CustomActivityOnCrash$EventListener;", "()V", "onCloseAppFromErrorActivity", "", "onLaunchErrorActivity", "onRestartAppFromErrorActivity", "app_DevDebug"})
    static final class CustomEventListener implements indg.com.cover2protect.util.crash_handle.CustomActivityOnCrash.EventListener {
        
        @java.lang.Override()
        public void onLaunchErrorActivity() {
        }
        
        @java.lang.Override()
        public void onRestartAppFromErrorActivity() {
        }
        
        @java.lang.Override()
        public void onCloseAppFromErrorActivity() {
        }
        
        public CustomEventListener() {
            super();
        }
    }
}