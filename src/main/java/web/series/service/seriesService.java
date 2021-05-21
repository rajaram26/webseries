package web.series.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.series.model.seriesModel;
import web.series.repo.seriesRepo;

@Service
public class seriesService {
	
	@Autowired
	seriesRepo repo;
	
	public void addSeries(seriesModel seriesModel) {
		repo.save(seriesModel);
	}

	public ArrayList<seriesModel> getAllSeries() {
		ArrayList<seriesModel> list = (ArrayList<seriesModel>) repo.findAll();
		return list;
	}
	
	public ArrayList<seriesModel> getSeriesById(String id) {
		ArrayList<seriesModel> list =  repo.findSeriesById(id);
		return list;
	}

	public ArrayList<seriesModel> getSeriesByName(String name) {
		ArrayList<seriesModel> list =  repo.findSeriesByName(name);
		return list;
	}

	public void deleteSeries(String id) {
		repo.deleteById(id);
	}
	
}
