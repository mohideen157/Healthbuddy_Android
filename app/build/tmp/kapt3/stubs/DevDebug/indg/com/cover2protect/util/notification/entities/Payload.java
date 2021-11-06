package indg.com.cover2protect.util.notification.entities;

import java.lang.System;

/**
 * * Wrapper class to provide configurable options for a NotifcationCompact object.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload;", "", "()V", "Alerts", "Content", "Header", "Meta", "Stackable", "app_DevDebug"})
public abstract class Payload {
    
    private Payload() {
        super();
    }
    
    /**
     * * The Metadata contains configuration that is considered to be such that it controls the
     *     * overall non-layout behaviour of the notification.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\u001e\u00100\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fH\u00c0\u0003\u00a2\u0006\u0002\b1Jo\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fH\u00c6\u0001J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J/\u00107\u001a\u0002082\'\u00109\u001a#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f\u0012\u0004\u0012\u0002080:\u00a2\u0006\u0002\b;J\t\u0010<\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006="}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Meta;", "", "clickIntent", "Landroid/app/PendingIntent;", "clearIntent", "cancelOnClick", "", "category", "", "localOnly", "sticky", "timeout", "", "contacts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Landroid/app/PendingIntent;Landroid/app/PendingIntent;ZLjava/lang/String;ZZJLjava/util/ArrayList;)V", "getCancelOnClick", "()Z", "setCancelOnClick", "(Z)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getClearIntent", "()Landroid/app/PendingIntent;", "setClearIntent", "(Landroid/app/PendingIntent;)V", "getClickIntent", "setClickIntent", "getContacts$app_DevDebug", "()Ljava/util/ArrayList;", "getLocalOnly", "setLocalOnly", "getSticky", "setSticky", "getTimeout", "()J", "setTimeout", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8$app_DevDebug", "copy", "equals", "other", "hashCode", "", "people", "", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "toString", "app_DevDebug"})
    public static final class Meta {
        
        /**
         * * The handler for a notification click.
         */
        @org.jetbrains.annotations.Nullable()
        private android.app.PendingIntent clickIntent;
        
        /**
         * * The handler for a dismissal of a notification ('clear all' or swipe away).
         */
        @org.jetbrains.annotations.Nullable()
        private android.app.PendingIntent clearIntent;
        
        /**
         * * Specifies the behaviour of the notification once it has been clicked. If set to
         *             * false, the notification is not dismissed once it has been clicked.
         */
        private boolean cancelOnClick;
        
        /**
         * * The category of the notification which allows android to prioritize the
         *             * notification as required.
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String category;
        
        /**
         * * Set whether or not this notification is only relevant to the current device.
         */
        private boolean localOnly;
        
        /**
         * * Indicates whether the notification is sticky. If enabled, the notification is not
         *             * affected by the clear all and is not dismissible.
         */
        private boolean sticky;
        
        /**
         * * The duration of time in milliseconds after which the notification is automatically dismissed.
         */
        private long timeout;
        
        /**
         * * Add a person that is relevant to this notification.
         *             *
         *             * Depending on user preferences, this may allow the notification to pass through interruption filters, and
         *             * to appear more prominently in the user interface.
         *             *
         *             * The person should be specified by the {@code String} representation of a
         *             * {@link android.provider.ContactsContract.Contacts#CONTENT_LOOKUP_URI}.
         *             *
         *             * The system will also attempt to resolve {@code mailto:} and {@code tel:} schema
         *             * URIs.  The path part of these URIs must exist in the contacts database, in the
         *             * appropriate column, or the reference will be discarded as invalid. Telephone schema
         *             * URIs will be resolved by {@link android.provider.ContactsContract.PhoneLookup}.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<java.lang.String> contacts = null;
        
        public final void people(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.ArrayList<java.lang.String>, kotlin.Unit> init) {
        }
        
        /**
         * * The handler for a notification click.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent getClickIntent() {
            return null;
        }
        
        /**
         * * The handler for a notification click.
         */
        public final void setClickIntent(@org.jetbrains.annotations.Nullable()
        android.app.PendingIntent p0) {
        }
        
        /**
         * * The handler for a dismissal of a notification ('clear all' or swipe away).
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent getClearIntent() {
            return null;
        }
        
        /**
         * * The handler for a dismissal of a notification ('clear all' or swipe away).
         */
        public final void setClearIntent(@org.jetbrains.annotations.Nullable()
        android.app.PendingIntent p0) {
        }
        
        /**
         * * Specifies the behaviour of the notification once it has been clicked. If set to
         *             * false, the notification is not dismissed once it has been clicked.
         */
        public final boolean getCancelOnClick() {
            return false;
        }
        
        /**
         * * Specifies the behaviour of the notification once it has been clicked. If set to
         *             * false, the notification is not dismissed once it has been clicked.
         */
        public final void setCancelOnClick(boolean p0) {
        }
        
        /**
         * * The category of the notification which allows android to prioritize the
         *             * notification as required.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCategory() {
            return null;
        }
        
        /**
         * * The category of the notification which allows android to prioritize the
         *             * notification as required.
         */
        public final void setCategory(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        /**
         * * Set whether or not this notification is only relevant to the current device.
         */
        public final boolean getLocalOnly() {
            return false;
        }
        
        /**
         * * Set whether or not this notification is only relevant to the current device.
         */
        public final void setLocalOnly(boolean p0) {
        }
        
        /**
         * * Indicates whether the notification is sticky. If enabled, the notification is not
         *             * affected by the clear all and is not dismissible.
         */
        public final boolean getSticky() {
            return false;
        }
        
        /**
         * * Indicates whether the notification is sticky. If enabled, the notification is not
         *             * affected by the clear all and is not dismissible.
         */
        public final void setSticky(boolean p0) {
        }
        
        /**
         * * The duration of time in milliseconds after which the notification is automatically dismissed.
         */
        public final long getTimeout() {
            return 0L;
        }
        
        /**
         * * The duration of time in milliseconds after which the notification is automatically dismissed.
         */
        public final void setTimeout(long p0) {
        }
        
        /**
         * * Add a person that is relevant to this notification.
         *             *
         *             * Depending on user preferences, this may allow the notification to pass through interruption filters, and
         *             * to appear more prominently in the user interface.
         *             *
         *             * The person should be specified by the {@code String} representation of a
         *             * {@link android.provider.ContactsContract.Contacts#CONTENT_LOOKUP_URI}.
         *             *
         *             * The system will also attempt to resolve {@code mailto:} and {@code tel:} schema
         *             * URIs.  The path part of these URIs must exist in the contacts database, in the
         *             * appropriate column, or the reference will be discarded as invalid. Telephone schema
         *             * URIs will be resolved by {@link android.provider.ContactsContract.PhoneLookup}.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getContacts$app_DevDebug() {
            return null;
        }
        
        public Meta(@org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clickIntent, @org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clearIntent, boolean cancelOnClick, @org.jetbrains.annotations.Nullable()
        java.lang.String category, boolean localOnly, boolean sticky, long timeout, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> contacts) {
            super();
        }
        
        public Meta() {
            super();
        }
        
        /**
         * * The handler for a notification click.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent component1() {
            return null;
        }
        
        /**
         * * The handler for a dismissal of a notification ('clear all' or swipe away).
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent component2() {
            return null;
        }
        
        /**
         * * Specifies the behaviour of the notification once it has been clicked. If set to
         *             * false, the notification is not dismissed once it has been clicked.
         */
        public final boolean component3() {
            return false;
        }
        
        /**
         * * The category of the notification which allows android to prioritize the
         *             * notification as required.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * * Set whether or not this notification is only relevant to the current device.
         */
        public final boolean component5() {
            return false;
        }
        
        /**
         * * Indicates whether the notification is sticky. If enabled, the notification is not
         *             * affected by the clear all and is not dismissible.
         */
        public final boolean component6() {
            return false;
        }
        
        /**
         * * The duration of time in milliseconds after which the notification is automatically dismissed.
         */
        public final long component7() {
            return 0L;
        }
        
        /**
         * * Add a person that is relevant to this notification.
         *             *
         *             * Depending on user preferences, this may allow the notification to pass through interruption filters, and
         *             * to appear more prominently in the user interface.
         *             *
         *             * The person should be specified by the {@code String} representation of a
         *             * {@link android.provider.ContactsContract.Contacts#CONTENT_LOOKUP_URI}.
         *             *
         *             * The system will also attempt to resolve {@code mailto:} and {@code tel:} schema
         *             * URIs.  The path part of these URIs must exist in the contacts database, in the
         *             * appropriate column, or the reference will be discarded as invalid. Telephone schema
         *             * URIs will be resolved by {@link android.provider.ContactsContract.PhoneLookup}.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> component8$app_DevDebug() {
            return null;
        }
        
        /**
         * * The Metadata contains configuration that is considered to be such that it controls the
         *     * overall non-layout behaviour of the notification.
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.entities.Payload.Meta copy(@org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clickIntent, @org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clearIntent, boolean cancelOnClick, @org.jetbrains.annotations.Nullable()
        java.lang.String category, boolean localOnly, boolean sticky, long timeout, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> contacts) {
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
    
    /**
     * * Defines the alerting configuration for a particular notification. This includes notification
     *     * visibility, sounds, vibrations, etc.
     *     *
     *     * This configuration system may not work as expected on all devices. Refer to the Wiki for more
     *     * information.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J_\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\t\u00104\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00065"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Alerts;", "", "lockScreenVisibility", "", "channelKey", "", "channelName", "channelDescription", "channelImportance", "lightColor", "vibrationPattern", "", "", "sound", "Landroid/net/Uri;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Landroid/net/Uri;)V", "getChannelDescription", "()Ljava/lang/String;", "setChannelDescription", "(Ljava/lang/String;)V", "getChannelImportance", "()I", "setChannelImportance", "(I)V", "getChannelKey", "getChannelName", "setChannelName", "getLightColor", "setLightColor", "getLockScreenVisibility", "setLockScreenVisibility", "getSound", "()Landroid/net/Uri;", "setSound", "(Landroid/net/Uri;)V", "getVibrationPattern", "()Ljava/util/List;", "setVibrationPattern", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_DevDebug"})
    public static final class Alerts {
        
        /**
         * * The visibility of the notification as it appears on the lockscreen. By default it is
         *             * hidden.
         */
        private int lockScreenVisibility;
        
        /**
         * * The default CHANNEL_ID for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String channelKey = null;
        
        /**
         * * The default CHANNEL_NAME for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String channelName;
        
        /**
         * * The default CHANNEL_DESCRIPTION for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String channelDescription;
        
        /**
         * * The default IMPORTANCE for a notification.
         */
        private int channelImportance;
        
        /**
         * * The LED colors of the notification notifyChannel.
         */
        private int lightColor;
        
        /**
         * * Vibration pattern for notification on this notifyChannel.
         */
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.Long> vibrationPattern;
        
        /**
         * * A custom notification sound if any.
         */
        @org.jetbrains.annotations.NotNull()
        private android.net.Uri sound;
        
        /**
         * * The visibility of the notification as it appears on the lockscreen. By default it is
         *             * hidden.
         */
        public final int getLockScreenVisibility() {
            return 0;
        }
        
        /**
         * * The visibility of the notification as it appears on the lockscreen. By default it is
         *             * hidden.
         */
        public final void setLockScreenVisibility(int p0) {
        }
        
        /**
         * * The default CHANNEL_ID for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannelKey() {
            return null;
        }
        
        /**
         * * The default CHANNEL_NAME for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannelName() {
            return null;
        }
        
        /**
         * * The default CHANNEL_NAME for a notification on versions >= Android O.
         */
        public final void setChannelName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * * The default CHANNEL_DESCRIPTION for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannelDescription() {
            return null;
        }
        
        /**
         * * The default CHANNEL_DESCRIPTION for a notification on versions >= Android O.
         */
        public final void setChannelDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * * The default IMPORTANCE for a notification.
         */
        public final int getChannelImportance() {
            return 0;
        }
        
        /**
         * * The default IMPORTANCE for a notification.
         */
        public final void setChannelImportance(int p0) {
        }
        
        /**
         * * The LED colors of the notification notifyChannel.
         */
        public final int getLightColor() {
            return 0;
        }
        
        /**
         * * The LED colors of the notification notifyChannel.
         */
        public final void setLightColor(int p0) {
        }
        
        /**
         * * Vibration pattern for notification on this notifyChannel.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getVibrationPattern() {
            return null;
        }
        
        /**
         * * Vibration pattern for notification on this notifyChannel.
         */
        public final void setVibrationPattern(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> p0) {
        }
        
        /**
         * * A custom notification sound if any.
         */
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri getSound() {
            return null;
        }
        
        /**
         * * A custom notification sound if any.
         */
        public final void setSound(@org.jetbrains.annotations.NotNull()
        android.net.Uri p0) {
        }
        
        public Alerts(@androidx.core.app.NotificationCompat.NotificationVisibility()
        int lockScreenVisibility, @org.jetbrains.annotations.NotNull()
        java.lang.String channelKey, @org.jetbrains.annotations.NotNull()
        java.lang.String channelName, @org.jetbrains.annotations.NotNull()
        java.lang.String channelDescription, @indg.com.cover2protect.util.notification.internal.utils.NotifyImportance()
        int channelImportance, @androidx.annotation.ColorInt()
        int lightColor, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> vibrationPattern, @org.jetbrains.annotations.NotNull()
        android.net.Uri sound) {
            super();
        }
        
        public Alerts() {
            super();
        }
        
        /**
         * * The visibility of the notification as it appears on the lockscreen. By default it is
         *             * hidden.
         */
        public final int component1() {
            return 0;
        }
        
        /**
         * * The default CHANNEL_ID for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * * The default CHANNEL_NAME for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * * The default CHANNEL_DESCRIPTION for a notification on versions >= Android O.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * * The default IMPORTANCE for a notification.
         */
        public final int component5() {
            return 0;
        }
        
        /**
         * * The LED colors of the notification notifyChannel.
         */
        public final int component6() {
            return 0;
        }
        
        /**
         * * Vibration pattern for notification on this notifyChannel.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component7() {
            return null;
        }
        
        /**
         * * A custom notification sound if any.
         */
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri component8() {
            return null;
        }
        
        /**
         * * Defines the alerting configuration for a particular notification. This includes notification
         *     * visibility, sounds, vibrations, etc.
         *     *
         *     * This configuration system may not work as expected on all devices. Refer to the Wiki for more
         *     * information.
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.entities.Payload.Alerts copy(@androidx.core.app.NotificationCompat.NotificationVisibility()
        int lockScreenVisibility, @org.jetbrains.annotations.NotNull()
        java.lang.String channelKey, @org.jetbrains.annotations.NotNull()
        java.lang.String channelName, @org.jetbrains.annotations.NotNull()
        java.lang.String channelDescription, @indg.com.cover2protect.util.notification.internal.utils.NotifyImportance()
        int channelImportance, @androidx.annotation.ColorInt()
        int lightColor, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> vibrationPattern, @org.jetbrains.annotations.NotNull()
        android.net.Uri sound) {
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
    
    /**
     * * Contains configuration that is specific to the header of a notification.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Header;", "", "icon", "", "color", "headerText", "", "showTimestamp", "", "(IILjava/lang/CharSequence;Z)V", "getColor", "()I", "setColor", "(I)V", "getHeaderText", "()Ljava/lang/CharSequence;", "setHeaderText", "(Ljava/lang/CharSequence;)V", "getIcon", "setIcon", "getShowTimestamp", "()Z", "setShowTimestamp", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_DevDebug"})
    public static final class Header {
        
        /**
         * * The icon that appears for the notification as a DrawableRes Integer.
         */
        private int icon;
        
        /**
         * * The color of the notification items -- icon, appName, and expand indicator.
         */
        private int color;
        
        /**
         * * The optional text that appears next to the appName of a notification.
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.CharSequence headerText;
        
        /**
         * * Setting this field to false results in the timestamp (now, 5m, ...) next to the
         *             * application name to be hidden.
         */
        private boolean showTimestamp;
        
        /**
         * * The icon that appears for the notification as a DrawableRes Integer.
         */
        public final int getIcon() {
            return 0;
        }
        
        /**
         * * The icon that appears for the notification as a DrawableRes Integer.
         */
        public final void setIcon(int p0) {
        }
        
        /**
         * * The color of the notification items -- icon, appName, and expand indicator.
         */
        public final int getColor() {
            return 0;
        }
        
        /**
         * * The color of the notification items -- icon, appName, and expand indicator.
         */
        public final void setColor(int p0) {
        }
        
        /**
         * * The optional text that appears next to the appName of a notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getHeaderText() {
            return null;
        }
        
        /**
         * * The optional text that appears next to the appName of a notification.
         */
        public final void setHeaderText(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence p0) {
        }
        
        /**
         * * Setting this field to false results in the timestamp (now, 5m, ...) next to the
         *             * application name to be hidden.
         */
        public final boolean getShowTimestamp() {
            return false;
        }
        
        /**
         * * Setting this field to false results in the timestamp (now, 5m, ...) next to the
         *             * application name to be hidden.
         */
        public final void setShowTimestamp(boolean p0) {
        }
        
        public Header(@androidx.annotation.DrawableRes()
        int icon, @androidx.annotation.ColorInt()
        int color, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence headerText, boolean showTimestamp) {
            super();
        }
        
        public Header() {
            super();
        }
        
        /**
         * * The icon that appears for the notification as a DrawableRes Integer.
         */
        public final int component1() {
            return 0;
        }
        
        /**
         * * The color of the notification items -- icon, appName, and expand indicator.
         */
        public final int component2() {
            return 0;
        }
        
        /**
         * * The optional text that appears next to the appName of a notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence component3() {
            return null;
        }
        
        /**
         * * Setting this field to false results in the timestamp (now, 5m, ...) next to the
         *             * application name to be hidden.
         */
        public final boolean component4() {
            return false;
        }
        
        /**
         * * Contains configuration that is specific to the header of a notification.
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.entities.Payload.Header copy(@androidx.annotation.DrawableRes()
        int icon, @androidx.annotation.ColorInt()
        int color, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence headerText, boolean showTimestamp) {
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
    
    /**
     * * Deterministic property assignment for a notification type.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "", "()V", "BigPicture", "BigText", "Default", "Expandable", "Message", "Standard", "SupportsLargeIcon", "TextList", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Default;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$TextList;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigText;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigPicture;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Message;", "app_DevDebug"})
    public static abstract class Content {
        
        private Content() {
            super();
        }
        
        /**
         * * All 'standard' notifications specify a title and a text field.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$Standard;", "", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "title", "getTitle", "setTitle", "app_DevDebug"})
        public static abstract interface Standard {
            
            /**
             * * The first line of a standard notification.
             */
            @org.jetbrains.annotations.Nullable()
            public abstract java.lang.CharSequence getTitle();
            
            /**
             * * The first line of a standard notification.
             */
            public abstract void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0);
            
            /**
             * * The second line of the notification.
             */
            @org.jetbrains.annotations.Nullable()
            public abstract java.lang.CharSequence getText();
            
            /**
             * * The second line of the notification.
             */
            public abstract void setText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0);
        }
        
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "", "largeIcon", "Landroid/graphics/Bitmap;", "getLargeIcon", "()Landroid/graphics/Bitmap;", "setLargeIcon", "(Landroid/graphics/Bitmap;)V", "app_DevDebug"})
        public static abstract interface SupportsLargeIcon {
            
            /**
             * * The large icon of the notification.
             */
            @org.jetbrains.annotations.Nullable()
            public abstract android.graphics.Bitmap getLargeIcon();
            
            /**
             * * The large icon of the notification.
             */
            public abstract void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0);
        }
        
        /**
         * * Indicates whether a notification is expandable.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$Expandable;", "", "expandedText", "", "getExpandedText", "()Ljava/lang/CharSequence;", "setExpandedText", "(Ljava/lang/CharSequence;)V", "app_DevDebug"})
        public static abstract interface Expandable {
            
            /**
             * * The content that is displayed when the notification is expanded expanded.
             */
            @org.jetbrains.annotations.Nullable()
            public abstract java.lang.CharSequence getExpandedText();
            
            /**
             * * The content that is displayed when the notification is expanded expanded.
             */
            public abstract void setExpandedText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0);
        }
        
        /**
         * * The object representation of a 'Default' notification.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011\u00a8\u0006 "}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$Default;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Standard;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "title", "", "text", "largeIcon", "Landroid/graphics/Bitmap;", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;)V", "getLargeIcon", "()Landroid/graphics/Bitmap;", "setLargeIcon", "(Landroid/graphics/Bitmap;)V", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_DevDebug"})
        public static final class Default extends indg.com.cover2protect.util.notification.entities.Payload.Content implements indg.com.cover2protect.util.notification.entities.Payload.Content.Standard, indg.com.cover2protect.util.notification.entities.Payload.Content.SupportsLargeIcon {
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence title;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence text;
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap largeIcon;
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getTitle() {
                return null;
            }
            
            @java.lang.Override()
            public void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getText() {
                return null;
            }
            
            @java.lang.Override()
            public void setText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public android.graphics.Bitmap getLargeIcon() {
                return null;
            }
            
            @java.lang.Override()
            public void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            public Default(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon) {
                super();
            }
            
            public Default() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component3() {
                return null;
            }
            
            /**
             * * The object representation of a 'Default' notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final indg.com.cover2protect.util.notification.entities.Payload.Content.Default copy(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon) {
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
        
        /**
         * * The object representation of a 'TextList' notification.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0003J=\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$TextList;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Standard;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "title", "", "text", "largeIcon", "Landroid/graphics/Bitmap;", "lines", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Ljava/util/List;)V", "getLargeIcon", "()Landroid/graphics/Bitmap;", "setLargeIcon", "(Landroid/graphics/Bitmap;)V", "getLines", "()Ljava/util/List;", "setLines", "(Ljava/util/List;)V", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_DevDebug"})
        public static final class TextList extends indg.com.cover2protect.util.notification.entities.Payload.Content implements indg.com.cover2protect.util.notification.entities.Payload.Content.Standard, indg.com.cover2protect.util.notification.entities.Payload.Content.SupportsLargeIcon {
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence title;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence text;
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap largeIcon;
            
            /**
             * * The lines of the notification.
             */
            @org.jetbrains.annotations.NotNull()
            private java.util.List<? extends java.lang.CharSequence> lines;
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getTitle() {
                return null;
            }
            
            @java.lang.Override()
            public void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getText() {
                return null;
            }
            
            @java.lang.Override()
            public void setText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public android.graphics.Bitmap getLargeIcon() {
                return null;
            }
            
            @java.lang.Override()
            public void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            /**
             * * The lines of the notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.CharSequence> getLines() {
                return null;
            }
            
            /**
             * * The lines of the notification.
             */
            public final void setLines(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.CharSequence> p0) {
            }
            
            public TextList(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.CharSequence> lines) {
                super();
            }
            
            public TextList() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component3() {
                return null;
            }
            
            /**
             * * The lines of the notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.CharSequence> component4() {
                return null;
            }
            
            /**
             * * The object representation of a 'TextList' notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final indg.com.cover2protect.util.notification.entities.Payload.Content.TextList copy(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.NotNull()
            java.util.List<? extends java.lang.CharSequence> lines) {
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
        
        /**
         * * The object representation of a 'BigText' notification.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010\u00a8\u0006)"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigText;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Standard;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Expandable;", "title", "", "text", "largeIcon", "Landroid/graphics/Bitmap;", "expandedText", "bigText", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getBigText", "()Ljava/lang/CharSequence;", "setBigText", "(Ljava/lang/CharSequence;)V", "getExpandedText", "setExpandedText", "getLargeIcon", "()Landroid/graphics/Bitmap;", "setLargeIcon", "(Landroid/graphics/Bitmap;)V", "getText", "setText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_DevDebug"})
        public static final class BigText extends indg.com.cover2protect.util.notification.entities.Payload.Content implements indg.com.cover2protect.util.notification.entities.Payload.Content.Standard, indg.com.cover2protect.util.notification.entities.Payload.Content.SupportsLargeIcon, indg.com.cover2protect.util.notification.entities.Payload.Content.Expandable {
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence title;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence text;
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap largeIcon;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence expandedText;
            
            /**
             * * The large text associated with the notification.
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence bigText;
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getTitle() {
                return null;
            }
            
            @java.lang.Override()
            public void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getText() {
                return null;
            }
            
            @java.lang.Override()
            public void setText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public android.graphics.Bitmap getLargeIcon() {
                return null;
            }
            
            @java.lang.Override()
            public void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getExpandedText() {
                return null;
            }
            
            @java.lang.Override()
            public void setExpandedText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            /**
             * * The large text associated with the notification.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence getBigText() {
                return null;
            }
            
            /**
             * * The large text associated with the notification.
             */
            public final void setBigText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            public BigText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence expandedText, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence bigText) {
                super();
            }
            
            public BigText() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component4() {
                return null;
            }
            
            /**
             * * The large text associated with the notification.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component5() {
                return null;
            }
            
            /**
             * * The object representation of a 'BigText' notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final indg.com.cover2protect.util.notification.entities.Payload.Content.BigText copy(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence expandedText, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence bigText) {
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
        
        /**
         * * The object representation of a 'BigPicture' notification.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010\u00a8\u0006)"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$BigPicture;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Standard;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$Expandable;", "title", "", "text", "largeIcon", "Landroid/graphics/Bitmap;", "expandedText", "image", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;)V", "getExpandedText", "()Ljava/lang/CharSequence;", "setExpandedText", "(Ljava/lang/CharSequence;)V", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "getLargeIcon", "setLargeIcon", "getText", "setText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_DevDebug"})
        public static final class BigPicture extends indg.com.cover2protect.util.notification.entities.Payload.Content implements indg.com.cover2protect.util.notification.entities.Payload.Content.Standard, indg.com.cover2protect.util.notification.entities.Payload.Content.SupportsLargeIcon, indg.com.cover2protect.util.notification.entities.Payload.Content.Expandable {
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence title;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence text;
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap largeIcon;
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence expandedText;
            
            /**
             * * The large image that appears when the notification is expanded.s
             */
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap image;
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getTitle() {
                return null;
            }
            
            @java.lang.Override()
            public void setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getText() {
                return null;
            }
            
            @java.lang.Override()
            public void setText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public android.graphics.Bitmap getLargeIcon() {
                return null;
            }
            
            @java.lang.Override()
            public void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.CharSequence getExpandedText() {
                return null;
            }
            
            @java.lang.Override()
            public void setExpandedText(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            /**
             * * The large image that appears when the notification is expanded.s
             */
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap getImage() {
                return null;
            }
            
            /**
             * * The large image that appears when the notification is expanded.s
             */
            public final void setImage(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            public BigPicture(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence expandedText, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap image) {
                super();
            }
            
            public BigPicture() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component4() {
                return null;
            }
            
            /**
             * * The large image that appears when the notification is expanded.s
             */
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component5() {
                return null;
            }
            
            /**
             * * The object representation of a 'BigPicture' notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final indg.com.cover2protect.util.notification.entities.Payload.Content.BigPicture copy(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence title, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence expandedText, @org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap image) {
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
        
        /**
         * * The object representaiton of a 'Message' notification.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J;\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Content$Message;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content;", "Lindg/com/cover2protect/util/notification/entities/Payload$Content$SupportsLargeIcon;", "largeIcon", "Landroid/graphics/Bitmap;", "conversationTitle", "", "userDisplayName", "messages", "", "Landroidx/core/app/NotificationCompat$MessagingStyle$Message;", "(Landroid/graphics/Bitmap;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)V", "getConversationTitle", "()Ljava/lang/CharSequence;", "setConversationTitle", "(Ljava/lang/CharSequence;)V", "getLargeIcon", "()Landroid/graphics/Bitmap;", "setLargeIcon", "(Landroid/graphics/Bitmap;)V", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "getUserDisplayName", "setUserDisplayName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_DevDebug"})
        public static final class Message extends indg.com.cover2protect.util.notification.entities.Payload.Content implements indg.com.cover2protect.util.notification.entities.Payload.Content.SupportsLargeIcon {
            @org.jetbrains.annotations.Nullable()
            private android.graphics.Bitmap largeIcon;
            
            /**
             * * The title of the conversation.
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.CharSequence conversationTitle;
            
            /**
             * * The display name of the device user.
             */
            @org.jetbrains.annotations.NotNull()
            private java.lang.CharSequence userDisplayName;
            
            /**
             * * A collection of messages associated with a particualar conversation.
             */
            @org.jetbrains.annotations.NotNull()
            private java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> messages;
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public android.graphics.Bitmap getLargeIcon() {
                return null;
            }
            
            @java.lang.Override()
            public void setLargeIcon(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap p0) {
            }
            
            /**
             * * The title of the conversation.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence getConversationTitle() {
                return null;
            }
            
            /**
             * * The title of the conversation.
             */
            public final void setConversationTitle(@org.jetbrains.annotations.Nullable()
            java.lang.CharSequence p0) {
            }
            
            /**
             * * The display name of the device user.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence getUserDisplayName() {
                return null;
            }
            
            /**
             * * The display name of the device user.
             */
            public final void setUserDisplayName(@org.jetbrains.annotations.NotNull()
            java.lang.CharSequence p0) {
            }
            
            /**
             * * A collection of messages associated with a particualar conversation.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessages() {
                return null;
            }
            
            /**
             * * A collection of messages associated with a particualar conversation.
             */
            public final void setMessages(@org.jetbrains.annotations.NotNull()
            java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> p0) {
            }
            
            public Message(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence conversationTitle, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence userDisplayName, @org.jetbrains.annotations.NotNull()
            java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> messages) {
                super();
            }
            
            public Message() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.graphics.Bitmap component1() {
                return null;
            }
            
            /**
             * * The title of the conversation.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.CharSequence component2() {
                return null;
            }
            
            /**
             * * The display name of the device user.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence component3() {
                return null;
            }
            
            /**
             * * A collection of messages associated with a particualar conversation.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> component4() {
                return null;
            }
            
            /**
             * * The object representaiton of a 'Message' notification.
             */
            @org.jetbrains.annotations.NotNull()
            public final indg.com.cover2protect.util.notification.entities.Payload.Content.Message copy(@org.jetbrains.annotations.Nullable()
            android.graphics.Bitmap largeIcon, @org.jetbrains.annotations.Nullable()
            java.lang.CharSequence conversationTitle, @org.jetbrains.annotations.NotNull()
            java.lang.CharSequence userDisplayName, @org.jetbrains.annotations.NotNull()
            java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> messages) {
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
    }
    
    /**
     * * Contains configuration specific to the manual stacking behaviour of a notification.
     *     * Manual stacking occurs for all notifications with the same key, additionally the summary
     *     * configuration is taken from the latest notification with the specified stack key.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012$\b\u0002\u0010\u000f\u001a\u001e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u0010j\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u0001`\u0013\u00a2\u0006\u0002\u0010\u0014J7\u0010+\u001a\u00020,2/\u0010-\u001a+\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0010j\f\u0012\b\u0012\u00060\u0011j\u0002`\u0012`\u0013\u0012\u0004\u0012\u00020,0\t\u00a2\u0006\u0002\b.J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J&\u00102\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J&\u00103\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00c6\u0003J*\u00104\u001a\u001e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u0010j\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u0001`\u0013H\u00c0\u0003\u00a2\u0006\u0002\b5J\u00a1\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2$\b\u0002\u0010\u000f\u001a\u001e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u0010j\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u0001`\u0013H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\nH\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR6\u0010\u000f\u001a\u001e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u00010\u0010j\u000e\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0018\u0001`\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R7\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(\u00a8\u0006<"}, d2 = {"Lindg/com/cover2protect/util/notification/entities/Payload$Stackable;", "", "key", "", "clickIntent", "Landroid/app/PendingIntent;", "summaryContent", "", "summaryTitle", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "count", "summaryDescription", "stackableActions", "Ljava/util/ArrayList;", "Landroidx/core/app/NotificationCompat$Action;", "Lindg/com/cover2protect/util/notification/internal/utils/Action;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Landroid/app/PendingIntent;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)V", "getClickIntent", "()Landroid/app/PendingIntent;", "setClickIntent", "(Landroid/app/PendingIntent;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getStackableActions$app_DevDebug", "()Ljava/util/ArrayList;", "setStackableActions$app_DevDebug", "(Ljava/util/ArrayList;)V", "getSummaryContent", "()Ljava/lang/CharSequence;", "setSummaryContent", "(Ljava/lang/CharSequence;)V", "getSummaryDescription", "()Lkotlin/jvm/functions/Function1;", "setSummaryDescription", "(Lkotlin/jvm/functions/Function1;)V", "getSummaryTitle", "setSummaryTitle", "actions", "", "init", "Lkotlin/ExtensionFunctionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component6$app_DevDebug", "copy", "equals", "", "other", "hashCode", "toString", "app_DevDebug"})
    public static final class Stackable {
        
        /**
         * * The key which defines the stack as well as the corresponding notification ID.
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String key;
        
        /**
         * * The click intent of the stacked notification.
         */
        @org.jetbrains.annotations.Nullable()
        private android.app.PendingIntent clickIntent;
        
        /**
         * * The summary content of this particular notification. How it appears in the list of
         *             * notifications in the stack.
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.CharSequence summaryContent;
        
        /**
         * * The title of the stacked notification.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryTitle;
        
        /**
         * * The second line of the collapsed notification which is meant to show a summary of the
         *             * stack.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        private kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryDescription;
        
        /**
         * * The actions associated with the stackable notification when it is stacked. These
         *             * actions override the actions for the individual notification.
         */
        @org.jetbrains.annotations.Nullable()
        private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> stackableActions;
        
        /**
         * * Scoped function for modifying the behaviour of the actions associated with the 'Stacked'
         *         * notification.
         */
        public final void actions(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.ArrayList<androidx.core.app.NotificationCompat.Action>, kotlin.Unit> init) {
        }
        
        /**
         * * The key which defines the stack as well as the corresponding notification ID.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getKey() {
            return null;
        }
        
        /**
         * * The key which defines the stack as well as the corresponding notification ID.
         */
        public final void setKey(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        /**
         * * The click intent of the stacked notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent getClickIntent() {
            return null;
        }
        
        /**
         * * The click intent of the stacked notification.
         */
        public final void setClickIntent(@org.jetbrains.annotations.Nullable()
        android.app.PendingIntent p0) {
        }
        
        /**
         * * The summary content of this particular notification. How it appears in the list of
         *             * notifications in the stack.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence getSummaryContent() {
            return null;
        }
        
        /**
         * * The summary content of this particular notification. How it appears in the list of
         *             * notifications in the stack.
         */
        public final void setSummaryContent(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence p0) {
        }
        
        /**
         * * The title of the stacked notification.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> getSummaryTitle() {
            return null;
        }
        
        /**
         * * The title of the stacked notification.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        public final void setSummaryTitle(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> p0) {
        }
        
        /**
         * * The second line of the collapsed notification which is meant to show a summary of the
         *             * stack.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> getSummaryDescription() {
            return null;
        }
        
        /**
         * * The second line of the collapsed notification which is meant to show a summary of the
         *             * stack.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        public final void setSummaryDescription(@org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> p0) {
        }
        
        /**
         * * The actions associated with the stackable notification when it is stacked. These
         *             * actions override the actions for the individual notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<androidx.core.app.NotificationCompat.Action> getStackableActions$app_DevDebug() {
            return null;
        }
        
        /**
         * * The actions associated with the stackable notification when it is stacked. These
         *             * actions override the actions for the individual notification.
         */
        public final void setStackableActions$app_DevDebug(@org.jetbrains.annotations.Nullable()
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> p0) {
        }
        
        public Stackable(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clickIntent, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence summaryContent, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryTitle, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryDescription, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> stackableActions) {
            super();
        }
        
        public Stackable() {
            super();
        }
        
        /**
         * * The key which defines the stack as well as the corresponding notification ID.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * * The click intent of the stacked notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.app.PendingIntent component2() {
            return null;
        }
        
        /**
         * * The summary content of this particular notification. How it appears in the list of
         *             * notifications in the stack.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.CharSequence component3() {
            return null;
        }
        
        /**
         * * The title of the stacked notification.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> component4() {
            return null;
        }
        
        /**
         * * The second line of the collapsed notification which is meant to show a summary of the
         *             * stack.
         *             *
         *             * Takes a function that receives a lambda with the total count of existing
         *             * notifications with the same stack key.
         */
        @org.jetbrains.annotations.Nullable()
        public final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> component5() {
            return null;
        }
        
        /**
         * * The actions associated with the stackable notification when it is stacked. These
         *             * actions override the actions for the individual notification.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.util.ArrayList<androidx.core.app.NotificationCompat.Action> component6$app_DevDebug() {
            return null;
        }
        
        /**
         * * Contains configuration specific to the manual stacking behaviour of a notification.
         *     * Manual stacking occurs for all notifications with the same key, additionally the summary
         *     * configuration is taken from the latest notification with the specified stack key.
         */
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.util.notification.entities.Payload.Stackable copy(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        android.app.PendingIntent clickIntent, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence summaryContent, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryTitle, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> summaryDescription, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> stackableActions) {
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
}