import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewwong on 6/7/17.
 */
public class TestZIPEnumerator {

    Path path;
    ZIPEnumerator ZIPE;

    @Before
    public void init() {
        path = Paths.get("src", "main", "resources/");
        ZIPE = new ZIPEnumerator(path);
    }

    @Test
    public void testListAllZipFiles() {

        // When
        List<Path> zipPaths = ZIPE.listAllZipFiles();

        // Then
        assertEquals(1, zipPaths.size());
    }

    @Test
    public void testListAllFiles() {

        // When
        List<String> filePaths = ZIPE.listAllFiles();
        System.out.println(filePaths.get(0));
        System.out.println(filePaths.get(1));
        System.out.println(filePaths.get(2));


        // Then
        assertEquals(3, filePaths.size());
    }

    @Test
    public void testAddFileToZipGivenPath() {

    }

    @Test
    public void testAddFileToZipGivenFileName() {

    }

}
