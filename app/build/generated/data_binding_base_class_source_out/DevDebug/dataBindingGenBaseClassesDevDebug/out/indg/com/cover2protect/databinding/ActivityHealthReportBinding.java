// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import indg.com.cover2protect.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHealthReportBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView anim;

  @NonNull
  public final RecyclerView medicalRv;

  @NonNull
  public final LinearLayout nodataLl;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityHealthReportBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView anim, RecyclerView medicalRv, LinearLayout nodataLl, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.anim = anim;
    this.medicalRv = medicalRv;
    this.nodataLl = nodataLl;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityHealthReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_health_report, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHealthReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHealthReportBinding>inflateInternal(inflater, R.layout.activity_health_report, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHealthReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_health_report, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHealthReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHealthReportBinding>inflateInternal(inflater, R.layout.activity_health_report, null, false, component);
  }

  public static ActivityHealthReportBinding bind(@NonNull View view) {
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
  public static ActivityHealthReportBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHealthReportBinding)bind(component, view, R.layout.activity_health_report);
  }
}