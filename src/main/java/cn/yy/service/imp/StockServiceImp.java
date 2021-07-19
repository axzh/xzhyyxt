package cn.yy.service.imp;

import cn.yy.mapper.StockMapper;
import cn.yy.pojo.Category;
import cn.yy.pojo.Medicine;
import cn.yy.pojo.Medicinedemand;
import cn.yy.service.StockService;
import cn.yy.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements StockService {
    @Autowired
    private StockMapper mapper;

    @Override
    public Page<Medicinedemand> findAllstock(int page1) {
        PageHelper.startPage(page1,5);
        List<Medicinedemand> allstock = mapper.findAllstock();
        //船舰PageInf对象，改对象中包含分页的最终结果
        PageInfo<Medicinedemand> pageInfo=new PageInfo<Medicinedemand>(allstock);
        Page<Medicinedemand> page=new Page<Medicinedemand>((int) pageInfo.getTotal(),pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getList());
        return page;
    }

    @Override
    public List<Medicine> findAllMedicine() {
        List<Medicine> allMedicine = mapper.findAllMedicine();
        return allMedicine;
    }

    @Override
    public Medicinedemand findMedicinedemandById(int id) {
        Medicinedemand medicinedemandById = mapper.findMedicinedemandById(id);
        return medicinedemandById;
    }

    @Override
    public void updateMedicinedemand(Medicinedemand medicinedemand) {
           mapper.updateMedicinedemand(medicinedemand);
    }

    @Override
    public Page<Medicinedemand> queryMedicinedemand(int page1, String keyWord) {
        PageHelper.startPage(page1,5);
        List<Medicinedemand> allstock =mapper.queryMedicinedemand(keyWord);
        //船舰PageInf对象，改对象中包含分页的最终结果
        PageInfo<Medicinedemand> pageInfo=new PageInfo<Medicinedemand>(allstock);
        Page<Medicinedemand> page=new Page<Medicinedemand>((int) pageInfo.getTotal(),pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getList());
        return page;
    }

    @Override
    public void deleteStock(int id) {
        mapper.deleteStock(id);
    }

    @Override
    public List<Category> findAllcategory() {
        List<Category> allcategory = mapper.findAllcategory();
        return allcategory;
    }

    @Override
    public void addMedicinedemand(Medicinedemand medicinedemand) {
        mapper.addMedicinedemand(medicinedemand);
    }
}
