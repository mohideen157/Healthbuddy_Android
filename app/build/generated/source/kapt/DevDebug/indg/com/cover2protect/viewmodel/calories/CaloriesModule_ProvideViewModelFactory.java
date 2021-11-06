// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.viewmodel.calories;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import javax.inject.Provider;

public final class CaloriesModule_ProvideViewModelFactory implements Factory<CaloriesViewModel> {
  private final CaloriesModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public CaloriesModule_ProvideViewModelFactory(
      CaloriesModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public CaloriesViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static CaloriesViewModel provideInstance(
      CaloriesModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static CaloriesModule_ProvideViewModelFactory create(
      CaloriesModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new CaloriesModule_ProvideViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static CaloriesViewModel proxyProvideViewModel(
      CaloriesModule instance,
      DataManager dataManager,
      ApiService apiService,
      HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.ProvideViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}