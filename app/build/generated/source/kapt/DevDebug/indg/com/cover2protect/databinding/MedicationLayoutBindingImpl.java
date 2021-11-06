package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MedicationLayoutBindingImpl extends MedicationLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cancel, 3);
        sViewsWithIds.put(R.id.syrup_btn, 4);
        sViewsWithIds.put(R.id.tablet_btn, 5);
        sViewsWithIds.put(R.id.vial_btn, 6);
        sViewsWithIds.put(R.id.number_button, 7);
        sViewsWithIds.put(R.id.save, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MedicationLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private MedicationLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (indg.com.cover2protect.util.counter.ElegantNumberButton) bindings[7]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[8]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[4]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[5]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[6]
            );
        this.dosage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.medname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setModel((indg.com.cover2protect.model.medicationmodel.medicationinfo.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable indg.com.cover2protect.model.medicationmodel.medicationinfo.Data Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
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
        indg.com.cover2protect.model.medicationmodel.medicationinfo.Data model = mModel;
        java.lang.String modelValue = null;
        java.lang.String modelDosage = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.value
                    modelValue = model.getValue();
                    // read model.dosage
                    modelDosage = model.getDosage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dosage, modelDosage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.medname, modelValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}