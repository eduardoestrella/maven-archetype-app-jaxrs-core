#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.business.service;

import ${package}.core.business.service.dto.CatDto;

import java.util.List;

public interface CatService {
    List<CatDto> getHelloCat();
}
