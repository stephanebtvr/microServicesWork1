package com.microservices.order.domain.service;

import com.microservices.order.domain.entity.OrderProduct;
import org.springframework.stereotype.*;

@Component
public class OrderManagerServiceImpl implements OrderManagerService {

    @Override
    public OrderProduct order(OrderProduct orderProduct) {
        // Logique pour traiter la commande
        return orderProduct; // Retourne l'objet traité (exemple)
    }
}
