package indg.com.cover2protect.adapter.nutrition.NutritionListAdapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lindg/com/cover2protect/adapter/nutrition/NutritionListAdapter/NutritionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lindg/com/cover2protect/adapter/nutrition/NutritionListAdapter/NutritionListAdapter$CustomViewHolder;", "context", "Landroid/content/Context;", "response", "", "Lindg/com/cover2protect/model/nutrition/nutitionmodel/Common;", "(Landroid/content/Context;Ljava/util/List;)V", "listener", "Lindg/com/cover2protect/presenter/OnItemClick;", "SetListener", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "CustomViewHolder", "app_DevDebug"})
public final class NutritionListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<indg.com.cover2protect.adapter.nutrition.NutritionListAdapter.NutritionListAdapter.CustomViewHolder> {
    private indg.com.cover2protect.presenter.OnItemClick listener;
    private android.content.Context context;
    private java.util.List<indg.com.cover2protect.model.nutrition.nutitionmodel.Common> response;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.adapter.nutrition.NutritionListAdapter.NutritionListAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void SetListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.OnItemClick listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.adapter.nutrition.NutritionListAdapter.NutritionListAdapter.CustomViewHolder holder, int position) {
    }
    
    public NutritionListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<indg.com.cover2protect.model.nutrition.nutitionmodel.Common> response) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/adapter/nutrition/NutritionListAdapter/NutritionListAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemLayoutNutritionBinding", "Lindg/com/cover2protect/databinding/ItemLayoutNutritionBinding;", "(Landroid/content/Context;Lindg/com/cover2protect/databinding/ItemLayoutNutritionBinding;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getItemLayoutNutritionBinding", "()Lindg/com/cover2protect/databinding/ItemLayoutNutritionBinding;", "setItemLayoutNutritionBinding", "(Lindg/com/cover2protect/databinding/ItemLayoutNutritionBinding;)V", "app_DevDebug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private indg.com.cover2protect.databinding.ItemLayoutNutritionBinding itemLayoutNutritionBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.databinding.ItemLayoutNutritionBinding getItemLayoutNutritionBinding() {
            return null;
        }
        
        public final void setItemLayoutNutritionBinding(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.ItemLayoutNutritionBinding p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.ItemLayoutNutritionBinding itemLayoutNutritionBinding) {
            super(null);
        }
    }
}