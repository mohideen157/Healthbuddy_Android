package indg.com.cover2protect.viewmodel.medication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\fJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\u000bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0018\u001a\u00020\fJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lindg/com/cover2protect/viewmodel/medication/MedicationDetailViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/allergyNavigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "Medicalresultdata", "Landroidx/lifecycle/MutableLiveData;", "", "arrayList", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/diseases/DiseaseData;", "arrayListMutableLiveData", "medarrayList", "Lindg/com/cover2protect/model/medicationmodel/medicationinfo/Data;", "medlist", "responsedata", "Lindg/com/cover2protect/model/medicationmodel/medicationnameresponse/PostMedicationResponse;", "resultdata", "DeleteMedication", "name", "DeleteMedicationList", "Diseases", "", "GetHra", "GetMedicalList", "GetMedicineDetail", "PostMedication", "UpdateMedicationInfo", "type", "count", "dosage", "id", "app_DevDebug"})
public final class MedicationDetailViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.allergyNavigator> {
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.diseases.DiseaseData>> arrayListMutableLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.String> resultdata;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.medicationmodel.medicationnameresponse.PostMedicationResponse> responsedata;
    private androidx.lifecycle.MutableLiveData<java.lang.String> Medicalresultdata;
    private final java.util.ArrayList<indg.com.cover2protect.model.diseases.DiseaseData> arrayList = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.medicationmodel.medicationinfo.Data>> medlist;
    private final java.util.ArrayList<indg.com.cover2protect.model.medicationmodel.medicationinfo.Data> medarrayList = null;
    
    public final void GetHra() {
    }
    
    public final void GetMedicineDetail() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.medicationmodel.medicationinfo.Data>> GetMedicalList() {
        return null;
    }
    
    public final void Diseases() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.medicationmodel.medicationnameresponse.PostMedicationResponse> PostMedication(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> DeleteMedication(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> DeleteMedicationList(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> UpdateMedicationInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String count, @org.jetbrains.annotations.NotNull()
    java.lang.String dosage, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public MedicationDetailViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}