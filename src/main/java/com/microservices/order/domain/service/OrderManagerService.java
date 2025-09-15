package com.microservices.order.domain.service;

import com.microservices.order.domain.entity.OrderProduct;
import org.springframework.stereotype.*;

@Service
public interface OrderManagerService {
    OrderProduct order(OrderProduct orderProduct);
}
