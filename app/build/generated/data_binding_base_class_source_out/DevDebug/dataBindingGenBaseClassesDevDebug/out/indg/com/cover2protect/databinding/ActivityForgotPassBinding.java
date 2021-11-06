// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rilixtech.CountryCodePicker;
import indg.com.cover2protect.R;
import indg.com.cover2protect.util.ripple.FButton;
import indg.com.cover2protect.viewmodel.forgotpasswordvm.ForgotPasswordViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityForgotPassBinding extends ViewDataBinding {
  @NonNull
  public final CountryCodePicker ccp;

  @NonNull
  public final FButton submit;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final EditText username;

  @Bindable
  protected ForgotPasswordViewModel mViewmodel;

  protected ActivityForgotPassBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CountryCodePicker ccp, FButton submit, Toolbar toolbar, EditText username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ccp = ccp;
    this.submit = submit;
    this.toolbar = toolbar;
    this.username = username;
  }

  public abstract void setViewmodel(@Nullable ForgotPasswordViewModel viewmodel);

  @Nullable
  public ForgotPasswordViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityForgotPassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_forgot_pass, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityForgotPassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityForgotPassBinding>inflateInternal(inflater, R.layout.activity_forgot_pass, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityForgotPassBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_forgot_pass, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityForgotPassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityForgotPassBinding>inflateInternal(inflater, R.layout.activity_forgot_pass, null, false, component);
  }

  public static ActivityForgotPassBinding bind(@NonNull View view) {
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
  public static ActivityForgotPassBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityForgotPassBinding)bind(component, view, R.layout.activity_forgot_pass);
  }
}
