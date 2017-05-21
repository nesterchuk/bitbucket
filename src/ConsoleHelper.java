
import java.io.IOException;

public class ConsoleHelper {
    public void start() {
        String choice ="";
        Bitbucket bitbucket = new Bitbucket();
        while (!choice.equals("0")) {
            System.out.print(
                    "Menu: \n" +
                    " 0) Exit \n" +
                    " 1) Add Item to collection \n" +
                    " 2) Delete item \n" +
                    " 3) Search element by its index \n" +
                    " 4) Search element by its value \n" +
                    " 5) Find the maximum element \n" +
                    " 6) Find the minimum element \n"  +
                    " 7) Find the arithmetic mean \n" +
                    " 8) View collection \n"+
                    " Select from the list: "
            );
            ConsoleReader reader = new ConsoleReader();
            choice = reader.readString();
            switch (choice) {
                case ("0"): break;
                case ("1"):
                        System.out.print("Enter a value: ");
                        try {
                            bitbucket.add(reader.readInteger());
                            System.out.println("Item successfully added");
                        }
                        catch (NumberFormatException | IOException  e){
                            System.out.println("Illegal value");
                            break;
                        }
                        break;
                case("2"):
                        if (bitbucket.isEmpty()){
                            System.out.println("Collection is empty");
                            break;
                        } else {
                            System.out.print("Enter the index: ");
                            try {
                                bitbucket.remove(reader.readInteger());
                                System.out.println("Element successfully deleted");
                            }
                            catch (NumberFormatException | IOException e){
                                System.out.println("Illegal value");
                            }
                            catch (IndexOutOfBoundsException e){
                                System.out.println( "The index is within " + 0 + " to " + (bitbucket.size()-1) );
                            }
                        }
                        break;
                case("3"):
                        if (bitbucket.isEmpty()) {
                            System.out.println("Collection is empty");
                            break;
                        } else {
                            System.out.print("Enter the index: ");
                            try {
                                System.out.println("Value of the element: " + bitbucket.get(reader.readInteger()));
                            }
                            catch (IndexOutOfBoundsException e) {
                                System.out.println("the index is within " + 0 + " to " + (bitbucket.size() - 1));
                            }
                            catch (IOException | NumberFormatException e) {
                                System.out.println("Illegal value");
                            }
                        }
                        break;
                case("4"):
                        if (bitbucket.isEmpty()) {
                            System.out.println("Collection is empty");
                            break;
                        } else {
                            System.out.print("Enter the value: ");
                            try {
                                Integer value = reader.readInteger();
                                System.out.println(bitbucket.contains(value) ? "Index of the element: " + bitbucket.indexOf(value) : "This element does not exist");
                            } catch (IOException | NumberFormatException n) {
                                System.out.println("Illegal value");
                            }
                        }
                        break;
                case("5"):
                        System.out.println( bitbucket.isEmpty() ? "Collection is empty" :  "Maximum element: " + bitbucket.maxValue());
                        break;
                case("6"):
                        System.out.println( bitbucket.isEmpty() ? "Collection is empty" : "Minimum element: " + bitbucket.minValue());
                        break;
                case("7"):
                        System.out.println( bitbucket.isEmpty() ? "Collection is empty" : "Arithmetic mean: " + bitbucket.getArithmeticMean());
                        break;
                case("8"):
                        System.out.println("Contents of collection: " + bitbucket);
                        break;
                default:
                        System.out.println("This item does not exist");
            }
        }
    }
}
