package com.jiacool.ssm.Service.impl;

import com.jiacool.ssm.DAO.ItemMapper;
import com.jiacool.ssm.POJO.Item;
import com.jiacool.ssm.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional//控制事务
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public Item findById(int id) {
        return itemMapper.findById(id);
    }
}
