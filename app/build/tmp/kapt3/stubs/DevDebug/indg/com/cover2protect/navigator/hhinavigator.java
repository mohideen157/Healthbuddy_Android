package indg.com.cover2protect.navigator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lindg/com/cover2protect/navigator/hhinavigator;", "", "onError", "", "msg", "", "onSuccess", "data", "", "Lindg/com/cover2protect/model/hhi/hhigraph/Data;", "app_DevDebug"})
public abstract interface hhinavigator {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.hhi.hhigraph.Data> data);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
}