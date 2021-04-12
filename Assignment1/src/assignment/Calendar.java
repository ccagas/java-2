package assignment;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {

	private static int x = 0;

	public static void main(String[] args) {

		System.out.println("#####################################");
		System.out.println("### Welcome to RRC Date Formatter ###");
		System.out.println("#####################################\n");

		Scanner sc = new Scanner(System.in);

		System.out.printf("Please enter a valid Day (1-31): ");
		int day = sc.nextInt();

		System.out.printf("Please enter a valid Month (1-12): ");
		int month = sc.nextInt();

		System.out.printf("Please enter a valid Year (1582-9999): ");
		int year = sc.nextInt();

		// call method to check input
		checkDate(day, month, year);

		// print valid date
		if (x != 0) {
			System.out.printf("\n%s %d, %d", Month.of(month).getDisplayName(TextStyle.FULL, Locale.CANADA), day, year);
		}
		sc.close();
	}

	// method to check input
	private static int checkDate(int cDay, int cMonth, int cYear) {

		if (cDay < 1 || cDay > 31) {
			System.out.printf("\n[%d] is an invalid day value.", cDay);
		} else if (cMonth < 1 || cMonth > 12) {
			System.out.printf("\n[%d] is an invalid month value.", cMonth);
		} else if (cYear < 1582 || cYear > 9999) {
			System.out.printf("\n[%d] is an invalid year value.", cYear);
		} else {
			switch (cMonth) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				x = 1;
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				if (cDay > 30) {
					System.out.printf("\n[%d] is an invalid day value for the month of %s.", cDay,
							Month.of(cMonth).getDisplayName(TextStyle.FULL, Locale.CANADA));
				} else {
					x = 1;
				}
				break;

			case 2:
				if (((cYear % 4 == 0) && (cYear % 100 != 0))
						|| ((cYear % 4 == 0) && (cYear % 100 == 0) && (cYear % 400 == 0))) {
					if (cDay > 29) {
						System.out.printf("\n[%d] February only has 29 days on a leap year.", cYear);
					} else {
						x = 1;
					}
				} else {
					if (cDay > 28) {
						System.out.printf("\n[%d] is an invalid day value.", cDay);
					} else {
						x = 1;
					}
				}
				break;
			}
		}
		return x;
	}

}
