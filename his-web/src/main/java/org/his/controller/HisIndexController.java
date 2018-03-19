package org.his.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/i")
public class HisIndexController {
	@RequestMapping("/index")
	public String index() throws Exception {
		return "index";
	}

}
