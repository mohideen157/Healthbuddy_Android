package indg.com.cover2protect.navigator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lindg/com/cover2protect/navigator/DeviceResponseNavigator;", "", "OnData", "", "data", "Lindg/com/cover2protect/model/deviceresponse/DeviceResponse;", "OnError", "message", "", "OnSuccess", "app_DevDebug"})
public abstract interface DeviceResponseNavigator {
    
    public abstract void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void OnData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.deviceresponse.DeviceResponse data);
}