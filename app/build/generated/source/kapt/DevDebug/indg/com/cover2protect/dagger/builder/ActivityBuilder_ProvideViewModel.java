package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.pedometer.PedometerModule;
import indg.com.cover2protect.views.activity.pedometer.PedometerActivity;

@Module(subcomponents = ActivityBuilder_ProvideViewModel.PedometerActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvideViewModel {
  private ActivityBuilder_ProvideViewModel() {}

  @Binds
  @IntoMap
  @ActivityKey(PedometerActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PedometerActivitySubcomponent.Builder builder);

  @Subcomponent(modules = PedometerModule.class)
  public interface PedometerActivitySubcomponent extends AndroidInjector<PedometerActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PedometerActivity> {}
  }
}
