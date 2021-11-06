package indg.com.cover2protect.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:J!\u0010;\u001a\u000207*\u00020/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002070=H\u0082\bR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR(\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR(\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u0007\"\u0004\b\'\u0010\tR(\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR(\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR(\u00103\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\t\u00a8\u0006?"}, d2 = {"Lindg/com/cover2protect/helper/DeviceHelper;", "", "()V", "value", "", "Calories", "getCalories", "()Ljava/lang/String;", "setCalories", "(Ljava/lang/String;)V", "DeviceConnectionStatus", "Lkotlin/Pair;", "", "DeviceStatus", "getDeviceStatus", "()Z", "setDeviceStatus", "(Z)V", "Device_address", "getDevice_address", "setDevice_address", "Device_name", "getDevice_name", "setDevice_name", "MODE", "", "NAME", "Rememberme", "Rememberstatus", "getRememberstatus", "setRememberstatus", "calburned", "getCalburned", "setCalburned", "date", "getDate", "setDate", "deviceuser", "getDeviceuser", "setDeviceuser", "gender", "getGender", "setGender", "pastdate", "getPastdate", "setPastdate", "preferences", "Landroid/content/SharedPreferences;", "steps", "getSteps", "setSteps", "token", "getToken", "setToken", "Clear", "", "init", "context", "Landroid/content/Context;", "edit", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "app_DevDebug"})
public final class DeviceHelper {
    private static final java.lang.String NAME = "Cover2Protect";
    private static final int MODE = 0;
    private static android.content.SharedPreferences preferences;
    private static final kotlin.Pair<java.lang.String, java.lang.Boolean> DeviceConnectionStatus = null;
    private static final kotlin.Pair<java.lang.String, java.lang.Boolean> Rememberme = null;
    public static final indg.com.cover2protect.helper.DeviceHelper INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void edit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $receiver, kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_name() {
        return null;
    }
    
    public final void setDevice_name(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_address() {
        return null;
    }
    
    public final void setDevice_address(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final boolean getDeviceStatus() {
        return false;
    }
    
    public final void setDeviceStatus(boolean value) {
    }
    
    public final boolean getRememberstatus() {
        return false;
    }
    
    public final void setRememberstatus(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCalories() {
        return null;
    }
    
    public final void setCalories(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCalburned() {
        return null;
    }
    
    public final void setCalburned(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceuser() {
        return null;
    }
    
    public final void setDeviceuser(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSteps() {
        return null;
    }
    
    public final void setSteps(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPastdate() {
        return null;
    }
    
    public final void setPastdate(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public final void Clear() {
    }
    
    private DeviceHelper() {
        super();
    }
}