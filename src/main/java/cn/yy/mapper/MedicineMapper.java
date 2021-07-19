package cn.yy.mapper;

import cn.yy.pojo.Medicine;
import cn.yy.pojo.QueryVo;

import java.util.List;

public interface

MedicineMapper {
    void addMedicine(Medicine medicine);

    List<Medicine> findMedicineList(QueryVo vo);

    List<Medicine> findMedicine();

    void updateMedicine(Medicine medicine);

    void removeMedicineById(int id);

    void sellCount(Medicine medicine);
}
