//package HW;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.logging.FileHandler;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
////После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
////в формате год-месяц-день час:минуты {массив на данной итерации}.
////Для логирования использовать логгер logger класса BubbleSort.
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//
//    public static void sort(int[] mas) throws IOException {
//            for (int i = 0; i < mas.length; i++) {
//                for (int j = 0; j < mas.length - 1; j++) {
//                    if (mas[j] > mas[j + 1]) {
//                        int temp = mas[j];
//                        mas[j] = mas[j + 1];
//                        mas[j + 1] = temp;
//
//                    }
//
//
//                }
//                writeArrToFile(mas,);
//
//
//            }
//
//        }
//
//
//
//
//
//    static void writeArrToFile(int[] dataArr, String fileName) {
//
//        try (FileWriter fw = new FileWriter(fileName)) {
//            for (Integer num : dataArr) {
//
//                //в формате год-месяц-день час:минуты {массив на данной итерации}.
//                fw.write(Integer.toString(num));
//                fw.append(System.lineSeparator());
//            }
//            fw.flush();
//            logger.info("Data saved!");
//        } catch (IOException e) {
//            logger.warning(e.getMessage());
//// logger.log(Level.WARNING, e.getMessage());
//        }
//    }
//
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class HWBuble {
//    public static void main(String[] args) throws IOException {
//        int[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new int[]{9, 4, 8, 3, 1};
//        } else {
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}