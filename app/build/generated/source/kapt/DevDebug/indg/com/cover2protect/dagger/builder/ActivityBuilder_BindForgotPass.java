package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider;
import indg.com.cover2protect.views.activity.forgot_password.ForgotPassActivity;

@Module(subcomponents = ActivityBuilder_BindForgotPass.ForgotPassActivitySubcomponent.class)
public abstract class ActivityBuilder_BindForgotPass {
  private ActivityBuilder_BindForgotPass() {}

  @Binds
  @IntoMap
  @ActivityKey(ForgotPassActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ForgotPassActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ForgotPassProvider.class)
  public interface ForgotPassActivitySubcomponent extends AndroidInjector<ForgotPassActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ForgotPassActivity> {}
  }
}
