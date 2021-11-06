package indg.com.cover2protect.util.bottom_navigation;

import java.lang.System;

@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001KB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u00106\u001a\u00020,2\u0006\u0010+\u001a\u00020(J\"\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\u000fH\u0002J\u0010\u0010;\u001a\u0004\u0018\u00010\u00162\u0006\u00109\u001a\u00020\tJ\u0010\u0010<\u001a\u0004\u0018\u00010(2\u0006\u00109\u001a\u00020\tJ\u000e\u0010=\u001a\u00020\t2\u0006\u00109\u001a\u00020\tJ\b\u0010>\u001a\u00020,H\u0002J\u000e\u0010?\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\tJ\u0018\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\tH\u0014J\u0018\u0010C\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0016\u0010D\u001a\u00020,2\u0006\u00109\u001a\u00020\t2\u0006\u0010E\u001a\u00020FJ-\u0010G\u001a\u00020,2%\u0010H\u001a!\u0012\u0013\u0012\u00110(\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,0\'j\u0002`-J-\u0010I\u001a\u00020,2%\u0010H\u001a!\u0012\u0013\u0012\u00110(\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,0\'j\u0002`-J\u0018\u0010J\u001a\u00020,2\u0006\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\u000fR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\b\n\u0000\u0012\u0004\b$\u0010%R-\u0010&\u001a!\u0012\u0013\u0012\u00110(\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,0\'j\u0002`-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R-\u0010.\u001a!\u0012\u0013\u0012\u00110(\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,0\'j\u0002`-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010/\u001a\b\u0012\u0004\u0012\u00020(0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u000e\u00102\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lindg/com/cover2protect/util/bottom_navigation/C2PBottomNavigation;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundBottomColor", "bezierView", "Lindg/com/cover2protect/util/bottom_navigation/BezierView;", "callListenerWhenIsSelected", "", "getCallListenerWhenIsSelected", "()Z", "setCallListenerWhenIsSelected", "(Z)V", "cells", "Ljava/util/ArrayList;", "Lindg/com/cover2protect/util/bottom_navigation/C2PBottomNavigationCell;", "getCells", "()Ljava/util/ArrayList;", "setCells", "(Ljava/util/ArrayList;)V", "countBackgroundColor", "countTextColor", "countTypeface", "Landroid/graphics/Typeface;", "defaultIconColor", "heightCell", "isAnimating", "ll_cells", "Landroid/widget/LinearLayout;", "ll_cells$annotations", "()V", "mOnClickedListener", "Lkotlin/Function1;", "Lindg/com/cover2protect/util/bottom_navigation/C2PBottomNavigation$Model;", "Lkotlin/ParameterName;", "name", "model", "", "Lindg/com/cover2protect/util/bottom_navigation/IBottomNavigationListener;", "mOnShowListener", "models", "getModels", "setModels", "rippleColor", "selectedIconColor", "selectedId", "shadowColor", "add", "anim", "cell", "id", "enableAnimation", "getCellById", "getModelById", "getModelPosition", "initializeViews", "isShowing", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setAttributeFromXml", "setCount", "count", "", "setOnClickMenuListener", "listener", "setOnShowListener", "show", "Model", "app_DevDebug"})
public final class C2PBottomNavigation extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model> models;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigationCell> cells;
    private boolean callListenerWhenIsSelected;
    private int selectedId;
    private kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model, kotlin.Unit> mOnClickedListener;
    private kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model, kotlin.Unit> mOnShowListener;
    private int heightCell;
    private boolean isAnimating;
    private int defaultIconColor;
    private int selectedIconColor;
    private int backgroundBottomColor;
    private int shadowColor;
    private int countTextColor;
    private int countBackgroundColor;
    private android.graphics.Typeface countTypeface;
    private int rippleColor;
    private android.widget.LinearLayout ll_cells;
    private indg.com.cover2protect.util.bottom_navigation.BezierView bezierView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model> getModels() {
        return null;
    }
    
    public final void setModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigationCell> getCells() {
        return null;
    }
    
    public final void setCells(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigationCell> p0) {
    }
    
    public final boolean getCallListenerWhenIsSelected() {
        return false;
    }
    
    public final void setCallListenerWhenIsSelected(boolean p0) {
    }
    
    @kotlin.Suppress(names = {"PrivatePropertyName"})
    private static void ll_cells$annotations() {
    }
    
    private final void setAttributeFromXml(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initializeViews() {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model model) {
    }
    
    public final void show(int id, boolean enableAnimation) {
    }
    
    private final void anim(indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigationCell cell, int id, boolean enableAnimation) {
    }
    
    public final boolean isShowing(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model getModelById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigationCell getCellById(int id) {
        return null;
    }
    
    public final int getModelPosition(int id) {
        return 0;
    }
    
    public final void setCount(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String count) {
    }
    
    public final void setOnShowListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model, kotlin.Unit> listener) {
    }
    
    public final void setOnClickMenuListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.bottom_navigation.C2PBottomNavigation.Model, kotlin.Unit> listener) {
    }
    
    public C2PBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public C2PBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public C2PBottomNavigation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lindg/com/cover2protect/util/bottom_navigation/C2PBottomNavigation$Model;", "", "id", "", "icon", "(II)V", "count", "", "getCount", "()Ljava/lang/String;", "setCount", "(Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getId", "setId", "app_DevDebug"})
    public static final class Model {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String count;
        private int id;
        private int icon;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCount() {
            return null;
        }
        
        public final void setCount(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getId() {
            return 0;
        }
        
        public final void setId(int p0) {
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final void setIcon(int p0) {
        }
        
        public Model(int id, int icon) {
            super();
        }
    }
}