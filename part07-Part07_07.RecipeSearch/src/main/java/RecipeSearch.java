
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                printRecipes(recipes);
                System.out.println("");
            }
            if(command.equals("find name")){
                findAndPrintRecipesByName(recipes, scanner);
                System.out.println("");
            }
            if(command.equals("find cooking time")){
                findAndPrintRecipesByCookingTime(recipes, scanner);
                System.out.println("");
            }
            if(command.equals("find ingredient")){
                findAndPrintRecipesByIndegient(recipes, scanner);
                System.out.println("");
            }
        }
    }
    
    public static void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }
        
    public static void findAndPrintRecipesByName(ArrayList<Recipe> recipes, Scanner reader){
        //Scanner reader = new Scanner(System.in);
        System.out.print("Search word: ");
         String word = reader.nextLine();
        System.out.println("Recipes: ");
        for(Recipe recipe : recipes){
            if (recipe.getName().contains(word)){
                System.out.println(recipe.toString());
            }
        }
    }
    
    public static void findAndPrintRecipesByCookingTime(ArrayList<Recipe> recipes, Scanner reader){
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(reader.nextLine());
        System.out.println("Recipes: ");
        for(Recipe recipe : recipes){
            if(recipe.getTime() <= time){
                System.out.println(recipe.toString());
            }
        }
    }

    public static void findAndPrintRecipesByIndegient(ArrayList<Recipe> recipes, Scanner reader){
        System.out.print("Ingredient:  ");
        String ingridient = reader.nextLine();
        System.out.println("Recipes:");
           for (Recipe recipe : recipes) {
               if (recipe.getIngredients().contains(ingridient)) {
                   System.out.println(recipe.toString());
               }
           }
    }
   
    public static ArrayList<Recipe> readRecipesFromFile(String filename) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        String recipeName;
        int recipeTime;
        try (Scanner fileReader = new Scanner(Paths.get(filename))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    recipeName = recipeParts.get(0);
                    recipeTime = Integer.valueOf(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                    recipeParts.clear();
                }
            }
            if (!recipeParts.isEmpty()) {
                recipeName = recipeParts.get(0);
                recipeTime = Integer.valueOf(recipeParts.get(1));
                recipeParts.remove(0);
                recipeParts.remove(0);
                recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                recipeParts.clear();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return recipes;

    }

}