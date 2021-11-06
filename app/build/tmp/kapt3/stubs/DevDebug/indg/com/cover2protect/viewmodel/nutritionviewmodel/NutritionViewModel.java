package indg.com.cover2protect.viewmodel.nutritionviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lindg/com/cover2protect/viewmodel/nutritionviewmodel/NutritionViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/presenter/NutritionModelNavigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "caltarget", "Landroidx/lifecycle/MutableLiveData;", "", "datalist", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/nutrition/getnutritiondata/Common;", "hit", "Lindg/com/cover2protect/model/nutrition/Hit;", "nutritionList", "Lindg/com/cover2protect/model/nutrition/nutitionmodel/NutritionModelResponse;", "nutritioninfo", "Lindg/com/cover2protect/model/nutrition/nutritiongetresponse/Food;", "resultdata", "GetCalories", "date", "GetNutritionInfo", "", "id", "GetNutritionList", "q", "GetNutritionType", "PostNutritionData", "nutritionInfo", "Lindg/com/cover2protect/model/nutrition/savenutriondata/NutritionData;", "SaveCalories", "cal", "app_DevDebug"})
public final class NutritionViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.presenter.NutritionModelNavigator> {
    private androidx.lifecycle.MutableLiveData<java.lang.String> resultdata;
    private androidx.lifecycle.MutableLiveData<java.lang.String> caltarget;
    private final java.util.ArrayList<indg.com.cover2protect.model.nutrition.getnutritiondata.Common> datalist = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.nutrition.nutritiongetresponse.Food>> nutritioninfo;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.nutrition.nutitionmodel.NutritionModelResponse> nutritionList;
    private indg.com.cover2protect.model.nutrition.Hit hit;
    
    public final void GetNutritionList(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
    }
    
    public final void GetNutritionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void PostNutritionData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.nutrition.savenutriondata.NutritionData nutritionInfo) {
    }
    
    public final void SaveCalories(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String cal) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> GetCalories(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    public final void GetNutritionType(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public NutritionViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}