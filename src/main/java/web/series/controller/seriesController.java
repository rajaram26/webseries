package web.series.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.series.model.seriesModel;
import web.series.service.seriesService;

@RestController
public class seriesController {
	
	@Autowired
	seriesService service;

	@PostMapping("/addSeries")
	public String addSeries(@RequestParam(name="id") String id,@RequestParam(name="name") String name,@RequestParam(name="seasons") String seasons,@RequestParam(name="episodes") String episodes,@RequestParam(name="rating") String rating) {
		service.addSeries(new seriesModel(id,name,seasons,episodes,rating));
		return "Series Details is stored";
	}
	
	@RequestMapping("/series")
	public ArrayList<seriesModel> getAllSeries(){
		ArrayList<seriesModel> list=service.getAllSeries();
		return list;
	}
	
	@RequestMapping("/series/{id}")
	public ArrayList<seriesModel> getSeriesById(@PathVariable(name="id") String id){
		ArrayList<seriesModel> list=service.getSeriesById(id);
		return list;
	}
	
	@RequestMapping("/seriesByname/{name}")
	public ArrayList<seriesModel> getSeriesByName(@PathVariable(name="name")  String name){
		ArrayList<seriesModel> list=service.getSeriesByName(name);
		return list;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteSeries(@PathVariable(name="id") String id){
		service.deleteSeries(id);
		return "Series Removed !"+id;
	}
	
	@PutMapping("/update")
	public String update(@RequestParam(name="id") String id,@RequestParam(name="name") String name,@RequestParam(name="seasons") String seasons,@RequestParam(name="episodes") String episodes,@RequestParam(name="rating") String rating) {
		service.addSeries(new seriesModel(id,name,seasons,episodes,rating));
		return "Series Details is updated";
	}
	
}
