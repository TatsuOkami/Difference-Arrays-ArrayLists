package difference.arrays.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // ARRAY EXAMPLE
        // An array has a fixed size once it is created.
        String[] games = {"FFXIV", "FFVII", "Skyrim"};

        System.out.println("=== Array Example ===");
        System.out.println("Original array: " + Arrays.toString(games));

        // Access an element using its index.
        System.out.println("First game: " + games[0]);

        // Replace an existing element.
        games[1] = "Suikoden";

        System.out.println("Updated array: " + Arrays.toString(games));

        // Arrays use length to determine their size.
        System.out.println("Array size: " + games.length);

        // Adding another element requires creating a larger array.
        games = Arrays.copyOf(games, games.length + 1);
        games[3] = "Elden Ring";

        System.out.println("Expanded array: " + Arrays.toString(games));

        // ARRAYLIST EXAMPLE
        // An ArrayList can grow or shrink dynamically.
        ArrayList<String> gameList = new ArrayList<>();

        gameList.add("FFXIV");
        gameList.add("FFVII");
        gameList.add("Skyrim");

        System.out.println("\n=== ArrayList Example ===");
        System.out.println("Original ArrayList: " + gameList);

        // Access an element using the get() method.
        System.out.println("First game: " + gameList.get(0));

        // Replace an element using the set() method.
        gameList.set(1, "Suikoden");

        System.out.println("Updated ArrayList: " + gameList);

        // ArrayLists use size() instead of length.
        System.out.println("ArrayList size: " + gameList.size());

        // Add and remove elements without manually resizing.
        gameList.add("Elden Ring");
        System.out.println("Expanded ArrayList: " + gameList);

        gameList.remove("Skyrim");
        System.out.println("After removal: " + gameList);

        System.out.println("Final ArrayList size: " + gameList.size());
    }
}
