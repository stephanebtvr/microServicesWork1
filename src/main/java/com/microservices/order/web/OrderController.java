package com.microservices.order.web;

import com.microservices.order.domain.entity.OrderProduct;
import com.microservices.order.domain.service.OrderManagerServiceImpl;
import com.microservices.order.web.dto.OrderProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-product")
@RequiredArgsConstructor
public class OrderController {

    private final OrderManagerServiceImpl orderManagerService;

    @PostMapping("/create")
    public ResponseEntity<OrderProductDto> createOrderProduct(@RequestBody OrderProductDto dto) {
        // Logique pour créer un OrderProduct
        OrderProduct response = orderManagerService.order(OrderProductDto.toEntity(dto));
        OrderProductDto itemToReturn = OrderProductDto.toDto(response);

        return ResponseEntity.status(HttpStatus.CREATED).body(itemToReturn);
    }
}