package indg.com.cover2protect.adapter.medicalreport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lindg/com/cover2protect/adapter/medicalreport/medical_report_adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lindg/com/cover2protect/adapter/medicalreport/medical_report_adapter$CustomViewHolder;", "context", "Landroid/content/Context;", "response", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/medicalreport/medical_report_get/Data;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "listener", "Lindg/com/cover2protect/presenter/reportlistener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setListener", "CustomViewHolder", "app_DevDebug"})
public final class medical_report_adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<indg.com.cover2protect.adapter.medicalreport.medical_report_adapter.CustomViewHolder> {
    private indg.com.cover2protect.presenter.reportlistener listener;
    private android.content.Context context;
    private java.util.ArrayList<indg.com.cover2protect.model.medicalreport.medical_report_get.Data> response;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.adapter.medicalreport.medical_report_adapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.reportlistener listener) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.adapter.medicalreport.medical_report_adapter.CustomViewHolder holder, int position) {
    }
    
    public medical_report_adapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<indg.com.cover2protect.model.medicalreport.medical_report_get.Data> response) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/adapter/medicalreport/medical_report_adapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "healthReportRvLayoutBinding", "Lindg/com/cover2protect/databinding/HealthReportRvLayoutBinding;", "(Landroid/content/Context;Lindg/com/cover2protect/databinding/HealthReportRvLayoutBinding;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getHealthReportRvLayoutBinding", "()Lindg/com/cover2protect/databinding/HealthReportRvLayoutBinding;", "setHealthReportRvLayoutBinding", "(Lindg/com/cover2protect/databinding/HealthReportRvLayoutBinding;)V", "app_DevDebug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private indg.com.cover2protect.databinding.HealthReportRvLayoutBinding healthReportRvLayoutBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.databinding.HealthReportRvLayoutBinding getHealthReportRvLayoutBinding() {
            return null;
        }
        
        public final void setHealthReportRvLayoutBinding(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.HealthReportRvLayoutBinding p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.HealthReportRvLayoutBinding healthReportRvLayoutBinding) {
            super(null);
        }
    }
}