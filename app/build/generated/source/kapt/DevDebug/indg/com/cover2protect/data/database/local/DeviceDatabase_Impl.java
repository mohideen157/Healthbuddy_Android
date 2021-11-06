package indg.com.cover2protect.data.database.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class DeviceDatabase_Impl extends DeviceDatabase {
  private volatile DeviceDAO _deviceDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MaisenseDevice` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `heartrate` TEXT, `rpwv` TEXT, `hrvlevel` INTEGER NOT NULL, `afib` TEXT NOT NULL, `arrythmia` TEXT NOT NULL, `bp` TEXT NOT NULL, `date` TEXT NOT NULL, `synchedid` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d01dc78435a84237d252052a82bb9c6f\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `MaisenseDevice`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMaisenseDevice = new HashMap<String, TableInfo.Column>(9);
        _columnsMaisenseDevice.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsMaisenseDevice.put("heartrate", new TableInfo.Column("heartrate", "TEXT", false, 0));
        _columnsMaisenseDevice.put("rpwv", new TableInfo.Column("rpwv", "TEXT", false, 0));
        _columnsMaisenseDevice.put("hrvlevel", new TableInfo.Column("hrvlevel", "INTEGER", true, 0));
        _columnsMaisenseDevice.put("afib", new TableInfo.Column("afib", "TEXT", true, 0));
        _columnsMaisenseDevice.put("arrythmia", new TableInfo.Column("arrythmia", "TEXT", true, 0));
        _columnsMaisenseDevice.put("bp", new TableInfo.Column("bp", "TEXT", true, 0));
        _columnsMaisenseDevice.put("date", new TableInfo.Column("date", "TEXT", true, 0));
        _columnsMaisenseDevice.put("synchedid", new TableInfo.Column("synchedid", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMaisenseDevice = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMaisenseDevice = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMaisenseDevice = new TableInfo("MaisenseDevice", _columnsMaisenseDevice, _foreignKeysMaisenseDevice, _indicesMaisenseDevice);
        final TableInfo _existingMaisenseDevice = TableInfo.read(_db, "MaisenseDevice");
        if (! _infoMaisenseDevice.equals(_existingMaisenseDevice)) {
          throw new IllegalStateException("Migration didn't properly handle MaisenseDevice(indg.com.cover2protect.data.database.model_db.MaisenseDevice).\n"
                  + " Expected:\n" + _infoMaisenseDevice + "\n"
                  + " Found:\n" + _existingMaisenseDevice);
        }
      }
    }, "d01dc78435a84237d252052a82bb9c6f", "d2c45efd81babf8f584ab2e8523a9d6e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "MaisenseDevice");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MaisenseDevice`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DeviceDAO cartDAO() {
    if (_deviceDAO != null) {
      return _deviceDAO;
    } else {
      synchronized(this) {
        if(_deviceDAO == null) {
          _deviceDAO = new DeviceDAO_Impl(this);
        }
        return _deviceDAO;
      }
    }
  }
}
