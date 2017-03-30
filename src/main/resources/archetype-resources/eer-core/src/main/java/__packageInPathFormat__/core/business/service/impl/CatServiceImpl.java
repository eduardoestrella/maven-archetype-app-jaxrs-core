#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.business.service.impl;

import ${package}.core.business.service.CatService;
import ${package}.core.business.service.dto.CatDto;
import ${package}.core.business.service.mapper.CatServiceMapper;
import ${package}.core.dao.CatDao;
import ${package}.core.dao.entity.CatEntity;

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
