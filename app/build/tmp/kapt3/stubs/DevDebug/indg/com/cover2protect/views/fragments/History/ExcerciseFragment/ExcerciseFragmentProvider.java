package indg.com.cover2protect.views.fragments.History.ExcerciseFragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lindg/com/cover2protect/views/fragments/History/ExcerciseFragment/ExcerciseFragmentProvider;", "", "()V", "provideFragment", "Lindg/com/cover2protect/views/fragments/History/ExcerciseFragment/ExcerciseFragment;", "app_DevDebug"})
@dagger.Module()
public abstract class ExcerciseFragmentProvider {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {indg.com.cover2protect.viewmodel.Device2.HomeModule.class})
    public abstract indg.com.cover2protect.views.fragments.History.ExcerciseFragment.ExcerciseFragment provideFragment();
    
    public ExcerciseFragmentProvider() {
        super();
    }
}