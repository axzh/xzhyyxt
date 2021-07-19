package cn.yy.mapper;

import cn.yy.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    void addCategory(Category category);

    List<Category> findCategoryListByPage();

    List<Category> findCategoryList();

    void updateCategory(Category category);

    void removeCategory(int id);

}
