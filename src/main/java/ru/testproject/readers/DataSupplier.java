package ru.testproject.readers;

import java.util.List;

public interface DataSupplier {
    List<String> getLines();
    String getFilename();
}
