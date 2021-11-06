package indg.com.cover2protect.viewmodel.mainprofileviewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u00150\u000bJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lindg/com/cover2protect/viewmodel/mainprofileviewmodel/ProfileViewModel;", "Lindg/com/cover2protect/viewmodel/BaseViewModel;", "Lindg/com/cover2protect/presenter/Profile_Data_Response;", "dataManager", "Lindg/com/cover2protect/presenter/DataManager;", "apiService", "Lindg/com/cover2protect/presenter/ApiService;", "headerData", "Lindg/com/cover2protect/util/HeaderData;", "(Lindg/com/cover2protect/presenter/DataManager;Lindg/com/cover2protect/presenter/ApiService;Lindg/com/cover2protect/util/HeaderData;)V", "articledata", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/model/articles/Data;", "hhidata", "Lindg/com/cover2protect/model/hhi/hhiresponse;", "profileImage", "", "profiledata", "Lindg/com/cover2protect/model/profile/Profile;", "GetArticles", "Lkotlin/collections/ArrayList;", "GetHHI", "GetProfileData", "GetProfileImage", "app_DevDebug"})
public final class ProfileViewModel extends indg.com.cover2protect.viewmodel.BaseViewModel<indg.com.cover2protect.presenter.Profile_Data_Response> {
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.profile.Profile> profiledata;
    private androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.hhi.hhiresponse> hhidata;
    private androidx.lifecycle.MutableLiveData<java.lang.String> profileImage;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.articles.Data>> articledata;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.profile.Profile> GetProfileData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> GetProfileImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<indg.com.cover2protect.model.articles.Data>> GetArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<indg.com.cover2protect.model.hhi.hhiresponse> GetHHI() {
        return null;
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.ApiService apiService, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.HeaderData headerData) {
        super(null);
    }
}