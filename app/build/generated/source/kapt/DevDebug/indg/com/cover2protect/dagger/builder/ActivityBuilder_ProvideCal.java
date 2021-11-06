package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.calories.CaloriesModule;
import indg.com.cover2protect.views.activity.health_profile.CaloriesTrends;

@Module(subcomponents = ActivityBuilder_ProvideCal.CaloriesTrendsSubcomponent.class)
public abstract class ActivityBuilder_ProvideCal {
  private ActivityBuilder_ProvideCal() {}

  @Binds
  @IntoMap
  @ActivityKey(CaloriesTrends.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      CaloriesTrendsSubcomponent.Builder builder);

  @Subcomponent(modules = CaloriesModule.class)
  public interface CaloriesTrendsSubcomponent extends AndroidInjector<CaloriesTrends> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<CaloriesTrends> {}
  }
}
