package cn.yy.pojo;

public class medicine {
    private Integer id;
    private String medNO;
    private String name;
    private String factoryAdd;
    private String description;
    private Double price;
    private Integer medCount;
    private String photoPath;
    private Integer categoryId;

    public medicine() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedNO() {
        return medNO;
    }

    public void setMedNO(String medNO) {
        this.medNO = medNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactoryAdd() {
        return factoryAdd;
    }

    public void setFactoryAdd(String factoryAdd) {
        this.factoryAdd = factoryAdd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMedCount() {
        return medCount;
    }

    public void setMedCount(Integer medCount) {
        this.medCount = medCount;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "medicine{" +
                "id=" + id +
                ", medNO='" + medNO + '\'' +
                ", name='" + name + '\'' +
                ", factoryAdd='" + factoryAdd + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", medCount=" + medCount +
                ", photoPath='" + photoPath + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
