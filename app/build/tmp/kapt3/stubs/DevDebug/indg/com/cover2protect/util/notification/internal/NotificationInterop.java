package indg.com.cover2protect.util.notification.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0004\u00a8\u0006\u001d"}, d2 = {"Lindg/com/cover2protect/util/notification/internal/NotificationInterop;", "", "()V", "buildNotification", "Landroidx/core/app/NotificationCompat$Builder;", "notify", "Lindg/com/cover2protect/util/notification/Notify;", "payload", "Lindg/com/cover2protect/util/notification/internal/RawNotification;", "buildStackedNotification", "Landroidx/core/app/NotificationCompat$InboxStyle;", "groupedNotifications", "", "Lindg/com/cover2protect/util/notification/internal/NotifyExtender;", "builder", "cancelNotification", "", "notificationManager", "Landroid/app/NotificationManager;", "notificationId", "", "getActiveNotifications", "getActiveNotifications$app_DevDebug", "setStyle", "Landroidx/core/app/NotificationCompat$Style;", "content", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "showNotification", "notification", "app_DevDebug"})
public final class NotificationInterop {
    public static final indg.com.cover2protect.util.notification.internal.NotificationInterop INSTANCE = null;
    
    public final int showNotification(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notificationManager, @org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder notification) {
        return 0;
    }
    
    public final void cancelNotification(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notificationManager, int notificationId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<indg.com.cover2protect.util.notification.internal.NotifyExtender> getActiveNotifications$app_DevDebug(@org.jetbrains.annotations.NotNull()
    android.app.NotificationManager notificationManager) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.InboxStyle buildStackedNotification(java.util.List<indg.com.cover2protect.util.notification.internal.NotifyExtender> groupedNotifications, androidx.core.app.NotificationCompat.Builder builder, indg.com.cover2protect.util.notification.internal.RawNotification payload) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder buildNotification(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.Notify notify, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.internal.RawNotification payload) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Style setStyle(androidx.core.app.NotificationCompat.Builder builder, indg.com.cover2protect.util.notification.entities.Payload.Content content) {
        return null;
    }
    
    private NotificationInterop() {
        super();
    }
}