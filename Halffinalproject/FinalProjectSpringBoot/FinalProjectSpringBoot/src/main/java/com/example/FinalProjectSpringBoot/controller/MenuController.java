package com.example.FinalProjectSpringBoot.controller;

//Controller file
//we only create the file(MenuController.java)
import com.example.FinalProjectSpringBoot.entity.Menu;
import com.example.FinalProjectSpringBoot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController  {

@Autowired
private MenuService menuService;
@PostMapping("/menu")
public Menu saveMenu(@RequestBody Menu menu) {
    return menuService.saveMenu(menu);
}
@GetMapping("/menu")
public List<Menu> getAllMenus() {
    return menuService.fetchAllMenus();
}
@GetMapping("/menu/{id}")
public Menu getMenuById(@PathVariable("id") Long id) {
    return menuService.getMenuById(id);
}

@PutMapping("/menu/{id}")
public Menu updateMenu(@PathVariable("id") Long id, @RequestBody Menu menu) {
    return menuService.updateMenuById(id, menu);
}
@DeleteMapping("/menu/{id}")
public String deleteMenu(@PathVariable("id") Long id) {
    return menuService.deleteDepartmentById(id);
}
}
