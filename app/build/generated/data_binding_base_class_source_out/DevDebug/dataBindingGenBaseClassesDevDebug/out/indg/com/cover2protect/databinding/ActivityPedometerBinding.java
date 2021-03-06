// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.clans.fab.FloatingActionButton;
import indg.com.cover2protect.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPedometerBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fab2;

  @NonNull
  public final com.google.android.material.floatingactionbutton.FloatingActionButton target;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityPedometerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fab2,
      com.google.android.material.floatingactionbutton.FloatingActionButton target,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fab2 = fab2;
    this.target = target;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityPedometerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pedometer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPedometerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPedometerBinding>inflateInternal(inflater, R.layout.activity_pedometer, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPedometerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pedometer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPedometerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPedometerBinding>inflateInternal(inflater, R.layout.activity_pedometer, null, false, component);
  }

  public static ActivityPedometerBinding bind(@NonNull View view) {
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
  public static ActivityPedometerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPedometerBinding)bind(component, view, R.layout.activity_pedometer);
  }
}
