// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.viewmodel.Device2;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import javax.inject.Provider;

public final class HomeModule_ProvideViewModelFactory implements Factory<HomeViewModel> {
  private final HomeModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public HomeModule_ProvideViewModelFactory(
      HomeModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public HomeViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static HomeViewModel provideInstance(
      HomeModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static HomeModule_ProvideViewModelFactory create(
      HomeModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new HomeModule_ProvideViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static HomeViewModel proxyProvideViewModel(
      HomeModule instance, DataManager dataManager, ApiService apiService, HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.ProvideViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
