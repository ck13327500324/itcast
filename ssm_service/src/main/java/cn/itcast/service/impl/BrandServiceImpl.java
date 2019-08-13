package cn.itcast.service.impl;

import cn.itcast.dao.TbBrandMapper;
import cn.itcast.pojo.TbBrand;
import cn.itcast.service.BrandService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }

    @Override
    public void save(TbBrand tbBrand) {
        brandMapper.insertSelective(tbBrand);
    }

    @Override
    public TbBrand findById(String id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand tbBrand) {
        brandMapper.updateByPrimaryKeySelective(tbBrand);
    }

    @Override
    public void delete(String id) {
        brandMapper.deleteByPrimaryKey(id);
    }

}