package indg.com.cover2protect.views.fragments.pedometer.month;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\"\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u0016H\u0002J\u0016\u0010,\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0016\u0010.\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lindg/com/cover2protect/views/fragments/pedometer/month/MonthlyStepFragment;", "Landroidx/fragment/app/Fragment;", "()V", "REQUEST_OAUTH_REQUEST_CODE", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "adapter", "Lindg/com/cover2protect/adapter/pedometer_adapter/GoogleFit/GooglefitMonthly_Adapter;", "arrayList", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/googlefit/monthly_data/data_month;", "dataView", "Landroid/view/View;", "data_Pedometer", "Lindg/com/cover2protect/model/googlefit/monthly_data/Update_MonthlyData;", "mchart", "Lcom/github/mikephil/charting/charts/LineChart;", "pedometer_response", "dumpDataSet", "", "dataSet", "Lcom/google/android/gms/fitness/data/DataSet;", "initGoogleFit", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "printData", "dataReadResult", "Lcom/google/android/gms/fitness/result/DataReadResponse;", "queryFitnessData", "Lcom/google/android/gms/fitness/request/DataReadRequest;", "readdata", "setGraph", "it", "setadapter", "app_DevDebug"})
public final class MonthlyStepFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "BasicHistoryApi";
    private final int REQUEST_OAUTH_REQUEST_CODE = 1;
    private android.view.View dataView;
    private java.util.ArrayList<indg.com.cover2protect.model.googlefit.monthly_data.data_month> arrayList;
    private indg.com.cover2protect.model.googlefit.monthly_data.Update_MonthlyData data_Pedometer;
    private indg.com.cover2protect.model.googlefit.monthly_data.data_month pedometer_response;
    private indg.com.cover2protect.adapter.pedometer_adapter.GoogleFit.GooglefitMonthly_Adapter adapter;
    private com.github.mikephil.charting.charts.LineChart mchart;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initGoogleFit() {
    }
    
    private final void readdata() {
    }
    
    private final void printData(com.google.android.gms.fitness.result.DataReadResponse dataReadResult) {
    }
    
    private final void setGraph(java.util.ArrayList<indg.com.cover2protect.model.googlefit.monthly_data.data_month> it) {
    }
    
    private final void setadapter(java.util.ArrayList<indg.com.cover2protect.model.googlefit.monthly_data.data_month> arrayList) {
    }
    
    private final void dumpDataSet(com.google.android.gms.fitness.data.DataSet dataSet) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.fitness.request.DataReadRequest queryFitnessData() {
        return null;
    }
    
    public MonthlyStepFragment() {
        super();
    }
}