package indg.com.cover2protect.data.database.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import indg.com.cover2protect.data.database.model_db.MaisenseDevice;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class DeviceDAO_Impl implements DeviceDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMaisenseDevice;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfMaisenseDevice;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfMaisenseDevice;

  private final SharedSQLiteStatement __preparedStmtOfEmptyCart;

  public DeviceDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMaisenseDevice = new EntityInsertionAdapter<MaisenseDevice>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `MaisenseDevice`(`id`,`heartrate`,`rpwv`,`hrvlevel`,`afib`,`arrythmia`,`bp`,`date`,`synchedid`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MaisenseDevice value) {
        stmt.bindLong(1, value.getId());
        if (value.getHeartrate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHeartrate());
        }
        if (value.getRPWV() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRPWV());
        }
        stmt.bindLong(4, value.getHRVLevel());
        if (value.getAFIB() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAFIB());
        }
        if (value.getArrythmia() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArrythmia());
        }
        if (value.getBp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBp());
        }
        if (value.getDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDate());
        }
        if (value.getSynchedId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSynchedId());
        }
      }
    };
    this.__deletionAdapterOfMaisenseDevice = new EntityDeletionOrUpdateAdapter<MaisenseDevice>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `MaisenseDevice` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MaisenseDevice value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMaisenseDevice = new EntityDeletionOrUpdateAdapter<MaisenseDevice>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `MaisenseDevice` SET `id` = ?,`heartrate` = ?,`rpwv` = ?,`hrvlevel` = ?,`afib` = ?,`arrythmia` = ?,`bp` = ?,`date` = ?,`synchedid` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MaisenseDevice value) {
        stmt.bindLong(1, value.getId());
        if (value.getHeartrate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHeartrate());
        }
        if (value.getRPWV() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRPWV());
        }
        stmt.bindLong(4, value.getHRVLevel());
        if (value.getAFIB() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAFIB());
        }
        if (value.getArrythmia() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArrythmia());
        }
        if (value.getBp() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBp());
        }
        if (value.getDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDate());
        }
        if (value.getSynchedId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSynchedId());
        }
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfEmptyCart = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM MaisenseDevice";
        return _query;
      }
    };
  }

  @Override
  public void insertToCart(MaisenseDevice... carts) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMaisenseDevice.insert(carts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCartItem(MaisenseDevice cart) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfMaisenseDevice.handle(cart);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCart(MaisenseDevice... carts) {
    __db.beginTransaction();
    try {
      __updateAdapterOfMaisenseDevice.handleMultiple(carts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void emptyCart() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfEmptyCart.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfEmptyCart.release(_stmt);
    }
  }

  @Override
  public Flowable<List<MaisenseDevice>> getCartItems() {
    final String _sql = "SELECT * FROM MaisenseDevice";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"MaisenseDevice"}, new Callable<List<MaisenseDevice>>() {
      @Override
      public List<MaisenseDevice> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfHeartrate = _cursor.getColumnIndexOrThrow("heartrate");
          final int _cursorIndexOfRPWV = _cursor.getColumnIndexOrThrow("rpwv");
          final int _cursorIndexOfHRVLevel = _cursor.getColumnIndexOrThrow("hrvlevel");
          final int _cursorIndexOfAFIB = _cursor.getColumnIndexOrThrow("afib");
          final int _cursorIndexOfArrythmia = _cursor.getColumnIndexOrThrow("arrythmia");
          final int _cursorIndexOfBp = _cursor.getColumnIndexOrThrow("bp");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfSynchedId = _cursor.getColumnIndexOrThrow("synchedid");
          final List<MaisenseDevice> _result = new ArrayList<MaisenseDevice>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MaisenseDevice _item;
            _item = new MaisenseDevice();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpHeartrate;
            _tmpHeartrate = _cursor.getString(_cursorIndexOfHeartrate);
            _item.setHeartrate(_tmpHeartrate);
            final String _tmpRPWV;
            _tmpRPWV = _cursor.getString(_cursorIndexOfRPWV);
            _item.setRPWV(_tmpRPWV);
            final int _tmpHRVLevel;
            _tmpHRVLevel = _cursor.getInt(_cursorIndexOfHRVLevel);
            _item.setHRVLevel(_tmpHRVLevel);
            final String _tmpAFIB;
            _tmpAFIB = _cursor.getString(_cursorIndexOfAFIB);
            _item.setAFIB(_tmpAFIB);
            final String _tmpArrythmia;
            _tmpArrythmia = _cursor.getString(_cursorIndexOfArrythmia);
            _item.setArrythmia(_tmpArrythmia);
            final String _tmpBp;
            _tmpBp = _cursor.getString(_cursorIndexOfBp);
            _item.setBp(_tmpBp);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final String _tmpSynchedId;
            _tmpSynchedId = _cursor.getString(_cursorIndexOfSynchedId);
            _item.setSynchedId(_tmpSynchedId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<List<MaisenseDevice>> getCartItemById(int cartItemId) {
    final String _sql = "SELECT * FROM MaisenseDevice WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, cartItemId);
    return RxRoom.createFlowable(__db, new String[]{"MaisenseDevice"}, new Callable<List<MaisenseDevice>>() {
      @Override
      public List<MaisenseDevice> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfHeartrate = _cursor.getColumnIndexOrThrow("heartrate");
          final int _cursorIndexOfRPWV = _cursor.getColumnIndexOrThrow("rpwv");
          final int _cursorIndexOfHRVLevel = _cursor.getColumnIndexOrThrow("hrvlevel");
          final int _cursorIndexOfAFIB = _cursor.getColumnIndexOrThrow("afib");
          final int _cursorIndexOfArrythmia = _cursor.getColumnIndexOrThrow("arrythmia");
          final int _cursorIndexOfBp = _cursor.getColumnIndexOrThrow("bp");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfSynchedId = _cursor.getColumnIndexOrThrow("synchedid");
          final List<MaisenseDevice> _result = new ArrayList<MaisenseDevice>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MaisenseDevice _item;
            _item = new MaisenseDevice();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpHeartrate;
            _tmpHeartrate = _cursor.getString(_cursorIndexOfHeartrate);
            _item.setHeartrate(_tmpHeartrate);
            final String _tmpRPWV;
            _tmpRPWV = _cursor.getString(_cursorIndexOfRPWV);
            _item.setRPWV(_tmpRPWV);
            final int _tmpHRVLevel;
            _tmpHRVLevel = _cursor.getInt(_cursorIndexOfHRVLevel);
            _item.setHRVLevel(_tmpHRVLevel);
            final String _tmpAFIB;
            _tmpAFIB = _cursor.getString(_cursorIndexOfAFIB);
            _item.setAFIB(_tmpAFIB);
            final String _tmpArrythmia;
            _tmpArrythmia = _cursor.getString(_cursorIndexOfArrythmia);
            _item.setArrythmia(_tmpArrythmia);
            final String _tmpBp;
            _tmpBp = _cursor.getString(_cursorIndexOfBp);
            _item.setBp(_tmpBp);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final String _tmpSynchedId;
            _tmpSynchedId = _cursor.getString(_cursorIndexOfSynchedId);
            _item.setSynchedId(_tmpSynchedId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public MaisenseDevice findDeviceBySynchedId(String synchedid) {
    final String _sql = "SELECT * FROM MaisenseDevice WHERE synchedid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (synchedid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, synchedid);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfHeartrate = _cursor.getColumnIndexOrThrow("heartrate");
      final int _cursorIndexOfRPWV = _cursor.getColumnIndexOrThrow("rpwv");
      final int _cursorIndexOfHRVLevel = _cursor.getColumnIndexOrThrow("hrvlevel");
      final int _cursorIndexOfAFIB = _cursor.getColumnIndexOrThrow("afib");
      final int _cursorIndexOfArrythmia = _cursor.getColumnIndexOrThrow("arrythmia");
      final int _cursorIndexOfBp = _cursor.getColumnIndexOrThrow("bp");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final int _cursorIndexOfSynchedId = _cursor.getColumnIndexOrThrow("synchedid");
      final MaisenseDevice _result;
      if(_cursor.moveToFirst()) {
        _result = new MaisenseDevice();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpHeartrate;
        _tmpHeartrate = _cursor.getString(_cursorIndexOfHeartrate);
        _result.setHeartrate(_tmpHeartrate);
        final String _tmpRPWV;
        _tmpRPWV = _cursor.getString(_cursorIndexOfRPWV);
        _result.setRPWV(_tmpRPWV);
        final int _tmpHRVLevel;
        _tmpHRVLevel = _cursor.getInt(_cursorIndexOfHRVLevel);
        _result.setHRVLevel(_tmpHRVLevel);
        final String _tmpAFIB;
        _tmpAFIB = _cursor.getString(_cursorIndexOfAFIB);
        _result.setAFIB(_tmpAFIB);
        final String _tmpArrythmia;
        _tmpArrythmia = _cursor.getString(_cursorIndexOfArrythmia);
        _result.setArrythmia(_tmpArrythmia);
        final String _tmpBp;
        _tmpBp = _cursor.getString(_cursorIndexOfBp);
        _result.setBp(_tmpBp);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        _result.setDate(_tmpDate);
        final String _tmpSynchedId;
        _tmpSynchedId = _cursor.getString(_cursorIndexOfSynchedId);
        _result.setSynchedId(_tmpSynchedId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countCartItem() {
    final String _sql = "SELECT COUNT(*) from MaisenseDevice";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
