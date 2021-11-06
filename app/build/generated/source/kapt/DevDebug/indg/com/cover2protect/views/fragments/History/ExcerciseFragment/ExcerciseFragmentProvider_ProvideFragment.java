package indg.com.cover2protect.views.fragments.History.ExcerciseFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.Device2.HomeModule;

@Module(
  subcomponents = ExcerciseFragmentProvider_ProvideFragment.ExcerciseFragmentSubcomponent.class
)
public abstract class ExcerciseFragmentProvider_ProvideFragment {
  private ExcerciseFragmentProvider_ProvideFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ExcerciseFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ExcerciseFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HomeModule.class)
  public interface ExcerciseFragmentSubcomponent extends AndroidInjector<ExcerciseFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ExcerciseFragment> {}
  }
}
