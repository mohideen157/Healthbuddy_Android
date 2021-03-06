// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.views.activity.registration;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import indg.com.cover2protect.viewmodel.registerviewmodel.RegisterViewModel;
import javax.inject.Provider;

public final class RegisterModule_ProvideRegisterViewModelFactory
    implements Factory<RegisterViewModel> {
  private final RegisterModule module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public RegisterModule_ProvideRegisterViewModelFactory(
      RegisterModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public RegisterViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static RegisterViewModel provideInstance(
      RegisterModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideRegisterViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static RegisterModule_ProvideRegisterViewModelFactory create(
      RegisterModule module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new RegisterModule_ProvideRegisterViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static RegisterViewModel proxyProvideRegisterViewModel(
      RegisterModule instance,
      DataManager dataManager,
      ApiService apiService,
      HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.provideRegisterViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
