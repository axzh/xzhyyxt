package cn.yy.service;

import cn.yy.pojo.Category;
import cn.yy.utils.Page;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);

    Page<Category> findCategoryListByPage(int page1);

    List<Category> findCategoryList();

    void updateCategory(Category category);

    void removeCategory(int id);
}
