//package com.example.polls.service;
//
//import com.example.polls.model.OrderProduct;
//import com.example.polls.repository.OrderProductRepository;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//@Transactional
//public class OrderProductServiceImpl implements OrderProductService {
//
//    private OrderProductRepository orderProductRepository;
//
//    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
//        this.orderProductRepository = orderProductRepository;
//    }
//
//    @Override
//    public OrderProduct create(OrderProduct orderProduct) {
//        return this.orderProductRepository.save(orderProduct);
//    }
//}
