package indg.com.cover2protect;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import indg.com.cover2protect.databinding.ActivityArticleDetailBindingImpl;
import indg.com.cover2protect.databinding.ActivityArticlePaginationBindingImpl;
import indg.com.cover2protect.databinding.ActivityDataDetailBindingImpl;
import indg.com.cover2protect.databinding.ActivityForgotPassBindingImpl;
import indg.com.cover2protect.databinding.ActivityHealthReportBindingImpl;
import indg.com.cover2protect.databinding.ActivityHeartAilmentBindingImpl;
import indg.com.cover2protect.databinding.ActivityHhiBindingImpl;
import indg.com.cover2protect.databinding.ActivityHistory2BindingImpl;
import indg.com.cover2protect.databinding.ActivityLoginBindingImpl;
import indg.com.cover2protect.databinding.ActivityNewPasswordBindingImpl;
import indg.com.cover2protect.databinding.ActivityPedometerBindingImpl;
import indg.com.cover2protect.databinding.ActivityProfileBindingImpl;
import indg.com.cover2protect.databinding.ActivityRegisterBindingImpl;
import indg.com.cover2protect.databinding.ActivityRegistrationOtpBindingImpl;
import indg.com.cover2protect.databinding.ActivityResetPasswordBindingImpl;
import indg.com.cover2protect.databinding.ActivityResultBindingImpl;
import indg.com.cover2protect.databinding.ActivityUploadFileBindingImpl;
import indg.com.cover2protect.databinding.AfibRvLayoutBindingImpl;
import indg.com.cover2protect.databinding.ArrhythmiaRvLayoutBindingImpl;
import indg.com.cover2protect.databinding.ArticlervLayoutBindingImpl;
import indg.com.cover2protect.databinding.ArticlervPaginationLayoutBindingImpl;
import indg.com.cover2protect.databinding.DeviceListLayoutBindingImpl;
import indg.com.cover2protect.databinding.DeviceViewconnectBindingImpl;
import indg.com.cover2protect.databinding.ExcerciseRvLayoutBindingImpl;
import indg.com.cover2protect.databinding.FragmentAccountBindingImpl;
import indg.com.cover2protect.databinding.FragmentDeviceBindingImpl;
import indg.com.cover2protect.databinding.FragmentExcerciseBindingImpl;
import indg.com.cover2protect.databinding.FragmentHeightViewBindingImpl;
import indg.com.cover2protect.databinding.FragmentHomeBindingImpl;
import indg.com.cover2protect.databinding.FragmentLargeAlcoholBindingImpl;
import indg.com.cover2protect.databinding.FragmentMediumAlcoholBindingImpl;
import indg.com.cover2protect.databinding.FragmentProfileBindingImpl;
import indg.com.cover2protect.databinding.FragmentProfileIdBindingImpl;
import indg.com.cover2protect.databinding.FragmentScanDeviceBindingImpl;
import indg.com.cover2protect.databinding.FragmentSmallAlcoholBindingImpl;
import indg.com.cover2protect.databinding.HealthReportRvLayoutBindingImpl;
import indg.com.cover2protect.databinding.ItemLayoutNutritionBindingImpl;
import indg.com.cover2protect.databinding.MedicationLayoutBindingImpl;
import indg.com.cover2protect.databinding.NumberLayoutBindingImpl;
import indg.com.cover2protect.databinding.NutrionLayoutBindingImpl;
import indg.com.cover2protect.databinding.NutritiontypeRvLayoutBindingImpl;
import indg.com.cover2protect.databinding.PedometerWeeklyRvBindingImpl;
import indg.com.cover2protect.databinding.TabaccoLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYARTICLEDETAIL = 1;

  private static final int LAYOUT_ACTIVITYARTICLEPAGINATION = 2;

  private static final int LAYOUT_ACTIVITYDATADETAIL = 3;

  private static final int LAYOUT_ACTIVITYFORGOTPASS = 4;

  private static final int LAYOUT_ACTIVITYHEALTHREPORT = 5;

  private static final int LAYOUT_ACTIVITYHEARTAILMENT = 6;

  private static final int LAYOUT_ACTIVITYHHI = 7;

  private static final int LAYOUT_ACTIVITYHISTORY2 = 8;

  private static final int LAYOUT_ACTIVITYLOGIN = 9;

  private static final int LAYOUT_ACTIVITYNEWPASSWORD = 10;

  private static final int LAYOUT_ACTIVITYPEDOMETER = 11;

  private static final int LAYOUT_ACTIVITYPROFILE = 12;

  private static final int LAYOUT_ACTIVITYREGISTER = 13;

  private static final int LAYOUT_ACTIVITYREGISTRATIONOTP = 14;

  private static final int LAYOUT_ACTIVITYRESETPASSWORD = 15;

  private static final int LAYOUT_ACTIVITYRESULT = 16;

  private static final int LAYOUT_ACTIVITYUPLOADFILE = 17;

  private static final int LAYOUT_AFIBRVLAYOUT = 18;

  private static final int LAYOUT_ARRHYTHMIARVLAYOUT = 19;

  private static final int LAYOUT_ARTICLERVLAYOUT = 20;

  private static final int LAYOUT_ARTICLERVPAGINATIONLAYOUT = 21;

  private static final int LAYOUT_DEVICELISTLAYOUT = 22;

  private static final int LAYOUT_DEVICEVIEWCONNECT = 23;

  private static final int LAYOUT_EXCERCISERVLAYOUT = 24;

  private static final int LAYOUT_FRAGMENTACCOUNT = 25;

  private static final int LAYOUT_FRAGMENTDEVICE = 26;

  private static final int LAYOUT_FRAGMENTEXCERCISE = 27;

  private static final int LAYOUT_FRAGMENTHEIGHTVIEW = 28;

  private static final int LAYOUT_FRAGMENTHOME = 29;

  private static final int LAYOUT_FRAGMENTLARGEALCOHOL = 30;

  private static final int LAYOUT_FRAGMENTMEDIUMALCOHOL = 31;

  private static final int LAYOUT_FRAGMENTPROFILE = 32;

  private static final int LAYOUT_FRAGMENTPROFILEID = 33;

  private static final int LAYOUT_FRAGMENTSCANDEVICE = 34;

  private static final int LAYOUT_FRAGMENTSMALLALCOHOL = 35;

  private static final int LAYOUT_HEALTHREPORTRVLAYOUT = 36;

  private static final int LAYOUT_ITEMLAYOUTNUTRITION = 37;

  private static final int LAYOUT_MEDICATIONLAYOUT = 38;

  private static final int LAYOUT_NUMBERLAYOUT = 39;

  private static final int LAYOUT_NUTRIONLAYOUT = 40;

  private static final int LAYOUT_NUTRITIONTYPERVLAYOUT = 41;

  private static final int LAYOUT_PEDOMETERWEEKLYRV = 42;

  private static final int LAYOUT_TABACCOLAYOUT = 43;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(43);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_article_detail, LAYOUT_ACTIVITYARTICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_article_pagination, LAYOUT_ACTIVITYARTICLEPAGINATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_data_detail, LAYOUT_ACTIVITYDATADETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_forgot_pass, LAYOUT_ACTIVITYFORGOTPASS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_health_report, LAYOUT_ACTIVITYHEALTHREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_heart_ailment, LAYOUT_ACTIVITYHEARTAILMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_hhi, LAYOUT_ACTIVITYHHI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_history2, LAYOUT_ACTIVITYHISTORY2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_new_password, LAYOUT_ACTIVITYNEWPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_pedometer, LAYOUT_ACTIVITYPEDOMETER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_register, LAYOUT_ACTIVITYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_registration__otp, LAYOUT_ACTIVITYREGISTRATIONOTP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_reset_password, LAYOUT_ACTIVITYRESETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_result, LAYOUT_ACTIVITYRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.activity_upload_file, LAYOUT_ACTIVITYUPLOADFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.afib_rv_layout, LAYOUT_AFIBRVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.arrhythmia_rv_layout, LAYOUT_ARRHYTHMIARVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.articlerv_layout, LAYOUT_ARTICLERVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.articlerv_pagination_layout, LAYOUT_ARTICLERVPAGINATIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.device_list_layout, LAYOUT_DEVICELISTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.device_viewconnect, LAYOUT_DEVICEVIEWCONNECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.excercise_rv_layout, LAYOUT_EXCERCISERVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_device, LAYOUT_FRAGMENTDEVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_excercise, LAYOUT_FRAGMENTEXCERCISE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_height_view, LAYOUT_FRAGMENTHEIGHTVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_large_alcohol, LAYOUT_FRAGMENTLARGEALCOHOL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_medium_alcohol, LAYOUT_FRAGMENTMEDIUMALCOHOL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_profile_id, LAYOUT_FRAGMENTPROFILEID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_scan_device, LAYOUT_FRAGMENTSCANDEVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.fragment_small_alcohol, LAYOUT_FRAGMENTSMALLALCOHOL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.health_report_rv_layout, LAYOUT_HEALTHREPORTRVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.item_layout_nutrition, LAYOUT_ITEMLAYOUTNUTRITION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.medication_layout, LAYOUT_MEDICATIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.number_layout, LAYOUT_NUMBERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.nutrion_layout, LAYOUT_NUTRIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.nutritiontype_rv_layout, LAYOUT_NUTRITIONTYPERVLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.pedometer_weekly_rv, LAYOUT_PEDOMETERWEEKLYRV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(indg.com.cover2protect.R.layout.tabacco_layout, LAYOUT_TABACCOLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYARTICLEDETAIL: {
          if ("layout/activity_article_detail_0".equals(tag)) {
            return new ActivityArticleDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_article_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYARTICLEPAGINATION: {
          if ("layout/activity_article_pagination_0".equals(tag)) {
            return new ActivityArticlePaginationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_article_pagination is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDATADETAIL: {
          if ("layout/activity_data_detail_0".equals(tag)) {
            return new ActivityDataDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_data_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFORGOTPASS: {
          if ("layout/activity_forgot_pass_0".equals(tag)) {
            return new ActivityForgotPassBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_forgot_pass is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHEALTHREPORT: {
          if ("layout/activity_health_report_0".equals(tag)) {
            return new ActivityHealthReportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_health_report is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHEARTAILMENT: {
          if ("layout/activity_heart_ailment_0".equals(tag)) {
            return new ActivityHeartAilmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_heart_ailment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHHI: {
          if ("layout/activity_hhi_0".equals(tag)) {
            return new ActivityHhiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_hhi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHISTORY2: {
          if ("layout/activity_history2_0".equals(tag)) {
            return new ActivityHistory2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_history2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEWPASSWORD: {
          if ("layout/activity_new_password_0".equals(tag)) {
            return new ActivityNewPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_new_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPEDOMETER: {
          if ("layout/activity_pedometer_0".equals(tag)) {
            return new ActivityPedometerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pedometer is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTER: {
          if ("layout/activity_register_0".equals(tag)) {
            return new ActivityRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTRATIONOTP: {
          if ("layout/activity_registration__otp_0".equals(tag)) {
            return new ActivityRegistrationOtpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_registration__otp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESETPASSWORD: {
          if ("layout/activity_reset_password_0".equals(tag)) {
            return new ActivityResetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_reset_password is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESULT: {
          if ("layout/activity_result_0".equals(tag)) {
            return new ActivityResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_result is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUPLOADFILE: {
          if ("layout/activity_upload_file_0".equals(tag)) {
            return new ActivityUploadFileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_upload_file is invalid. Received: " + tag);
        }
        case  LAYOUT_AFIBRVLAYOUT: {
          if ("layout/afib_rv_layout_0".equals(tag)) {
            return new AfibRvLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for afib_rv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ARRHYTHMIARVLAYOUT: {
          if ("layout/arrhythmia_rv_layout_0".equals(tag)) {
            return new ArrhythmiaRvLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for arrhythmia_rv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ARTICLERVLAYOUT: {
          if ("layout/articlerv_layout_0".equals(tag)) {
            return new ArticlervLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for articlerv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ARTICLERVPAGINATIONLAYOUT: {
          if ("layout/articlerv_pagination_layout_0".equals(tag)) {
            return new ArticlervPaginationLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for articlerv_pagination_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_DEVICELISTLAYOUT: {
          if ("layout/device_list_layout_0".equals(tag)) {
            return new DeviceListLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for device_list_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_DEVICEVIEWCONNECT: {
          if ("layout/device_viewconnect_0".equals(tag)) {
            return new DeviceViewconnectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for device_viewconnect is invalid. Received: " + tag);
        }
        case  LAYOUT_EXCERCISERVLAYOUT: {
          if ("layout/excercise_rv_layout_0".equals(tag)) {
            return new ExcerciseRvLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for excercise_rv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDEVICE: {
          if ("layout/fragment_device_0".equals(tag)) {
            return new FragmentDeviceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_device is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEXCERCISE: {
          if ("layout/fragment_excercise_0".equals(tag)) {
            return new FragmentExcerciseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_excercise is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHEIGHTVIEW: {
          if ("layout/fragment_height_view_0".equals(tag)) {
            return new FragmentHeightViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_height_view is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLARGEALCOHOL: {
          if ("layout/fragment_large_alcohol_0".equals(tag)) {
            return new FragmentLargeAlcoholBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_large_alcohol is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEDIUMALCOHOL: {
          if ("layout/fragment_medium_alcohol_0".equals(tag)) {
            return new FragmentMediumAlcoholBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_medium_alcohol is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILEID: {
          if ("layout/fragment_profile_id_0".equals(tag)) {
            return new FragmentProfileIdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile_id is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCANDEVICE: {
          if ("layout/fragment_scan_device_0".equals(tag)) {
            return new FragmentScanDeviceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_scan_device is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSMALLALCOHOL: {
          if ("layout/fragment_small_alcohol_0".equals(tag)) {
            return new FragmentSmallAlcoholBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_small_alcohol is invalid. Received: " + tag);
        }
        case  LAYOUT_HEALTHREPORTRVLAYOUT: {
          if ("layout/health_report_rv_layout_0".equals(tag)) {
            return new HealthReportRvLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for health_report_rv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLAYOUTNUTRITION: {
          if ("layout/item_layout_nutrition_0".equals(tag)) {
            return new ItemLayoutNutritionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_layout_nutrition is invalid. Received: " + tag);
        }
        case  LAYOUT_MEDICATIONLAYOUT: {
          if ("layout/medication_layout_0".equals(tag)) {
            return new MedicationLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for medication_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_NUMBERLAYOUT: {
          if ("layout/number_layout_0".equals(tag)) {
            return new NumberLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for number_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_NUTRIONLAYOUT: {
          if ("layout/nutrion_layout_0".equals(tag)) {
            return new NutrionLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nutrion_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_NUTRITIONTYPERVLAYOUT: {
          if ("layout/nutritiontype_rv_layout_0".equals(tag)) {
            return new NutritiontypeRvLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nutritiontype_rv_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_PEDOMETERWEEKLYRV: {
          if ("layout/pedometer_weekly_rv_0".equals(tag)) {
            return new PedometerWeeklyRvBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for pedometer_weekly_rv is invalid. Received: " + tag);
        }
        case  LAYOUT_TABACCOLAYOUT: {
          if ("layout/tabacco_layout_0".equals(tag)) {
            return new TabaccoLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tabacco_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(16);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "registerpresenter");
      sKeys.put(2, "viewmodel");
      sKeys.put(3, "presenter");
      sKeys.put(4, "data");
      sKeys.put(5, "hrvLeve");
      sKeys.put(6, "Numbermodel");
      sKeys.put(7, "hR");
      sKeys.put(8, "bP");
      sKeys.put(9, "rPMV");
      sKeys.put(10, "aFIB");
      sKeys.put(11, "arrhythmi");
      sKeys.put(12, "viewModel");
      sKeys.put(13, "model");
      sKeys.put(14, "loginpresenter");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(43);

    static {
      sKeys.put("layout/activity_article_detail_0", indg.com.cover2protect.R.layout.activity_article_detail);
      sKeys.put("layout/activity_article_pagination_0", indg.com.cover2protect.R.layout.activity_article_pagination);
      sKeys.put("layout/activity_data_detail_0", indg.com.cover2protect.R.layout.activity_data_detail);
      sKeys.put("layout/activity_forgot_pass_0", indg.com.cover2protect.R.layout.activity_forgot_pass);
      sKeys.put("layout/activity_health_report_0", indg.com.cover2protect.R.layout.activity_health_report);
      sKeys.put("layout/activity_heart_ailment_0", indg.com.cover2protect.R.layout.activity_heart_ailment);
      sKeys.put("layout/activity_hhi_0", indg.com.cover2protect.R.layout.activity_hhi);
      sKeys.put("layout/activity_history2_0", indg.com.cover2protect.R.layout.activity_history2);
      sKeys.put("layout/activity_login_0", indg.com.cover2protect.R.layout.activity_login);
      sKeys.put("layout/activity_new_password_0", indg.com.cover2protect.R.layout.activity_new_password);
      sKeys.put("layout/activity_pedometer_0", indg.com.cover2protect.R.layout.activity_pedometer);
      sKeys.put("layout/activity_profile_0", indg.com.cover2protect.R.layout.activity_profile);
      sKeys.put("layout/activity_register_0", indg.com.cover2protect.R.layout.activity_register);
      sKeys.put("layout/activity_registration__otp_0", indg.com.cover2protect.R.layout.activity_registration__otp);
      sKeys.put("layout/activity_reset_password_0", indg.com.cover2protect.R.layout.activity_reset_password);
      sKeys.put("layout/activity_result_0", indg.com.cover2protect.R.layout.activity_result);
      sKeys.put("layout/activity_upload_file_0", indg.com.cover2protect.R.layout.activity_upload_file);
      sKeys.put("layout/afib_rv_layout_0", indg.com.cover2protect.R.layout.afib_rv_layout);
      sKeys.put("layout/arrhythmia_rv_layout_0", indg.com.cover2protect.R.layout.arrhythmia_rv_layout);
      sKeys.put("layout/articlerv_layout_0", indg.com.cover2protect.R.layout.articlerv_layout);
      sKeys.put("layout/articlerv_pagination_layout_0", indg.com.cover2protect.R.layout.articlerv_pagination_layout);
      sKeys.put("layout/device_list_layout_0", indg.com.cover2protect.R.layout.device_list_layout);
      sKeys.put("layout/device_viewconnect_0", indg.com.cover2protect.R.layout.device_viewconnect);
      sKeys.put("layout/excercise_rv_layout_0", indg.com.cover2protect.R.layout.excercise_rv_layout);
      sKeys.put("layout/fragment_account_0", indg.com.cover2protect.R.layout.fragment_account);
      sKeys.put("layout/fragment_device_0", indg.com.cover2protect.R.layout.fragment_device);
      sKeys.put("layout/fragment_excercise_0", indg.com.cover2protect.R.layout.fragment_excercise);
      sKeys.put("layout/fragment_height_view_0", indg.com.cover2protect.R.layout.fragment_height_view);
      sKeys.put("layout/fragment_home_0", indg.com.cover2protect.R.layout.fragment_home);
      sKeys.put("layout/fragment_large_alcohol_0", indg.com.cover2protect.R.layout.fragment_large_alcohol);
      sKeys.put("layout/fragment_medium_alcohol_0", indg.com.cover2protect.R.layout.fragment_medium_alcohol);
      sKeys.put("layout/fragment_profile_0", indg.com.cover2protect.R.layout.fragment_profile);
      sKeys.put("layout/fragment_profile_id_0", indg.com.cover2protect.R.layout.fragment_profile_id);
      sKeys.put("layout/fragment_scan_device_0", indg.com.cover2protect.R.layout.fragment_scan_device);
      sKeys.put("layout/fragment_small_alcohol_0", indg.com.cover2protect.R.layout.fragment_small_alcohol);
      sKeys.put("layout/health_report_rv_layout_0", indg.com.cover2protect.R.layout.health_report_rv_layout);
      sKeys.put("layout/item_layout_nutrition_0", indg.com.cover2protect.R.layout.item_layout_nutrition);
      sKeys.put("layout/medication_layout_0", indg.com.cover2protect.R.layout.medication_layout);
      sKeys.put("layout/number_layout_0", indg.com.cover2protect.R.layout.number_layout);
      sKeys.put("layout/nutrion_layout_0", indg.com.cover2protect.R.layout.nutrion_layout);
      sKeys.put("layout/nutritiontype_rv_layout_0", indg.com.cover2protect.R.layout.nutritiontype_rv_layout);
      sKeys.put("layout/pedometer_weekly_rv_0", indg.com.cover2protect.R.layout.pedometer_weekly_rv);
      sKeys.put("layout/tabacco_layout_0", indg.com.cover2protect.R.layout.tabacco_layout);
    }
  }
}
