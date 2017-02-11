/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.analysis.settings;

import java.util.List;

public interface FileListManager {
    List<BaseListedFile> getFilteredSessionFiles();

    void setFilteredSessionFiles(List<BaseListedFile> files);
}
