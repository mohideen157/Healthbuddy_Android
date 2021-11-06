package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider;
import indg.com.cover2protect.views.activity.forgot_password.NewPasswordActivity;

@Module(subcomponents = ActivityBuilder_BindNewPass.NewPasswordActivitySubcomponent.class)
public abstract class ActivityBuilder_BindNewPass {
  private ActivityBuilder_BindNewPass() {}

  @Binds
  @IntoMap
  @ActivityKey(NewPasswordActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      NewPasswordActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ForgotPassProvider.class)
  public interface NewPasswordActivitySubcomponent extends AndroidInjector<NewPasswordActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NewPasswordActivity> {}
  }
}
