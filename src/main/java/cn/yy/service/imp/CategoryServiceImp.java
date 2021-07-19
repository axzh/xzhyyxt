package cn.yy.service.imp;

import cn.yy.mapper.CategoryMapper;
import cn.yy.pojo.Category;
import cn.yy.service.CategoryService;
import cn.yy.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryMapper mapper;

    @Override
    public void addCategory(Category category) {
        mapper.addCategory(category);
    }

    @Override
    public Page<Category> findCategoryListByPage(int page1) {
        PageHelper.startPage(page1, 5);
        List<Category> categoryList = mapper.findCategoryListByPage();
        PageInfo<Category> pageInfo = new PageInfo<Category>(categoryList);
        Page<Category> page = new Page<Category>((int) pageInfo.getTotal(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getList());
        return page;
    }

    @Override
    public List<Category> findCategoryList() {
        return mapper.findCategoryList();
    }

    @Override
    public void updateCategory(Category category) {
        mapper.updateCategory(category);
    }

    @Override
    public void removeCategory(int id) {
        mapper.removeCategory(id);
    }
}
