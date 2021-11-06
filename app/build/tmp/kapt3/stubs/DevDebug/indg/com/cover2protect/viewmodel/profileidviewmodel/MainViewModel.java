package indg.com.cover2protect.viewmodel.profileidviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012J\u001e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0012\u00a8\u0006 "}, d2 = {"Lindg/com/cover2protect/viewmodel/profileidviewmodel/MainViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/navigator/response_navigator;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "GetHra", "", "GetProfileBlood", "GetProfileHeight", "GetProfileWeight", "GetProfiledob", "PostProfileBloodGroup", "blood_group", "", "PostProfileDob", "dob", "nationalid", "gender", "PostProfileHeight", "heightcm", "heightfeet", "PostProfileWeight", "weight_kg", "weight_pounds", "bmi", "UploadImage", "path", "app_DevDebug"})
public final class MainViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.navigator.response_navigator> {
    
    public final void GetHra() {
    }
    
    public final void GetProfiledob() {
    }
    
    public final void GetProfileHeight() {
    }
    
    public final void GetProfileWeight() {
    }
    
    public final void GetProfileBlood() {
    }
    
    public final void PostProfileDob(@org.jetbrains.annotations.NotNull()
    java.lang.String dob, @org.jetbrains.annotations.NotNull()
    java.lang.String nationalid, @org.jetbrains.annotations.NotNull()
    java.lang.String gender) {
    }
    
    public final void PostProfileHeight(@org.jetbrains.annotations.NotNull()
    java.lang.String heightcm, @org.jetbrains.annotations.NotNull()
    java.lang.String heightfeet) {
    }
    
    public final void PostProfileWeight(@org.jetbrains.annotations.NotNull()
    java.lang.String weight_kg, @org.jetbrains.annotations.NotNull()
    java.lang.String weight_pounds, @org.jetbrains.annotations.NotNull()
    java.lang.String bmi) {
    }
    
    public final void PostProfileBloodGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String blood_group) {
    }
    
    public final void UploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}