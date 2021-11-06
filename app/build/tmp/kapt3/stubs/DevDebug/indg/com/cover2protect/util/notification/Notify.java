package indg.com.cover2protect.util.notification;

import java.lang.System;

/**
 * * Simplified Notification delivery for Android.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Lindg/com/cover2protect/util/notification/Notify;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$app_DevDebug", "()Landroid/content/Context;", "setContext$app_DevDebug", "asBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "payload", "Lindg/com/cover2protect/util/notification/internal/RawNotification;", "asBuilder$app_DevDebug", "show", "", "builder", "show$app_DevDebug", "Companion", "app_DevDebug"})
public final class Notify {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    /**
     * * The default CHANNEL_ID for a notification on Android O.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_DEFAULT_KEY = "application_notification";
    
    /**
     * * The default CHANNEL_NAME for a notification on Android O.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_DEFAULT_NAME = "Application notifications.";
    
    /**
     * * The default CHANNEL_DESCRIPTION for a notification on Android O.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_DEFAULT_DESCRIPTION = "General application notifications.";
    
    /**
     * * Lowest priority for a notification. These notifications might not be shown to the user except under special
     *         * circumstances, such as detailed notification logs.
     */
    public static final int IMPORTANCE_MIN = -2;
    
    /**
     * * Lower priority for notifications that are deemed less important. The UI may choose to show these items
     *         * smaller, or at a different position in the list, compared to notifications with normal importance.
     */
    public static final int IMPORTANCE_LOW = -1;
    
    /**
     * * Default priority for notifications. If your application does not prioritize its own notifications, use this
     *         * value for all notifications.
     */
    public static final int IMPORTANCE_NORMAL = 0;
    
    /**
     * * Higher priority for notifications, for more important notifications or alerts. The UI may choose to show
     *         * these items larger, or at a different position in notification lists, compared with your app's notifications
     *         * of normal importance.
     */
    public static final int IMPORTANCE_HIGH = 1;
    
    /**
     * * Highest priority for notifications, use for notifications that require the user's prompt attention or input.
     */
    public static final int IMPORTANCE_MAX = 2;
    
    /**
     * * The flag to disable notification lights.
     */
    public static final int NO_LIGHTS = 0;
    @org.jetbrains.annotations.NotNull()
    private static indg.com.cover2protect.util.notification.entities.NotifyConfig defaultConfig;
    public static final indg.com.cover2protect.util.notification.Notify.Companion Companion = null;
    
    /**
     * * Return the standard {@see NotificationCompat.Builder} after applying fluent API transformations (if any) from the
     *     * {@see NotifyCreator} builder object.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder asBuilder$app_DevDebug(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.internal.RawNotification payload) {
        return null;
    }
    
    /**
     * * Delegate a {@see Notification.Builder} object to the Notify NotificationInterop class which builds and displays
     *     * the notification.
     *     *
     *     * This is a terminal operation.
     *     *
     *     * @return An integer corresponding to the ID of the system notification. Any updates should use this returned
     *     * integer to make updates or to cancel the notification.
     */
    public final int show$app_DevDebug(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_DevDebug() {
        return null;
    }
    
    public final void setContext$app_DevDebug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public Notify(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJ\u001f\u0010\u000e\u001a\u00020\u00152\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00150\u0018\u00a2\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lindg/com/cover2protect/util/notification/Notify$Companion;", "", "()V", "CHANNEL_DEFAULT_DESCRIPTION", "", "CHANNEL_DEFAULT_KEY", "CHANNEL_DEFAULT_NAME", "IMPORTANCE_HIGH", "", "IMPORTANCE_LOW", "IMPORTANCE_MAX", "IMPORTANCE_MIN", "IMPORTANCE_NORMAL", "NO_LIGHTS", "defaultConfig", "Lindg/com/cover2protect/util/notification/entities/NotifyConfig;", "getDefaultConfig$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/NotifyConfig;", "setDefaultConfig$app_DevDebug", "(Lindg/com/cover2protect/util/notification/entities/NotifyConfig;)V", "cancelNotification", "", "id", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "with", "Lindg/com/cover2protect/util/notification/NotifyCreator;", "context", "Landroid/content/Context;", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.entities.NotifyConfig getDefaultConfig$app_DevDebug() {
            return null;
        }
        
        public final void setDefaultConfig$app_DevDebug(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.util.notification.entities.NotifyConfig p0) {
        }
        
        /**
         * * Modify the default configuration.
         *         *
         *         * Takes a receiver with the NotifyConfig immutable object which has mutable fields.
         */
        public final void defaultConfig(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.NotifyConfig, kotlin.Unit> init) {
        }
        
        /**
         * * A new {@see Notify} and {@see NotifyCreator} instance.
         *         *
         *         * This object is automatically initialized with the singleton default configuration which can be modified using
         *         * {@see Notify#defaultConfig((NotifyConfig) -> Unit)}.
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.NotifyCreator with(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * * Cancel an existing notification with a particular id.
         */
        public final void cancelNotification(int id) {
        }
        
        private Companion() {
            super();
        }
    }
}