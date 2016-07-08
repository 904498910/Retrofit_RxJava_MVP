package com.example.y.mvp;

import android.database.sqlite.SQLiteDatabase;

import com.example.y.mvp.mvp.Bean.TabNewsInfo;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsTabDaoConfig;

    private final NewsTabDao newsTabDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsTabDaoConfig = daoConfigMap.get(NewsTabDao.class).clone();
        newsTabDaoConfig.initIdentityScope(type);

        newsTabDao = new NewsTabDao(newsTabDaoConfig, this);

        registerDao(TabNewsInfo.class, newsTabDao);
    }
    
    public void clear() {
        newsTabDaoConfig.getIdentityScope().clear();
    }

    public NewsTabDao getNewsTabDao() {
        return newsTabDao;
    }

}