package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider;
import indg.com.cover2protect.views.activity.forgot_password.ResetPasswordActivity;

@Module(subcomponents = ActivityBuilder_BindForgotResetPass.ResetPasswordActivitySubcomponent.class)
public abstract class ActivityBuilder_BindForgotResetPass {
  private ActivityBuilder_BindForgotResetPass() {}

  @Binds
  @IntoMap
  @ActivityKey(ResetPasswordActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ResetPasswordActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ForgotPassProvider.class)
  public interface ResetPasswordActivitySubcomponent
      extends AndroidInjector<ResetPasswordActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ResetPasswordActivity> {}
  }
}
