package indg.com.cover2protect.viewmodel.dashboardviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lindg/com/cover2protect/viewmodel/dashboardviewmodel/DashboardViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/presenter/ResponseHandle;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "devicedata", "Landroidx/lifecycle/MutableLiveData;", "Lindg/com/cover2protect/model/deviceresponse/DeviceResponse;", "GetDeviceData", "synchedid", "", "PostBandData", "", "upsertBanddata", "Lindg/com/cover2protect/model/banddatadetail/updatebanddata/UpsertBanddata;", "app_DevDebug"})
public final class DashboardViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.presenter.ResponseHandle> {
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.deviceresponse.DeviceResponse> devicedata;
    
    public final void PostBandData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.banddatadetail.updatebanddata.UpsertBanddata upsertBanddata) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.deviceresponse.DeviceResponse> GetDeviceData(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedid) {
        return null;
    }
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}