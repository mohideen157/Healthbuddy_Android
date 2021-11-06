package indg.com.cover2protect.adapter.nutrition.HistoryNutrition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lindg/com/cover2protect/adapter/nutrition/HistoryNutrition/Excercise_History_Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lindg/com/cover2protect/adapter/nutrition/HistoryNutrition/Excercise_History_Adapter$CustomViewHolder;", "context", "Landroid/content/Context;", "response", "", "Lindg/com/cover2protect/model/excerciseapi/excercise_get/Data;", "(Landroid/content/Context;Ljava/util/List;)V", "listener", "Lindg/com/cover2protect/presenter/DeleteExcerciseListener;", "SetListener", "", "capitalize", "", "input", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "CustomViewHolder", "app_DevDebug"})
public final class Excercise_History_Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<indg.com.cover2protect.adapter.nutrition.HistoryNutrition.Excercise_History_Adapter.CustomViewHolder> {
    private indg.com.cover2protect.presenter.DeleteExcerciseListener listener;
    private android.content.Context context;
    private java.util.List<indg.com.cover2protect.model.excerciseapi.excercise_get.Data> response;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.adapter.nutrition.HistoryNutrition.Excercise_History_Adapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void SetListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DeleteExcerciseListener listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.adapter.nutrition.HistoryNutrition.Excercise_History_Adapter.CustomViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String capitalize(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String input) {
        return null;
    }
    
    public Excercise_History_Adapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.excerciseapi.excercise_get.Data> response) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/adapter/nutrition/HistoryNutrition/Excercise_History_Adapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "excerciseRvLayoutBinding", "Lindg/com/cover2protect/databinding/ExcerciseRvLayoutBinding;", "(Landroid/content/Context;Lindg/com/cover2protect/databinding/ExcerciseRvLayoutBinding;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getExcerciseRvLayoutBinding", "()Lindg/com/cover2protect/databinding/ExcerciseRvLayoutBinding;", "setExcerciseRvLayoutBinding", "(Lindg/com/cover2protect/databinding/ExcerciseRvLayoutBinding;)V", "app_DevDebug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private indg.com.cover2protect.databinding.ExcerciseRvLayoutBinding excerciseRvLayoutBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.databinding.ExcerciseRvLayoutBinding getExcerciseRvLayoutBinding() {
            return null;
        }
        
        public final void setExcerciseRvLayoutBinding(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.ExcerciseRvLayoutBinding p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.ExcerciseRvLayoutBinding excerciseRvLayoutBinding) {
            super(null);
        }
    }
}