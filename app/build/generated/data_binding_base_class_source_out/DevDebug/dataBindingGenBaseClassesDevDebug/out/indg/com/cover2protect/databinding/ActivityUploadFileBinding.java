// Generated by data binding compiler. Do not edit!
package indg.com.cover2protect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.wang.avi.AVLoadingIndicatorView;
import de.hdodenhof.circleimageview.CircleImageView;
import indg.com.cover2protect.R;
import indg.com.cover2protect.util.ripple.FButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityUploadFileBinding extends ViewDataBinding {
  @NonNull
  public final AVLoadingIndicatorView avi;

  @NonNull
  public final EditText bpEt;

  @NonNull
  public final ImageView bpStatus;

  @NonNull
  public final TextView bpTv;

  @NonNull
  public final LinearLayout buttonLl;

  @NonNull
  public final FButton cameraBtn;

  @NonNull
  public final LinearLayout fileLl;

  @NonNull
  public final FButton galleryBtn;

  @NonNull
  public final EditText glucoseEt;

  @NonNull
  public final TextView glucosePp;

  @NonNull
  public final EditText glucosePpEt;

  @NonNull
  public final TextView glucoseTv;

  @NonNull
  public final EditText hdlEt;

  @NonNull
  public final ImageView hdlStatus;

  @NonNull
  public final TextView hdlTv;

  @NonNull
  public final EditText heartEt;

  @NonNull
  public final TextView heartTv;

  @NonNull
  public final ImageView hrStatus;

  @NonNull
  public final CircleImageView image;

  @NonNull
  public final EditText ldlEt;

  @NonNull
  public final ImageView ldlStatus;

  @NonNull
  public final TextView ldlTv;

  @NonNull
  public final ImageView sfStatus;

  @NonNull
  public final ImageView snfStatus;

  @NonNull
  public final FButton submit;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final EditText triEt;

  @NonNull
  public final ImageView triStatus;

  @NonNull
  public final TextView triTv;

  @NonNull
  public final LinearLayout uploadLl;

  protected ActivityUploadFileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AVLoadingIndicatorView avi, EditText bpEt, ImageView bpStatus, TextView bpTv,
      LinearLayout buttonLl, FButton cameraBtn, LinearLayout fileLl, FButton galleryBtn,
      EditText glucoseEt, TextView glucosePp, EditText glucosePpEt, TextView glucoseTv,
      EditText hdlEt, ImageView hdlStatus, TextView hdlTv, EditText heartEt, TextView heartTv,
      ImageView hrStatus, CircleImageView image, EditText ldlEt, ImageView ldlStatus,
      TextView ldlTv, ImageView sfStatus, ImageView snfStatus, FButton submit, Toolbar toolbar,
      EditText triEt, ImageView triStatus, TextView triTv, LinearLayout uploadLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avi = avi;
    this.bpEt = bpEt;
    this.bpStatus = bpStatus;
    this.bpTv = bpTv;
    this.buttonLl = buttonLl;
    this.cameraBtn = cameraBtn;
    this.fileLl = fileLl;
    this.galleryBtn = galleryBtn;
    this.glucoseEt = glucoseEt;
    this.glucosePp = glucosePp;
    this.glucosePpEt = glucosePpEt;
    this.glucoseTv = glucoseTv;
    this.hdlEt = hdlEt;
    this.hdlStatus = hdlStatus;
    this.hdlTv = hdlTv;
    this.heartEt = heartEt;
    this.heartTv = heartTv;
    this.hrStatus = hrStatus;
    this.image = image;
    this.ldlEt = ldlEt;
    this.ldlStatus = ldlStatus;
    this.ldlTv = ldlTv;
    this.sfStatus = sfStatus;
    this.snfStatus = snfStatus;
    this.submit = submit;
    this.toolbar = toolbar;
    this.triEt = triEt;
    this.triStatus = triStatus;
    this.triTv = triTv;
    this.uploadLl = uploadLl;
  }

  @NonNull
  public static ActivityUploadFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_upload_file, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUploadFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityUploadFileBinding>inflateInternal(inflater, R.layout.activity_upload_file, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityUploadFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_upload_file, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUploadFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityUploadFileBinding>inflateInternal(inflater, R.layout.activity_upload_file, null, false, component);
  }

  public static ActivityUploadFileBinding bind(@NonNull View view) {
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
  public static ActivityUploadFileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityUploadFileBinding)bind(component, view, R.layout.activity_upload_file);
  }
}
