package indg.com.cover2protect.views.activity.health_report;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lindg/com/cover2protect/views/activity/health_report/HealthReportActivity;", "Lindg/com/cover2protect/base/BaseActivityBinding;", "Lindg/com/cover2protect/databinding/ActivityHealthReportBinding;", "Lindg/com/cover2protect/navigator/MedicalReportNavigator;", "Lindg/com/cover2protect/presenter/reportlistener;", "()V", "adapter", "Lindg/com/cover2protect/adapter/medicalreport/medical_report_adapter;", "binding", "bindingVariable", "", "getBindingVariable", "()I", "layoutId", "getLayoutId", "viewmodel", "Lindg/com/cover2protect/viewmodel/medicalreport/MedicalReportViewModel;", "getViewmodel", "()Lindg/com/cover2protect/viewmodel/medicalreport/MedicalReportViewModel;", "setViewmodel", "(Lindg/com/cover2protect/viewmodel/medicalreport/MedicalReportViewModel;)V", "OnError", "", "message", "", "OnSuccess", "data", "Lindg/com/cover2protect/model/MedicalReportResponse;", "OnUpdate", "msg", "", "getdata", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSelect", "listener", "Lindg/com/cover2protect/model/medicalreport/medical_report_get/Data;", "app_DevDebug"})
public final class HealthReportActivity extends indg.com.cover2protect.base.BaseActivityBinding<indg.com.cover2protect.databinding.ActivityHealthReportBinding> implements indg.com.cover2protect.navigator.MedicalReportNavigator, indg.com.cover2protect.presenter.reportlistener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.viewmodel.medicalreport.MedicalReportViewModel viewmodel;
    private indg.com.cover2protect.adapter.medicalreport.medical_report_adapter adapter;
    private indg.com.cover2protect.databinding.ActivityHealthReportBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getBindingVariable() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.viewmodel.medicalreport.MedicalReportViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.viewmodel.medicalreport.MedicalReportViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getdata() {
    }
    
    @java.lang.Override()
    public void OnSuccess(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.MedicalReportResponse data) {
    }
    
    @java.lang.Override()
    public void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void OnUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.Object msg) {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.medicalreport.medical_report_get.Data listener) {
    }
    
    public HealthReportActivity() {
        super();
    }
}