package indg.com.cover2protect.dagger.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\b\u0010\u0013\u001a\u00020\u0014H\'J\b\u0010\u0015\u001a\u00020\u0016H\'J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u001aH\'J\b\u0010\u001b\u001a\u00020\u001cH\'J\b\u0010\u001d\u001a\u00020\u001eH\'\u00a8\u0006\u001f"}, d2 = {"Lindg/com/cover2protect/dagger/builder/ActivityBuilder;", "", "()V", "ProvideCal", "Lindg/com/cover2protect/views/activity/health_profile/CaloriesTrends;", "ProvideMedicalReport", "Lindg/com/cover2protect/views/activity/upload_file/UploadFileActivity;", "ProvideMedicalReportResponse", "Lindg/com/cover2protect/views/activity/health_report/HealthReportActivity;", "ProvideViewModel", "Lindg/com/cover2protect/views/activity/pedometer/PedometerActivity;", "ProvidehomeViewModel", "Lindg/com/cover2protect/views/activity/device2/HistoryActivity;", "bindForgotPass", "Lindg/com/cover2protect/views/activity/forgot_password/ForgotPassActivity;", "bindForgotResetPass", "Lindg/com/cover2protect/views/activity/forgot_password/ResetPasswordActivity;", "bindLoginActivity", "Lindg/com/cover2protect/views/activity/login/LoginActivity;", "bindNewPass", "Lindg/com/cover2protect/views/activity/forgot_password/NewPasswordActivity;", "bindNutritionModule", "Lindg/com/cover2protect/views/activity/home/ProfileActivity;", "bindRegisterActivity", "Lindg/com/cover2protect/views/activity/registration/RegisterActivity;", "bindRegistration", "Lindg/com/cover2protect/views/activity/registration/otp_registration_activity/Registration_OTPActivity;", "bindResultActivity", "Lindg/com/cover2protect/views/activity/result_view/ResultActivity;", "bindhhi", "Lindg/com/cover2protect/views/activity/health_profile/HHIActivity;", "app_DevDebug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.views.activity.login.LoginModule.class})
    public abstract indg.com.cover2protect.views.activity.login.LoginActivity bindLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.views.activity.registration.RegisterModule.class})
    public abstract indg.com.cover2protect.views.activity.registration.RegisterActivity bindRegisterActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.calories.CaloriesModule.class})
    public abstract indg.com.cover2protect.views.activity.health_profile.CaloriesTrends ProvideCal();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.hhi.HHIModule.class})
    public abstract indg.com.cover2protect.views.activity.health_profile.HHIActivity bindhhi();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.views.fragments.profile.ProfileFragmentProvider.class, indg.com.cover2protect.viewmodel.mainprofileviewmodel.MainProfileModule.class})
    public abstract indg.com.cover2protect.views.activity.home.ProfileActivity bindNutritionModule();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.result.ResultModule.class})
    public abstract indg.com.cover2protect.views.activity.result_view.ResultActivity bindResultActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider.class})
    public abstract indg.com.cover2protect.views.activity.forgot_password.ForgotPassActivity bindForgotPass();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider.class})
    public abstract indg.com.cover2protect.views.activity.forgot_password.NewPasswordActivity bindNewPass();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPassProvider.class})
    public abstract indg.com.cover2protect.views.activity.forgot_password.ResetPasswordActivity bindForgotResetPass();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.registration.RegistrationModule.class})
    public abstract indg.com.cover2protect.views.activity.registration.otp_registration_activity.Registration_OTPActivity bindRegistration();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.pedometer.PedometerModule.class})
    public abstract indg.com.cover2protect.views.activity.pedometer.PedometerActivity ProvideViewModel();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.Device2.HomeModule.class, indg.com.cover2protect.views.fragments.History.AccountFragment.AccountFragmentProvider.class, indg.com.cover2protect.views.fragments.History.DeviceFragment.DeviceFragmentProvider.class, indg.com.cover2protect.views.fragments.History.ExcerciseFragment.ExcerciseFragmentProvider.class, indg.com.cover2protect.views.fragments.History.HomeFragment.HomeFragmentProvider.class})
    public abstract indg.com.cover2protect.views.activity.device2.HistoryActivity ProvidehomeViewModel();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.medicalreport.MedicalReportModule.class})
    public abstract indg.com.cover2protect.views.activity.upload_file.UploadFileActivity ProvideMedicalReport();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.medicalreport.MedicalReportModule.class})
    public abstract indg.com.cover2protect.views.activity.health_report.HealthReportActivity ProvideMedicalReportResponse();
    
    public ActivityBuilder() {
        super();
    }
}