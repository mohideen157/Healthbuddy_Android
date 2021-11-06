package indg.com.cover2protect.data.permissions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\r\u001a\u00020\u000bH&J*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a8\u0006\u0010"}, d2 = {"Lindg/com/cover2protect/data/permissions/PermissionHandler;", "", "()V", "onBlocked", "", "context", "Landroid/content/Context;", "blockedList", "Ljava/util/ArrayList;", "", "onDenied", "", "deniedPermissions", "onGranted", "onJustBlocked", "justBlockedList", "app_DevDebug"})
public abstract class PermissionHandler {
    
    /**
     * * This method will be called if all of the requested permissions are granted.
     */
    public abstract void onGranted();
    
    /**
     * * This method will be called if some of the requested permissions have been denied.
     *     *
     *     * @param context           The application context.
     *     * @param deniedPermissions The list of permissions which have been denied.
     */
    public final void onDenied(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> deniedPermissions) {
    }
    
    /**
     * * This method will be called if some permissions have previously been set not to ask again.
     *     *
     *     * @param context     the application context.
     *     * @param blockedList the list of permissions which have been set not to ask again.
     *     * @return The overrider of this method should return true if no further action is needed,
     *     * and should return false if the default action is to be taken, i.e. send user to settings.
     *     * <br></br><br></br>
     *     * Note: If the option [Permissions.Options.sendDontAskAgainToSettings] has been
     *     * set to false, the user won't be sent to settings by default.
     */
    public final boolean onBlocked(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> blockedList) {
        return false;
    }
    
    /**
     * * This method will be called if some permissions have just been set not to ask again.
     *     *
     *     * @param context           The application context.
     *     * @param justBlockedList   The list of permissions which have just been set not to ask again.
     *     * @param deniedPermissions The list of currently unavailable permissions.
     */
    public final void onJustBlocked(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> justBlockedList, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> deniedPermissions) {
    }
    
    public PermissionHandler() {
        super();
    }
}