package indg.com.cover2protect.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006#"}, d2 = {"AWS_BUCKET", "", "BASE_URL", "DEVICE2_STATUS", "DEVICE_DATA", "DEVICE_STATUS", "DURATION_500", "", "FIRSTTIME", "LOGGED_IN_PREF", "MOBILE", "MaisenseURL", "Medical_BASE_URL", "NODEVICE", "NutrionURL", "PREF_NAME", "getPREF_NAME", "()Ljava/lang/String;", "RC_FILE_PICKER_PERM", "", "USER_ID", "VIEW_SCALE_FACTOR", "", "deviceDatabase", "Lindg/com/cover2protect/data/database/local/DeviceDatabase;", "getDeviceDatabase", "()Lindg/com/cover2protect/data/database/local/DeviceDatabase;", "setDeviceDatabase", "(Lindg/com/cover2protect/data/database/local/DeviceDatabase;)V", "deviceRepository", "Lindg/com/cover2protect/data/database/datasource/DeviceRepository;", "getDeviceRepository", "()Lindg/com/cover2protect/data/database/datasource/DeviceRepository;", "setDeviceRepository", "(Lindg/com/cover2protect/data/database/datasource/DeviceRepository;)V", "app_DevDebug"})
public final class ConstKt {
    public static final float VIEW_SCALE_FACTOR = 0.6F;
    public static final long DURATION_500 = 500L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://admin.myaibud.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String Medical_BASE_URL = "http://c2phealthcareapi.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NutrionURL = "https://trackapi.nutritionix.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MaisenseURL = "https://us-central1-freeview-d955b.cloudfunctions.net";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_NAME = "Cover2Protect";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGGED_IN_PREF = "logged_in_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_STATUS = "device_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE2_STATUS = "device2_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRSTTIME = "device_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NODEVICE = "nodevice_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOBILE = "mobile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AWS_BUCKET = "cp2pdfupload2read";
    @org.jetbrains.annotations.NotNull()
    public static indg.com.cover2protect.data.database.local.DeviceDatabase deviceDatabase;
    @org.jetbrains.annotations.NotNull()
    public static indg.com.cover2protect.data.database.datasource.DeviceRepository deviceRepository;
    public static final int RC_FILE_PICKER_PERM = 321;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_DATA = "api/device-json";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPREF_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final indg.com.cover2protect.data.database.local.DeviceDatabase getDeviceDatabase() {
        return null;
    }
    
    public static final void setDeviceDatabase(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.local.DeviceDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final indg.com.cover2protect.data.database.datasource.DeviceRepository getDeviceRepository() {
        return null;
    }
    
    public static final void setDeviceRepository(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.datasource.DeviceRepository p0) {
    }
}