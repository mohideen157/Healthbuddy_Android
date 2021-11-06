package indg.com.cover2protect.dagger.builder;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import indg.com.cover2protect.viewmodel.medicalreport.MedicalReportModule;
import indg.com.cover2protect.views.activity.upload_file.UploadFileActivity;

@Module(subcomponents = ActivityBuilder_ProvideMedicalReport.UploadFileActivitySubcomponent.class)
public abstract class ActivityBuilder_ProvideMedicalReport {
  private ActivityBuilder_ProvideMedicalReport() {}

  @Binds
  @IntoMap
  @ActivityKey(UploadFileActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      UploadFileActivitySubcomponent.Builder builder);

  @Subcomponent(modules = MedicalReportModule.class)
  public interface UploadFileActivitySubcomponent extends AndroidInjector<UploadFileActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UploadFileActivity> {}
  }
}
