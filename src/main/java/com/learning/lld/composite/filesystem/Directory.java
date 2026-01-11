package com.learning.lld.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> childrenFileSystem;
    String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        childrenFileSystem = new ArrayList<>();
    }

    public void addChildrenFileSystem(FileSystem fileSystem) {
        childrenFileSystem.add(fileSystem);
    }

    public void removeChildrenFileSystem(FileSystem fileSystem) {
        childrenFileSystem.remove(fileSystem);
    }

    public void ls() {
        System.out.println("Directory name: " + directoryName);
        for (FileSystem fileSystem : childrenFileSystem) {
            fileSystem.ls();
        }
    }
}
