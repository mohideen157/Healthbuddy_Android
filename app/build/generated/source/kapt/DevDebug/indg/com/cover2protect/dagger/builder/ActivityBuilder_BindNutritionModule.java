package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.mainprofileviewmodel.MainProfileModule;
import indg.com.cover2protect.views.activity.home.ProfileActivity;
import indg.com.cover2protect.views.fragments.profile.ProfileFragmentProvider;

@Module(subcomponents = ActivityBuilder_BindNutritionModule.ProfileActivitySubcomponent.class)
public abstract class ActivityBuilder_BindNutritionModule {
  private ActivityBuilder_BindNutritionModule() {}

  @Binds
  @IntoMap
  @ActivityKey(ProfileActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ProfileActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {ProfileFragmentProvider.class, MainProfileModule.class})
  public interface ProfileActivitySubcomponent extends AndroidInjector<ProfileActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileActivity> {}
  }
}
