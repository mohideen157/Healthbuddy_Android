// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.viewmodel.maisenselogin;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import javax.inject.Provider;

public final class MaisenseModule_ProvideMaisenseViewModelFactory
    implements Factory<MaisenseLoginViewModel> {
  private final MaisenseModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public MaisenseModule_ProvideMaisenseViewModelFactory(
      MaisenseModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public MaisenseLoginViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static MaisenseLoginViewModel provideInstance(
      MaisenseModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideMaisenseViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static MaisenseModule_ProvideMaisenseViewModelFactory create(
      MaisenseModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new MaisenseModule_ProvideMaisenseViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static MaisenseLoginViewModel proxyProvideMaisenseViewModel(
      MaisenseModule instance,
      DataManager dataManager,
      ApiService apiService,
      HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.ProvideMaisenseViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
