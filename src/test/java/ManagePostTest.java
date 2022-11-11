import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagePostTest {
    String Film1 = "Бладшот";
    String Film2 = "Вперед";
    String Film3 = "Отель Белград";
    String Film4 = "Джентльмены";
    String Film5 = "Человек-невидимка";
    String Film6 = "Тролли. Мировой тур";
    String Film7 = "Номер один";
    String Film8 = "Матрица";
    String Film9 = "Терминатор";
    String Film10 = "Фарго";
    String Film11 = "Санта-Барбара";

    @Test
    public void testSave() {
        ManagePost name = new ManagePost();
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findAll();
        String[] exprected = {Film1,Film2,Film3};

        Assertions.assertArrayEquals(exprected,actual);
    }

    @Test
    public void testFindLastLessDefault() {
        ManagePost name = new ManagePost();
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findLast();
        String[] exprected = {Film3,Film2,Film1};

        Assertions.assertArrayEquals(exprected,actual);
    }

    @Test
    public void testFindLastEqualDefault() {
        ManagePost name = new ManagePost();
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);
        name.save(Film4);
        name.save(Film5);
        name.save(Film6);
        name.save(Film7);
        name.save(Film8);
        name.save(Film9);
        name.save(Film10);

        String[] actual = name.findLast();
        String[] exprected = {Film10, Film9, Film8, Film7, Film6, Film5, Film4, Film3, Film2, Film1};

        Assertions.assertArrayEquals(exprected, actual);
    }

    @Test
    public void testFindLastMoreDefault() {
        ManagePost name = new ManagePost();
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);
        name.save(Film4);
        name.save(Film5);
        name.save(Film6);
        name.save(Film7);
        name.save(Film8);
        name.save(Film9);
        name.save(Film10);
        name.save(Film11);

        String[] actual = name.findLast();
        String[] exprected = {Film11, Film10, Film9, Film8, Film7, Film6, Film5, Film4, Film3, Film2};

        Assertions.assertArrayEquals(exprected, actual);
    }
    @Test
    public void testFindLastLess10() {
        ManagePost name = new ManagePost(10);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findLast();
        String[] exprected = {Film3,Film2,Film1};

        Assertions.assertArrayEquals(exprected,actual);
    }

    @Test
    public void testFindLastEqual10() {
        ManagePost name = new ManagePost(10);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);
        name.save(Film4);
        name.save(Film5);
        name.save(Film6);
        name.save(Film7);
        name.save(Film8);
        name.save(Film9);
        name.save(Film10);

        String[] actual = name.findLast();
        String[] exprected = {Film10, Film9, Film8, Film7, Film6, Film5, Film4, Film3, Film2, Film1};

        Assertions.assertArrayEquals(exprected, actual);
    }

    @Test
    public void testFindLastMore10() {
        ManagePost name = new ManagePost(10);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);
        name.save(Film4);
        name.save(Film5);
        name.save(Film6);
        name.save(Film7);
        name.save(Film8);
        name.save(Film9);
        name.save(Film10);
        name.save(Film11);

        String[] actual = name.findLast();
        String[] exprected = {Film11, Film10, Film9, Film8, Film7, Film6, Film5, Film4, Film3, Film2};

        Assertions.assertArrayEquals(exprected, actual);
    }

    @Test
    public void testChangeSizeMoreAddedFims() {
        ManagePost name = new ManagePost(1);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findLast();
        String[] exprected = {Film3};

        Assertions.assertArrayEquals(exprected,actual);
    }

    @Test
    public void testChangeSizeEqualAddedFims() {
        ManagePost name = new ManagePost(3);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findLast();
        String[] exprected = {Film3,Film2,Film1};

        Assertions.assertArrayEquals(exprected,actual);
    }

    @Test
    public void testChangeSizeLessAddedFims() {
        ManagePost name = new ManagePost(7);
        name.save(Film1);
        name.save(Film2);
        name.save(Film3);

        String[] actual = name.findLast();
        String[] exprected = {Film3,Film2,Film1};

        Assertions.assertArrayEquals(exprected,actual);
    }
}
