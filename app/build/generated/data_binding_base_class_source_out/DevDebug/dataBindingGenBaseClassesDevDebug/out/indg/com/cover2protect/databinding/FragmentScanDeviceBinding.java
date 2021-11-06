// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import indg.com.cover2protect.R;
import indg.com.cover2protect.util.ripple.FButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentScanDeviceBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView anim;

  @NonNull
  public final LinearLayout deviceLl;

  @NonNull
  public final RecyclerView deviceRv;

  @NonNull
  public final LinearLayout infoLl;

  @NonNull
  public final FButton scan;

  protected FragmentScanDeviceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LottieAnimationView anim, LinearLayout deviceLl, RecyclerView deviceRv, LinearLayout infoLl,
      FButton scan) {
    super(_bindingComponent, _root, _localFieldCount);
    this.anim = anim;
    this.deviceLl = deviceLl;
    this.deviceRv = deviceRv;
    this.infoLl = infoLl;
    this.scan = scan;
  }

  @NonNull
  public static FragmentScanDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_scan_device, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScanDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentScanDeviceBinding>inflateInternal(inflater, R.layout.fragment_scan_device, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentScanDeviceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_scan_device, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentScanDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentScanDeviceBinding>inflateInternal(inflater, R.layout.fragment_scan_device, null, false, component);
  }

  public static FragmentScanDeviceBinding bind(@NonNull View view) {
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
  public static FragmentScanDeviceBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentScanDeviceBinding)bind(component, view, R.layout.fragment_scan_device);
  }
}