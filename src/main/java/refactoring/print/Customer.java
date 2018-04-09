package refactoring.print;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return this.name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		StringBuilder result = new StringBuilder(getName() + "������ �뿩 ���\n");

		for (Rental each : rentals) {
			double thisAmount = each.getCharge();
			frequentRenterPoints += each.getRenterPoints();

			result.append("\t" + each.getMovie().getTitle());
			result.append("\t" + String.valueOf(thisAmount) + "\n");
			totalAmount += thisAmount;
		}

		result.append("���� �뿩��:" + String.valueOf(totalAmount) + "\n");
		result.append("���� ����Ʈ:" + String.valueOf(frequentRenterPoints));

		return result.toString();

	}

}
