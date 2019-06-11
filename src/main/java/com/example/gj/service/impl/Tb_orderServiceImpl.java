package com.example.gj.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.gj.config.Random;
import com.example.gj.entities.*;
import com.example.gj.mapper.*;
import com.example.gj.service.Tb_ordersService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/5/30 17:37
 * @description：2
 */
@WebService(serviceName = "TestService", // 与接口中指定的name一致
        targetNamespace = "http://service.gj.example.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.gj.service.Tb_ordersService"// 接口地址
)
@Service
@Component
public class Tb_orderServiceImpl implements Tb_ordersService {

    @Resource
    TbOrdersMapper tbOrdersMapper;

    @Resource
    TbWaybillMapper tbWaybillMapper;

    @Resource
    TbOrdersdetailsMapper tbOrdersdetails;

    @Resource
    TbPayMapper tbPayMapper;

    @Resource
    TbParamMapper tbParam;

    @Resource
    TbQingMapper tbQingMapper;

    @Resource
    TbGoodsMapper tbGoodsMapper;


    @Override
    public String sendMessage(String code, String data) {
        if (code.equals("1001")) {
            //订单
            TbOrders orders = (TbOrders) JSON.parseObject(data, TbOrders.class);
            int i = tbOrdersMapper.insert(orders);
        } else if (code.equals("1002")) {
            //运单
            TbWaybill tbWaybill = (TbWaybill) JSON.parseObject(data, TbWaybill.class);
            tbWaybillMapper.insert(tbWaybill);
        } else if (code.equals("1003")) {
            //清单
            TbQing qing = (TbQing) JSON.parseObject(data, TbQing.class);
            //获取这张清单的包含的所有信息,
            TbOrders or=new TbOrders();
            or=tbOrdersMapper.selectByPrimaryKey(qing.getOrdersNo());
            TbOrdersdetails qing1 = tbOrdersdetails.selectByPrimaryKey(qing.getOrdersNo());
            List<TbOrdersdetails> ordersDetailsList = new ArrayList<TbOrdersdetails>();
            ordersDetailsList.add(qing1);
            TbWaybill tbWaybill = tbWaybillMapper.selectByPrimaryKey(qing.getWaybillNo());
            TbPay tbPay = tbPayMapper.selectByPrimaryKey(qing.getPayNo());
            //1.合法校验(Tb_param表),先获取
            String type="负面清单";
            List<TbParam> byTypeList = tbParam.findByType(type);
            //声明一个标记(是用来判断是否被负面清单命中)
            boolean falg=false;
            for (TbOrdersdetails od : ordersDetailsList)
            {
                for (TbParam p : byTypeList)
                {
                    //商品名字和负面清单维护的值作比较
                    if (od.getGoodsName().contains(p.getParamValue()))
                    {
                        falg = true;
                        break;
                    }else{
                        falg=false;
                    }
                }
                if (falg)
                {
                    qing.setStauts("2");
                }else {
                    List<TbParam> paramsList=tbParam.findByType("自动放行基数");
                    int jishu=Integer.parseInt(paramsList.get(0).getParamCode());
                    int suijishu= (int) (Math.random()*100+1);
                    System.out.println(suijishu);
                    if(suijishu>jishu)
                    {
                        //需要人工审单
                        qing.setStauts("1");
                    }else{
                        //自动放行
                        System.out.println("自动放行");
                        qing.setStauts("7");
                        for (TbOrdersdetails odd:ordersDetailsList){
                            TbGoods goods=new TbGoods();
                            goods.setCbename(or.getCbename());
                            tbGoodsMapper.insert(goods);
                        }
                    }
                }
                qing.setQingNo(Random.getUUID().substring(0,10));
                tbQingMapper.insert(qing);
            }
            }
            return "hello";
        }

    }

