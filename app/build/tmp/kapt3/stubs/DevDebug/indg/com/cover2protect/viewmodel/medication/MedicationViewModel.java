package indg.com.cover2protect.viewmodel.medication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lindg/com/cover2protect/viewmodel/medication/MedicationViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/response_navigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "resultdata", "Landroidx/lifecycle/MutableLiveData;", "", "scoredata", "", "GETMedicationData", "", "GetHra", "UpsertData", "answer", "app_DevDebug"})
public final class MedicationViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.response_navigator> {
    private androidx.lifecycle.MutableLiveData<java.lang.String> resultdata;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> scoredata;
    
    public final void GetHra() {
    }
    
    public final void UpsertData(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void GETMedicationData() {
    }
    
    public MedicationViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}