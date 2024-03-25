package mapper;

import com.vijay.foodCatalog.dto.FoodItemDto;
import com.vijay.foodCatalog.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItemDto mapFoodItemToFoodItemDto(FoodItem foodItem);

    FoodItem mapFoodItemDtotoFoodItem(FoodItemDto foodItemDto);
}
