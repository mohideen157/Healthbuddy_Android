package indg.com.cover2protect.views.fragments.History.DeviceFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.Device2.HomeModule;

@Module(subcomponents = DeviceFragmentProvider_ProvideFragment.DeviceFragmentSubcomponent.class)
public abstract class DeviceFragmentProvider_ProvideFragment {
  private DeviceFragmentProvider_ProvideFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(DeviceFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      DeviceFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HomeModule.class)
  public interface DeviceFragmentSubcomponent extends AndroidInjector<DeviceFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DeviceFragment> {}
  }
}
