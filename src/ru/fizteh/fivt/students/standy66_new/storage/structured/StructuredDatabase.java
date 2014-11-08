package ru.fizteh.fivt.students.standy66_new.storage.structured;

import ru.fizteh.fivt.storage.structured.ColumnFormatException;
import ru.fizteh.fivt.storage.structured.Storeable;
import ru.fizteh.fivt.storage.structured.Table;
import ru.fizteh.fivt.storage.structured.TableProvider;
import ru.fizteh.fivt.students.standy66_new.storage.strings.StringDatabase;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

/**
 * Created by andrew on 07.11.14.
 */
public class StructuredDatabase implements TableProvider {
    private StringDatabase backendDatabase;

    public StructuredDatabase(File databaseFile) {
        //TODO: not implemented
        backendDatabase = new StringDatabase(databaseFile);

    }

    @Override
    public Table getTable(String name) {
        //TODO: not implemented
        return null;
    }

    @Override
    public Table createTable(String name, List<Class<?>> columnTypes) throws IOException {
        //TODO: not implemented
        return null;
    }

    @Override
    public void removeTable(String name) throws IOException {
        //TODO: not implemented

    }

    @Override
    public Storeable deserialize(Table table, String value) throws ParseException {
        //TODO: not implemented
        return null;
    }

    @Override
    public String serialize(Table table, Storeable value) throws ColumnFormatException {
        //TODO: not implemented
        return null;
    }

    @Override
    public Storeable createFor(Table table) {
        //TODO: not implemented
        return null;
    }

    @Override
    public Storeable createFor(Table table, List<?> values) throws ColumnFormatException, IndexOutOfBoundsException {
        //TODO: not implemented
        return null;
    }
}
