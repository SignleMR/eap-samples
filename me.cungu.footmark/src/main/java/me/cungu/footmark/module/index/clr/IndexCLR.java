package me.cungu.footmark.module.index.clr;

import javax.servlet.http.HttpServletRequest;

import me.cungu.footmark.bizprocess.user.bs.IUserBS;
import me.cungu.footmark.module.P;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eap.base.BaseController;

@Controller
public class IndexCLR extends BaseController {
	
	@Autowired
	@Qualifier("userBS")
	private IUserBS userBS;
	
	@RequestMapping(value=P.INDEX)
	public String index(Model model, HttpServletRequest request) {
		return "index";
	}
}