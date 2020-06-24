package com.spring.boot.rocks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/")
	public String indexPage(Model model) {
		return "index";
	}
	
	@GetMapping("/formbasic")
	public String formbasicPage(Model model) {
		return "formbasic";
	}
	
	@GetMapping("/formadvanced")
	public String formadvancedPage(Model model) {
		return "formadvanced";
	}
	
	@GetMapping("/blank")
	public String blankPage(Model model) {
		return "blank";
	}
	
	@GetMapping("/index2")
	public String index2Page(Model model) {
		return "index2";
	}
	
	@GetMapping("/tablesimple")
	public String tablesimplePage(Model model) {
		return "table_simple";
	}
	
	@GetMapping("/tabledatatables")
	public String tabledatatablesPage(Model model) {
		return "table_datatables";
	}
	
	@GetMapping("/uicolors")
	public String uicolorsPage(Model model) {
		return "uicolors";
	}
	
	@GetMapping("/charts")
	public String chartsPage(Model model) {
		return "charts";
	}
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		return "login";
	}
	
	@GetMapping("/register")
	public String registerPage(Model model) {
		return "register";
	}
	
	@GetMapping("/404")
	public String pageNotFoundPage(Model model) {
		return "404";
	}
	
	@GetMapping("/alerts")
	public String alertsPage(Model model) {
		return "alerts";
	}
	
	@GetMapping("/buttons")
	public String buttonsPage(Model model) {
		return "buttons";
	}
	
	@GetMapping("/dropdowns")
	public String dropdownsPage(Model model) {
		return "dropdowns";
	}
	
	@GetMapping("/popovers")
	public String popovers(Model model) {
		return "popovers";
	}
	
	@GetMapping("/modals")
	public String modalsPage(Model model) {
		return "modals";
	}
	
	@GetMapping("/progressbars")
	public String progressbarsPage(Model model) {
		return "progressbars";
	}


}
