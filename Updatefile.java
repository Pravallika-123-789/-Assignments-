package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Updatefile {
	public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Lenovo\\filename.txt";

        Path file = Paths.get(fileName);
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        FileTime lastModifiedTime = attr.lastModifiedTime();
        System.out.println("[original] lastModifiedTime:" + lastModifiedTime);
        LocalDate newLocalDate = LocalDate.of(1998, 9, 30);
        Instant instant = newLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        Files.setLastModifiedTime(file, FileTime.from(instant));
        FileTime newLastModifiedTime = Files.readAttributes(file,
                BasicFileAttributes.class).lastModifiedTime();
        System.out.println("[updated] lastModifiedTime:" + newLastModifiedTime);
	}
}