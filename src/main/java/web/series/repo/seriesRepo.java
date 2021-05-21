package web.series.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import web.series.model.seriesModel;


@Repository
public interface seriesRepo extends CrudRepository<seriesModel, String> {
	
	
	@Query(value="select * from webseries where id=?1",nativeQuery = true)
	ArrayList<seriesModel> findSeriesById(String id);
	
	
	@Query(value="select * from webseries where name=?1",nativeQuery = true)
	ArrayList<seriesModel> findSeriesByName(String name);

}
