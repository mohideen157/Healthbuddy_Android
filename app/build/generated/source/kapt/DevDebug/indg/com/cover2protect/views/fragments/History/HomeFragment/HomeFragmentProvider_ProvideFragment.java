package indg.com.cover2protect.views.fragments.History.HomeFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.Device2.HomeModule;

@Module(subcomponents = HomeFragmentProvider_ProvideFragment.HomeFragmentSubcomponent.class)
public abstract class HomeFragmentProvider_ProvideFragment {
  private HomeFragmentProvider_ProvideFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HomeModule.class)
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
  }
}
