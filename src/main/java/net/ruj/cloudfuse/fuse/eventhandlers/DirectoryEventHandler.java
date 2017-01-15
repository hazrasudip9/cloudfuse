package net.ruj.cloudfuse.fuse.eventhandlers;

import net.ruj.cloudfuse.clouds.exceptions.CreateFileException;
import net.ruj.cloudfuse.clouds.exceptions.MakeDirectoryException;
import net.ruj.cloudfuse.clouds.exceptions.SynchronizeChildremException;
import net.ruj.cloudfuse.fuse.filesystem.CloudDirectory;
import net.ruj.cloudfuse.fuse.filesystem.CloudFile;

public interface DirectoryEventHandler {
    void fileAdded(CloudDirectory parent, CloudFile file) throws CreateFileException;

    void directoryAdded(CloudDirectory parent, CloudDirectory directory) throws MakeDirectoryException;

    void synchronizeChildrenPaths(CloudDirectory directory) throws SynchronizeChildremException;
}
