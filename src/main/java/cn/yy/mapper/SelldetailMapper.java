package cn.yy.mapper;

import cn.yy.pojo.*;

import java.util.List;

public interface SelldetailMapper {
    List<Selldetail> findAllSelldetail();
    List<User> findAllUser();
    List<Selldetail> findSelldetailBycreateTime(Beginandend beginAndEnd);
    List<Selldetail> querySelldetailBySellname(String keyword);
    Medicine findMedicineById(Integer id);
    List<Category> findAllCategortManage();
    void addDetail(Selldetail selldetail);

}
