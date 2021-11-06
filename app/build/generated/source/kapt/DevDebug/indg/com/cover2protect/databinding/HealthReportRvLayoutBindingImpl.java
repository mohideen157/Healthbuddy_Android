package indg.com.cover2protect.databinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HealthReportRvLayoutBindingImpl extends HealthReportRvLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.row1, 9);
        sViewsWithIds.put(R.id.heartRateItem, 10);
        sViewsWithIds.put(R.id.heartRateLabel, 11);
        sViewsWithIds.put(R.id.heartRateUnit, 12);
        sViewsWithIds.put(R.id.bloodPressureItem, 13);
        sViewsWithIds.put(R.id.bloodPressureLabel, 14);
        sViewsWithIds.put(R.id.bpUnit, 15);
        sViewsWithIds.put(R.id.pwvItem, 16);
        sViewsWithIds.put(R.id.pwvLabel, 17);
        sViewsWithIds.put(R.id.row2, 18);
        sViewsWithIds.put(R.id.afibItem, 19);
        sViewsWithIds.put(R.id.afibLabel, 20);
        sViewsWithIds.put(R.id.arrhythmiaItem, 21);
        sViewsWithIds.put(R.id.arrhythmiaLabel, 22);
        sViewsWithIds.put(R.id.hrvLevelItem, 23);
        sViewsWithIds.put(R.id.hrvLabel, 24);
        sViewsWithIds.put(R.id.eventIdItem, 25);
        sViewsWithIds.put(R.id.eventIdLabel, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HealthReportRvLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private HealthReportRvLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RelativeLayout) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[8]
            , (android.widget.RelativeLayout) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[7]
            , (android.widget.RelativeLayout) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[18]
            );
        this.afibValue.setTag(null);
        this.arrhythmiaValue.setTag(null);
        this.bloodPressure.setTag(null);
        this.date.setTag(null);
        this.eventId.setTag(null);
        this.heartRateView.setTag(null);
        this.hrvLevel.setTag(null);
        this.itemLayout.setTag(null);
        this.pwvValue.setTag(null);
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
        if (BR.data == variableId) {
            setData((indg.com.cover2protect.model.medicalreport.medical_report_get.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable indg.com.cover2protect.model.medicalreport.medical_report_get.Data Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
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
        java.lang.String dataBp = null;
        java.lang.String dataHdlCholesterol = null;
        java.lang.String dataLdlCholesterol = null;
        java.lang.String dataTriglycerides = null;
        indg.com.cover2protect.model.medicalreport.medical_report_get.Data data = mData;
        java.lang.String dataHeartRate = null;
        java.lang.String dataSugarFasting = null;
        java.lang.String dataCreatedAt = null;
        java.lang.String dataSugarNonFasting = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.bp
                    dataBp = data.getBp();
                    // read data.hdl_cholesterol
                    dataHdlCholesterol = data.getHdl_cholesterol();
                    // read data.ldl_cholesterol
                    dataLdlCholesterol = data.getLdl_cholesterol();
                    // read data.triglycerides
                    dataTriglycerides = data.getTriglycerides();
                    // read data.heart_rate
                    dataHeartRate = data.getHeart_rate();
                    // read data.sugar_fasting
                    dataSugarFasting = data.getSugar_fasting();
                    // read data.created_at
                    dataCreatedAt = data.getCreated_at();
                    // read data.sugar_non_fasting
                    dataSugarNonFasting = data.getSugar_non_fasting();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.afibValue, dataSugarFasting);
            this.arrhythmiaValue.setText(dataSugarNonFasting);
            this.bloodPressure.setText(dataBp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, dataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.eventId, dataHdlCholesterol);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.heartRateView, dataHeartRate);
            this.hrvLevel.setText(dataTriglycerides);
            this.pwvValue.setText(dataLdlCholesterol);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}