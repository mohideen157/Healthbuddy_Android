package indg.com.cover2protect.util.notification.entities;

import java.lang.System;

/**
 * * Provider of the initial configuration of the Notify > NotifyCreator Fluent API.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b!J)\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\u001f\u0010(\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0002\b\u001bJ\t\u0010)\u001a\u00020\u0017H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/NotifyConfig;", "", "notificationManager", "Landroid/app/NotificationManager;", "defaultHeader", "Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "defaultAlerting", "Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "(Landroid/app/NotificationManager;Lindg/com/cover2protect/util/notification/entities/Payload$Header;Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;)V", "getDefaultAlerting$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "setDefaultAlerting$app_DevDebug", "(Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;)V", "getDefaultHeader$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "setDefaultHeader$app_DevDebug", "(Lindg/com/cover2protect/util/notification/entities/Payload$Header;)V", "getNotificationManager$app_DevDebug", "()Landroid/app/NotificationManager;", "setNotificationManager$app_DevDebug", "(Landroid/app/NotificationManager;)V", "alerting", "key", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "component1", "component1$app_DevDebug", "component2", "component2$app_DevDebug", "component3", "component3$app_DevDebug", "copy", "equals", "", "other", "hashCode", "", "header", "toString", "app_DevDebug"})
public final class NotifyConfig {
    
    /**
     * * A reference to the notification manager.
     */
    @org.jetbrains.annotations.Nullable()
    private android.app.NotificationManager notificationManager;
    
    /**
     * * Specifies the default configuration of a notification (e.g the default notificationIcon,
     *         * and notification color.)
     */
    @org.jetbrains.annotations.NotNull()
    private indg.com.cover2protect.util.notification.entities.Payload.Header defaultHeader;
    
    /**
     * * Specifies the default alerting configuration for notifications.
     */
    @org.jetbrains.annotations.NotNull()
    private indg.com.cover2protect.util.notification.entities.Payload.Alerts defaultAlerting;
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.NotifyConfig header(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Header, kotlin.Unit> init) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.NotifyConfig alerting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Alerts, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * A reference to the notification manager.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.NotificationManager getNotificationManager$app_DevDebug() {
        return null;
    }
    
    /**
     * * A reference to the notification manager.
     */
    public final void setNotificationManager$app_DevDebug(@org.jetbrains.annotations.Nullable()
    android.app.NotificationManager p0) {
    }
    
    /**
     * * Specifies the default configuration of a notification (e.g the default notificationIcon,
     *         * and notification color.)
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Header getDefaultHeader$app_DevDebug() {
        return null;
    }
    
    /**
     * * Specifies the default configuration of a notification (e.g the default notificationIcon,
     *         * and notification color.)
     */
    public final void setDefaultHeader$app_DevDebug(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Header p0) {
    }
    
    /**
     * * Specifies the default alerting configuration for notifications.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Alerts getDefaultAlerting$app_DevDebug() {
        return null;
    }
    
    /**
     * * Specifies the default alerting configuration for notifications.
     */
    public final void setDefaultAlerting$app_DevDebug(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Alerts p0) {
    }
    
    public NotifyConfig(@org.jetbrains.annotations.Nullable()
    android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Header defaultHeader, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Alerts defaultAlerting) {
        super();
    }
    
    public NotifyConfig() {
        super();
    }
    
    /**
     * * A reference to the notification manager.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.NotificationManager component1$app_DevDebug() {
        return null;
    }
    
    /**
     * * Specifies the default configuration of a notification (e.g the default notificationIcon,
     *         * and notification color.)
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Header component2$app_DevDebug() {
        return null;
    }
    
    /**
     * * Specifies the default alerting configuration for notifications.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Alerts component3$app_DevDebug() {
        return null;
    }
    
    /**
     * * Provider of the initial configuration of the Notify > NotifyCreator Fluent API.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.NotifyConfig copy(@org.jetbrains.annotations.Nullable()
    android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Header defaultHeader, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Alerts defaultAlerting) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}