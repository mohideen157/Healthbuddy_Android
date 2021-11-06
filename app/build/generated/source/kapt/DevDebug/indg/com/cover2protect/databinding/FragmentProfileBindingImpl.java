package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profile_card, 5);
        sViewsWithIds.put(R.id.profile_img, 6);
        sViewsWithIds.put(R.id.bmi_color_img, 7);
        sViewsWithIds.put(R.id.hbc_img, 8);
        sViewsWithIds.put(R.id.connected_status, 9);
        sViewsWithIds.put(R.id.hhi_tv, 10);
        sViewsWithIds.put(R.id.hhi_text, 11);
        sViewsWithIds.put(R.id.name_hint, 12);
        sViewsWithIds.put(R.id.recycler_view, 13);
        sViewsWithIds.put(R.id.devices, 14);
        sViewsWithIds.put(R.id.buynow_img, 15);
        sViewsWithIds.put(R.id.viewall_img, 16);
        sViewsWithIds.put(R.id.article_rv, 17);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.RelativeLayout) bindings[16]
            );
        this.conf.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
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
            setModel((indg.com.cover2protect.model.profile.Profile) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((indg.com.cover2protect.viewmodel.mainprofileviewmodel.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable indg.com.cover2protect.model.profile.Profile Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable indg.com.cover2protect.viewmodel.mainprofileviewmodel.ProfileViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
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
        indg.com.cover2protect.model.profile.Profile model = mModel;
        java.lang.String modelDataAge = null;
        java.lang.String modelDataName = null;
        boolean modelDataAgeJavaLangObjectNull = false;
        java.lang.String modelDataBloodGroup = null;
        java.lang.String modelDataAgeJavaLangObjectNullModelDataAgeJavaLangStringYrOldJavaLangString0YrOld = null;
        java.lang.String modelDataAgeJavaLangStringYrOld = null;
        indg.com.cover2protect.model.profile.Data modelData = null;
        java.lang.String modelDataBmi = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.data
                    modelData = model.getData();
                }


                if (modelData != null) {
                    // read model.data.age
                    modelDataAge = modelData.getAge();
                    // read model.data.name
                    modelDataName = modelData.getName();
                    // read model.data.blood_group
                    modelDataBloodGroup = modelData.getBlood_group();
                    // read model.data.bmi
                    modelDataBmi = modelData.getBmi();
                }


                // read model.data.age != null
                modelDataAgeJavaLangObjectNull = (modelDataAge) != (null);
            if((dirtyFlags & 0x5L) != 0) {
                if(modelDataAgeJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                // read (model.data.age) + ("yr old")
                modelDataAgeJavaLangStringYrOld = (modelDataAge) + ("yr old");
        }

        if ((dirtyFlags & 0x5L) != 0) {

                // read model.data.age != null ? (model.data.age) + ("yr old") : "0 yr old"
                modelDataAgeJavaLangObjectNullModelDataAgeJavaLangStringYrOldJavaLangString0YrOld = ((modelDataAgeJavaLangObjectNull) ? (modelDataAgeJavaLangStringYrOld) : ("0 yr old"));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, modelDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, modelDataAgeJavaLangObjectNullModelDataAgeJavaLangStringYrOldJavaLangString0YrOld);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, modelDataBmi);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, modelDataBloodGroup);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): model.data.age != null ? (model.data.age) + ("yr old") : "0 yr old"
        flag 4 (0x5L): model.data.age != null ? (model.data.age) + ("yr old") : "0 yr old"
    flag mapping end*/
    //end
}