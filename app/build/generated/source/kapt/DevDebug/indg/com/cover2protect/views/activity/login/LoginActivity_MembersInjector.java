// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.views.activity.login;

import dagger.MembersInjector;
import indg.com.cover2protect.util.HeaderData;
import indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel;
import javax.inject.Provider;

public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginViewModel> viewmodelProvider;

  private final Provider<HeaderData> headerDataProvider;

  public LoginActivity_MembersInjector(
      Provider<LoginViewModel> viewmodelProvider, Provider<HeaderData> headerDataProvider) {
    this.viewmodelProvider = viewmodelProvider;
    this.headerDataProvider = headerDataProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginViewModel> viewmodelProvider, Provider<HeaderData> headerDataProvider) {
    return new LoginActivity_MembersInjector(viewmodelProvider, headerDataProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectViewmodel(instance, viewmodelProvider.get());
    injectHeaderData(instance, headerDataProvider.get());
  }

  public static void injectViewmodel(LoginActivity instance, LoginViewModel viewmodel) {
    instance.viewmodel = viewmodel;
  }

  public static void injectHeaderData(LoginActivity instance, HeaderData headerData) {
    instance.headerData = headerData;
  }
}
