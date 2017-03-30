#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.core.business.service.mapper;

import ${package}.core.business.service.dto.CatDto;
import ${package}.core.dao.entity.CatEntity;
import ${package}.core.business.service.mapper.AbstractServiceMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;

/**
 * Mapping between entity beans and display beans.
 */
public class CatServiceMapper extends AbstractServiceMapper {

	/**
	 * ModelMapper : bean to bean mapping library.
	 */
	private ModelMapper modelMapper;

	/**
	 * Constructor.
	 */
	public CatServiceMapper() {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	/**
	 * Mapping from 'CatEntity' to 'CatDto'
	 * @param CatEntity
	 * @param CatDto
	 */
	public void mapCatEntityToCatDto(List<CatEntity> catEntity, List<CatDto> catDto) {
		map(catEntity, catDto, CatDto.class);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ModelMapper getModelMapper() {
		return modelMapper;
	}

	protected void setModelMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

}