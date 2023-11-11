package com.example.success.generatedDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.success.entity.FriendShip;
import com.example.success.entity.Knowledge;
import com.example.success.entity.KnowledgeBlank;
import com.example.success.entity.KnowledgeHistory;
import com.example.success.entity.KnowledgeLabel;
import com.example.success.entity.KnowledgeTask;
import com.example.success.entity.Label;
import com.example.success.entity.SportTip;
import com.example.success.entity.User;
import com.example.success.entity.Word;
import com.example.success.entity.WordHistory;
import com.example.success.entity.WordLabel;
import com.example.success.entity.WordTask;

import com.example.success.generatedDao.FriendShipDao;
import com.example.success.generatedDao.KnowledgeDao;
import com.example.success.generatedDao.KnowledgeBlankDao;
import com.example.success.generatedDao.KnowledgeHistoryDao;
import com.example.success.generatedDao.KnowledgeLabelDao;
import com.example.success.generatedDao.KnowledgeTaskDao;
import com.example.success.generatedDao.LabelDao;
import com.example.success.generatedDao.SportTipDao;
import com.example.success.generatedDao.UserDao;
import com.example.success.generatedDao.WordDao;
import com.example.success.generatedDao.WordHistoryDao;
import com.example.success.generatedDao.WordLabelDao;
import com.example.success.generatedDao.WordTaskDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig friendShipDaoConfig;
    private final DaoConfig knowledgeDaoConfig;
    private final DaoConfig knowledgeBlankDaoConfig;
    private final DaoConfig knowledgeHistoryDaoConfig;
    private final DaoConfig knowledgeLabelDaoConfig;
    private final DaoConfig knowledgeTaskDaoConfig;
    private final DaoConfig labelDaoConfig;
    private final DaoConfig sportTipDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig wordDaoConfig;
    private final DaoConfig wordHistoryDaoConfig;
    private final DaoConfig wordLabelDaoConfig;
    private final DaoConfig wordTaskDaoConfig;

    private final FriendShipDao friendShipDao;
    private final KnowledgeDao knowledgeDao;
    private final KnowledgeBlankDao knowledgeBlankDao;
    private final KnowledgeHistoryDao knowledgeHistoryDao;
    private final KnowledgeLabelDao knowledgeLabelDao;
    private final KnowledgeTaskDao knowledgeTaskDao;
    private final LabelDao labelDao;
    private final SportTipDao sportTipDao;
    private final UserDao userDao;
    private final WordDao wordDao;
    private final WordHistoryDao wordHistoryDao;
    private final WordLabelDao wordLabelDao;
    private final WordTaskDao wordTaskDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        friendShipDaoConfig = daoConfigMap.get(FriendShipDao.class).clone();
        friendShipDaoConfig.initIdentityScope(type);

        knowledgeDaoConfig = daoConfigMap.get(KnowledgeDao.class).clone();
        knowledgeDaoConfig.initIdentityScope(type);

        knowledgeBlankDaoConfig = daoConfigMap.get(KnowledgeBlankDao.class).clone();
        knowledgeBlankDaoConfig.initIdentityScope(type);

        knowledgeHistoryDaoConfig = daoConfigMap.get(KnowledgeHistoryDao.class).clone();
        knowledgeHistoryDaoConfig.initIdentityScope(type);

        knowledgeLabelDaoConfig = daoConfigMap.get(KnowledgeLabelDao.class).clone();
        knowledgeLabelDaoConfig.initIdentityScope(type);

        knowledgeTaskDaoConfig = daoConfigMap.get(KnowledgeTaskDao.class).clone();
        knowledgeTaskDaoConfig.initIdentityScope(type);

        labelDaoConfig = daoConfigMap.get(LabelDao.class).clone();
        labelDaoConfig.initIdentityScope(type);

        sportTipDaoConfig = daoConfigMap.get(SportTipDao.class).clone();
        sportTipDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        wordDaoConfig = daoConfigMap.get(WordDao.class).clone();
        wordDaoConfig.initIdentityScope(type);

        wordHistoryDaoConfig = daoConfigMap.get(WordHistoryDao.class).clone();
        wordHistoryDaoConfig.initIdentityScope(type);

        wordLabelDaoConfig = daoConfigMap.get(WordLabelDao.class).clone();
        wordLabelDaoConfig.initIdentityScope(type);

        wordTaskDaoConfig = daoConfigMap.get(WordTaskDao.class).clone();
        wordTaskDaoConfig.initIdentityScope(type);

        friendShipDao = new FriendShipDao(friendShipDaoConfig, this);
        knowledgeDao = new KnowledgeDao(knowledgeDaoConfig, this);
        knowledgeBlankDao = new KnowledgeBlankDao(knowledgeBlankDaoConfig, this);
        knowledgeHistoryDao = new KnowledgeHistoryDao(knowledgeHistoryDaoConfig, this);
        knowledgeLabelDao = new KnowledgeLabelDao(knowledgeLabelDaoConfig, this);
        knowledgeTaskDao = new KnowledgeTaskDao(knowledgeTaskDaoConfig, this);
        labelDao = new LabelDao(labelDaoConfig, this);
        sportTipDao = new SportTipDao(sportTipDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        wordDao = new WordDao(wordDaoConfig, this);
        wordHistoryDao = new WordHistoryDao(wordHistoryDaoConfig, this);
        wordLabelDao = new WordLabelDao(wordLabelDaoConfig, this);
        wordTaskDao = new WordTaskDao(wordTaskDaoConfig, this);

        registerDao(FriendShip.class, friendShipDao);
        registerDao(Knowledge.class, knowledgeDao);
        registerDao(KnowledgeBlank.class, knowledgeBlankDao);
        registerDao(KnowledgeHistory.class, knowledgeHistoryDao);
        registerDao(KnowledgeLabel.class, knowledgeLabelDao);
        registerDao(KnowledgeTask.class, knowledgeTaskDao);
        registerDao(Label.class, labelDao);
        registerDao(SportTip.class, sportTipDao);
        registerDao(User.class, userDao);
        registerDao(Word.class, wordDao);
        registerDao(WordHistory.class, wordHistoryDao);
        registerDao(WordLabel.class, wordLabelDao);
        registerDao(WordTask.class, wordTaskDao);
    }
    
    public void clear() {
        friendShipDaoConfig.clearIdentityScope();
        knowledgeDaoConfig.clearIdentityScope();
        knowledgeBlankDaoConfig.clearIdentityScope();
        knowledgeHistoryDaoConfig.clearIdentityScope();
        knowledgeLabelDaoConfig.clearIdentityScope();
        knowledgeTaskDaoConfig.clearIdentityScope();
        labelDaoConfig.clearIdentityScope();
        sportTipDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        wordDaoConfig.clearIdentityScope();
        wordHistoryDaoConfig.clearIdentityScope();
        wordLabelDaoConfig.clearIdentityScope();
        wordTaskDaoConfig.clearIdentityScope();
    }

    public FriendShipDao getFriendShipDao() {
        return friendShipDao;
    }

    public KnowledgeDao getKnowledgeDao() {
        return knowledgeDao;
    }

    public KnowledgeBlankDao getKnowledgeBlankDao() {
        return knowledgeBlankDao;
    }

    public KnowledgeHistoryDao getKnowledgeHistoryDao() {
        return knowledgeHistoryDao;
    }

    public KnowledgeLabelDao getKnowledgeLabelDao() {
        return knowledgeLabelDao;
    }

    public KnowledgeTaskDao getKnowledgeTaskDao() {
        return knowledgeTaskDao;
    }

    public LabelDao getLabelDao() {
        return labelDao;
    }

    public SportTipDao getSportTipDao() {
        return sportTipDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public WordDao getWordDao() {
        return wordDao;
    }

    public WordHistoryDao getWordHistoryDao() {
        return wordHistoryDao;
    }

    public WordLabelDao getWordLabelDao() {
        return wordLabelDao;
    }

    public WordTaskDao getWordTaskDao() {
        return wordTaskDao;
    }

}
