package indg.com.cover2protect.util.notification.internal;

import java.lang.System;

/**
 * * Helper class to add Notify Extensions to a notification. The extensions contain data specific to
 * * notifications created by the Notify class, these extensions include data on functionality such as
 * * forced stacking.
 * *
 * * Notify Extensions can be accessed on an existing notification by using the
 * * {@code NotifyExtender(Notification)} constructor, and then using property access to get the
 * * values.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0017\u0010*\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b,J\u0017\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\b\u0018J\u0017\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\b\u001cJ\u0017\u0010/\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b1RL\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010 \u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019\u00a8\u00063"}, d2 = {"Lindg/com/cover2protect/util/notification/internal/NotifyExtender;", "Landroidx/core/app/NotificationCompat$Extender;", "()V", "notification", "Landroid/service/notification/StatusBarNotification;", "(Landroid/service/notification/StatusBarNotification;)V", "value", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "stackItems", "getStackItems", "()Ljava/util/ArrayList;", "setStackItems$app_DevDebug", "(Ljava/util/ArrayList;)V", "stackKey", "getStackKey", "()Ljava/lang/CharSequence;", "setStackKey$app_DevDebug", "(Ljava/lang/CharSequence;)V", "", "stackable", "getStackable", "()Z", "setStackable$app_DevDebug", "(Z)V", "stacked", "getStacked", "setStacked$app_DevDebug", "summaryContent", "getSummaryContent", "setSummaryContent$app_DevDebug", "valid", "getValid", "setValid$app_DevDebug", "extend", "Landroidx/core/app/NotificationCompat$Builder;", "builder", "loadConfigurationFromBundle", "", "bundle", "Landroid/os/Bundle;", "setKey", "key", "setKey$app_DevDebug", "setStackable", "setStacked", "setSummaryText", "text", "setSummaryText$app_DevDebug", "Companion", "app_DevDebug"})
public final class NotifyExtender implements androidx.core.app.NotificationCompat.Extender {
    private boolean valid;
    private boolean stackable;
    private boolean stacked;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence stackKey;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.CharSequence> stackItems;
    @org.jetbrains.annotations.Nullable()
    private java.lang.CharSequence summaryContent;
    
    /**
     * * Identifies the bundle that is associated
     */
    private static final java.lang.String EXTRA_NOTIFY_EXTENSIONS = "io.karn.notify.EXTENSIONS";
    private static final java.lang.String VALID = "notify_valid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STACKABLE = "stackable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STACKED = "stacked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STACK_KEY = "stack_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUMMARY_CONTENT = "summary_content";
    public static final indg.com.cover2protect.util.notification.internal.NotifyExtender.Companion Companion = null;
    
    public final boolean getValid() {
        return false;
    }
    
    public final void setValid$app_DevDebug(boolean value) {
    }
    
    public final boolean getStackable() {
        return false;
    }
    
    public final void setStackable$app_DevDebug(boolean value) {
    }
    
    public final boolean getStacked() {
        return false;
    }
    
    public final void setStacked$app_DevDebug(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getStackKey() {
        return null;
    }
    
    public final void setStackKey$app_DevDebug(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.CharSequence> getStackItems() {
        return null;
    }
    
    public final void setStackItems$app_DevDebug(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.CharSequence> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getSummaryContent() {
        return null;
    }
    
    public final void setSummaryContent$app_DevDebug(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.core.app.NotificationCompat.Builder extend(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder) {
        return null;
    }
    
    private final void loadConfigurationFromBundle(android.os.Bundle bundle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.internal.NotifyExtender setStackable$app_DevDebug(boolean stackable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.internal.NotifyExtender setStacked$app_DevDebug(boolean stacked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.internal.NotifyExtender setKey$app_DevDebug(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.internal.NotifyExtender setSummaryText$app_DevDebug(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
        return null;
    }
    
    public NotifyExtender() {
        super();
    }
    
    /**
     * * Build a Notify notification from an existing notification.
     */
    public NotifyExtender(@org.jetbrains.annotations.NotNull()
    android.service.notification.StatusBarNotification notification) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lindg/com/cover2protect/util/notification/internal/NotifyExtender$Companion;", "", "()V", "EXTRA_NOTIFY_EXTENSIONS", "", "STACKABLE", "STACKED", "STACK_KEY", "SUMMARY_CONTENT", "VALID", "getExtensions", "Landroid/os/Bundle;", "extras", "getExtensions$app_DevDebug", "getKey", "", "getKey$app_DevDebug", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getExtensions$app_DevDebug(@org.jetbrains.annotations.NotNull()
        android.os.Bundle extras) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getKey$app_DevDebug(@org.jetbrains.annotations.NotNull()
        android.os.Bundle extras) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}