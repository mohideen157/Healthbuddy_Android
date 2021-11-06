package indg.com.cover2protect.data.database.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\rH&J!\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013\"\u00020\u0007H&\u00a2\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0013\"\u00020\u0007H&\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lindg/com/cover2protect/data/database/datasource/IDeviceDataSource;", "", "countCartItems", "", "deleteCartItem", "", "cart", "Lindg/com/cover2protect/data/database/model_db/MaisenseDevice;", "emptyCart", "findDeviceBySynchedId", "synchedId", "", "getCartItemById", "Lio/reactivex/Flowable;", "", "cartItemId", "getCartItems", "insertToCart", "carts", "", "([Lindg/com/cover2protect/data/database/model_db/MaisenseDevice;)V", "updateCart", "app_DevDebug"})
public abstract interface IDeviceDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<indg.com.cover2protect.data.database.model_db.MaisenseDevice>> getCartItems();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<indg.com.cover2protect.data.database.model_db.MaisenseDevice>> getCartItemById(int cartItemId);
    
    public abstract int countCartItems();
    
    @org.jetbrains.annotations.NotNull()
    public abstract indg.com.cover2protect.data.database.model_db.MaisenseDevice findDeviceBySynchedId(@org.jetbrains.annotations.NotNull()
    java.lang.String synchedId);
    
    public abstract void emptyCart();
    
    public abstract void insertToCart(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice... carts);
    
    public abstract void updateCart(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice... carts);
    
    public abstract void deleteCartItem(@org.jetbrains.annotations.NotNull()
    indg.com.cover2protect.data.database.model_db.MaisenseDevice cart);
}