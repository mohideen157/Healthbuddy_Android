package indg.com.cover2protect.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lindg/com/cover2protect/helper/AppDataManager;", "Lindg/com/cover2protect/presenter/DataManager;", "preferencesHelper", "Lindg/com/cover2protect/presenter/PreferencesHelper;", "(Lindg/com/cover2protect/presenter/PreferencesHelper;)V", "value", "", "DeviceConnectionstatus", "getDeviceConnectionstatus", "()Ljava/lang/String;", "setDeviceConnectionstatus", "(Ljava/lang/String;)V", "accesstoken", "accessToken", "getAccessToken", "setAccessToken", "email", "currentUserEmail", "getCurrentUserEmail", "setCurrentUserEmail", "currentUserName", "getCurrentUserName", "setCurrentUserName", "currentUserProfilePicUrl", "getCurrentUserProfilePicUrl", "setCurrentUserProfilePicUrl", "mPreferencesHelper", "updateDeviceStatus", "", "updateUserInfo", "AccessToken", "userName", "profilePicPath", "app_DevDebug"})
public final class AppDataManager implements indg.com.cover2protect.presenter.DataManager {
    private indg.com.cover2protect.presenter.PreferencesHelper mPreferencesHelper;
    
    @java.lang.Override()
    public void updateDeviceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String DeviceConnectionstatus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDeviceConnectionstatus() {
        return null;
    }
    
    @java.lang.Override()
    public void setDeviceConnectionstatus(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void updateUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String AccessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String profilePicPath) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAccessToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String accesstoken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentUserEmail() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentUserName() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentUserProfilePicUrl() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserProfilePicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @javax.inject.Inject()
    public AppDataManager(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.PreferencesHelper preferencesHelper) {
        super();
    }
}