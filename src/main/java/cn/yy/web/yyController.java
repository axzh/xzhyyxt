package cn.yy.web;


import cn.yy.pojo.*;
import cn.yy.service.*;
import cn.yy.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RequestMapping("/yyxt")
@Controller
public class yyController {
    @Autowired
    private UserService userService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private MedicineService medicineService;
    @Autowired
    private SelldetailService selldetailService;
    @Autowired
    private StockService stockService ;

   /* @GetMapping(value = "/test.action")

    public String login(User user, Model model, HttpServletRequest request) {
        User user1 = userService.checkout(user);
        if (user1 != null) {
            request.getSession().setAttribute("username", user1.getUsername());
            request.getSession().setAttribute("userid", user1.getId());
            return "manager";
        } else return "redirect:../staticpage/login.jsp";
    }*/

    @RequestMapping( "/test.action")
    public String test(){
        return "redirect:../staticpage/login.jsp";
    }
    @RequestMapping("/login.action")
    public String login(User user, Model model,HttpServletRequest request,String username,String password ) {

        User user1 = userService.checkout(user);
        model.addAttribute("username", user.getUsername());

        if (user1 != null) {
            request.getSession().setAttribute("id",user1.getId());
            request.getSession().setAttribute("username",user1.getUsername());
            return "manager";
        }else if (user1 == null && username == null ){
            model.addAttribute("msg","用户名或者密码出错！");
            return "error" ;
        }
        return "redirect:../staticpage/login.jsp";
    }

    @RequestMapping(value = "/add.action")
    public String add(@RequestParam("repassword")String repassword,User user,Model model){
        user.setCreateTime(new Date(System.currentTimeMillis()));
        List<User> users = userService.findAllUser();
        for (User user1:users) {
            if (user1.getUsername().equals(user.getUsername())){
                model.addAttribute("msg", "用户名已存在！");
                return "error";
            }
        }
        if (!repassword.equals(user.getPassword())){
            model.addAttribute("msg", "密码不一致！");
            return "error";
        }
        userService.adduser(user);
        return "redirect:users.action";
    }

    @GetMapping("/users.action")
    public String  findAllUser(User user,Model model){
        List<User> users  = userService.findAllUser();
        model.addAttribute("users",users);
        return "system/user_list";
    }

    @RequestMapping("/changepassword.action")
    public String changePasswordById(Model model,Integer id,String password,String newpassword, String renewpassword){

        if (password.equals(newpassword)){
            model.addAttribute("msg","修改密码不能与原密码相同!");
            return "error";
        }

        if (!renewpassword.equals(newpassword)){
            model.addAttribute("msg","修改密码与确认密码不相同!");
            return "error";
        }
        userService.changePasswordById(id,newpassword);

        return "system/user_password";
    }

    @GetMapping("/delete.action")
    public String delete(int id){
        userService.deleteUserById(id);
        return "redirect:users.action";
    }



    @RequestMapping("redirect1.action")
    public String redirect1(Model model) {
        return "top";
    }

    @RequestMapping("redirect2")
    public String redirect2() {
        return "left";
    }

    @RequestMapping("redirect3/{page1}")
    public String findMedicineList(Model model, QueryVo vo, @PathVariable("page1") int page1) {
        vo.setPage(page1);
        Page<Medicine> page = medicineService.findMedicineList(vo);
        model.addAttribute("page", page);
        return "baseData/med_list";
    }

    @RequestMapping("redirect4.action")
    public String redirect4(Model model) {
        List<Category> categoryList = categoryService.findCategoryList();
        model.addAttribute("categoryList", categoryList);
        return "forward:/staticpage/med_save.jsp";
    }

    @RequestMapping("redirect5.action")
    public String redirect5() {
        return "baseData/med_query";
    }

    @RequestMapping("redirect6.action")
    public String redirect6() {
        return "baseData/med_count";
    }

    @RequestMapping("redirect7.action")
    public String redirect7() {
        return "baseData/category_add";
    }

    @RequestMapping("redirect8.action")
    public String redirect8(Model model, @RequestParam("page") int page1) {
        Page<Category> page = categoryService.findCategoryListByPage(page1);
        model.addAttribute("page", page);
        return "baseData/category_list";
    }

