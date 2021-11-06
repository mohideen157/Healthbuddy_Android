package indg.com.cover2protect.viewmodel.devicedataviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lindg/com/cover2protect/viewmodel/devicedataviewmodel/DeviceViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/devicedata_navigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "devicedata", "Landroidx/lifecycle/MutableLiveData;", "Lindg/com/cover2protect/model/deviceresponse/DeviceResponse;", "profiledata", "Lindg/com/cover2protect/model/profile/Profile;", "resultdata", "Lindg/com/cover2protect/model/banddatadetail/DetailModel;", "GetDeviceData", "", "synchedid", "", "GetEvent", "GetProfileData", "UpdateEvent", "event", "getData", "app_DevDebug"})
public final class DeviceViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.devicedata_navigator> {
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.banddatadetail.DetailModel> resultdata;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.deviceresponse.DeviceResponse> devicedata;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.profile.Profile> profiledata;
    
    public final void GetDeviceData(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedid) {
    }
    
    public final void GetEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedid) {
    }
    
    public final void UpdateEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedid, @org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.profile.Profile> GetProfileData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.banddatadetail.DetailModel> getData() {
        return null;
    }
    
    public DeviceViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}