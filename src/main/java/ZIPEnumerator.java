import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by andrewwong on 6/7/17.
 */
public class ZIPEnumerator {
    Path directory;
    boolean listsJarFiles;

    public ZIPEnumerator(Path _directory) {
        this.directory = _directory;
    }

    public List<Path> listAllZipFiles() {
        try {
            return Files.walk(this.directory).filter(p -> getFileExtension(p.toFile())==".zip").collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException ioe) {
            return null;
        }
    }

    private String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }
    }

    public List<String> listAllFiles() {
        try {
            return Files.walk(this.directory).map(p -> p.toString()).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException ioe) {
            return null;
        }
    }

    public void addFileToZip(Path zipArchive) {

    }

    public void addFileToZip(String fileName) throws AmbiguousFileNameException{

    }

    // Include an optional parameter for the path within the ZIP to write the file; if it is not specified then write
    // the file to / within the ZIP filesystem.


}
