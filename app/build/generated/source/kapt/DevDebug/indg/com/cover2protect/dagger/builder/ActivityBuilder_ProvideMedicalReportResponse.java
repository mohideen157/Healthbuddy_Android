package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.medicalreport.MedicalReportModule;
import indg.com.cover2protect.views.activity.health_report.HealthReportActivity;

@Module(
  subcomponents =
      ActivityBuilder_ProvideMedicalReportResponse.HealthReportActivitySubcomponent.class
)
public abstract class ActivityBuilder_ProvideMedicalReportResponse {
  private ActivityBuilder_ProvideMedicalReportResponse() {}

  @Binds
  @IntoMap
  @ActivityKey(HealthReportActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HealthReportActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MedicalReportModule.class)
  public interface HealthReportActivitySubcomponent extends AndroidInjector<HealthReportActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HealthReportActivity> {}
  }
}
