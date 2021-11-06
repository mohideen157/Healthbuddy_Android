package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUploadFileBindingImpl extends ActivityUploadFileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.upload_ll, 2);
        sViewsWithIds.put(R.id.image, 3);
        sViewsWithIds.put(R.id.file_ll, 4);
        sViewsWithIds.put(R.id.heart_tv, 5);
        sViewsWithIds.put(R.id.heart_et, 6);
        sViewsWithIds.put(R.id.hr_status, 7);
        sViewsWithIds.put(R.id.bp_tv, 8);
        sViewsWithIds.put(R.id.bp_et, 9);
        sViewsWithIds.put(R.id.bp_status, 10);
        sViewsWithIds.put(R.id.glucose_tv, 11);
        sViewsWithIds.put(R.id.glucose_et, 12);
        sViewsWithIds.put(R.id.sf_status, 13);
        sViewsWithIds.put(R.id.glucose_pp, 14);
        sViewsWithIds.put(R.id.glucose_pp_et, 15);
        sViewsWithIds.put(R.id.snf_status, 16);
        sViewsWithIds.put(R.id.tri_tv, 17);
        sViewsWithIds.put(R.id.tri_et, 18);
        sViewsWithIds.put(R.id.tri_status, 19);
        sViewsWithIds.put(R.id.hdl_tv, 20);
        sViewsWithIds.put(R.id.hdl_et, 21);
        sViewsWithIds.put(R.id.hdl_status, 22);
        sViewsWithIds.put(R.id.ldl_tv, 23);
        sViewsWithIds.put(R.id.ldl_et, 24);
        sViewsWithIds.put(R.id.ldl_status, 25);
        sViewsWithIds.put(R.id.submit, 26);
        sViewsWithIds.put(R.id.button_ll, 27);
        sViewsWithIds.put(R.id.gallery_btn, 28);
        sViewsWithIds.put(R.id.camera_btn, 29);
        sViewsWithIds.put(R.id.avi, 30);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUploadFileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityUploadFileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.wang.avi.AVLoadingIndicatorView) bindings[30]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[27]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[29]
            , (android.widget.LinearLayout) bindings[4]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[28]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.EditText) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (android.widget.EditText) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.widget.EditText) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.TextView) bindings[23]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[16]
            , (indg.com.cover2protect.util.ripple.FButton) bindings[26]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.EditText) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}