package com.mixiao.mssm.service;

import com.mixiao.mssm.domain.Product;
import com.mixiao.mssm.domain.ProductExample;
import com.mixiao.mssm.mapper.ProductMapper;
import com.mixiao.mssm.req.ProductQueryreq;
import com.mixiao.mssm.resp.ProductQueryresp;
import com.mixiao.mssm.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;


//商品控制层
@Service
public class ProductService {
    private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);//把代码模板导入进来

    @Resource //jdk自带的注入 @Autowired spring自带的
    private ProductMapper productMapper;

    public List<ProductQueryresp> list(ProductQueryreq req){
        ProductExample ProductExample = new ProductExample();
        ProductExample.Criteria criteria = ProductExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())){
            criteria.andNameLike('%' + req.getName()+ '%');
        }
        if (!ObjectUtils.isEmpty(req.getCategory2Id())){
            criteria.andCategory2IdEqualTo(req.getCategory2Id());//查询分类2
        }
        List<Product> ProductList = productMapper.selectByExample(ProductExample);//查询全部
        List<ProductQueryresp> list = CopyUtil.copyList(ProductList,ProductQueryresp.class);

        return list;
    }
}
