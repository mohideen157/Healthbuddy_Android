package indg.com.cover2protect.viewmodel.nutritionviewmodel.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\fJ\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lindg/com/cover2protect/viewmodel/nutritionviewmodel/history/NutrititionHistoryVM;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/NutrionHistoryNavigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "caltarget", "Landroidx/lifecycle/MutableLiveData;", "", "DeleteExcerciseItembyId", "", "id", "DeleteNutritionItembyId", "GETExcercise", "date", "GetCalories", "GetNutritionHistory_Breakfast", "type", "GetNutritionHistory_Dinner", "GetNutritionHistory_Lunch", "GetNutritionHistory_Snacks", "PostPedometerData", "pedometerRequest", "Lindg/com/cover2protect/model/pedometer/PedometerRequest;", "SaveCalories", "cal", "app_DevDebug"})
public final class NutrititionHistoryVM extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.NutrionHistoryNavigator> {
    private androidx.lifecycle.MutableLiveData<java.lang.String> caltarget;
    
    public final void GetNutritionHistory_Breakfast(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void GetNutritionHistory_Lunch(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void PostPedometerData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.pedometer.PedometerRequest pedometerRequest) {
    }
    
    public final void GetNutritionHistory_Dinner(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void GetNutritionHistory_Snacks(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void GETExcercise(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    public final void SaveCalories(@org.jetbrains.annotations.NotNull()
    java.lang.String cal) {
    }
    
    public final void DeleteNutritionItembyId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void DeleteExcerciseItembyId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> GetCalories(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    public NutrititionHistoryVM(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}