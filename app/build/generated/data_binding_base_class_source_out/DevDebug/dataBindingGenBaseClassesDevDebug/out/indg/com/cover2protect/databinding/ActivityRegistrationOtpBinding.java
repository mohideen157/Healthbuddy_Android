// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import indg.com.cover2protect.R;
import indg.com.cover2protect.util.pin_view.Pinview;
import indg.com.cover2protect.util.ripple.FButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRegistrationOtpBinding extends ViewDataBinding {
  @NonNull
  public final TextView number;

  @NonNull
  public final Pinview pinview;

  @NonNull
  public final TextView resend;

  @NonNull
  public final FButton submit;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityRegistrationOtpBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView number, Pinview pinview, TextView resend, FButton submit,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.number = number;
    this.pinview = pinview;
    this.resend = resend;
    this.submit = submit;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityRegistrationOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_registration__otp, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegistrationOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRegistrationOtpBinding>inflateInternal(inflater, R.layout.activity_registration__otp, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRegistrationOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_registration__otp, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegistrationOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRegistrationOtpBinding>inflateInternal(inflater, R.layout.activity_registration__otp, null, false, component);
  }

  public static ActivityRegistrationOtpBinding bind(@NonNull View view) {
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
  public static ActivityRegistrationOtpBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityRegistrationOtpBinding)bind(component, view, R.layout.activity_registration__otp);
  }
}
