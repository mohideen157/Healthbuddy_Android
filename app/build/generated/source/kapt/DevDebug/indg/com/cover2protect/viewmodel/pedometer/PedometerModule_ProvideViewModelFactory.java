// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.viewmodel.pedometer;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import javax.inject.Provider;

public final class PedometerModule_ProvideViewModelFactory implements Factory<PedometerViewModel> {
  private final PedometerModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public PedometerModule_ProvideViewModelFactory(
      PedometerModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public PedometerViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static PedometerViewModel provideInstance(
      PedometerModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static PedometerModule_ProvideViewModelFactory create(
      PedometerModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new PedometerModule_ProvideViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static PedometerViewModel proxyProvideViewModel(
      PedometerModule instance,
      DataManager dataManager,
      ApiService apiService,
      HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.ProvideViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}