package indg.com.cover2protect.navigator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&\u00a8\u0006\n"}, d2 = {"Lindg/com/cover2protect/navigator/allergyNavigator;", "", "OnData", "", "data", "", "OnError", "message", "OnSuccess", "onResult", "app_DevDebug"})
public abstract interface allergyNavigator {
    
    public abstract void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void OnData(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    public abstract void onResult(@org.jetbrains.annotations.NotNull()
    java.lang.Object data);
}