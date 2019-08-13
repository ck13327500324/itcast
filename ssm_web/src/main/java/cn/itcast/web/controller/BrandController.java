package cn.itcast.web.controller;

import cn.itcast.pojo.TbBrand;
import cn.itcast.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }
    @RequestMapping("/save")
    public void save(TbBrand tbBrand) {
        if(!StringUtils.isEmpty(tbBrand.getId())){
            brandService.update(tbBrand);
        }else{
            brandService.save(tbBrand);
        }
    }
    @RequestMapping("/findById")
    public TbBrand findById(String id) {
        return brandService.findById(id);
    }
    @RequestMapping("/delete")
    public void delete(String id) {
         brandService.delete(id);
    }
}
