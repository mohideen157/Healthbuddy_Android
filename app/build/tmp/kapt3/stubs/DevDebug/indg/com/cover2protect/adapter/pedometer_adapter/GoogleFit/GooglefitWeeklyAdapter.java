package indg.com.cover2protect.adapter.pedometer_adapter.GoogleFit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lindg/com/cover2protect/adapter/pedometer_adapter/GoogleFit/GooglefitWeeklyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lindg/com/cover2protect/adapter/pedometer_adapter/GoogleFit/GooglefitWeeklyAdapter$CustomViewHolder;", "context", "Landroid/content/Context;", "response", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/googlefit/PedometerResponse;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "CustomViewHolder", "app_DevDebug"})
public final class GooglefitWeeklyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<indg.com.cover2protect.adapter.pedometer_adapter.GoogleFit.GooglefitWeeklyAdapter.CustomViewHolder> {
    private android.content.Context context;
    private java.util.ArrayList<indg.com.cover2protect.model.googlefit.PedometerResponse> response;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.adapter.pedometer_adapter.GoogleFit.GooglefitWeeklyAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.adapter.pedometer_adapter.GoogleFit.GooglefitWeeklyAdapter.CustomViewHolder holder, int position) {
    }
    
    public GooglefitWeeklyAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<indg.com.cover2protect.model.googlefit.PedometerResponse> response) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/adapter/pedometer_adapter/GoogleFit/GooglefitWeeklyAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "weekLayoutBinding", "Lindg/com/cover2protect/databinding/PedometerWeeklyRvBinding;", "(Landroid/content/Context;Lindg/com/cover2protect/databinding/PedometerWeeklyRvBinding;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getWeekLayoutBinding", "()Lindg/com/cover2protect/databinding/PedometerWeeklyRvBinding;", "setWeekLayoutBinding", "(Lindg/com/cover2protect/databinding/PedometerWeeklyRvBinding;)V", "app_DevDebug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private indg.com.cover2protect.databinding.PedometerWeeklyRvBinding weekLayoutBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.databinding.PedometerWeeklyRvBinding getWeekLayoutBinding() {
            return null;
        }
        
        public final void setWeekLayoutBinding(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.PedometerWeeklyRvBinding p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.PedometerWeeklyRvBinding weekLayoutBinding) {
            super(null);
        }
    }
}