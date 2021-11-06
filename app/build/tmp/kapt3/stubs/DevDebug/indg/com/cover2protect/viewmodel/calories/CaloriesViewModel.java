package indg.com.cover2protect.viewmodel.calories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/viewmodel/calories/CaloriesViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/TrendsNavigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "caltrends", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/caloriesgraphresponse/Data;", "GetCalTrends", "app_DevDebug"})
public final class CaloriesViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.TrendsNavigator> {
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.caloriesgraphresponse.Data>> caltrends;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.caloriesgraphresponse.Data>> GetCalTrends() {
        return null;
    }
    
    public CaloriesViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}