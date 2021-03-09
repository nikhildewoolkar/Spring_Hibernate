package law.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import law.dao.LawyerDAO;
import law.lawyerInfo.Lawyer;

@Controller
public class MainController {
	
	@Autowired
	private LawyerDAO lawyerDAO;
	
	
	@RequestMapping(value = "/")
	public ModelAndView listLawyer(ModelAndView model) {
		
		List<Lawyer> listLawyer = lawyerDAO.list();
		model.addObject("listLawyer", listLawyer);
		model.setViewName("index");
		return model;
	}
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newLawyer(ModelAndView model) {
		Lawyer newlawyer = new Lawyer();
		model.addObject("newLawyer", newlawyer);
		model.setViewName("lawyer_form");
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveLawyer(@ModelAttribute Lawyer newLawyer) {
		lawyerDAO.save(newLawyer);
		return new ModelAndView("redirect:/");
	}
}
