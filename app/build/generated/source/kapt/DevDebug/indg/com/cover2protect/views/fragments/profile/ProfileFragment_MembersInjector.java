// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.views.fragments.profile;

import dagger.MembersInjector;
import indg.com.cover2protect.viewmodel.mainprofileviewmodel.ProfileViewModel;
import javax.inject.Provider;

public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<ProfileViewModel> viewmodelProvider;

  public ProfileFragment_MembersInjector(Provider<ProfileViewModel> viewmodelProvider) {
    this.viewmodelProvider = viewmodelProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<ProfileViewModel> viewmodelProvider) {
    return new ProfileFragment_MembersInjector(viewmodelProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectViewmodel(instance, viewmodelProvider.get());
  }

  public static void injectViewmodel(ProfileFragment instance, ProfileViewModel viewmodel) {
    instance.viewmodel = viewmodel;
  }
}
