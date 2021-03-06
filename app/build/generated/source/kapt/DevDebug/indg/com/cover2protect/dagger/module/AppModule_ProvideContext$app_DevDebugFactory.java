// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.dagger.module;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideContext$app_DevDebugFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideContext$app_DevDebugFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return provideInstance(module, applicationProvider);
  }

  public static Context provideInstance(
      AppModule module, Provider<Application> applicationProvider) {
    return proxyProvideContext$app_DevDebug(module, applicationProvider.get());
  }

  public static AppModule_ProvideContext$app_DevDebugFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideContext$app_DevDebugFactory(module, applicationProvider);
  }

  public static Context proxyProvideContext$app_DevDebug(
      AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideContext$app_DevDebug(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
