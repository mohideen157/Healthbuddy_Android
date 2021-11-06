package indg.com.cover2protect.adapter.medication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lindg/com/cover2protect/adapter/medication/MedicationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lindg/com/cover2protect/adapter/medication/MedicationAdapter$CustomViewHolder;", "context", "Landroid/content/Context;", "response", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/medicationmodel/medicationinfo/Data;", "Lkotlin/collections/ArrayList;", "listener", "Lindg/com/cover2protect/presenter/Medicationlistener;", "(Landroid/content/Context;Ljava/util/ArrayList;Lindg/com/cover2protect/presenter/Medicationlistener;)V", "count", "", "counter", "", "dosage", "getListener", "()Lindg/com/cover2protect/presenter/Medicationlistener;", "setListener", "(Lindg/com/cover2protect/presenter/Medicationlistener;)V", "onclick", "type", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "CustomViewHolder", "app_DevDebug"})
public final class MedicationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<indg.com.cover2protect.adapter.medication.MedicationAdapter.CustomViewHolder> {
    private indg.com.cover2protect.presenter.Medicationlistener onclick;
    private java.lang.String type;
    private java.lang.String dosage;
    private java.lang.String count;
    private int counter;
    private android.content.Context context;
    private java.util.ArrayList<indg.com.cover2protect.model.medicationmodel.medicationinfo.Data> response;
    @org.jetbrains.annotations.NotNull()
    private indg.com.cover2protect.presenter.Medicationlistener listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.adapter.medication.MedicationAdapter.CustomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.adapter.medication.MedicationAdapter.CustomViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.presenter.Medicationlistener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.Medicationlistener p0) {
    }
    
    public MedicationAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<indg.com.cover2protect.model.medicationmodel.medicationinfo.Data> response, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.Medicationlistener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lindg/com/cover2protect/adapter/medication/MedicationAdapter$CustomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "medicationLayoutBinding", "Lindg/com/cover2protect/databinding/MedicationLayoutBinding;", "(Landroid/content/Context;Lindg/com/cover2protect/databinding/MedicationLayoutBinding;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getMedicationLayoutBinding", "()Lindg/com/cover2protect/databinding/MedicationLayoutBinding;", "setMedicationLayoutBinding", "(Lindg/com/cover2protect/databinding/MedicationLayoutBinding;)V", "app_DevDebug"})
    public static final class CustomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        @org.jetbrains.annotations.NotNull()
        private indg.com.cover2protect.databinding.MedicationLayoutBinding medicationLayoutBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.databinding.MedicationLayoutBinding getMedicationLayoutBinding() {
            return null;
        }
        
        public final void setMedicationLayoutBinding(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.MedicationLayoutBinding p0) {
        }
        
        public CustomViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.databinding.MedicationLayoutBinding medicationLayoutBinding) {
            super(null);
        }
    }
}