package cn.yy.service.imp;

import cn.yy.mapper.MedicineMapper;
import cn.yy.pojo.Medicine;
import cn.yy.pojo.QueryVo;
import cn.yy.service.MedicineService;
import cn.yy.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class
MedicineServiceImp implements MedicineService {
    @Autowired
    private MedicineMapper mapper;

    @Override
    public void addMedicine(Medicine medicine) {
        mapper.addMedicine(medicine);
    }

    @Override
    public Page<Medicine> findMedicineList(QueryVo vo) {
        PageHelper.startPage(vo.getPage(), vo.getRows());
        List<Medicine> medicineList = mapper.findMedicineList(vo);
        PageInfo<Medicine> pageInfo = new PageInfo<Medicine>(medicineList);
        Page<Medicine> page = new Page<Medicine>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }

    @Override
    public void updateMedicine(Medicine medicine) {
        mapper.updateMedicine(medicine);
    }

    @Override
    public void removeMedicineById(int id) {
        mapper.removeMedicineById(id);
    }

    @Override
    public void sellCount(Medicine medicine) {
        mapper.sellCount(medicine);
    }

    @Override
    public Page<Medicine> findMedicine(int page1) {
        PageHelper.startPage(page1, 5);
        List<Medicine> medicineList = mapper.findMedicine();
        PageInfo<Medicine> pageInfo = new PageInfo<Medicine>(medicineList);
        Page<Medicine> page = new Page<Medicine>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }
}
