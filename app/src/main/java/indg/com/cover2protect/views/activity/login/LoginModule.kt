package indg.com.cover2protect.views.activity.login

import dagger.Module
import dagger.Provides
import indg.com.cover2protect.presenter.ApiService
import indg.com.cover2protect.presenter.DataManager
import indg.com.cover2protect.util.HeaderData
import indg.com.cover2protect.viewmodel.loginviewmodel.LoginViewModel


@Module
class LoginModule {

    @Provides
    fun provideViewModel(dataManager: indg.com.cover2protect.presenter.DataManager, apiService: indg.com.cover2protect.presenter.ApiService, headerData: HeaderData): LoginViewModel {
        return LoginViewModel(dataManager,apiService,headerData)
    }


}