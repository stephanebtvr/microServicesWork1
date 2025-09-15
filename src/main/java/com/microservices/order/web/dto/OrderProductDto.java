package com.microservices.order.web.dto;

import com.microservices.order.domain.entity.OrderProduct;


public record OrderProductDto(int id, String name, int quantity) {


    public static OrderProduct toEntity(OrderProductDto dto) {
        return new OrderProduct(dto.id(), dto.name(), dto.quantity());
    }

    public static OrderProductDto toDto(OrderProduct entity) {
        return new OrderProductDto(entity.getId(), entity.getName(), entity.getQuantity());
    }
}
