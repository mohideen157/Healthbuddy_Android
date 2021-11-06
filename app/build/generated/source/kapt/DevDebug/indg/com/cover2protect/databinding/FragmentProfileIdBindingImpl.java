package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileIdBindingImpl extends FragmentProfileIdBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.donut_progress, 3);
        sViewsWithIds.put(R.id.skip_ll, 4);
        sViewsWithIds.put(R.id.skip, 5);
        sViewsWithIds.put(R.id.profile_image, 6);
        sViewsWithIds.put(R.id.male_ll, 7);
        sViewsWithIds.put(R.id.female_ll, 8);
        sViewsWithIds.put(R.id.other_ll, 9);
        sViewsWithIds.put(R.id.dob_tv, 10);
        sViewsWithIds.put(R.id.usernameWrapper, 11);
        sViewsWithIds.put(R.id.forward_img, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileIdBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentProfileIdBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (indg.com.cover2protect.util.material_text_view.MaterialTextView) bindings[10]
            , (com.github.lzyzsd.circleprogress.DonutProgress) bindings[3]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.txtAdharid.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((indg.com.cover2protect.model.profile.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable indg.com.cover2protect.model.profile.Data ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        java.lang.String viewModelNationalId = null;
        java.lang.String viewModelName = null;
        indg.com.cover2protect.model.profile.Data viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.national_id
                    viewModelNationalId = viewModel.getNational_id();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAdharid, viewModelNationalId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}