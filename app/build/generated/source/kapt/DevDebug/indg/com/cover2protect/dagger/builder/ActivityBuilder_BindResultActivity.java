package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.result.ResultModule;
import indg.com.cover2protect.views.activity.result_view.ResultActivity;

@Module(subcomponents = ActivityBuilder_BindResultActivity.ResultActivitySubcomponent.class)
public abstract class ActivityBuilder_BindResultActivity {
  private ActivityBuilder_BindResultActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ResultActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ResultActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ResultModule.class)
  public interface ResultActivitySubcomponent extends AndroidInjector<ResultActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ResultActivity> {}
  }
}
