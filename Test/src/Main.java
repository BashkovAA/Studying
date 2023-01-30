import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());

//        List<EmailAddress> addresses = library.getReaders().stream()
//                .map(Reader::getEmail)
//                .map(EmailAddress::new)
//                .collect(Collectors.toList());
//
//        List<EmailAddress> addresses1 = library.getReaders().stream()
//                .filter(Reader::isSubscriber)
//                .filter(reader -> reader.getBooks().size() > 1)
//                .map(Reader::getEmail).map(EmailAddress::new)
//                .collect(Collectors.toList());
//
//        List<Book> bookList = library.getReaders().stream()
//                .flatMap(reader -> reader.getBooks().stream())
//                .distinct()
//                .collect(Collectors.toList());
//
//        boolean match = library.getReaders().stream()
//                .flatMap(reader -> reader.getBooks().stream())
//                .anyMatch(book -> "Оруэлл".equals(book.getAuthor()));
//
//        Integer reduce = library.getReaders().stream()
//                .map(reader -> reader.getBooks().size())
//                .reduce(0, (max, size) -> size > max ? size : max);

//        Map<String, List<EmailAddress>> map = library.getReaders().stream()
//                .filter(Reader::isSubscriber)
//                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
//                        mapping(r -> new EmailAddress(r.getEmail()), Collectors.toList())));
//
//        map.entrySet().stream().forEach(System.out::println);



        Map<String, String> readersFIOMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        mapping(Reader::getFio, joining(", ", "{", "}"))));

        readersFIOMap.entrySet().stream().forEach(System.out::println );
    }
}
