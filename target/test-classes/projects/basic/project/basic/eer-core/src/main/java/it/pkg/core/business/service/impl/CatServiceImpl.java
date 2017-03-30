package it.pkg.core.business.service.impl;

import it.pkg.core.business.service.CatService;
import it.pkg.core.business.service.dto.CatDto;
import it.pkg.core.business.service.mapper.CatServiceMapper;
import it.pkg.core.dao.CatDao;
import it.pkg.core.dao.entity.CatEntity;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class CatServiceImpl implements CatService {

    @Inject
    CatDao catDao;

    @Inject
    CatServiceMapper catServiceMapper;

    public CatServiceImpl() {

    }

    public List<CatDto> getHelloCat() {

        // Searching Games
        List<CatEntity> catEntityList = catDao.findAll();

        // Mapping from Persistence Entity to Dto Object
        List<CatDto> catDtoList = new ArrayList<CatDto>();
        catServiceMapper.mapCatEntityToCatDto(catEntityList, catDtoList);

        return catDtoList;
    }

}
