package ru.fizteh.fivt.students.maxim_gotovchits.file_map;

public class Remove extends FileMapMain {
    void removeFunction() {
        if (cmdBuffer.length == 2) {
            String v = storage.remove(cmdBuffer[1]);
            if (v != null) {
                System.out.println("removed");
            } else {
                System.out.println("not found");
            }
        } else {
            System.err.println("incorrect syntax");
        }
    }
}

