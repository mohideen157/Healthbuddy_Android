package indg.com.cover2protect.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lindg/com/cover2protect/presenter/DataManager;", "Lindg/com/cover2protect/presenter/PreferencesHelper;", "updateDeviceStatus", "", "DeviceConnectionstatus", "", "updateUserInfo", "accessToken", "userName", "email", "profilePicPath", "app_DevDebug"})
public abstract interface DataManager extends indg.com.cover2protect.presenter.PreferencesHelper {
    
    public abstract void updateUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String profilePicPath);
    
    public abstract void updateDeviceStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String DeviceConnectionstatus);
}