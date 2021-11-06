package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.Device2.HomeModule;
import indg.com.cover2protect.views.activity.device2.HistoryActivity;
import indg.com.cover2protect.views.fragments.History.AccountFragment.AccountFragmentProvider;
import indg.com.cover2protect.views.fragments.History.DeviceFragment.DeviceFragmentProvider;
import indg.com.cover2protect.views.fragments.History.ExcerciseFragment.ExcerciseFragmentProvider;
import indg.com.cover2protect.views.fragments.History.HomeFragment.HomeFragmentProvider;

@Module(subcomponents = ActivityBuilder_ProvidehomeViewModel.HistoryActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvidehomeViewModel {
  private ActivityBuilder_ProvidehomeViewModel() {}

  @Binds
  @IntoMap
  @ActivityKey(HistoryActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HistoryActivitySubcomponent.Builder builder);

  @Subcomponent(
    modules = {
      HomeModule.class,
      AccountFragmentProvider.class,
      DeviceFragmentProvider.class,
      ExcerciseFragmentProvider.class,
      HomeFragmentProvider.class
    }
  )
  public interface HistoryActivitySubcomponent extends AndroidInjector<HistoryActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HistoryActivity> {}
  }
}
