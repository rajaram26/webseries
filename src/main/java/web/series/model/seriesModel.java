package web.series.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="webseries")
public class seriesModel {
	
	@Id
	private String id;
	private String name;
	private String seasons;
	private String episodes;
	private String rating;
	
	
	
	public seriesModel(String id, String name, String seasons, String episodes, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.seasons = seasons;
		this.episodes = episodes;
		this.rating = rating;
	}
	
	public seriesModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeasons() {
		return seasons;
	}
	public void setSeasons(String seasons) {
		this.seasons = seasons;
	}
	public String getEpisodes() {
		return episodes;
	}
	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "seriesModel [id=" + id + ", name=" + name + ", seasons=" + seasons + ", episodes=" + episodes
				+ ", rating=" + rating + "]";
	}
	
	
	
}
