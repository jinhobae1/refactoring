package refactoring.print;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie aMoive, int aDaysRented) {
		this.movie = aMoive;
		this.daysRented = aDaysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

}
