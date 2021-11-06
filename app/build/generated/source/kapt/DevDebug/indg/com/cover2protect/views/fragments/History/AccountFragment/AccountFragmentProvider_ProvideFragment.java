package indg.com.cover2protect.views.fragments.History.AccountFragment;

import androidx.fragment.app.Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.Device2.HomeModule;

@Module(subcomponents = AccountFragmentProvider_ProvideFragment.AccountFragmentSubcomponent.class)
public abstract class AccountFragmentProvider_ProvideFragment {
  private AccountFragmentProvider_ProvideFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(AccountFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      AccountFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HomeModule.class)
  public interface AccountFragmentSubcomponent extends AndroidInjector<AccountFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AccountFragment> {}
  }
}
