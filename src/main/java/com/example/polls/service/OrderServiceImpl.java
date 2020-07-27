//package com.example.polls.service;
//
//import com.example.polls.model.Order;
//import com.example.polls.repository.OrderRepository;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//
//@Service
//@Transactional
//public class OrderServiceImpl implements OrderService {
//
//    private OrderRepository orderRepository;
//
//    public OrderServiceImpl(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    @Override
//    public Iterable<Order> getAllOrders() {
//        return this.orderRepository.findAll();
//    }
//
//    @Override
//    public Order create(@NotNull(message = "The order cannot be null.") @Valid Order order) {
//        return null;
//    }
//
//
//    @Override
//    public void update(Order order) {
//        this.orderRepository.save(order);
//    }
//}
