// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.viewmodel.forgotpasswordvm;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import indg.com.cover2protect.presenter.ApiService;
import indg.com.cover2protect.presenter.DataManager;
import indg.com.cover2protect.util.HeaderData;
import javax.inject.Provider;

public final class ForgotPassProvider_ProvideViewModelFactory
    implements Factory<ForgotPasswordViewModel> {
  private final ForgotPassProvider module;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<ApiService> apiServiceProvider;

  private final Provider<HeaderData> headerDataProvider;

  public ForgotPassProvider_ProvideViewModelFactory(
      ForgotPassProvider module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    this.module = module;
    this.dataManagerProvider = dataManagerProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.headerDataProvider = headerDataProvider;
  }

  @Override
  public ForgotPasswordViewModel get() {
    return provideInstance(module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static ForgotPasswordViewModel provideInstance(
      ForgotPassProvider module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return proxyProvideViewModel(
        module, dataManagerProvider.get(), apiServiceProvider.get(), headerDataProvider.get());
  }

  public static ForgotPassProvider_ProvideViewModelFactory create(
      ForgotPassProvider module,
      Provider<DataManager> dataManagerProvider,
      Provider<ApiService> apiServiceProvider,
      Provider<HeaderData> headerDataProvider) {
    return new ForgotPassProvider_ProvideViewModelFactory(
        module, dataManagerProvider, apiServiceProvider, headerDataProvider);
  }

  public static ForgotPasswordViewModel proxyProvideViewModel(
      ForgotPassProvider instance,
      DataManager dataManager,
      ApiService apiService,
      HeaderData headerData) {
    return Preconditions.checkNotNull(
        instance.provideViewModel(dataManager, apiService, headerData),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}