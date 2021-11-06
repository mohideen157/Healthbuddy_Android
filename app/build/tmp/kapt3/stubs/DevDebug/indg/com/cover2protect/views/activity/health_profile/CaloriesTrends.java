package indg.com.cover2protect.views.activity.health_profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J \u0010\u0017\u001a\u00020\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lindg/com/cover2protect/views/activity/health_profile/CaloriesTrends;", "Lindg/com/cover2protect/base/BaseActivity;", "Lindg/com/cover2protect/navigator/TrendsNavigator;", "()V", "mchart", "Lcom/github/mikephil/charting/charts/LineChart;", "viewmodel", "Lindg/com/cover2protect/viewmodel/calories/CaloriesViewModel;", "getViewmodel", "()Lindg/com/cover2protect/viewmodel/calories/CaloriesViewModel;", "setViewmodel", "(Lindg/com/cover2protect/viewmodel/calories/CaloriesViewModel;)V", "OnError", "", "message", "", "OnSuccess", "startdate", "enddate", "getData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setChart", "it", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/caloriesgraphresponse/Data;", "Lkotlin/collections/ArrayList;", "app_DevDebug"})
public final class CaloriesTrends extends indg.com.cover2protect.base.BaseActivity implements indg.com.cover2protect.navigator.TrendsNavigator {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public indg.com.cover2protect.viewmodel.calories.CaloriesViewModel viewmodel;
    private com.github.mikephil.charting.charts.LineChart mchart;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String startdate, @org.jetbrains.annotations.NotNull()
    java.lang.String enddate) {
    }
    
    @java.lang.Override()
    public void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.viewmodel.calories.CaloriesViewModel getViewmodel() {
        return null;
    }
    
    public final void setViewmodel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.viewmodel.calories.CaloriesViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getData() {
    }
    
    private final void setChart(java.util.ArrayList<indg.com.cover2protect.model.caloriesgraphresponse.Data> it) {
    }
    
    public CaloriesTrends() {
        super();
    }
}