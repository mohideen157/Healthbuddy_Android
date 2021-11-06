package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDataDetailBindingImpl extends ActivityDataDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.ripple_bp, 7);
        sViewsWithIds.put(R.id.bp_tv, 8);
        sViewsWithIds.put(R.id.bp_txt, 9);
        sViewsWithIds.put(R.id.ripple_pulse, 10);
        sViewsWithIds.put(R.id.hr_txt, 11);
        sViewsWithIds.put(R.id.ripple_rpwv, 12);
        sViewsWithIds.put(R.id.rpwv_txt, 13);
        sViewsWithIds.put(R.id.ripple_afib, 14);
        sViewsWithIds.put(R.id.afib_txt, 15);
        sViewsWithIds.put(R.id.ripple_arrythmia, 16);
        sViewsWithIds.put(R.id.arrythmia_txt, 17);
        sViewsWithIds.put(R.id.hrvLevel_txt, 18);
        sViewsWithIds.put(R.id.event_spinner, 19);
        sViewsWithIds.put(R.id.status, 20);
        sViewsWithIds.put(R.id.title, 21);
        sViewsWithIds.put(R.id.pulseimageview, 22);
        sViewsWithIds.put(R.id.ecg, 23);
        sViewsWithIds.put(R.id.ecgimageview, 24);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDataDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityDataDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.Spinner) bindings[19]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ImageView) bindings[22]
            , (com.balysv.materialripple.MaterialRippleLayout) bindings[14]
            , (com.balysv.materialripple.MaterialRippleLayout) bindings[16]
            , (com.balysv.materialripple.MaterialRippleLayout) bindings[7]
            , (com.balysv.materialripple.MaterialRippleLayout) bindings[10]
            , (com.balysv.materialripple.MaterialRippleLayout) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            );
        this.afibTv.setTag(null);
        this.arrythmiaTv.setTag(null);
        this.hrTv.setTag(null);
        this.hrvLevel.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rpwvTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((indg.com.cover2protect.model.deviceresponse.Data) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((indg.com.cover2protect.viewmodel.devicedataviewmodel.DeviceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable indg.com.cover2protect.model.deviceresponse.Data Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setViewModel(@Nullable indg.com.cover2protect.viewmodel.devicedataviewmodel.DeviceViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        indg.com.cover2protect.model.deviceresponse.Data model = mModel;
        java.lang.String modelAfib = null;
        java.lang.String modelPwv = null;
        java.lang.String modelHr = null;
        java.lang.String modelArrhythmia = null;
        java.lang.String modelHrvLevel = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.afib
                    modelAfib = model.getAfib();
                    // read model.pwv
                    modelPwv = model.getPwv();
                    // read model.hr
                    modelHr = model.getHr();
                    // read model.arrhythmia
                    modelArrhythmia = model.getArrhythmia();
                    // read model.hrv_level
                    modelHrvLevel = model.getHrv_level();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.afibTv, modelAfib);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.arrythmiaTv, modelArrhythmia);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hrTv, modelHr);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hrvLevel, modelHrvLevel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rpwvTv, modelPwv);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}