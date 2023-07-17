package com.example.FinalProjectSpringBoot.service;

//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.FinalProjectSpringBoot.entity.Menu;
import java.util.List;

public interface MenuService {
	Menu saveMenu(Menu menu);
List<Menu> fetchAllMenus();
Menu getMenuById(Long id);
Menu updateMenuById(Long id, Menu menu);
String deleteDepartmentById(Long id);
}