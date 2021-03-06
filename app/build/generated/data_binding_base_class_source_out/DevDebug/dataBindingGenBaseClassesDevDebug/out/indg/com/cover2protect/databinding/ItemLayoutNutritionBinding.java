// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.model.nutrition.nutitionmodel.Common;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemLayoutNutritionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView itemSearchCommonIv;

  @NonNull
  public final LinearLayout itemSearchCommonLayout;

  @NonNull
  public final TextView itemSearchCommonNameTv;

  @Bindable
  protected Common mData;

  protected ItemLayoutNutritionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView itemSearchCommonIv, LinearLayout itemSearchCommonLayout,
      TextView itemSearchCommonNameTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.itemSearchCommonIv = itemSearchCommonIv;
    this.itemSearchCommonLayout = itemSearchCommonLayout;
    this.itemSearchCommonNameTv = itemSearchCommonNameTv;
  }

  public abstract void setData(@Nullable Common data);

  @Nullable
  public Common getData() {
    return mData;
  }

  @NonNull
  public static ItemLayoutNutritionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_layout_nutrition, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLayoutNutritionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLayoutNutritionBinding>inflateInternal(inflater, R.layout.item_layout_nutrition, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLayoutNutritionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_layout_nutrition, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLayoutNutritionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLayoutNutritionBinding>inflateInternal(inflater, R.layout.item_layout_nutrition, null, false, component);
  }

  public static ItemLayoutNutritionBinding bind(@NonNull View view) {
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
  public static ItemLayoutNutritionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLayoutNutritionBinding)bind(component, view, R.layout.item_layout_nutrition);
  }
}
