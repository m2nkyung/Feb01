public class Movie {
	private String title;
	private String director;
	private Date date;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Movie() {
		title = "모름";
		director = "모름";
		date = new Date	(1999, 9, 9);
	}
	
	public String toString() {
		String s = "";
		s += "제목 : " + title + "\n";
		s += "감독 : " + director + "\n";
		s += "관람일 : " + date.toString();
		
		return s;
	}

}
