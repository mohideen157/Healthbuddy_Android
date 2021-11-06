package indg.com.cover2protect.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/presenter/MaisenseApi;", "", "GetDeviceResponse", "Lretrofit2/Call;", "Lindg/com/cover2protect/model/deviceresponse/DeviceResponse;", "email", "", "synched_id", "app_DevDebug"})
public abstract interface MaisenseApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/record")
    public abstract retrofit2.Call<indg.com.cover2protect.model.deviceresponse.DeviceResponse> GetDeviceResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "synched_id")
    java.lang.String synched_id);
}