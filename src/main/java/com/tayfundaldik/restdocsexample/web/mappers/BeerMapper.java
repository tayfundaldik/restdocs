package com.tayfundaldik.restdocsexample.web.mappers;

import com.tayfundaldik.restdocsexample.domain.Beer;
import com.tayfundaldik.restdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
