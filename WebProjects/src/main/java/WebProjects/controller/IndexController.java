package WebProjects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		return "home";
	}
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	@GetMapping("/localNew")
	public String localNews(Model model) {
		return "localNew";
	}
	@GetMapping("/news")
	public String news(Model model) {
		return "news";
	}
	@GetMapping("/words")
	public String words(Model model) {
		return "words";
	}
	@GetMapping("/schedule")
	public String schedule(Model model) {
		return "schedule";
	}
}
