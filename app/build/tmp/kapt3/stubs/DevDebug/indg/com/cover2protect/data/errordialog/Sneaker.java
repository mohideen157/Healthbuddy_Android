package indg.com.cover2protect.data.errordialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\tJ\u0006\u0010)\u001a\u00020\'J\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\'H\u0002J\u001c\u00101\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u00102\u001a\u00020\tH\u0002J\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u0007J\u0016\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0007J\u000e\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u0007J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0013J\u0016\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\tJ\u0016\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0007J\u001e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\tJ\u0010\u0010:\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u0007J\u0018\u0010:\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\tJ\u0018\u0010:\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007J \u0010:\u001a\u00020\u00002\b\b\u0001\u0010;\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\tJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u0007J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001aJ\u0016\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0017J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u000eJ\u0010\u0010F\u001a\u00020+2\u0006\u0010&\u001a\u00020GH\u0002J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u001aJ\u0016\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0007J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u001fJ\u000e\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020\u0007J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020.J\u0006\u0010P\u001a\u00020+J\u0006\u0010Q\u001a\u00020+J\b\u0010R\u001a\u00020+H\u0002J\u0006\u0010S\u001a\u00020+R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Lindg/com/cover2protect/data/errordialog/Sneaker;", "Landroid/view/View$OnClickListener;", "Landroidx/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DEFAULT_VALUE", "", "isActivity", "", "mAutoHide", "mBackgroundColor", "mCornerRadius", "mDismissListener", "Lindg/com/cover2protect/presenter/OnSneakerDismissListener;", "mDuration", "mHeight", "mIconColorFilterColor", "mIconDrawable", "Landroid/graphics/drawable/Drawable;", "mIconSize", "mIsCircular", "mListener", "Lindg/com/cover2protect/presenter/OnSneakerClickListener;", "mMargin", "mMessage", "", "mMessageColor", "mTitle", "mTitleColor", "mTypeFace", "Landroid/graphics/Typeface;", "sneakerView", "Lindg/com/cover2protect/data/errordialog/SneakerView;", "getSneakerView", "()Lindg/com/cover2protect/data/errordialog/SneakerView;", "sneakerView$delegate", "Lkotlin/Lazy;", "targetView", "Landroid/view/ViewGroup;", "autoHide", "getView", "hide", "", "onClick", "view", "Landroid/view/View;", "removeExistingSneakerView", "parent", "removeView", "animate", "setCornerRadius", "radius", "margin", "setDuration", "duration", "setHeight", "height", "setIcon", "icon", "isCircular", "tintColor", "setIconSize", "size", "setMessage", "message", "color", "setOnSneakerClickListener", "listener", "setOnSneakerDismissListener", "setTargetView", "", "setTitle", "title", "setTypeface", "typeface", "sneak", "backgroundColor", "sneakCustom", "layout", "sneakError", "sneakSuccess", "sneakView", "sneakWarning", "Companion", "app_DevDebug"})
public final class Sneaker implements android.view.View.OnClickListener, androidx.lifecycle.LifecycleObserver {
    private final int DEFAULT_VALUE = -100000;
    private android.graphics.drawable.Drawable mIconDrawable;
    private int mBackgroundColor;
    private int mHeight;
    private int mIconColorFilterColor;
    private int mIconSize;
    private java.lang.String mTitle;
    private java.lang.String mMessage;
    private int mTitleColor;
    private int mMessageColor;
    private boolean mAutoHide;
    private int mDuration;
    private boolean mIsCircular;
    private indg.com.cover2protect.presenter.OnSneakerClickListener mListener;
    private indg.com.cover2protect.presenter.OnSneakerDismissListener mDismissListener;
    private android.graphics.Typeface mTypeFace;
    private int mCornerRadius;
    private int mMargin;
    private android.view.ViewGroup targetView;
    private boolean isActivity;
    private final kotlin.Lazy sneakerView$delegate = null;
    private android.content.Context context;
    public static final indg.com.cover2protect.data.errordialog.Sneaker.Companion Companion = null;
    
    private final indg.com.cover2protect.data.errordialog.SneakerView getSneakerView() {
        return null;
    }
    
    private final void setTargetView(java.lang.Object targetView) {
    }
    
    /**
     * * Hides the sneaker
     */
    public final void hide() {
    }
    
