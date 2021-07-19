package cn.yy.service;

import cn.yy.pojo.*;
import cn.yy.utils.Page;

import java.util.List;

public interface SelldetailService {

    Page<Selldetail> findAllSelldetail(int page);
    List<User> findAllUser();
    Page<Selldetail>  findSelldetailBycreateTime(Beginandend beginAndEnd);
    Page<Selldetail>  querySelldetailBySellname(String keyword, int page);
    Medicine findMedicineById(Integer id);
    List<Category> findAllCategory();
    void addDetail(Selldetail selldetail);
}
