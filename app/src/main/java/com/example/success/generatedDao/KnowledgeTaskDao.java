package com.example.success.generatedDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.success.entity.KnowledgeTask;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "KNOWLEDGE_TASK".
*/
public class KnowledgeTaskDao extends AbstractDao<KnowledgeTask, Long> {

    public static final String TABLENAME = "KNOWLEDGE_TASK";

    /**
     * Properties of entity KnowledgeTask.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property KnowledgeId = new Property(1, Long.class, "knowledgeId", false, "KNOWLEDGE_ID");
        public final static Property UserId = new Property(2, Long.class, "userId", false, "USER_ID");
        public final static Property Date = new Property(3, String.class, "date", false, "DATE");
        public final static Property Status = new Property(4, int.class, "status", false, "STATUS");
    }


    public KnowledgeTaskDao(DaoConfig config) {
        super(config);
    }
    
    public KnowledgeTaskDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"KNOWLEDGE_TASK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"KNOWLEDGE_ID\" INTEGER," + // 1: knowledgeId
                "\"USER_ID\" INTEGER," + // 2: userId
                "\"DATE\" TEXT," + // 3: date
                "\"STATUS\" INTEGER NOT NULL );"); // 4: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"KNOWLEDGE_TASK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, KnowledgeTask entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long knowledgeId = entity.getKnowledgeId();
        if (knowledgeId != null) {
            stmt.bindLong(2, knowledgeId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(3, userId);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
        stmt.bindLong(5, entity.getStatus());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, KnowledgeTask entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long knowledgeId = entity.getKnowledgeId();
        if (knowledgeId != null) {
            stmt.bindLong(2, knowledgeId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(3, userId);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(4, date);
        }
        stmt.bindLong(5, entity.getStatus());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public KnowledgeTask readEntity(Cursor cursor, int offset) {
        KnowledgeTask entity = new KnowledgeTask( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // knowledgeId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // userId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // date
            cursor.getInt(offset + 4) // status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, KnowledgeTask entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setKnowledgeId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setUserId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStatus(cursor.getInt(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(KnowledgeTask entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(KnowledgeTask entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(KnowledgeTask entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
