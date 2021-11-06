package indg.com.cover2protect.views.activity.guide_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001aH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006,"}, d2 = {"Lindg/com/cover2protect/views/activity/guide_activity/GuideActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "btnNext", "Landroid/widget/Button;", "btnSkip", "dots", "", "Landroid/widget/TextView;", "[Landroid/widget/TextView;", "dotsLayout", "Landroid/widget/LinearLayout;", "layouts", "", "myViewPagerAdapter", "Lindg/com/cover2protect/views/activity/guide_activity/GuideActivity$GuideViewPagerAdapter;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "viewPagerPageChangeListener", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "getViewPagerPageChangeListener$app_DevDebug", "()Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "setViewPagerPageChangeListener$app_DevDebug", "(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V", "addBottomDots", "", "currentPage", "", "changeStatusBarColor", "getItem", "i", "launchHomeScreen", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showtoast", "message", "", "switchActivity", "GuideViewPagerAdapter", "app_DevDebug"})
public final class GuideActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private androidx.viewpager.widget.ViewPager viewPager;
    private indg.com.cover2protect.views.activity.guide_activity.GuideActivity.GuideViewPagerAdapter myViewPagerAdapter;
    private android.widget.LinearLayout dotsLayout;
    private android.widget.TextView[] dots;
    private int[] layouts;
    private android.widget.Button btnSkip;
    private android.widget.Button btnNext;
    @org.jetbrains.annotations.NotNull()
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener viewPagerPageChangeListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener getViewPagerPageChangeListener$app_DevDebug() {
        return null;
    }
    
    public final void setViewPagerPageChangeListener$app_DevDebug(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager.OnPageChangeListener p0) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addBottomDots(int currentPage) {
    }
    
    private final int getItem(int i) {
        return 0;
    }
    
    private final void launchHomeScreen() {
    }
    
    private final void changeStatusBarColor() {
    }
    
    private final void switchActivity() {
    }
    
    private final void showtoast(java.lang.String message) {
    }
    
    public GuideActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lindg/com/cover2protect/views/activity/guide_activity/GuideActivity$GuideViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "(Lindg/com/cover2protect/views/activity/guide_activity/GuideActivity;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "obj", "app_DevDebug"})
    public final class GuideViewPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
        private android.view.LayoutInflater layoutInflater;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.Object obj) {
            return false;
        }
        
        @java.lang.Override()
        public void destroyItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
        }
        
        public GuideViewPagerAdapter() {
            super();
        }
    }
}