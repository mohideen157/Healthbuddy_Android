package indg.com.cover2protect.dagger.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lindg/com/cover2protect/dagger/module/NetworkModule;", "", "()V", "providePostApi", "Lindg/com/cover2protect/presenter/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providePostApi$app_DevDebug", "provideRetrofitInterface", "provideRetrofitInterface$app_DevDebug", "app_DevDebug"})
@dagger.Module()
public final class NetworkModule {
    public static final indg.com.cover2protect.dagger.module.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @dagger.Reusable()
    public static final indg.com.cover2protect.presenter.ApiService providePostApi$app_DevDebug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public static final retrofit2.Retrofit provideRetrofitInterface$app_DevDebug() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}