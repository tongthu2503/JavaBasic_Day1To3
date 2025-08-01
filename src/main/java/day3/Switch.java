package day3;

import java.util.Scanner;
import org.openqa.selenium.By;


public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number:");
        int n = scanner.nextInt();
        printDayOfWeek(n);

        String locatorType = "id";
		String locatorValue = "firstName";
		
		By result = getLocator(locatorType, locatorValue);
		System.out.println(result);
        scanner.close();
    }

    /*
     * Ex1
     */

        public static void printDayOfWeek(int n) {
        switch (n) {
            case 2:
                System.out.println("Thứ Hai");
                break;
            case 3:
                System.out.println("Thứ Ba");
                break;
            case 4:
                System.out.println("Thứ Tư");
                break;
            case 5:
                System.out.println("Thứ Năm");
                break;
            case 6:
                System.out.println("Thứ Sáu");
                break;
            case 7:
                System.out.println("Thứ Bảy");
                break;
            case 8:
                System.out.println("Chủ Nhật");
                break;
            default:
                System.out.println("Nhập lại n");
                break;
        }
    }

    /*
     * Ex2
     */
        public static By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			
			result = By.id(locatorValue);
			break;
			}
        case "name": {
			
			result = By.name(locatorValue);
			break;			
		}
        case "linkText": {
			
			result = By.linkText(locatorValue);
			break;			
		}
        case "cssSelector": {
			
			result = By.cssSelector(locatorValue);
			break;			
		}
        case "partialLinkText": {
			
			result = By.partialLinkText(locatorValue);
			break;			
		}
        case "tagName": {
			
			result = By.tagName(locatorValue);
			break;			
		}
        case "xpath": {
			
			result = By.xpath(locatorValue);
			break;			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + locatorType);
		}
		return result;
	}
        
    
}