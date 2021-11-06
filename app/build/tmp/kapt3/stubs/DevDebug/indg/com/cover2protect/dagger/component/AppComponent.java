package indg.com.cover2protect.dagger.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lindg/com/cover2protect/dagger/component/AppComponent;", "", "inject", "", "app", "Lindg/com/cover2protect/views/application/Cover2ProtectApp;", "Builder", "app_DevDebug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, indg.com.cover2protect.dagger.module.NetworkModule.class, indg.com.cover2protect.dagger.module.AppModule.class, indg.com.cover2protect.dagger.builder.ActivityBuilder.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.views.application.Cover2ProtectApp app);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lindg/com/cover2protect/dagger/component/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lindg/com/cover2protect/dagger/component/AppComponent;", "app_DevDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract indg.com.cover2protect.dagger.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract indg.com.cover2protect.dagger.component.AppComponent build();
    }
}