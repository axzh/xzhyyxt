package cn.yy.service;

import cn.yy.pojo.Medicine;
import cn.yy.pojo.QueryVo;
import cn.yy.utils.Page;

public interface MedicineService {
    void addMedicine(Medicine medicine);

    Page<Medicine> findMedicineList(QueryVo vo);

    void updateMedicine(Medicine medicine);

    void removeMedicineById(int id);

    void sellCount(Medicine medicine);

    Page<Medicine> findMedicine(int page1);
}
