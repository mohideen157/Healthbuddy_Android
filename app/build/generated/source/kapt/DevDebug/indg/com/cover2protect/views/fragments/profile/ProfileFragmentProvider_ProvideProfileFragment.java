package indg.com.cover2protect.views.fragments.profile;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.mainprofileviewmodel.MainProfileModule;

@Module(
  subcomponents = ProfileFragmentProvider_ProvideProfileFragment.ProfileFragmentSubcomponent.class
)
public abstract class ProfileFragmentProvider_ProvideProfileFragment {
  private ProfileFragmentProvider_ProvideProfileFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ProfileFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProfileFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = MainProfileModule.class)
  public interface ProfileFragmentSubcomponent extends AndroidInjector<ProfileFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFragment> {}
  }
}
