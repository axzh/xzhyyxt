package cn.yy.service.imp;

import cn.yy.mapper.SelldetailMapper;
import cn.yy.pojo.*;
import cn.yy.service.SelldetailService;
import cn.yy.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SelldetailServiceImp implements SelldetailService {
    @Autowired
    private SelldetailMapper mapper;

    @Override
    public Page<Selldetail> findAllSelldetail(int page1) {
        PageHelper.startPage(page1, 5);
        List<Selldetail> allSelldetail = mapper.findAllSelldetail();
        //船舰PageInf对象，改对象中包含分页的最终结果
        PageInfo<Selldetail> pageInfo = new PageInfo<Selldetail>(allSelldetail);
        Page<Selldetail> page = new Page<Selldetail>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }

    @Override
    public List<User> findAllUser() {
        List<User> allUser = mapper.findAllUser();
        return allUser;
    }

    @Override
    public Page<Selldetail> findSelldetailBycreateTime(Beginandend beginAndEnd) {
        PageHelper.startPage(beginAndEnd.getPage(), beginAndEnd.getRows());
        List<Selldetail> allSelldetail = mapper.findSelldetailBycreateTime(beginAndEnd);
        //船舰PageInf对象，改对象中包含分页的最终结果
        PageInfo<Selldetail> pageInfo = new PageInfo<Selldetail>(allSelldetail);
        Page<Selldetail> page = new Page<Selldetail>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }

    @Override
    public Page<Selldetail> querySelldetailBySellname(String keyword, int page1) {
        PageHelper.startPage(page1, 5);
        List<Selldetail> selldetails = mapper.querySelldetailBySellname(keyword);
        //船舰PageInf对象，改对象中包含分页的最终结果
        PageInfo<Selldetail> pageInfo = new PageInfo<Selldetail>(selldetails);
        Page<Selldetail> page = new Page<Selldetail>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }

    @Override
    public Medicine findMedicineById(Integer id) {
        Medicine medicine = mapper.findMedicineById(id);
        return medicine;
    }

    @Override
    public List<Category> findAllCategory() {
        List<Category> allCategory = mapper.findAllCategortManage();
        return allCategory;
    }

    @Override
    public void addDetail(Selldetail selldetail) {
        Medicine medicine = mapper.findMedicineById(selldetail.getMedid());
        selldetail.setSellName(medicine.getName());
        selldetail.setSellPrice(medicine.getPrice());
        selldetail.setSellTime(new Date(System.currentTimeMillis()));
        mapper.addDetail(selldetail);


    }
}
