package cn.yy.service;

import cn.yy.pojo.Category;
import cn.yy.pojo.Medicine;
import cn.yy.pojo.Medicinedemand;
import cn.yy.utils.Page;

import java.util.List;

public interface StockService {
Page<Medicinedemand> findAllstock(int page);
    List<Medicine>findAllMedicine();
    Medicinedemand findMedicinedemandById(int id);
    void  updateMedicinedemand(Medicinedemand medicinedemand);
    Page<Medicinedemand> queryMedicinedemand(int page,String keyWord);
    void  deleteStock(int id);
    List<Category> findAllcategory();
    void  addMedicinedemand(Medicinedemand medicinedemand);

}
