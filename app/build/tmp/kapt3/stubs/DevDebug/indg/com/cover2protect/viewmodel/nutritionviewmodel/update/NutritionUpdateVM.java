package indg.com.cover2protect.viewmodel.nutritionviewmodel.update;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lindg/com/cover2protect/viewmodel/nutritionviewmodel/update/NutritionUpdateVM;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/SampleNavigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "nutritioninfo", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/nutrition/nutritiongetresponse/Food;", "GetNutritionInfo", "", "id", "", "GetNutritionType", "PostNutritionData", "nutritionInfo", "Lindg/com/cover2protect/model/nutrition/savenutriondata/NutritionData;", "app_DevDebug"})
public final class NutritionUpdateVM extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.SampleNavigator> {
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.nutrition.nutritiongetresponse.Food>> nutritioninfo;
    
    public final void GetNutritionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void PostNutritionData(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.model.nutrition.savenutriondata.NutritionData nutritionInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void GetNutritionType(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public NutritionUpdateVM(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}