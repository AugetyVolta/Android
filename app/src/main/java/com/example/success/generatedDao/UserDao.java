package com.example.success.generatedDao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.example.success.entity.FriendShip;
import com.example.success.entity.UserInRoom;

import com.example.success.entity.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TaskNum = new Property(1, int.class, "taskNum", false, "TASK_NUM");
        public final static Property WordTaskNum = new Property(2, int.class, "wordTaskNum", false, "WORD_TASK_NUM");
        public final static Property KnowledgeTaskNum = new Property(3, int.class, "knowledgeTaskNum", false, "KNOWLEDGE_TASK_NUM");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property Password = new Property(5, String.class, "password", false, "PASSWORD");
        public final static Property NoteTime = new Property(6, int.class, "noteTime", false, "NOTE_TIME");
        public final static Property UserPhoto = new Property(7, byte[].class, "userPhoto", false, "USER_PHOTO");
    }

    private DaoSession daoSession;

    private Query<User> room_JoinUsersQuery;
    private Query<User> user_FriendsQuery;

    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TASK_NUM\" INTEGER NOT NULL ," + // 1: taskNum
                "\"WORD_TASK_NUM\" INTEGER NOT NULL ," + // 2: wordTaskNum
                "\"KNOWLEDGE_TASK_NUM\" INTEGER NOT NULL ," + // 3: knowledgeTaskNum
                "\"NAME\" TEXT UNIQUE ," + // 4: name
                "\"PASSWORD\" TEXT," + // 5: password
                "\"NOTE_TIME\" INTEGER NOT NULL ," + // 6: noteTime
                "\"USER_PHOTO\" BLOB);"); // 7: userPhoto
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTaskNum());
        stmt.bindLong(3, entity.getWordTaskNum());
        stmt.bindLong(4, entity.getKnowledgeTaskNum());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(6, password);
        }
        stmt.bindLong(7, entity.getNoteTime());
 
        byte[] userPhoto = entity.getUserPhoto();
        if (userPhoto != null) {
            stmt.bindBlob(8, userPhoto);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getTaskNum());
        stmt.bindLong(3, entity.getWordTaskNum());
        stmt.bindLong(4, entity.getKnowledgeTaskNum());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(6, password);
        }
        stmt.bindLong(7, entity.getNoteTime());
 
        byte[] userPhoto = entity.getUserPhoto();
        if (userPhoto != null) {
            stmt.bindBlob(8, userPhoto);
        }
    }

    @Override
    protected final void attachEntity(User entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // taskNum
            cursor.getInt(offset + 2), // wordTaskNum
            cursor.getInt(offset + 3), // knowledgeTaskNum
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // password
            cursor.getInt(offset + 6), // noteTime
            cursor.isNull(offset + 7) ? null : cursor.getBlob(offset + 7) // userPhoto
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTaskNum(cursor.getInt(offset + 1));
        entity.setWordTaskNum(cursor.getInt(offset + 2));
        entity.setKnowledgeTaskNum(cursor.getInt(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPassword(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setNoteTime(cursor.getInt(offset + 6));
        entity.setUserPhoto(cursor.isNull(offset + 7) ? null : cursor.getBlob(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "joinUsers" to-many relationship of Room. */
    public List<User> _queryRoom_JoinUsers(Long roomId) {
        synchronized (this) {
            if (room_JoinUsersQuery == null) {
                QueryBuilder<User> queryBuilder = queryBuilder();
                queryBuilder.join(UserInRoom.class, UserInRoomDao.Properties.UserId)
                    .where(UserInRoomDao.Properties.RoomId.eq(roomId));
                room_JoinUsersQuery = queryBuilder.build();
            }
        }
        Query<User> query = room_JoinUsersQuery.forCurrentThread();
        query.setParameter(0, roomId);
        return query.list();
    }

    /** Internal query to resolve the "friends" to-many relationship of User. */
    public List<User> _queryUser_Friends(Long user1Id) {
        synchronized (this) {
            if (user_FriendsQuery == null) {
                QueryBuilder<User> queryBuilder = queryBuilder();
                queryBuilder.join(FriendShip.class, FriendShipDao.Properties.User2Id)
                    .where(FriendShipDao.Properties.User1Id.eq(user1Id));
                user_FriendsQuery = queryBuilder.build();
            }
        }
        Query<User> query = user_FriendsQuery.forCurrentThread();
        query.setParameter(0, user1Id);
        return query.list();
    }

}
