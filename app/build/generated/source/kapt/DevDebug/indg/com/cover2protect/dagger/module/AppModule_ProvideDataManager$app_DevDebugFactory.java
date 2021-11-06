// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.dagger.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.helper.AppDataManager;
import indg.com.cover2protect.presenter.DataManager;
import javax.inject.Provider;

public final class AppModule_ProvideDataManager$app_DevDebugFactory
    implements Factory<DataManager> {
  private final AppModule module;

  private final Provider<AppDataManager> appDataManagerProvider;

  public AppModule_ProvideDataManager$app_DevDebugFactory(
      AppModule module, Provider<AppDataManager> appDataManagerProvider) {
    this.module = module;
    this.appDataManagerProvider = appDataManagerProvider;
  }

  @Override
  public DataManager get() {
    return provideInstance(module, appDataManagerProvider);
  }

  public static DataManager provideInstance(
      AppModule module, Provider<AppDataManager> appDataManagerProvider) {
    return proxyProvideDataManager$app_DevDebug(module, appDataManagerProvider.get());
  }

  public static AppModule_ProvideDataManager$app_DevDebugFactory create(
      AppModule module, Provider<AppDataManager> appDataManagerProvider) {
    return new AppModule_ProvideDataManager$app_DevDebugFactory(module, appDataManagerProvider);
  }

  public static DataManager proxyProvideDataManager$app_DevDebug(
      AppModule instance, AppDataManager appDataManager) {
    return Preconditions.checkNotNull(
        instance.provideDataManager$app_DevDebug(appDataManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}