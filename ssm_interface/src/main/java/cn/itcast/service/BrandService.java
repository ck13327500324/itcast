package cn.itcast.service;
import cn.itcast.pojo.TbBrand;
import java.util.List;

public interface BrandService {
    //查询所有
    List<TbBrand> findAll();

    //新增
    void save(TbBrand tbBrand);

    //根据id查询
    TbBrand findById(String id);

    //修改
    void update(TbBrand tbBrand);

    //删除
    void delete(String id);

}