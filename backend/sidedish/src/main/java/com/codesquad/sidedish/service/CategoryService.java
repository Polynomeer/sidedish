package com.codesquad.sidedish.service;

import com.codesquad.sidedish.domain.Category;
import com.codesquad.sidedish.domain.Item;
import com.codesquad.sidedish.domain.Order;
import com.codesquad.sidedish.dto.CategoryDto;
import com.codesquad.sidedish.dto.DetailItemDto;
import com.codesquad.sidedish.exception.CategoryNotFoundException;
import com.codesquad.sidedish.exception.ErrorCode;
import com.codesquad.sidedish.repository.CategoryRepository;
import com.codesquad.sidedish.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final OrderRepository orderRepository;

    public CategoryService(CategoryRepository categoryRepository, OrderRepository orderRepository) {
        this.categoryRepository = categoryRepository;
        this.orderRepository = orderRepository;
    }

    public CategoryDto findById(Long id) {
        return Category.createCategoryDto(categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(ErrorCode.CATEGORY_NOT_FOUND)));
    }

    public DetailItemDto findDetailItemDtoByHash(Long categoryId, String hash) {
        Item item = categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryNotFoundException(ErrorCode.CATEGORY_NOT_FOUND)).findItem(hash);
        return Item.createDetailItemDto(item);
    }

    public void order(Long categoryId, String hash, int orderCount) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryNotFoundException(ErrorCode.CATEGORY_NOT_FOUND));
        Item item = category.findItem(hash);
        item.purchase(orderCount);
        categoryRepository.save(category);

        Order order = Order.of("Dion@naver.com", hash, orderCount);

        orderRepository.save(order);
    }

}
