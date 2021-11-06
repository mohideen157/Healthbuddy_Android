package indg.com.cover2protect.navigator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u001e\u0010\u000e\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u001e\u0010\u0010\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u001e\u0010\u0011\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u0012"}, d2 = {"Lindg/com/cover2protect/navigator/NutrionHistoryNavigator;", "", "OnCalTarget", "", "msg", "", "OnDinner", "data", "", "Lindg/com/cover2protect/model/nutrition/nutritionhistory/Date;", "sum", "OnError", "OnExcercise", "Lindg/com/cover2protect/model/excerciseapi/excercise_get/Data;", "OnLunch", "OnPedometerSuccess", "OnSnacks", "OnSuccess", "app_DevDebug"})
public abstract interface NutrionHistoryNavigator {
    
    public abstract void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritionhistory.Date> data, @org.jetbrains.annotations.NotNull()
    java.lang.String sum);
    
    public abstract void OnLunch(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritionhistory.Date> data, @org.jetbrains.annotations.NotNull()
    java.lang.String sum);
    
    public abstract void OnDinner(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritionhistory.Date> data, @org.jetbrains.annotations.NotNull()
    java.lang.String sum);
    
    public abstract void OnSnacks(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritionhistory.Date> data, @org.jetbrains.annotations.NotNull()
    java.lang.String sum);
    
    public abstract void OnExcercise(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.excerciseapi.excercise_get.Data> data, @org.jetbrains.annotations.NotNull()
    java.lang.String sum);
    
    public abstract void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void OnCalTarget(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void OnPedometerSuccess();
}