    @RequestMapping("medicinePage")
    public String medicinePage(Model model, QueryVo vo) {
        Page<Medicine> page = medicineService.findMedicineList(vo);
        model.addAttribute("page", page);
        return "baseData/med_list";
    }

    @RequestMapping("redirect9/{page1}")
    public String redirect9(Model model, QueryVo vo, @PathVariable("page1") int page1) {
        vo.setPage(page1);
        Page<Medicine> page = medicineService.findMedicineList(vo);
        model.addAttribute("page", page);
        return "baseData/med_sell";
    }

    @RequestMapping("medicinePage1")
    public String medicinePage1(Model model, QueryVo vo) {
        Page<Medicine> page = medicineService.findMedicineList(vo);
        model.addAttribute("page", page);
        return "baseData/med_sell";
    }

    /*@RequestMapping("redirect10.action")
    public String redirect10(Model model) {
        Page<Selldetail> page = selldetailService.findPage1(1);
        System.out.println(page);
        model.addAttribute("page", page);
        return "sell/sell_list";
    }*/

    /*@RequestMapping("redirect10")
    public String redirect100(Model model, StartEnd vo) {
        Page<Selldetail> page = selldetailService.findPage(vo);
        System.out.println(page);
        model.addAttribute("page", page);
        return "sell/sell_list";
    }

    @RequestMapping("redirect11.action")
    public String redirect11() {
        return "sell/sell_query";
    }*/

    @RequestMapping("redirect12.action")
    public String redirect12() {
        return "system/user_add";
    }

    @RequestMapping("redirect13.action")
    public String redirect13() {
        return "system/user_list";
    }

    @RequestMapping("redirect14.action")
    public String redirect14() {
        return "system/user_password";
    }

    @PostMapping("addCategory.action")
    public String addCategory(Category category, Model model) {
        if (category != null) {
            category.setCreateTime(new Date(System.currentTimeMillis()));
            categoryService.addCategory(category);
        }
        Page<Category> page = categoryService.findCategoryListByPage(1);
        model.addAttribute("page", page);
        return "baseData/category_list";
    }

    @RequestMapping("redicretPage1.action")
    public String Page1(Model model) {
        Page<Category> page = categoryService.findCategoryListByPage(1);
        model.addAttribute("page", page);
        return "baseData/category_list";
    }

    @PostMapping("addMedicine.action")
    public String addMedicine(Model model, @RequestParam("file") MultipartFile file, HttpServletRequest request, Medicine medicine) throws IOException {
        String path = request.getServletContext().getRealPath("/WEB-INF/upload");

        medicine.setPhotoPath(path);
        String fileName = file.getOriginalFilename();
        file.transferTo(new File(path, fileName));

        medicineService.addMedicine(medicine);
        return "baseData/med_list";
    }

    @RequestMapping("/forword1/{id}/{name}/{medNo}/{price}/{medCount}/{add}/{des}")
    public String forword1(@PathVariable("id") int id, @PathVariable("name") String name,
                           @PathVariable("medNo") String medNo, @PathVariable("price") double price,
                           @PathVariable("medCount") String count, @PathVariable("add") String add,
                           @PathVariable("des") String des, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("medNo", medNo);
        model.addAttribute("price", price);
        model.addAttribute("count", count);
        model.addAttribute("add", add);
        model.addAttribute("des", des);
        return "forward:/staticpage/med_update.jsp";
    }

    @RequestMapping("/forword2/{name}/{des}/{id}")
    public String forword2(@PathVariable("name") String name, @PathVariable("des") String des, @PathVariable("id") int id, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("des", des);
        model.addAttribute("id", id);
        return "forward:/staticpage/category_update.jsp";
    }

    @PostMapping("/update1/{id}")
    public String updateMedicine(Medicine medicine, Model model) {
        medicineService.updateMedicine(medicine);
        return "baseData/med_query";
    }

    @PostMapping("/update2/{id}")
    public Object updateCategory(Category category, Model model) {
        System.out.println(category);
        categoryService.updateCategory(category);
        return Page1(model);
    }

