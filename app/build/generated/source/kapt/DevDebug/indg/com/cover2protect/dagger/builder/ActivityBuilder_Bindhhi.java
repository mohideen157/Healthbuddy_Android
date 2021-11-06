package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.hhi.HHIModule;
import indg.com.cover2protect.views.activity.health_profile.HHIActivity;

@Module(subcomponents = ActivityBuilder_Bindhhi.HHIActivitySubcomponent.class)
public abstract class ActivityBuilder_Bindhhi {
  private ActivityBuilder_Bindhhi() {}

  @Binds
  @IntoMap
  @ActivityKey(HHIActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HHIActivitySubcomponent.Builder builder);

  @Subcomponent(modules = HHIModule.class)
  public interface HHIActivitySubcomponent extends AndroidInjector<HHIActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HHIActivity> {}
  }
}
