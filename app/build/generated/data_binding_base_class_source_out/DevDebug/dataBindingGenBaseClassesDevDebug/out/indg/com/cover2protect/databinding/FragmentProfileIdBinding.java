// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.lzyzsd.circleprogress.DonutProgress;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import indg.com.cover2protect.R;
import indg.com.cover2protect.model.profile.Data;
import indg.com.cover2protect.util.material_text_view.MaterialTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileIdBinding extends ViewDataBinding {
  @NonNull
  public final MaterialTextView dobTv;

  @NonNull
  public final DonutProgress donutProgress;

  @NonNull
  public final RelativeLayout femaleLl;

  @NonNull
  public final ImageView forwardImg;

  @NonNull
  public final RelativeLayout maleLl;

  @NonNull
  public final RelativeLayout otherLl;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView skip;

  @NonNull
  public final RelativeLayout skipLl;

  @NonNull
  public final EditText txtAdharid;

  @NonNull
  public final TextInputLayout usernameWrapper;

  @Bindable
  protected Data mViewModel;

  protected FragmentProfileIdBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialTextView dobTv, DonutProgress donutProgress, RelativeLayout femaleLl,
      ImageView forwardImg, RelativeLayout maleLl, RelativeLayout otherLl,
      CircleImageView profileImage, TextView skip, RelativeLayout skipLl, EditText txtAdharid,
      TextInputLayout usernameWrapper) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dobTv = dobTv;
    this.donutProgress = donutProgress;
    this.femaleLl = femaleLl;
    this.forwardImg = forwardImg;
    this.maleLl = maleLl;
    this.otherLl = otherLl;
    this.profileImage = profileImage;
    this.skip = skip;
    this.skipLl = skipLl;
    this.txtAdharid = txtAdharid;
    this.usernameWrapper = usernameWrapper;
  }

  public abstract void setViewModel(@Nullable Data viewModel);

  @Nullable
  public Data getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentProfileIdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_id, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileIdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileIdBinding>inflateInternal(inflater, R.layout.fragment_profile_id, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileIdBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile_id, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileIdBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileIdBinding>inflateInternal(inflater, R.layout.fragment_profile_id, null, false, component);
  }

  public static FragmentProfileIdBinding bind(@NonNull View view) {
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
  public static FragmentProfileIdBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileIdBinding)bind(component, view, R.layout.fragment_profile_id);
  }
}