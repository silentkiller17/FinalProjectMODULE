package com.example.FinalProjectSpringBoot.service;

//All business logic(services) we are going to achieve with predefined methods(save(),findAll()....
//EmployeeServiceImple.java
import com.example.FinalProjectSpringBoot.entity.Menu;
import com.example.FinalProjectSpringBoot.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService{

@Autowired
private MenuRepository menuRepository;

@Override
public Menu saveMenu(Menu menu) {//saving records
    return menuRepository.save(menu);
}

@Override
public List<Menu> fetchAllMenus() {
    List<Menu> allMenus = menuRepository.findAll();//select the records from db table
    return allMenus;
}

@Override
public Menu getMenuById(Long id) {
    Optional<Menu> menu = menuRepository.findById(id);//get the values based on customer requirement
    if (menu.isPresent()) {
        return menu.get();
    }
    return null;
}
@Override
public Menu updateMenuById(Long id, Menu menu) {//based on selected id we are going to edit(Update) the record here
    Optional<Menu> menu1 = menuRepository.findById(id);

    if (menu1.isPresent()) {
    	Menu originalMenu =menu1.get();

       if (Objects.nonNull(menu.getMenuName()) && !"".equalsIgnoreCase(menu.getMenuName())) {
            originalMenu.setCustomerName(menu.getMenuName());
        }
        if (Objects.nonNull(menu.getMenuPrice()) && Menu.getMenuPrice() != "NULL") {
            originalMenu.setMenuPrice(menu.getMenuPrice());
        }
        if (Objects.nonNull(menu.getMenuCategory()) && !"".equalsIgnoreCase(menu.getMenuCategory())) {
            originalMenu.setCustomerName(menu.getMenuCategory());
        }
        return menuRepository.save(originalMenu);
    }
return null;
}

@Override
public String deleteDepartmentById(Long id) {//deleting the records from the mysql db table
    if (menuRepository.findById(id).isPresent()) {
    	menuRepository.deleteById(id);
        return "Menu deleted successfully";
    }
    return "No such Menu in the database";//table not present unable to delete the record
}
}
