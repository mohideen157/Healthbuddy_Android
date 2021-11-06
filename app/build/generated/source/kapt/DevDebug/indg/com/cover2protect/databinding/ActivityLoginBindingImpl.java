package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements indg.com.cover2protect.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ccp, 3);
        sViewsWithIds.put(R.id.username, 4);
        sViewsWithIds.put(R.id.password, 5);
        sViewsWithIds.put(R.id.forgot_password, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final indg.com.cover2protect.util.ripple.FButton mboundView1;
    @NonNull
    private final android.widget.Button mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.rilixtech.CountryCodePicker) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (indg.com.cover2protect.util.ripple.FButton) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new indg.com.cover2protect.generated.callback.OnClickListener(this, 1);
        mCallback4 = new indg.com.cover2protect.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.presenter == variableId) {
            setPresenter((indg.com.cover2protect.presenter.Presenter) variable);
        }
        else if (BR.registerpresenter == variableId) {
            setRegisterpresenter((indg.com.cover2protect.presenter.RegisterPresenter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPresenter(@Nullable indg.com.cover2protect.presenter.Presenter Presenter) {
        this.mPresenter = Presenter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.presenter);
        super.requestRebind();
    }
    public void setRegisterpresenter(@Nullable indg.com.cover2protect.presenter.RegisterPresenter Registerpresenter) {
        this.mRegisterpresenter = Registerpresenter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.registerpresenter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel ViewModel) {
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
        indg.com.cover2protect.presenter.Presenter presenter = mPresenter;
        indg.com.cover2protect.presenter.RegisterPresenter registerpresenter = mRegisterpresenter;
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback3);
            this.mboundView2.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // presenter != null
                boolean presenterJavaLangObjectNull = false;
                // presenter
                indg.com.cover2protect.presenter.Presenter presenter = mPresenter;



                presenterJavaLangObjectNull = (presenter) != (null);
                if (presenterJavaLangObjectNull) {


                    presenter.logIn();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // registerpresenter != null
                boolean registerpresenterJavaLangObjectNull = false;
                // registerpresenter
                indg.com.cover2protect.presenter.RegisterPresenter registerpresenter = mRegisterpresenter;



                registerpresenterJavaLangObjectNull = (registerpresenter) != (null);
                if (registerpresenterJavaLangObjectNull) {


                    registerpresenter.Register();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): presenter
        flag 1 (0x2L): registerpresenter
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}