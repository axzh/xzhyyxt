package cn.yy.mapper;

import cn.yy.pojo.Category;
import cn.yy.pojo.Medicine;
import cn.yy.pojo.Medicinedemand;

import java.util.List;

public interface StockMapper {
    List<Medicinedemand>findAllstock();
    List<Medicinedemand>queryMedicinedemand(String keyWord);
    List<Medicine>findAllMedicine();
    Medicinedemand findMedicinedemandById(int id);
    void  updateMedicinedemand(Medicinedemand medicinedemand);
    void  deleteStock(int id);
    List<Category> findAllcategory();
    void  addMedicinedemand(Medicinedemand medicinedemand);
}
