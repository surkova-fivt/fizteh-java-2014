package ru.fizteh.fivt.students.LebedevAleksey.MultiFileHashMap;

import ru.fizteh.fivt.students.LebedevAleksey.FileMap.DatabaseException;
import ru.fizteh.fivt.students.LebedevAleksey.FileMap.LoadOrSaveError;
import ru.fizteh.fivt.students.LebedevAleksey.Shell01.CommandParser;
import ru.fizteh.fivt.students.LebedevAleksey.Shell01.ParsedCommand;
import ru.fizteh.fivt.students.LebedevAleksey.Shell01.ParserException;

import java.util.List;

public class MultiFileHashMap extends CommandParser {
    Database database;

    public MultiFileHashMap() throws DatabaseFileStructureException, LoadOrSaveError {
        database = new Database();
    }

    public static void main(String[] args) {
        try {
            MultiFileHashMap map = new MultiFileHashMap();
            map.run(args);
            if (args.length == 0) {
                map.tryToSave();
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    protected boolean invokeCommands(List<ParsedCommand> commands) throws ParserException {
        for (ParsedCommand command : commands) {
            if (command.getCommandName().equals("exit")) {
                if (tryToSave()) {
                    return exit();
                }
            } else {
                try {
                    database.invokeCommand(command);
                } catch (DatabaseException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        return true;
    }

    private boolean tryToSave() {
        try {
            save();
        } catch (TableNotFoundException ex) {
            //Table not selected.
        } catch (LoadOrSaveError ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }

    private void save() throws LoadOrSaveError, TableNotFoundException {
        if (database != null) {
            database.getCurrentTable().save();
        } else {
            throw new TableNotFoundException("Table isn't selected");
        }
    }


}