    @RequestMapping("/delete1/{id}")
    public Object removeMedicineById(@PathVariable("id") int id, Model model) {
        medicineService.removeMedicineById(id);
        return findMedicineList(model, new QueryVo(), 1);
    }

    @RequestMapping("/delete2/{id}")
    public Object removeCategory(@PathVariable("id") int id, Model model) {
        categoryService.removeCategory(id);
        return Page1(model);
    }

    @PostMapping("/query1")
    public Object queryMedicine1(Model model, QueryVo vo) {
        return medicinePage(model, vo);
    }

    @PostMapping("/query2")
    public Object queryMedicine2(QueryVo vo, Model model) {
        return medicinePage(model, vo);
    }

    @PostMapping("/query3")
    public Object queryMedicine3(QueryVo vo, Model model) {
        return medicinePage(model, vo);
    }

    @RequestMapping("/sellAdd/{id}/{name}/{price}/{factoryAdd}/{count}")
    public String sellAdd(Medicine medicine, Model model, @PathVariable("count") int count) {
        model.addAttribute("medicine", medicine);
        model.addAttribute("count", count);
        return "sell/sell_add";
    }

    @RequestMapping("/sellCount/{id}")
    public Object sellCount(Medicine medicine, Model model, HttpServletRequest request) {
        medicineService.sellCount(medicine);
        Selldetail selldetail = new Selldetail();
        selldetail.setUsername((String) request.getSession().getAttribute("username"));
        selldetail.setUserid((Integer) request.getSession().getAttribute("userid"));
        selldetail.setMedid(medicine.getId());
        selldetail.setSellCount(medicine.getMedCount());
        selldetailService.addDetail(selldetail);
        return medicinePage1(model, new QueryVo());
    }

    @RequestMapping("seeSelldetail.action")//查看明细分页
    public String seeSelldetail(Model model,@RequestParam("page")int page) {
        Page<Selldetail> Selldetail = selldetailService.findAllSelldetail(page);
        model.addAttribute("page",Selldetail);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("QueryVourl","seeSelldetail.action");
        model.addAttribute("userlist",allUser);
        return "sell/sell_list";
    }
    @RequestMapping("querySelldetailBycreateTime.action")//根据时间查询
    public String querySelldetailBycreateTime(Beginandend beginAndEnd, Model model) {
        Page<Selldetail> selldetailBycreateTime = selldetailService.findSelldetailBycreateTime(beginAndEnd);
        model.addAttribute("page",selldetailBycreateTime);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("QueryVourl","querySelldetailBycreateTimepage.action");
        model.addAttribute("userlist",allUser);
        return "sell/sell_list";
    }
    @RequestMapping("querySelldetailBycreateTimepage.action")//实现时间查询的分页查询
    public String querySelldetailBycreateTimepage(Beginandend beginAndEnd, Model model) {
        Page<Selldetail> selldetailBycreateTime = selldetailService.findSelldetailBycreateTime(beginAndEnd);
        model.addAttribute("page",selldetailBycreateTime);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("QueryVourl","querySelldetailBycreateTimepage.action");
        model.addAttribute("userlist",allUser);
        return "sell/sell_list";
    }
    @RequestMapping("querySelldetailBySellname.action")//根据sellname查询
    public String querySelldetailBySellname(String keyWord, Model model) {
        Page<Selldetail> selldetailPage = selldetailService.querySelldetailBySellname(keyWord, 1);
        model.addAttribute("page",selldetailPage);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("QueryVourl","querySelldetailBySellnamepage.action");
        model.addAttribute("userlist",allUser);
        return "sell/sell_list";
    }
    @RequestMapping("querySelldetailBySellnamepage.action")//根据sellname查询分页
    public String querySelldetailBySellnamepage(String keyWord, Model model,@RequestParam("page")int page) {
        Page<Selldetail> selldetailPage = selldetailService.querySelldetailBySellname(keyWord, page);
        model.addAttribute("page",selldetailPage);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("QueryVourl","querySelldetailBySellnamepage.action");
        model.addAttribute("userlist",allUser);
        return "sell/sell_list";
    }
    @RequestMapping("ViewDetail.action/{medid}")
    public  String ViewDetail(Model model,@PathVariable("medid")Integer medid){
        Medicine medicineById = selldetailService.findMedicineById(medid);
        model.addAttribute("medicineById",medicineById);
        List<Category> allCategory = selldetailService.findAllCategory();
        model.addAttribute("Categorylist",allCategory);
        return "baseData/med_view";

    }

