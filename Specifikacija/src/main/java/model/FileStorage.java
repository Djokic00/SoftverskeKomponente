package model;

import java.io.File;
import java.util.HashMap;

public class FileStorage {
    String restrictionExtension;
    String storagePath;
    String currentPath;
    Long size;
    String storageName;
    HashMap<String, Integer> folderRestrictions;

    /**
     * Default constructor.
     * The current value will be null.
     */
    public FileStorage() {
    }

    /**
     * Parameterized constructor.
     * The values will be set to storageName and size.
     */

    public FileStorage(String storageName, Long size) {
        this.storageName = storageName;
        this.size = size;
    }
    /**
     * Parameterized constructor.
     * The values will be set to storageName, size and extension restriction.
     */

    public FileStorage(String storageName, Long size, String restrictionExtension) {
        this.storageName = storageName;
        this.size = size;
        this.restrictionExtension = restrictionExtension;
    }

    /**
     * Parameterized constructor.
     * The values will be set to storageName, size, extension restriction and folder restristions.
     */
    public FileStorage(String storageName, Long size, String restrictionExtension, HashMap<String, Integer> folderRestrictions) {
        this.storageName = storageName;
        this.size = size;
        this.restrictionExtension = restrictionExtension;
        this.folderRestrictions = folderRestrictions;
    }



    public void setFolderRestrictions(HashMap<String, Integer> folderRestrictions) {
        this.folderRestrictions = folderRestrictions;
    }

    public HashMap<String, Integer> getFolderRestrictions() {
        return folderRestrictions;
    }

    public String getRestriction() {
        return restrictionExtension;
    }

    public void setRestriction(String restriction) {
        this.restrictionExtension = restriction;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

}
