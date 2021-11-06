package indg.com.cover2protect.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0019\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001a\u001a\u00020\u0011J\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00028\u0000\u00a2\u0006\u0002\u0010$R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lindg/com/cover2protect/viewmodel/BaseViewModel;", "N", "Landroidx/lifecycle/ViewModel;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "(Lindg/com/cover2protect/presenter/DataManager;)V", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "header", "mApiService", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mDataManager", "mIsLoading", "Landroidx/databinding/ObservableBoolean;", "mNavigator", "Ljava/lang/ref/WeakReference;", "mcontext", "Landroid/app/Application;", "getApiService", "getCompositeDisposable", "getDataManager", "getHeader", "getIsLoading", "getNavigator", "()Ljava/lang/Object;", "onCleared", "", "setIsLoading", "isLoading", "", "setNavigator", "navigator", "(Ljava/lang/Object;)V", "app_DevDebug"})
public abstract class BaseViewModel<N extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private indg.com.cover2protect.presenter.DataManager mDataManager;
    private indg.com.cover2protect.presenter.ApiService mApiService;
    private android.app.Application mcontext;
    private final androidx.databinding.ObservableBoolean mIsLoading = null;
    private final io.reactivex.disposables.CompositeDisposable mCompositeDisposable = null;
    private indg.com.cover2protect.util.HeaderData header;
    private java.lang.ref.WeakReference<N> mNavigator;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.HeaderData getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.presenter.DataManager getDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.presenter.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getIsLoading() {
        return null;
    }
    
    public final void setIsLoading(boolean isLoading) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final N getNavigator() {
        return null;
    }
    
    public final void setNavigator(N navigator) {
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager) {
        super();
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.HeaderData headerData) {
        super();
    }
}