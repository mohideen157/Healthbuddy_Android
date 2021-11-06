package indg.com.cover2protect.util.notification.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\"\u0010\f\u001a\u001e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u0001`\u0010\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u001e\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b%J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c0\u0003\u00a2\u0006\u0002\b\'J*\u0010(\u001a\u001e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u0001`\u0010H\u00c0\u0003\u00a2\u0006\u0002\b)Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2$\b\u0002\u0010\f\u001a\u001e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u0001`\u0010H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R0\u0010\f\u001a\u001e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u00010\rj\u000e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u0001`\u0010X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00062"}, d2 = {"Lindg/com/cover2protect/util/notification/internal/RawNotification;", "", "meta", "Lindg/com/cover2protect/util/notification/entities/Payload$Meta;", "alerting", "Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "header", "Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "content", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "stackable", "Lindg/com/cover2protect/util/notification/entities/Payload$Stackable;", "actions", "Ljava/util/ArrayList;", "Landroidx/core/app/NotificationCompat$Action;", "Lindg/com/cover2protect/util/notification/internal/utils/Action;", "Lkotlin/collections/ArrayList;", "(Lindg/com/cover2protect/util/notification/entities/Payload$Meta;Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;Lindg/com/cover2protect/util/notification/entities/Payload$Header;Lindg/com/cover2protect/util/notification/entities/Payload$Content;Lindg/com/cover2protect/util/notification/entities/Payload$Stackable;Ljava/util/ArrayList;)V", "getActions$app_DevDebug", "()Ljava/util/ArrayList;", "getAlerting$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "getContent$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "getHeader$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "getMeta$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Meta;", "getStackable$app_DevDebug", "()Lindg/com/cover2protect/util/notification/entities/Payload$Stackable;", "component1", "component1$app_DevDebug", "component2", "component2$app_DevDebug", "component3", "component3$app_DevDebug", "component4", "component4$app_DevDebug", "component5", "component5$app_DevDebug", "component6", "component6$app_DevDebug", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_DevDebug"})
public final class RawNotification {
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.util.notification.entities.Payload.Meta meta = null;
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.util.notification.entities.Payload.Alerts alerting = null;
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.util.notification.entities.Payload.Header header = null;
    @org.jetbrains.annotations.NotNull()
    private final indg.com.cover2protect.util.notification.entities.Payload.Content content = null;
    @org.jetbrains.annotations.Nullable()
    private final indg.com.cover2protect.util.notification.entities.Payload.Stackable stackable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<androidx.core.app.NotificationCompat.Action> actions = null;
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Meta getMeta$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Alerts getAlerting$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Header getHeader$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Content getContent$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.notification.entities.Payload.Stackable getStackable$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<androidx.core.app.NotificationCompat.Action> getActions$app_DevDebug() {
        return null;
    }
    
    public RawNotification(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Meta meta, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Alerts alerting, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Header header, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Content content, @org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.notification.entities.Payload.Stackable stackable, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<androidx.core.app.NotificationCompat.Action> actions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Meta component1$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Alerts component2$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Header component3$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.entities.Payload.Content component4$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final indg.com.cover2protect.util.notification.entities.Payload.Stackable component5$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<androidx.core.app.NotificationCompat.Action> component6$app_DevDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.internal.RawNotification copy(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Meta meta, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Alerts alerting, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Header header, @org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.entities.Payload.Content content, @org.jetbrains.annotations.Nullable()
    indg.com.cover2protect.util.notification.entities.Payload.Stackable stackable, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<androidx.core.app.NotificationCompat.Action> actions) {
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