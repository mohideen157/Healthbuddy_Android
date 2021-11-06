package indg.com.cover2protect.util.stickyswitch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\b\u00a6\u0001\u00a7\u0001\u00a8\u0001\u00a9\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\u0013\u0010\u0088\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\u0011\u0010\u0089\u0001\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\u0016\u0010\u008e\u0001\u001a\u0004\u0018\u0001092\t\b\u0001\u0010\u008f\u0001\u001a\u00020\tH\u0002J\u0013\u0010\u0090\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\u0015\u0010\u0091\u0001\u001a\u00020\u000e2\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u008d\u0001H\u0007J(\u0010\u0093\u0001\u001a\u00030\u0086\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002J\u0013\u0010\u0094\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\u0013\u0010\u0095\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\n\u0010\u0096\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u0097\u0001\u001a\u00030\u0086\u0001H\u0002J\u0016\u0010\u0098\u0001\u001a\u00030\u0086\u00012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0014J\u001c\u0010\u009b\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009c\u0001\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\tH\u0014J\u0015\u0010\u009e\u0001\u001a\u0002042\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u00a0\u0001H\u0016J\u0013\u0010\u00a1\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J\u0013\u0010\u00a2\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0087\u0001\u001a\u000204H\u0002J*\u0010\u00a3\u0001\u001a\u00030\u0086\u00012\b\u0010\u0092\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u00a4\u0001\u001a\u0002042\t\b\u0002\u0010\u00a5\u0001\u001a\u000204H\u0007J\u0012\u0010=\u001a\u00030\u0086\u00012\t\b\u0001\u0010\u008f\u0001\u001a\u00020\tJ\u0012\u0010V\u001a\u00030\u0086\u00012\t\b\u0001\u0010\u008f\u0001\u001a\u00020\tR\u0014\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010,\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001e\u00105\u001a\u0002042\u0006\u0010\u0011\u001a\u000204@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b6\u00107R(\u0010:\u001a\u0004\u0018\u0001092\b\u00108\u001a\u0004\u0018\u000109@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010?\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010D\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\bE\u00100R\u000e\u0010F\u001a\u00020GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010K\u001a\u00020J2\u0006\u0010\u0011\u001a\u00020J@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010T\u001a\u0004\u0018\u0001092\b\u00108\u001a\u0004\u0018\u000109@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010<\"\u0004\bV\u0010>R$\u0010W\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010A\"\u0004\bY\u0010CR\u001e\u0010Z\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b[\u00100R\u000e\u0010\\\u001a\u00020GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010^\u001a\u00020J2\u0006\u0010\u0011\u001a\u00020J@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b_\u0010MR\u001e\u0010`\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\ba\u00100R&\u0010c\u001a\u00020\t2\b\b\u0001\u0010b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010.\"\u0004\be\u00100R\u000e\u0010f\u001a\u00020GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020hX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020GX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010j\u001a\u00020\t2\b\b\u0001\u0010b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R\u000e\u0010m\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R&\u0010o\u001a\u00020\t2\b\b\u0001\u0010b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010.\"\u0004\bq\u00100R\u001e\u0010r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\bs\u00100R$\u0010u\u001a\u00020t2\u0006\u0010\u0011\u001a\u00020t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR(\u0010z\u001a\u0004\u0018\u00010{2\b\u0010z\u001a\u0004\u0018\u00010{@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020JX\u0086D\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0083\u0001\u001a\u00020JX\u0086D\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001\u00a8\u0006\u00aa\u0001"}, d2 = {"Lindg/com/cover2protect/util/stickyswitch/StickySwitch;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "TAG", "", "TAG$annotations", "()V", "value", "", "animateBounceRate", "setAnimateBounceRate", "(D)V", "animatePercent", "setAnimatePercent", "animationDuration", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "Lindg/com/cover2protect/util/stickyswitch/StickySwitch$AnimationType;", "animationType", "getAnimationType", "()Lindg/com/cover2protect/util/stickyswitch/StickySwitch$AnimationType;", "setAnimationType", "(Lindg/com/cover2protect/util/stickyswitch/StickySwitch$AnimationType;)V", "animatorSet", "Landroid/animation/AnimatorSet;", "getAnimatorSet", "()Landroid/animation/AnimatorSet;", "setAnimatorSet", "(Landroid/animation/AnimatorSet;)V", "connectionPath", "Landroid/graphics/Path;", "iconPadding", "getIconPadding", "()I", "setIconPadding", "(I)V", "iconSize", "getIconSize", "setIconSize", "", "isSwitchOn", "setSwitchOn", "(Z)V", "drawable", "Landroid/graphics/drawable/Drawable;", "leftIcon", "getLeftIcon", "()Landroid/graphics/drawable/Drawable;", "setLeftIcon", "(Landroid/graphics/drawable/Drawable;)V", "leftText", "getLeftText", "()Ljava/lang/String;", "setLeftText", "(Ljava/lang/String;)V", "leftTextAlpha", "setLeftTextAlpha", "leftTextPaint", "Landroid/graphics/Paint;", "leftTextRect", "Landroid/graphics/Rect;", "", "leftTextSize", "setLeftTextSize", "(F)V", "onSelectedChangeListener", "Lindg/com/cover2protect/util/stickyswitch/StickySwitch$OnSelectedChangeListener;", "getOnSelectedChangeListener", "()Lindg/com/cover2protect/util/stickyswitch/StickySwitch$OnSelectedChangeListener;", "setOnSelectedChangeListener", "(Lindg/com/cover2protect/util/stickyswitch/StickySwitch$OnSelectedChangeListener;)V", "rightIcon", "getRightIcon", "setRightIcon", "rightText", "getRightText", "setRightText", "rightTextAlpha", "setRightTextAlpha", "rightTextPaint", "rightTextRect", "rightTextSize", "setRightTextSize", "selectedTextSize", "setSelectedTextSize", "colorInt", "sliderBackgroundColor", "getSliderBackgroundColor", "setSliderBackgroundColor", "sliderBackgroundPaint", "sliderBackgroundRect", "Landroid/graphics/RectF;", "switchBackgroundPaint", "switchColor", "getSwitchColor", "setSwitchColor", "textAlphaMax", "textAlphaMin", "textColor", "getTextColor", "setTextColor", "textSize", "setTextSize", "Lindg/com/cover2protect/util/stickyswitch/StickySwitch$TextVisibility;", "textVisibility", "getTextVisibility", "()Lindg/com/cover2protect/util/stickyswitch/StickySwitch$TextVisibility;", "setTextVisibility", "(Lindg/com/cover2protect/util/stickyswitch/StickySwitch$TextVisibility;)V", "typeFace", "Landroid/graphics/Typeface;", "getTypeFace", "()Landroid/graphics/Typeface;", "setTypeFace", "(Landroid/graphics/Typeface;)V", "xParam", "getXParam", "()F", "yParam", "getYParam", "animateCheckState", "", "newCheckedState", "changeCheckState", "evaluateBounceRate", "getBounceAnimator", "Landroid/animation/Animator;", "getDirection", "Lindg/com/cover2protect/util/stickyswitch/StickySwitch$Direction;", "getDrawable", "resourceId", "getLiquidAnimator", "getText", "direction", "init", "leftTextAlphaAnimator", "leftTextSizeAnimator", "measureText", "notifySelectedChange", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "rightTextAlphaAnimator", "rightTextSizeAnimator", "setDirection", "isAnimate", "shouldTriggerSelected", "AnimationType", "Direction", "OnSelectedChangeListener", "TextVisibility", "app_DevDebug"})
public final class StickySwitch extends android.view.View {
    private final java.lang.String TAG = "StickySwitch";
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable leftIcon;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable rightIcon;
    private int iconSize;
    private int iconPadding;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String leftText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rightText;
    private int sliderBackgroundColor;
    private int switchColor;
    private int textColor;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Typeface typeFace;
    private final android.graphics.Paint sliderBackgroundPaint = null;
    private final android.graphics.RectF sliderBackgroundRect = null;
    private final android.graphics.Paint switchBackgroundPaint = null;
    private final android.graphics.Paint leftTextPaint = null;
    private final android.graphics.Rect leftTextRect = null;
    private final android.graphics.Paint rightTextPaint = null;
    private final android.graphics.Rect rightTextRect = null;
    private float leftTextSize;
    private float rightTextSize;
    private final int textAlphaMax = 255;
    private final int textAlphaMin = 163;
    private int leftTextAlpha;
    private int rightTextAlpha;
    private int textSize;
    private int selectedTextSize;
    private boolean isSwitchOn;
    private double animatePercent;
    private double animateBounceRate;
    @org.jetbrains.annotations.NotNull()
    private indg.com.cover2protect.util.stickyswitch.StickySwitch.AnimationType animationType;
    @org.jetbrains.annotations.Nullable()
    private indg.com.cover2protect.util.stickyswitch.StickySwitch.OnSelectedChangeListener onSelectedChangeListener;
    @org.jetbrains.annotations.Nullable()
    private android.animation.AnimatorSet animatorSet;
    private long animationDuration;
    @org.jetbrains.annotations.NotNull()
    private indg.com.cover2protect.util.stickyswitch.StickySwitch.TextVisibility textVisibility;
    private final android.graphics.Path connectionPath = null;
    private final float xParam = 0.5F;
    private final float yParam = 0.8660254F;
    private java.util.HashMap _$_findViewCache;
    
    @kotlin.Suppress(names = {"unused", "PrivatePropertyName"})
    private static void TAG$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getLeftIcon() {
        return null;
    }
    
    public final void setLeftIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getRightIcon() {
        return null;
    }
    
    public final void setRightIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public final int getIconSize() {
        return 0;
    }
    
    public final void setIconSize(int value) {
    }
    
    public final int getIconPadding() {
        return 0;
    }
    
    public final void setIconPadding(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLeftText() {
        return null;
    }
    
    public final void setLeftText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRightText() {
        return null;
    }
    
    public final void setRightText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getSliderBackgroundColor() {
        return 0;
    }
    
    public final void setSliderBackgroundColor(@androidx.annotation.ColorInt()
    int colorInt) {
    }
    
    public final int getSwitchColor() {
        return 0;
    }
    
    public final void setSwitchColor(@androidx.annotation.ColorInt()
    int colorInt) {
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    public final void setTextColor(@androidx.annotation.ColorInt()
    int colorInt) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getTypeFace() {
        return null;
    }
    
    public final void setTypeFace(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface typeFace) {
    }
    
    private final void setLeftTextSize(float value) {
    }
    
    private final void setRightTextSize(float value) {
    }
    
    private final void setLeftTextAlpha(int value) {
    }
    
    private final void setRightTextAlpha(int value) {
    }
    
    private final void setTextSize(int value) {
    }
    
    private final void setSelectedTextSize(int value) {
    }
    
    private final void setSwitchOn(boolean value) {
    }
    
    private final void setAnimatePercent(double value) {
    }
    
    private final void setAnimateBounceRate(double value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.stickyswitch.StickySwitch.AnimationType getAnimationType() {
        return null;
    }
    
    public final void setAnimationType(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.AnimationType value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.stickyswitch.StickySwitch.OnSelectedChangeListener getOnSelectedChangeListener() {
        return null;
    }
    
    public final void setOnSelectedChangeListener(@org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.OnSelectedChangeListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.animation.AnimatorSet getAnimatorSet() {
        return null;
    }
    
    public final void setAnimatorSet(@org.jetbrains.annotations.Nullable()
    android.animation.AnimatorSet p0) {
    }
    
    public final long getAnimationDuration() {
        return 0L;
    }
    
    public final void setAnimationDuration(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.stickyswitch.StickySwitch.TextVisibility getTextVisibility() {
        return null;
    }
    
    public final void setTextVisibility(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.TextVisibility value) {
    }
    
    private final void init(android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    }
    
    public final float getXParam() {
        return 0.0F;
    }
    
    public final float getYParam() {
        return 0.0F;
    }
    
    /**
     * * Draw Sticky Switch View
     *     *
     *     * Animation
     *     *
     *     * 0% ~ 50%
     *     * radius : circle radius -> circle radius / 2
     *     * x      : x -> x + widthSpace
     *     * y      : y
     *     *
     *     * 50% ~ 100%
     *     * radius : circle radius / 2 -> circle radius
     *     * x      : x + widthSpace -> x + widthSpace
     *     * y      : y
     *     *
     *     * @param canvas the canvas on which the background will be drawn
     */
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    private final double evaluateBounceRate(double value) {
        return 0.0;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction direction, boolean isAnimate, boolean shouldTriggerSelected) {
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction direction, boolean isAnimate) {
    }
    
    public final void setDirection(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction direction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction getDirection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction direction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setLeftIcon(@androidx.annotation.DrawableRes()
    int resourceId) {
    }
    
    public final void setRightIcon(@androidx.annotation.DrawableRes()
    int resourceId) {
    }
    
    private final android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes()
    int resourceId) {
        return null;
    }
    
    private final void notifySelectedChange() {
    }
    
    private final void measureText() {
    }
    
    private final void animateCheckState(boolean newCheckedState) {
    }
    
    private final void changeCheckState(boolean newCheckedState) {
    }
    
    private final android.animation.Animator leftTextAlphaAnimator(boolean newCheckedState) {
        return null;
    }
    
    private final android.animation.Animator rightTextAlphaAnimator(boolean newCheckedState) {
        return null;
    }
    
    private final android.animation.Animator leftTextSizeAnimator(boolean newCheckedState) {
        return null;
    }
    
    private final android.animation.Animator rightTextSizeAnimator(boolean newCheckedState) {
        return null;
    }
    
    private final android.animation.Animator getLiquidAnimator(boolean newCheckedState) {
        return null;
    }
    
    private final android.animation.Animator getBounceAnimator() {
        return null;
    }
    
    public StickySwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public StickySwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public StickySwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public StickySwitch(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lindg/com/cover2protect/util/stickyswitch/StickySwitch$AnimationType;", "", "(Ljava/lang/String;I)V", "LINE", "CURVED", "app_DevDebug"})
    public static enum AnimationType {
        /*public static final*/ LINE /* = new LINE() */,
        /*public static final*/ CURVED /* = new CURVED() */;
        
        AnimationType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lindg/com/cover2protect/util/stickyswitch/StickySwitch$TextVisibility;", "", "(Ljava/lang/String;I)V", "VISIBLE", "INVISIBLE", "GONE", "app_DevDebug"})
    public static enum TextVisibility {
        /*public static final*/ VISIBLE /* = new VISIBLE() */,
        /*public static final*/ INVISIBLE /* = new INVISIBLE() */,
        /*public static final*/ GONE /* = new GONE() */;
        
        TextVisibility() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lindg/com/cover2protect/util/stickyswitch/StickySwitch$Direction;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "app_DevDebug"})
    public static enum Direction {
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */;
        
        Direction() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/util/stickyswitch/StickySwitch$OnSelectedChangeListener;", "", "onSelectedChange", "", "direction", "Lindg/com/cover2protect/util/stickyswitch/StickySwitch$Direction;", "text", "", "app_DevDebug"})
    public static abstract interface OnSelectedChangeListener {
        
        public abstract void onSelectedChange(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.util.stickyswitch.StickySwitch.Direction direction, @org.jetbrains.annotations.NotNull()
        java.lang.String text);
    }
}