package indg.com.cover2protect.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lindg/com/cover2protect/presenter/PreferencesHelper;", "", "DeviceConnectionstatus", "", "getDeviceConnectionstatus", "()Ljava/lang/String;", "setDeviceConnectionstatus", "(Ljava/lang/String;)V", "accessToken", "getAccessToken", "setAccessToken", "currentUserEmail", "getCurrentUserEmail", "setCurrentUserEmail", "currentUserName", "getCurrentUserName", "setCurrentUserName", "currentUserProfilePicUrl", "getCurrentUserProfilePicUrl", "setCurrentUserProfilePicUrl", "app_DevDebug"})
public abstract interface PreferencesHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAccessToken();
    
    public abstract void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentUserEmail();
    
    public abstract void setCurrentUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentUserName();
    
    public abstract void setCurrentUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentUserProfilePicUrl();
    
    public abstract void setCurrentUserProfilePicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDeviceConnectionstatus();
    
    public abstract void setDeviceConnectionstatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
}