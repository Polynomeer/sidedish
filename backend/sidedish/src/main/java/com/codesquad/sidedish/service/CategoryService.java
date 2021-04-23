package com.codesquad.sidedish.service;

import com.codesquad.sidedish.domain.Category;
import com.codesquad.sidedish.domain.Item;
import com.codesquad.sidedish.domain.Order;
import com.codesquad.sidedish.dto.CategoryDto;
import com.codesquad.sidedish.dto.DetailItemDto;
import com.codesquad.sidedish.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDto> findAll() {
         return categoryRepository.findAll().stream().map(category -> Category.createCategoryDto(category)).collect(Collectors.toList());
    }

    public DetailItemDto findDetailItemDtoByHash(Long categoryId, String hash) {
        Item item = categoryRepository.findById(categoryId).orElseThrow(IllegalAccessError::new).getItem(hash);
        return Item.createDetailItemDto(item);
    }

    public String order(Long categoryId, String hash, Order order) {
        Item item =  findItemByHash(categoryId, hash);
        if(item.getStock() < order.getCount()) {
            //error
        }
        return null;
    }

    public Item findItemByHash(Long categoryId, String hash) {//제거
        return categoryRepository.findById(categoryId).orElseThrow(IllegalAccessError::new).getItem(hash);
    }

}
