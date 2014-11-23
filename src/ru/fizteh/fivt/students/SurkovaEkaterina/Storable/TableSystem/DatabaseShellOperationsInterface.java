package ru.fizteh.fivt.students.SurkovaEkaterina.Storable.TableSystem;

import ru.fizteh.fivt.students.SurkovaEkaterina.Storable.FileMap.FileMapShellOperationsInterface;

import java.io.IOException;
import java.util.List;

public interface DatabaseShellOperationsInterface<Table, Key, Value>
        extends FileMapShellOperationsInterface<Table, Key, Value> {
    Table useTable(String name);

    void dropTable(String name) throws IOException;

    Table createTable(String parameters);

    String getActiveTableName();

    void showTables();

    List<String> list();
}