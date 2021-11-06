package indg.com.cover2protect.viewmodel.heartailment_vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000eJ\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lindg/com/cover2protect/viewmodel/heartailment_vm/HeartAilmentViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/Main_Navigation;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "HeartAilmentData", "Landroidx/lifecycle/MutableLiveData;", "Lindg/com/cover2protect/model/gettraveldata/GetTravelData;", "resultdata", "", "scoredata", "", "GETHeartAilment", "GetHra", "", "GetScore", "Stroke1", "answer", "StrokeSubQues", "Tia1", "TiasubQues", "UpsertCadiovascCoronaryAngiography", "UpsertCardiovascBypassSurgery", "UpsertCardiovascEcg", "UpsertCardiovascStentPlacement", "UpsertCardiovascValveSurgery", "UpsertCardiovascularAnginaPain", "UpsertCardiovascularCoronary", "UpsertCardiovascularRegularMedication", "UpsertCardivascHeartAttack", "UpsertData", "data", "getData", "app_DevDebug"})
public final class HeartAilmentViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.Main_Navigation> {
    private androidx.lifecycle.MutableLiveData<java.lang.String> resultdata;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.gettraveldata.GetTravelData> HeartAilmentData;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> scoredata;
    
    public final void Stroke1(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void StrokeSubQues(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void Tia1(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void TiasubQues(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascularCoronary(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascularAnginaPain(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascularRegularMedication(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardivascHeartAttack(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascEcg(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCadiovascCoronaryAngiography(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascBypassSurgery(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascStentPlacement(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertCardiovascValveSurgery(@org.jetbrains.annotations.NotNull()
    java.lang.String answer) {
    }
    
    public final void UpsertData(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.gettraveldata.GetTravelData> GETHeartAilment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> GetScore() {
        return null;
    }
    
    public final void GetHra() {
    }
    
    public HeartAilmentViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}