package com.mixiao.mssm.controller;

import com.mixiao.mssm.req.ProductQueryreq;
import com.mixiao.mssm.resp.CommonResp;
import com.mixiao.mssm.resp.ProductQueryresp;
import com.mixiao.mssm.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


//商品控制层
@RestController
@Controller
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @GetMapping("/list")
    public CommonResp list(ProductQueryreq req){
        CommonResp <List<ProductQueryresp>> resp = new CommonResp<>();
        List<ProductQueryresp> list =productService.list(req);
        resp.setContent(list);
        return  resp;
    }
}
