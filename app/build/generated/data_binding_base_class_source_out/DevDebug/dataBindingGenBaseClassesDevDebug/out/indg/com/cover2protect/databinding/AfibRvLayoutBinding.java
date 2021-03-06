// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.model.trends.afib.Data;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AfibRvLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView afib;

  @NonNull
  public final TextView afibCount;

  @Bindable
  protected Data mData;

  protected AfibRvLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView afib, TextView afibCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.afib = afib;
    this.afibCount = afibCount;
  }

  public abstract void setData(@Nullable Data data);

  @Nullable
  public Data getData() {
    return mData;
  }

  @NonNull
  public static AfibRvLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.afib_rv_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AfibRvLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AfibRvLayoutBinding>inflateInternal(inflater, R.layout.afib_rv_layout, root, attachToRoot, component);
  }

  @NonNull
  public static AfibRvLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.afib_rv_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AfibRvLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AfibRvLayoutBinding>inflateInternal(inflater, R.layout.afib_rv_layout, null, false, component);
  }

  public static AfibRvLayoutBinding bind(@NonNull View view) {
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
  public static AfibRvLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (AfibRvLayoutBinding)bind(component, view, R.layout.afib_rv_layout);
  }
}