    /**
     * * Sets the title of the sneaker
     *     *
     *     * @param title string value of title
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    /**
     * * Sets the title of the sneaker with color
     *     *
     *     * @param title string value of title
     *     * @param color Color resource for title text
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, int color) {
        return null;
    }
    
    /**
     * * Sets the message to sneaker
     *     *
     *     * @param message String value of message
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    /**
     * * Sets the message to sneaker with color
     *     *
     *     * @param message String value of message
     *     * @param color   Color resource for message text
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int color) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker
     *     *
     *     * @param icon icon resource for sneaker
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@androidx.annotation.DrawableRes()
    int icon) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker
     *     *
     *     * @param icon icon drawable for sneaker
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable icon) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker with circular option
     *     *
     *     * @param icon
     *     * @param isCircular If icon is round or not
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@androidx.annotation.DrawableRes()
    int icon, boolean isCircular) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker with circular option
     *     *
     *     * @param icon
     *     * @param isCircular If icon is round or not
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable icon, boolean isCircular) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@androidx.annotation.DrawableRes()
    int icon, int tintColor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable icon, int tintColor) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker with circular option and icon tint
     *     *
     *     * @param icon
     *     * @param tintColor  icon tint color
     *     * @param isCircular If icon is round or not
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@androidx.annotation.DrawableRes()
    int icon, int tintColor, boolean isCircular) {
        return null;
    }
    
    /**
     * * Sets the icon to sneaker with circular option and icon tint
     *     *
     *     * @param icon
     *     * @param tintColor  icon tint color
     *     * @param isCircular If icon is round or not
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIcon(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable icon, int tintColor, boolean isCircular) {
        return null;
    }
    
    /**
     * * Sets the size of the icon.
     *     *
     *     * @param size New icon size.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setIconSize(int size) {
        return null;
    }
    
    /**
     * * Sets the corner radius for round corner sneaker.
     *     *
     *     * @param radius Corner radius.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setCornerRadius(int radius) {
        return null;
    }
    
    /**
     * * Sets the corner radius for round corner sneaker with margin.
     *     *
     *     * @param radius Corner radius.
     *     * @param margin margin.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setCornerRadius(int radius, int margin) {
        return null;
    }
    
    /**
     * * Disable/Enable auto hiding sneaker
     *     *
     *     * @param autoHide
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker autoHide(boolean autoHide) {
        return null;
    }
    
    /**
     * * Sets the height to sneaker
     *     *
     *     * @param height Height value for sneaker
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setHeight(int height) {
        return null;
    }
    
    /**
     * * Sets the duration for sneaker.
     *     * After this duration sneaker will disappear
     *     *
     *     * @param duration
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setDuration(int duration) {
        return null;
    }
    
    /**
     * * Sets the click listener to sneaker
     *     *
     *     * @param listener
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setOnSneakerClickListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.OnSneakerClickListener listener) {
        return null;
    }
    
    /**
     * * Sets the dismiss listener to sneaker
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setOnSneakerDismissListener(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.presenter.OnSneakerDismissListener listener) {
        return null;
    }
    
    /**
     * * Set font for title and message
     *     *
     *     * @param typeface
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker setTypeface(@org.jetbrains.annotations.NotNull()
    android.graphics.Typeface typeface) {
        return null;
    }
    
    /**
     * * Shows sneaker with custom color
     *     *
     *     * @param backgroundColor Color resource for sneaker background color
     */
    public final void sneak(int backgroundColor) {
    }
    
    /**
     * * Shows warning sneaker with fixed icon, background color and icon color.
     *     * Icons, background and text colors for this are not customizable
     */
    public final void sneakWarning() {
    }
    
    /**
     * * Shows error sneaker with fixed icon, background color and icon color.
     *     * Icons, background and text colors for this are not customizable
     */
    public final void sneakError() {
    }
    
    /**
     * * Shows success sneaker with fixed icon, background color and icon color.
     *     * Icons, background and text colors for this are not customizable
     */
    public final void sneakSuccess() {
    }
    
    /**
     * * Creates the view and sneaks in
     */
    private final void sneakView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.data.errordialog.Sneaker sneakCustom(@org.jetbrains.annotations.NotNull()
    android.view.View layout) {
        return null;
    }
    
    /**
     * * Gets the existing sneaker and removes before adding new one
     *     *
     *     * @param parent
     */
    private final void removeExistingSneakerView(android.view.ViewGroup parent) {
    }
    
    private final void removeView(android.view.View view, boolean animate) {
    }
    
    /**
     * * Sneaker on click
     *     *
     *     * @param view
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getView() {
        return null;
    }
    
    public Sneaker(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * * Create Sneaker instance
     *         *
     *         * @param activity
     *         * @return Sneaker instance
     */
    @org.jetbrains.annotations.NotNull()
    public static final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return null;
    }
    
    /**
     * * Create Sneaker instance
     *         *
     *         * @param fragment
     *         * @return Sneaker instance
     */
    @org.jetbrains.annotations.NotNull()
    public static final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return null;
    }
    
    /**
     * * Create Sneaker instance
     *         *
     *         * @param viewGroup
     *         * @return Sneaker instance
     */
    @org.jetbrains.annotations.NotNull()
    public static final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lindg/com/cover2protect/data/errordialog/Sneaker$Companion;", "", "()V", "with", "Lindg/com/cover2protect/data/errordialog/Sneaker;", "activity", "Landroid/app/Activity;", "viewGroup", "Landroid/view/ViewGroup;", "fragment", "Landroidx/fragment/app/Fragment;", "app_DevDebug"})
    public static final class Companion {
        
        /**
         * * Create Sneaker instance
         *         *
         *         * @param activity
         *         * @return Sneaker instance
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        /**
         * * Create Sneaker instance
         *         *
         *         * @param fragment
         *         * @return Sneaker instance
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
        
        /**
         * * Create Sneaker instance
         *         *
         *         * @param viewGroup
         *         * @return Sneaker instance
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.data.errordialog.Sneaker with(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup viewGroup) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}