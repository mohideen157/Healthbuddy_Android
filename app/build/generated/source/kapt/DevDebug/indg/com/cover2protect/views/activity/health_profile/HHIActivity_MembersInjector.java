// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.views.activity.health_profile;

import dagger.MembersInjector;
import indg.com.cover2protect.viewmodel.hhi.HHIViewmodel;
import javax.inject.Provider;

public final class HHIActivity_MembersInjector implements MembersInjector<HHIActivity> {
  private final Provider<HHIViewmodel> viewmodelProvider;

  public HHIActivity_MembersInjector(Provider<HHIViewmodel> viewmodelProvider) {
    this.viewmodelProvider = viewmodelProvider;
  }

  public static MembersInjector<HHIActivity> create(Provider<HHIViewmodel> viewmodelProvider) {
    return new HHIActivity_MembersInjector(viewmodelProvider);
  }

  @Override
  public void injectMembers(HHIActivity instance) {
    injectViewmodel(instance, viewmodelProvider.get());
  }

  public static void injectViewmodel(HHIActivity instance, HHIViewmodel viewmodel) {
    instance.viewmodel = viewmodel;
  }
}
