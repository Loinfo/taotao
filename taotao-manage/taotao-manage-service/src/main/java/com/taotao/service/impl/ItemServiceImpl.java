package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品管理service
 */
@Service
public class ItemServiceImpl implements ItemService{


    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long ItemId) {
        TbItem item = itemMapper.selectByPrimaryKey(ItemId);
        return item;
    }
}
