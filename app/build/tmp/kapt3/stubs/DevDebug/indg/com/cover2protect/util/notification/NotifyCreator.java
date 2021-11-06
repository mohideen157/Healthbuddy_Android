package indg.com.cover2protect.util.notification;

import java.lang.System;

/**
 * * Fluent API for creating a Notification object.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u00020\u00002/\u0010\u0014\u001a+\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006j\f\u0012\b\u0012\u00060\u0007j\u0002`\b`\t\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\'\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u001f\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u001f\u0010\u001d\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u0006\u0010\u001f\u001a\u00020 J\u001f\u0010!\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u001f\u0010#\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'H\u0007J\u001f\u0010\f\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u001f\u0010\u000e\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u001f\u0010\u0010\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017J\u0006\u0010)\u001a\u00020\'J\u001f\u0010\u0012\u001a\u00020\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\b\u0017R*\u0010\u0005\u001a\u001e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u0006j\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u0001`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lindg/com/cover2protect/util/notification/NotifyCreator;", "", "notify", "Lindg/com/cover2protect/util/notification/Notify;", "(Lindg/com/cover2protect/util/notification/Notify;)V", "actions", "Ljava/util/ArrayList;", "Landroidx/core/app/NotificationCompat$Action;", "Lindg/com/cover2protect/util/notification/internal/utils/Action;", "Lkotlin/collections/ArrayList;", "alerts", "Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "content", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "header", "Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "meta", "Lindg/com/cover2protect/util/notification/entities/Payload$Meta;", "stackable", "Lindg/com/cover2protect/util/notification/entities/Payload$Stackable;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "alerting", "key", "", "asBigPicture", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigPicture;", "asBigText", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigText;", "asBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "asMessage", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Message;", "asTextList", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$TextList;", "cancel", "id", "", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Default;", "show", "app_DevDebug"})
@indg.com.cover2protect.util.notification.internal.utils.NotifyScopeMarker()
public final class NotifyCreator {
    private indg.com.cover2protect.util.notification.entities.Payload.Meta meta;
    private indg.com.cover2protect.util.notification.entities.Payload.Alerts alerts;
    private indg.com.cover2protect.util.notification.entities.Payload.Header header;
    private indg.com.cover2protect.util.notification.entities.Payload.Content content;
    private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> actions;
    private indg.com.cover2protect.util.notification.entities.Payload.Stackable stackable;
    private final indg.com.cover2protect.util.notification.Notify notify = null;
    
    /**
     * * Scoped function for modifying the Metadata of a notification, such as click intents,
     *     * notification category, and priority among other options.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator meta(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Meta, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the Alerting of a notification. This includes visibility,
     *     * sounds, lights, etc.
     *     *
     *     * If an existing key is provided the existing channel is retrieved (API >= AndroidO) and set as the alerting
     *     * configuration. If the key is new, the channel is created and set as the alerting configuration.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator alerting(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Alerts, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the Header of a notification. Specifically, it allows the
     *     * modification of the notificationIcon, color, the headerText (optional text next to the
     *     * appName), and finally the notifyChannel of the notification if targeting Android O.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator header(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Header, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the content of a 'Default' notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator content(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Content.Default, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the content of a 'TextList' notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator asTextList(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Content.TextList, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the content of a 'BigText' notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator asBigText(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Content.BigText, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the content of a 'BigPicture' notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator asBigPicture(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Content.BigPicture, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the content of a 'Message' notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator asMessage(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Content.Message, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the 'Actions' of a notification. The transformation
     *     * relies on adding standard notification Action objects.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator actions(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<androidx.core.app.NotificationCompat.Action>, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Scoped function for modifying the behaviour of 'Stacked' notifications. The transformation
     *     * relies on the 'summaryText' of a stackable notification.
     */
    @org.jetbrains.annotations.NotNull()
    public final indg.com.cover2protect.util.notification.NotifyCreator stackable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super indg.com.cover2protect.util.notification.entities.Payload.Stackable, kotlin.Unit> init) {
        return null;
    }
    
    /**
     * * Return the standard {@see NotificationCompat.Builder} after applying fluent API
     *     * transformations (if any) from the {@see NotifyCreator} builder object.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder asBuilder() {
        return null;
    }
    
    /**
     * * Delegate a {@see Notification.Builder} object to the Notify NotificationInterop class which
     *     * builds and displays the notification.
     *     *
     *     * This is a terminal operation.
     *     *
     *     * @return An integer corresponding to the ID of the system notification. Any updates should use
     *     * this returned integer to make updates or to cancel the notification.
     */
    public final int show() {
        return 0;
    }
    
    /**
     * * Cancel an existing notification given an ID.
     *     *
     *     * @deprecated Choose to instead use the static function {@see Notify#cancelNotification()} which provides the correct
     *     * encapsulation of the this `cancel` function.
     */
    public final void cancel(int id) {
    }
    
    public NotifyCreator(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.util.notification.Notify notify) {
        super();
    }
}