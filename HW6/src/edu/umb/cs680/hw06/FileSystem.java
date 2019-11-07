package edu.umb.cs680.hw06;

import java.util.LinkedList;

public class FileSystem {

    private LinkedList<Directory> rootDirs;

    private FileSystem(){}
    private static FileSystem fileSystem = null;
    public static FileSystem getFileSystem(){
        if(fileSystem==null)
            fileSystem = new FileSystem();
        return fileSystem;
    }

    public LinkedList<Directory> getRootDirs() {
        return rootDirs;
    }

    public void addRootDir(Directory rootDir) {
        this.rootDirs.add(rootDir);
    }

}