import java.nio.file.Path;
import java.util.List;

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
        return null;
    }

    public List<Path> listAllFiles() {
        return null;
    }

    public void addFileToZip(Path zipArchive) {

    }

    public void addFileToZip(String fileName) throws AmbiguousFileNameException{

    }

    // Include an optional parameter for the path within the ZIP to write the file; if it is not specified then write
    // the file to / within the ZIP filesystem.


}
