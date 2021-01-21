package ua.lits.lesson14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    //    Stream s1 = Stream.empty();
    //    List<String> list = new ArrayList<>();
    //    Stream<String> s2 = list.stream();
    //    Map<String, String> map = new HashMap<>();
    //    Stream<Map.Entry<String, String>> s3 = map.entrySet().stream();
    //    Arrays.stream(new int[] {1, 2, 4});
    //    Stream<Integer> s5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    //    Stream.builder().add(1).add(2).add(3).build();
    //    Stream<Integer> s6 = s5;
    //    s5.filter(e -> e > 1)
    //        .peek(e -> System.out.println("before map"))
    //        .map(
    //            e -> {
    //              System.out.println("map");
    //              return e;
    //            })
    //        .peek(e -> System.out.println("after map"))
    //        .limit(10)
    //        .peek(e -> System.out.println("after limit"))
    //        .forEach(System.out::println);
    //    List<String> names = Arrays.asList("Peter", "John", "Homer", "Bart", "Tony", "Steve");
    //    names
    //        .parallelStream()
    //        .peek(e -> System.out.println(e))
    //        .map(e -> e + " Milner")
    //        .peek(e -> System.out.println(e))
    //        .forEach(e -> System.out.println(e));
    //      Stream.builder().add(1).add(2).add(3).build();
    //      IntStream.builder().add(1).add(2).add(3).build();
    //      LongStream.builder().add(1).add(2).add(3).build();
    //      Random d = new Random(47);
    //    Stream.generate(() -> d.nextInt(100)).limit(100).forEach(e -> System.out.println(e));
    //    Stream.iterate(2, x -> x + 4).limit(10).forEach(e -> System.out.println(e));
    //    Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6)).forEach(e -> System.out.println(e));
    //    IntStream.range(0, 100).forEach(e -> System.out.println(e));
    //      Random d = new Random(47);
    //      Stream.generate(() -> d.nextInt(100)).limit(100)
    //            .filter(e -> e % 2 == 0)
    //            .map(e -> {
    //                return "+" + e;
    //            }).forEach(e -> System.out.println(e));


    List<Author> authors = new ArrayList<>();
    authors.add(
        new Author("Шекспір", Arrays.asList(new Book("Ромео і Джульєта", Arrays.asList("Роман", "Драма")), new Book("Гамлет", Arrays.asList("Драма", "Трагікомендія")))));
    authors.add(
        new Author("Шувченко", Arrays.asList(new Book("Катерина", Arrays.asList("Комедія")), new Book("Катерина", Arrays.asList("Біографія")))));
    //    authors.stream()
    //        .map(e -> e.getBooks())
    //        .flatMap(e -> e.stream())
    //        .map(e -> e.getTitle())
    //        .forEach(e -> System.out.println(e));

    authors.stream()
        .map(e -> e.getBooks())
        .flatMap(e -> e.stream())
        .sorted(Comparator.comparing(Book::getTitle))
        //        .peek(e -> System.out.println("Зараз ми читаємо книжку " + e.getTitle()))
        //        .map(
        //            e -> {
        //              e.setTitle("asdasd");
        //              return e;
        //            })
        //        .map(e -> e.getGenre())
        //        .flatMap(e -> e.stream())
        //        .distinct()
        //            .sorted()
        //            .skip(2)
        //            .limit(1)
        //            .count();
        //        .forEach(e -> System.out.println(e));
        //      .collect(Collectors.joining(","));
        //      .collect(Collectors.toList());
        //      .collect(Collectors.toMap(e -> e.getTitle(), e -> e.getGenre()));
        //      .collect(Collectors.groupingBy(e -> e.getTitle()));
        //        .filter(e -> e.getTitle().equals("Гра Престолів"))
        .findFirst()
        .map(e -> e.getTitle())
        .ifPresent(e -> System.out.println(e));
    //            .orElseGet(() -> new Book("aasd"));
    //        .ifPresentOrElse(e -> System.out.println(e.getTitle()), () ->
    // System.out.println("книжки не існує"));
    //            .or(() -> {
    //                System.out.println("Книжки не існує");
    //                return Optional.of(new Book("test"));
    //            })
    //              .orElseThrow(() -> new IllegalStateException("книжки не існує"))
    //        .ifPresent(e -> System.out.println(e.getTitle()));
    Author author = null;

//    Optional.of(new Book("Гра Престолів")).map(e -> e.getTitle()).ifPresent(e -> System.out.println(e));
    readAuthor(author);
  }

  public static void readAuthor(Author author) {
    Optional.ofNullable(author).ifPresent(e -> System.out.println(e.getBooks()));
  }

  public static Optional<Author> getAuthor() {
      return Optional.empty();
  }
}
