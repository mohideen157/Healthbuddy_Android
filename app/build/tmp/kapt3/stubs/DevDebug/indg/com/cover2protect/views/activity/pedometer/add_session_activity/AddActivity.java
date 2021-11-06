package indg.com.cover2protect.views.activity.pedometer.add_session_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0002J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u000200H\u0002J\b\u0010;\u001a\u000200H\u0002J\b\u0010<\u001a\u00020=H\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\"\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0012\u0010F\u001a\u0002002\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u0002002\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J0\u0010L\u001a\u0002002\f\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010H2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020RH\u0016J\u0016\u0010S\u001a\u0002002\f\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010NH\u0016J/\u0010T\u001a\u0002002\u0006\u0010B\u001a\u00020\b2\u000e\b\u0001\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060V2\b\b\u0001\u0010W\u001a\u00020XH\u0016\u00a2\u0006\u0002\u0010YJ\b\u0010Z\u001a\u000200H\u0002J\b\u0010[\u001a\u000200H\u0002J\u0010\u0010\\\u001a\u0002002\u0006\u0010]\u001a\u00020\u0006H\u0002J\u0010\u0010^\u001a\u0002002\u0006\u0010]\u001a\u00020\u0006H\u0002J\b\u0010_\u001a\u000200H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0019\u0010\"\u001a\n $*\u0004\u0018\u00010#0#\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u000e\u0010+\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006`"}, d2 = {"Lindg/com/cover2protect/views/activity/pedometer/add_session_activity/AddActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/view/View$OnClickListener;", "()V", "DATE_FORMAT", "", "REQUEST_OAUTH_REQUEST_CODE", "", "REQUEST_PERMISSIONS_REQUEST_CODE", "SAMPLE_SESSION_NAME", "getSAMPLE_SESSION_NAME", "()Ljava/lang/String;", "setSAMPLE_SESSION_NAME", "(Ljava/lang/String;)V", "TAG", "getTAG", "current_date", "description", "endTime", "mHour", "getMHour", "()I", "setMHour", "(I)V", "mHour1", "getMHour1", "setMHour1", "mMinute", "getMMinute", "setMMinute", "mMinute1", "getMMinute1", "setMMinute1", "myCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getMyCalendar", "()Ljava/util/Calendar;", "startTime", "stepCountDelta", "getStepCountDelta", "setStepCountDelta", "time_end", "time_start", "GetTimeinMill", "time", "InsertActivity", "", "OpenNewTimePicker", "OpenTimePicker", "OpendatePicker", "changeStatusBarColor", "getFitnessSignInOptions", "Lcom/google/android/gms/fitness/FitnessOptions;", "hasOAuthPermission", "", "hasRuntimePermissions", "insertAndVerifySession", "insertAndVerifySessionWrapper", "insertFitnessSession", "Lcom/google/android/gms/fitness/request/SessionInsertRequest;", "insertSession", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "position", "id", "", "onNothingSelected", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestOAuthPermission", "requestRuntimePermissions", "showSuccess", "it", "showToast", "updateLabel", "app_DevDebug"})
public final class AddActivity extends androidx.appcompat.app.AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener, android.view.View.OnClickListener {
    private final java.util.Calendar myCalendar = null;
    private int mHour;
    private int mMinute;
    private int mHour1;
    private int mMinute1;
    private java.lang.String current_date;
    private java.lang.String time_start;
    private java.lang.String time_end;
    private java.lang.String startTime;
    private java.lang.String endTime;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "BasicSessions";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String SAMPLE_SESSION_NAME;
    private final java.lang.String DATE_FORMAT = "yyyy.MM.dd HH:mm:ss";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stepCountDelta;
    private java.lang.String description;
    private final int REQUEST_OAUTH_REQUEST_CODE = 1;
    private final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    private java.util.HashMap _$_findViewCache;
    
    public final java.util.Calendar getMyCalendar() {
        return null;
    }
    
    public final int getMHour() {
        return 0;
    }
    
    public final void setMHour(int p0) {
    }
    
    public final int getMMinute() {
        return 0;
    }
    
    public final void setMMinute(int p0) {
    }
    
    public final int getMHour1() {
        return 0;
    }
    
    public final void setMHour1(int p0) {
    }
    
    public final int getMMinute1() {
        return 0;
    }
    
    public final void setMMinute1(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSAMPLE_SESSION_NAME() {
        return null;
    }
    
    public final void setSAMPLE_SESSION_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStepCountDelta() {
        return null;
    }
    
    public final void setStepCountDelta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void InsertActivity() {
    }
    
    private final java.lang.String GetTimeinMill(java.lang.String time) {
        return null;
    }
    
    private final void OpendatePicker() {
    }
    
    private final void updateLabel() {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String it) {
    }
    
    private final void showSuccess(java.lang.String it) {
    }
    
    private final void requestRuntimePermissions() {
    }
    
    private final boolean hasRuntimePermissions() {
        return false;
    }
    
    private final void insertAndVerifySessionWrapper() {
    }
    
    private final boolean hasOAuthPermission() {
        return false;
    }
    
    private final void requestOAuthPermission() {
    }
    
    private final com.google.android.gms.fitness.FitnessOptions getFitnessSignInOptions() {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    int[] grantResults) {
    }
    
    private final void insertAndVerifySession() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final com.google.android.gms.tasks.Task<java.lang.Void> insertSession() {
        return null;
    }
    
    private final com.google.android.gms.fitness.request.SessionInsertRequest insertFitnessSession() {
        return null;
    }
    
    private final void OpenNewTimePicker() {
    }
    
    private final void OpenTimePicker() {
    }
    
    private final void changeStatusBarColor() {
    }
    
    public AddActivity() {
        super();
    }
}