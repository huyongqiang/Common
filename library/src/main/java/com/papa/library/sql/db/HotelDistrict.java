package com.papa.library.sql.db;

import com.papa.library.sql.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.papa.library.sql.dao.HotelCityDao;
import com.papa.library.sql.dao.HotelDistrictDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "HOTEL_DISTRICT".
 */
public class HotelDistrict {

    private Long id;
    private String name;
    private Long cityId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient HotelDistrictDao myDao;

    private HotelCity hotelCity;
    private Long hotelCity__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public HotelDistrict() {
    }

    public HotelDistrict(Long id) {
        this.id = id;
    }

    public HotelDistrict(Long id, String name, Long cityId) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getHotelDistrictDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /** To-one relationship, resolved on first access. */
    public HotelCity getHotelCity() {
        Long __key = this.cityId;
        if (hotelCity__resolvedKey == null || !hotelCity__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            HotelCityDao targetDao = daoSession.getHotelCityDao();
            HotelCity hotelCityNew = targetDao.load(__key);
            synchronized (this) {
                hotelCity = hotelCityNew;
            	hotelCity__resolvedKey = __key;
            }
        }
        return hotelCity;
    }

    public void setHotelCity(HotelCity hotelCity) {
        synchronized (this) {
            this.hotelCity = hotelCity;
            cityId = hotelCity == null ? null : hotelCity.getId();
            hotelCity__resolvedKey = cityId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}