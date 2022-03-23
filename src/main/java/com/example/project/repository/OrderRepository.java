package com.example.project.repository;

import com.example.project.model.entity.Cart;
import com.example.project.model.entity.Order;
import com.example.project.model.enumclass.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUserIdx(Long userIdx);
    List<Order> findAllByOrderStatus(OrderStatus orderStatus);

    Optional<Order> findTopByUserIdxOrderByOrderRegdateDesc(Long userIdx);


    List<Order> findAllByUserIdxAndOrderStatus(Long userIdx, OrderStatus orderStatus);
}
