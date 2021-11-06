package indg.com.cover2protect.navigator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\f"}, d2 = {"Lindg/com/cover2protect/navigator/SampleNavigator;", "", "OnError", "", "msg", "", "OnFood", "food", "", "Lindg/com/cover2protect/model/nutrition/nutritiongetresponse/Food;", "OnSuccess", "OnType", "app_DevDebug"})
public abstract interface SampleNavigator {
    
    public abstract void OnSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void OnError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void OnFood(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritiongetresponse.Food> food);
    
    public abstract void OnType(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutritiongetresponse.Food> food);
}