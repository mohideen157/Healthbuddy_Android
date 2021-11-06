package indg.com.cover2protect.data.database.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000fH\u0016J!\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0015\"\u00020\tH\u0016\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\u00072\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0015\"\u00020\tH\u0016\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lindg/com/cover2protect/data/database/datasource/DeviceRepository;", "Lindg/com/cover2protect/data/database/datasource/IDeviceDataSource;", "iCartDataSource", "(Lindg/com/cover2protect/data/database/datasource/IDeviceDataSource;)V", "countCartItems", "", "deleteCartItem", "", "cart", "Lindg/com/cover2protect/data/database/model_db/MaisenseDevice;", "emptyCart", "findDeviceBySynchedId", "synchedId", "", "getCartItemById", "Lio/reactivex/Flowable;", "", "cartItemId", "getCartItems", "insertToCart", "carts", "", "([Lindg/com/cover2protect/data/database/model_db/MaisenseDevice;)V", "updateCart", "Companion", "app_DevDebug"})
public final class DeviceRepository implements indg.com.cover2protect.data.database.datasource.IDeviceDataSource {
    private final indg.com.cover2protect.data.database.datasource.IDeviceDataSource iCartDataSource = null;
    private static indg.com.cover2protect.data.database.datasource.DeviceRepository instance;
    public static final indg.com.cover2protect.data.database.datasource.DeviceRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public indg.com.cover2protect.data.database.model_db.MaisenseDevice findDeviceBySynchedId(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<indg.com.cover2protect.data.database.model_db.MaisenseDevice>> getCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<indg.com.cover2protect.data.database.model_db.MaisenseDevice>> getCartItemById(int cartItemId) {
        return null;
    }
    
    @java.lang.Override()
    public int countCartItems() {
        return 0;
    }
    
    @java.lang.Override()
    public void emptyCart() {
    }
    
    @java.lang.Override()
    public void insertToCart(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice... carts) {
    }
    
    @java.lang.Override()
    public void updateCart(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice... carts) {
    }
    
    @java.lang.Override()
    public void deleteCartItem(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice cart) {
    }
    
    public DeviceRepository(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.datasource.IDeviceDataSource iCartDataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lindg/com/cover2protect/data/database/datasource/DeviceRepository$Companion;", "", "()V", "instance", "Lindg/com/cover2protect/data/database/datasource/DeviceRepository;", "getInstance", "iCartDataSource", "Lindg/com/cover2protect/data/database/datasource/IDeviceDataSource;", "app_DevDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final indg.com.cover2protect.data.database.datasource.DeviceRepository getInstance(@org.jetbrains.annotations.NotNull()
        indg.com.cover2protect.data.database.datasource.IDeviceDataSource iCartDataSource) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}