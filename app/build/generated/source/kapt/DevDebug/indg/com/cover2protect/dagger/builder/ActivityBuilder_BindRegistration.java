package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.registration.RegistrationModule;
import indg.com.cover2protect.views.activity.registration.otp_registration_activity.Registration_OTPActivity;

@Module(subcomponents = ActivityBuilder_BindRegistration.Registration_OTPActivitySubcomponent.class)
public abstract class ActivityBuilder_BindRegistration {
  private ActivityBuilder_BindRegistration() {}

  @Binds
  @IntoMap
  @ActivityKey(Registration_OTPActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      Registration_OTPActivitySubcomponent.Builder builder);

  @Subcomponent(modules = RegistrationModule.class)
  public interface Registration_OTPActivitySubcomponent
      extends AndroidInjector<Registration_OTPActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Registration_OTPActivity> {}
  }
}
