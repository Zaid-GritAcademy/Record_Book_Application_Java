package com.grit;


import java.io.File;



import java.util.*;




public class RecordCatalogue {



    public static void main(String[] args) throws Exception {
        //state
        List<Student> studentList = new ArrayList<>() ;
        List<RecordBook> recordBookList = new ArrayList<>();


        // använder File och Scanner för att kunna läsa info från textfilen

        File file = new File("names.txt");

        Scanner scanner= new Scanner(file);



        while (scanner.hasNextLine())

            studentList.add(new Student(scanner.nextLine()));
        for (Student student : studentList) System.out.println(student.getName());

        scanner.close();



        file = new File("grades.txt");
        scanner = new Scanner(file);



        while (scanner.hasNextLine())
        recordBookList.add(new RecordBook(scanner.nextLine()) );

        for (int i = 0; i < recordBookList.size() ; i++)


        scanner.close();


        String firstLineGrade1 = recordBookList.get(0).getGrades();
        String firstLineGrade2 = recordBookList.get(1).getGrades();
        String secondLineGrade1 = recordBookList.get(2).getGrades();
        String secondLineGrade2 = recordBookList.get(3).getGrades();
        String thirdLineGrade1 = recordBookList.get(4).getGrades();
        String thirdLineGrade2 = recordBookList.get(5).getGrades();
        String fourthLineGrade1 = recordBookList.get(6).getGrades();
        String fourthLineGrade2 = recordBookList.get(7).getGrades();


        int FirstLineGrade1 = Integer.parseInt(firstLineGrade1);
        int FirstLineGrade2 = Integer.parseInt(firstLineGrade2);
        int SecondLineGrade1 = Integer.parseInt(secondLineGrade1);
        int SecondLineGrade2 = Integer.parseInt(secondLineGrade2);
        int ThirdLineGrade1 = Integer.parseInt(thirdLineGrade1);
        int ThirdLineGrade2 = Integer.parseInt(thirdLineGrade2);
        int FourthLineGrade1 = Integer.parseInt(fourthLineGrade1);
        int FourthLineGrade2 = Integer.parseInt(fourthLineGrade2);






        System.out.println("Write student´s name to show his grades: ");
        String name;
        scanner = new Scanner(System.in);
        name = scanner.nextLine();






        if (name.equalsIgnoreCase("Zaid") || name.equalsIgnoreCase("Al khateeb") || name.equalsIgnoreCase("zaid al khateeb") ) {

            System.out.println(studentList.get(0).getName() + " : " + firstLineGrade1 + " " + firstLineGrade2);

            System.out.println("Choose one of the methods by entering one of the numbers 1, 2 or 3: ");
            System.out.println("1. Lowest grade");
            System.out.println("2. Highest grade");
            System.out.println("3. Average grade");

            int lowestGrade, averageGrade, highestGrade;


            int options = scanner.nextInt();
            switch (options) {
                case (1) -> {
                    lowestGrade = Math.min(FirstLineGrade1, FirstLineGrade2);
                    System.out.println("Zaid`s lowest grade is " + lowestGrade);
                }
                case (2) -> {
                    highestGrade = Math.max(FirstLineGrade1, FirstLineGrade2);
                    System.out.println("Zaid`s highest grade is " + highestGrade);
                }
                case (3) -> {
                    averageGrade = (FirstLineGrade1 + FirstLineGrade2) / 2;
                    System.out.println("Zaid`s average grade is " + averageGrade);
                }
                default -> System.out.println("Please enter the right number!");
            }

        }

        else if (name.equalsIgnoreCase("ali") || name.equalsIgnoreCase("mohamed") || name.equalsIgnoreCase("ali mohamed")){
            System.out.println(studentList.get(1).getName() + " : "  + secondLineGrade1 + " " + secondLineGrade2 );

            System.out.println("Choose one of the methods by entering one of the numbers 1, 2 or 3 : ");
            System.out.println("1. Lowest grade");
            System.out.println("2. Highest grade");
            System.out.println("3. Average grade");

            int lowestGrade, averageGrade, highestGrade;

            int options = scanner.nextInt();

            switch (options) {
                case (1) -> {
                    lowestGrade = Math.min(SecondLineGrade1, SecondLineGrade2);
                    System.out.println("Ali`s lowest grade is " + lowestGrade);
                }
                case (2) -> {
                    highestGrade = Math.max(SecondLineGrade1, SecondLineGrade2);
                    System.out.println("Ali`s highest grade is " + highestGrade);
                }
                case (3) -> {
                    averageGrade = (SecondLineGrade1 + SecondLineGrade2) / 2;
                    System.out.println("Ali`s average grade is " + averageGrade);
                }
                default -> System.out.println("Please enter the right number!");
            }

        }
        else if (name.equalsIgnoreCase("ammar") || name.equalsIgnoreCase("alaa") || name.equalsIgnoreCase("ammar alaa")) {
            System.out.println(studentList.get(2).getName() + " : " + thirdLineGrade1 + " " + thirdLineGrade2 );

            System.out.println("Choose one of the methods by entering one of the numbers 1, 2 or 3 : ");
            System.out.println("1. Lowest grade");
            System.out.println("2. Highest grade");
            System.out.println("3. Average grade");

            int lowestGrade, averageGrade, highestGrade;

            int options = scanner.nextInt();

            switch (options) {
                case (1) -> {
                    lowestGrade = Math.min(ThirdLineGrade1, ThirdLineGrade2);
                    System.out.println("Ammar`s lowest grade is " + lowestGrade);
                }
                case (2) -> {
                    highestGrade = Math.max(ThirdLineGrade1, ThirdLineGrade2);
                    System.out.println("Ammar`s highest grade is " + highestGrade);
                }
                case (3) -> {
                    averageGrade = (ThirdLineGrade1 + ThirdLineGrade2) / 2;
                    System.out.println("Ammar`s average grade is " + averageGrade);
                }
                default -> System.out.println("Please enter the right number!");
            }
        }
        else if (name.equalsIgnoreCase("mustafa") || name.equalsIgnoreCase("khalid") || name.equalsIgnoreCase("mustafa khalid")) {
            System.out.println(studentList.get(3).getName() + " : " + fourthLineGrade1 + " " + fourthLineGrade2 );

            System.out.println("Choose one of the methods by entering one of the numbers 1, 2 or 3 : ");
            System.out.println("1. Lowest grade");
            System.out.println("2. Highest grade");
            System.out.println("3. Average grade");

            int lowestGrade, averageGrade, highestGrade;

            int options = scanner.nextInt();

            switch (options) {
                case (1) -> {
                    lowestGrade = Math.min(FourthLineGrade1, FourthLineGrade2);
                    System.out.println("Mustafa`s lowest grade is " + lowestGrade);
                }
                case (2) -> {
                    highestGrade = Math.max(FourthLineGrade1, FourthLineGrade2);
                    System.out.println("Mustafa`s highest grade is " + highestGrade);
                }
                case (3) -> {
                    averageGrade = (FourthLineGrade1 + FourthLineGrade2) / 2;
                    System.out.println("Mustafa`s average grade is " + averageGrade);
                }
                default -> System.out.println("Please enter the right number!");
            }
        }



    }









}
