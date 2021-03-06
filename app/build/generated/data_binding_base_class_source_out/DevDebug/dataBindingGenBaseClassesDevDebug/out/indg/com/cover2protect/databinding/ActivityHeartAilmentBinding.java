// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.lzyzsd.circleprogress.DonutProgress;
import indg.com.cover2protect.R;
import indg.com.cover2protect.viewmodel.heartailment_vm.HeartAilmentViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHeartAilmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backward;

  @NonNull
  public final DonutProgress donutProgress;

  @NonNull
  public final ImageView forward;

  @NonNull
  public final RelativeLayout noRl;

  @NonNull
  public final TextView skip;

  @NonNull
  public final LinearLayout skipLl;

  @NonNull
  public final RelativeLayout yesRl;

  @Bindable
  protected HeartAilmentViewModel mViewModel;

  protected ActivityHeartAilmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView backward, DonutProgress donutProgress, ImageView forward, RelativeLayout noRl,
      TextView skip, LinearLayout skipLl, RelativeLayout yesRl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backward = backward;
    this.donutProgress = donutProgress;
    this.forward = forward;
    this.noRl = noRl;
    this.skip = skip;
    this.skipLl = skipLl;
    this.yesRl = yesRl;
  }

  public abstract void setViewModel(@Nullable HeartAilmentViewModel viewModel);

  @Nullable
  public HeartAilmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityHeartAilmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_heart_ailment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHeartAilmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHeartAilmentBinding>inflateInternal(inflater, R.layout.activity_heart_ailment, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHeartAilmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_heart_ailment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHeartAilmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHeartAilmentBinding>inflateInternal(inflater, R.layout.activity_heart_ailment, null, false, component);
  }

  public static ActivityHeartAilmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHeartAilmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHeartAilmentBinding)bind(component, view, R.layout.activity_heart_ailment);
  }
}
