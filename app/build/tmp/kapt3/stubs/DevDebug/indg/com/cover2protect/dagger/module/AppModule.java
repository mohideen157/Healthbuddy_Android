package indg.com.cover2protect.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0001\u00a2\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001\u00a2\u0006\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lindg/com/cover2protect/dagger/module/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideContext$app_DevDebug", "provideDataManager", "Lindg/com/cover2protect/presenter/DataManager;", "appDataManager", "Lindg/com/cover2protect/helper/AppDataManager;", "provideDataManager$app_DevDebug", "provideGson", "Lcom/google/gson/Gson;", "provideGson$app_DevDebug", "provideHeader", "Lindg/com/cover2protect/util/HeaderData;", "provideHeader$app_DevDebug", "providePreferenceName", "", "providePreferenceName$app_DevDebug", "providePreferencesHelper", "Lindg/com/cover2protect/presenter/PreferencesHelper;", "appPreferencesHelper", "Lindg/com/cover2protect/helper/AppPreferenceHelper;", "providePreferencesHelper$app_DevDebug", "app_DevDebug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_DevDebug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final indg.com.cover2protect.presenter.DataManager provideDataManager$app_DevDebug(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.helper.AppDataManager appDataManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @indg.com.cover2protect.dagger.PreferenceInfo()
    @dagger.Provides()
    public final java.lang.String providePreferenceName$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final indg.com.cover2protect.presenter.PreferencesHelper providePreferencesHelper$app_DevDebug(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.helper.AppPreferenceHelper appPreferencesHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final indg.com.cover2protect.util.HeaderData provideHeader$app_DevDebug() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}