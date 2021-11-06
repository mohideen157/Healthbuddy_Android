package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.views.activity.registration.RegisterActivity;
import indg.com.cover2protect.views.activity.registration.RegisterModule;

@Module(subcomponents = ActivityBuilder_BindRegisterActivity.RegisterActivitySubcomponent.class)
public abstract class ActivityBuilder_BindRegisterActivity {
  private ActivityBuilder_BindRegisterActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(RegisterActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      RegisterActivitySubcomponent.Builder builder);

  @Subcomponent(modules = RegisterModule.class)
  public interface RegisterActivitySubcomponent extends AndroidInjector<RegisterActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegisterActivity> {}
  }
}
