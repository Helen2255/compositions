import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.BillboardManager;
public class BillboardManagerTest {
    String movie1 = "Один дома";

    String movie2 = "Оно";
    String movie3 = "Мира";
    String movie4 = "Ганнибал";
    String movie5 = "Сверхъестественное";
    String movie6 = "Доктор Хаус";
    String movie7 = "Абсолютный ноль";
    String movie8 = "Послезавтра";
    String movie9 = "Подводные чудеса";
    String movie10 = "Непослушник";
    String movie11 = "Круэлла";
    String movie12 = "Душа";

    @Test
    public void findAllTest() {

        BillboardManager manager = new BillboardManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTestLimit() {

        BillboardManager manager = new BillboardManager(12);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestMax() {

        BillboardManager manager = new BillboardManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimit() {

        BillboardManager manager = new BillboardManager(12);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);

        String[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimitOutMax() {

        BillboardManager manager = new BillboardManager(6);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimitOutMin() {

        BillboardManager manager = new BillboardManager(11);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);


        String[] expected = {movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWithin() {

        BillboardManager manager = new BillboardManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        String[] expected = {movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestMin() {

        BillboardManager manager = new BillboardManager();
        manager.addMovie(movie1);

        String[] expected = {movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestNull() {

        BillboardManager manager = new BillboardManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