    @RequestMapping("redirect10.action")//查看明细
    public String redirect10(Model model) {
        Page<Selldetail> Selldetail = selldetailService.findAllSelldetail(1);
        List<User> allUser = selldetailService.findAllUser();
        model.addAttribute("userlist",allUser);
        model.addAttribute("QueryVourl","seeSelldetail.action");
        model.addAttribute("page",Selldetail);
        return "sell/sell_list";
    }
    @RequestMapping("redirect11.action")//日期查询
    public String redirect11() {
        return "sell/sell_query";
    }
    /*sell_list   med_view  sell_query*/


    /*------------------------------------------进货管理--------------------------------------------------*/
    @RequestMapping("checkstock.action")
    public  String checkstock(Model model){
        Page<Medicinedemand> allstock = stockService.findAllstock(1);
        model.addAttribute("page",allstock);
        List<Medicine> allMedicine = stockService.findAllMedicine();
        model.addAttribute("medicinelist",allMedicine);
        model.addAttribute("QueryVourl","checkstockpage.action");
        return "require/req_list";
    }
    @RequestMapping("checkstockpage.action")
    public  String checkstockpage(Model model,@RequestParam("page")int page){
        Page<Medicinedemand> allstock = stockService.findAllstock(page);
        model.addAttribute("page",allstock);
        List<Medicine> allMedicine = stockService.findAllMedicine();
        model.addAttribute("medicinelist",allMedicine);
        model.addAttribute("QueryVourl","checkstockpage.action");

        return "require/req_list";
    }
    @RequestMapping("deleteStock.action/{id}")
    public  String deleteStock(@PathVariable("id")int id,Model model){

        stockService.deleteStock(id);

        return checkstock(model);
    }
    @RequestMapping("toupdateStock.action/{id}")
    public  String toupdateStock(@PathVariable("id")int id,Model model){
        Medicinedemand medicinedemandById = stockService.findMedicinedemandById(id);
        model.addAttribute("medicinedemand",medicinedemandById);
        return "require/req_update";
    }
    @RequestMapping("updateStock.action")
    public  String updateStock(Medicinedemand medicinedemand){
        stockService.updateMedicinedemand(medicinedemand);
        return "redirect:checkstock.action";
    }
    @RequestMapping("queryStock.action")
    public  String queryStock(String keyWord,Model model){
        Page<Medicinedemand> medicinedemandPage = stockService.queryMedicinedemand(1, keyWord);
        model.addAttribute("page",medicinedemandPage);
        model.addAttribute("QueryVourl","queryStockpage.action");
        return "require/req_list";
    }
    @RequestMapping("queryStockpage.action")
    public  String queryStockpage(String keyWord,Model model,@RequestParam("page")int page){
        Page<Medicinedemand> medicinedemandPage = stockService.queryMedicinedemand(page, keyWord);
        model.addAttribute("page",medicinedemandPage);
        model.addAttribute("QueryVourl","queryStockpage.action");
        return "require/req_list";
    }

    @RequestMapping("addstock.action")
    public  String toaddstock(Model model){
        List<Category> allcategory = stockService.findAllcategory();
        model.addAttribute("categroylist",allcategory);

        return "require/req_save";
    }
    @RequestMapping("addStock.action")
    public String addStock(@RequestParam("file") MultipartFile file, Medicinedemand medicinedemand, HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("/WEB-INF/upload");//用过请求来找到服务器储存文件的具体位置
        String fileName = file.getOriginalFilename();//传进来得文件参数就用Multipartfile对象来接受；
        file.transferTo(new File(path, fileName));
        medicinedemand.setPhotoPath(fileName);
        stockService.addMedicinedemand(medicinedemand);

        return "redirect:checkstock.action";

    }
}
