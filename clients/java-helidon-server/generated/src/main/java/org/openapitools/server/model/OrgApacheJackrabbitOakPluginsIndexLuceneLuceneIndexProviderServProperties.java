package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties   {

    private ConfigNodePropertyBoolean disabled;
    private ConfigNodePropertyBoolean debug;
    private ConfigNodePropertyString localIndexDir;
    private ConfigNodePropertyBoolean enableOpenIndexAsync;
    private ConfigNodePropertyInteger threadPoolSize;
    private ConfigNodePropertyBoolean prefetchIndexFiles;
    private ConfigNodePropertyInteger extractedTextCacheSizeInMB;
    private ConfigNodePropertyInteger extractedTextCacheExpiryInSecs;
    private ConfigNodePropertyBoolean alwaysUsePreExtractedCache;
    private ConfigNodePropertyInteger booleanClauseLimit;
    private ConfigNodePropertyBoolean enableHybridIndexing;
    private ConfigNodePropertyInteger hybridQueueSize;
    private ConfigNodePropertyBoolean disableStoredIndexDefinition;
    private ConfigNodePropertyBoolean deletedBlobsCollectionEnabled;
    private ConfigNodePropertyInteger propIndexCleanerIntervalInSecs;
    private ConfigNodePropertyBoolean enableSingleBlobIndexFiles;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.
     *
     * @param disabled disabled
     * @param debug debug
     * @param localIndexDir localIndexDir
     * @param enableOpenIndexAsync enableOpenIndexAsync
     * @param threadPoolSize threadPoolSize
     * @param prefetchIndexFiles prefetchIndexFiles
     * @param extractedTextCacheSizeInMB extractedTextCacheSizeInMB
     * @param extractedTextCacheExpiryInSecs extractedTextCacheExpiryInSecs
     * @param alwaysUsePreExtractedCache alwaysUsePreExtractedCache
     * @param booleanClauseLimit booleanClauseLimit
     * @param enableHybridIndexing enableHybridIndexing
     * @param hybridQueueSize hybridQueueSize
     * @param disableStoredIndexDefinition disableStoredIndexDefinition
     * @param deletedBlobsCollectionEnabled deletedBlobsCollectionEnabled
     * @param propIndexCleanerIntervalInSecs propIndexCleanerIntervalInSecs
     * @param enableSingleBlobIndexFiles enableSingleBlobIndexFiles
     */
    public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(
        ConfigNodePropertyBoolean disabled, 
        ConfigNodePropertyBoolean debug, 
        ConfigNodePropertyString localIndexDir, 
        ConfigNodePropertyBoolean enableOpenIndexAsync, 
        ConfigNodePropertyInteger threadPoolSize, 
        ConfigNodePropertyBoolean prefetchIndexFiles, 
        ConfigNodePropertyInteger extractedTextCacheSizeInMB, 
        ConfigNodePropertyInteger extractedTextCacheExpiryInSecs, 
        ConfigNodePropertyBoolean alwaysUsePreExtractedCache, 
        ConfigNodePropertyInteger booleanClauseLimit, 
        ConfigNodePropertyBoolean enableHybridIndexing, 
        ConfigNodePropertyInteger hybridQueueSize, 
        ConfigNodePropertyBoolean disableStoredIndexDefinition, 
        ConfigNodePropertyBoolean deletedBlobsCollectionEnabled, 
        ConfigNodePropertyInteger propIndexCleanerIntervalInSecs, 
        ConfigNodePropertyBoolean enableSingleBlobIndexFiles
    ) {
        this.disabled = disabled;
        this.debug = debug;
        this.localIndexDir = localIndexDir;
        this.enableOpenIndexAsync = enableOpenIndexAsync;
        this.threadPoolSize = threadPoolSize;
        this.prefetchIndexFiles = prefetchIndexFiles;
        this.extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
        this.extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
        this.alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
        this.booleanClauseLimit = booleanClauseLimit;
        this.enableHybridIndexing = enableHybridIndexing;
        this.hybridQueueSize = hybridQueueSize;
        this.disableStoredIndexDefinition = disableStoredIndexDefinition;
        this.deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
        this.propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
        this.enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
    }



    /**
     * Get disabled
     * @return disabled
     */
    public ConfigNodePropertyBoolean getDisabled() {
        return disabled;
    }

    public void setDisabled(ConfigNodePropertyBoolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Get debug
     * @return debug
     */
    public ConfigNodePropertyBoolean getDebug() {
        return debug;
    }

    public void setDebug(ConfigNodePropertyBoolean debug) {
        this.debug = debug;
    }

    /**
     * Get localIndexDir
     * @return localIndexDir
     */
    public ConfigNodePropertyString getLocalIndexDir() {
        return localIndexDir;
    }

    public void setLocalIndexDir(ConfigNodePropertyString localIndexDir) {
        this.localIndexDir = localIndexDir;
    }

    /**
     * Get enableOpenIndexAsync
     * @return enableOpenIndexAsync
     */
    public ConfigNodePropertyBoolean getEnableOpenIndexAsync() {
        return enableOpenIndexAsync;
    }

    public void setEnableOpenIndexAsync(ConfigNodePropertyBoolean enableOpenIndexAsync) {
        this.enableOpenIndexAsync = enableOpenIndexAsync;
    }

    /**
     * Get threadPoolSize
     * @return threadPoolSize
     */
    public ConfigNodePropertyInteger getThreadPoolSize() {
        return threadPoolSize;
    }

    public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    /**
     * Get prefetchIndexFiles
     * @return prefetchIndexFiles
     */
    public ConfigNodePropertyBoolean getPrefetchIndexFiles() {
        return prefetchIndexFiles;
    }

    public void setPrefetchIndexFiles(ConfigNodePropertyBoolean prefetchIndexFiles) {
        this.prefetchIndexFiles = prefetchIndexFiles;
    }

    /**
     * Get extractedTextCacheSizeInMB
     * @return extractedTextCacheSizeInMB
     */
    public ConfigNodePropertyInteger getExtractedTextCacheSizeInMB() {
        return extractedTextCacheSizeInMB;
    }

    public void setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger extractedTextCacheSizeInMB) {
        this.extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
    }

    /**
     * Get extractedTextCacheExpiryInSecs
     * @return extractedTextCacheExpiryInSecs
     */
    public ConfigNodePropertyInteger getExtractedTextCacheExpiryInSecs() {
        return extractedTextCacheExpiryInSecs;
    }

    public void setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger extractedTextCacheExpiryInSecs) {
        this.extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
    }

    /**
     * Get alwaysUsePreExtractedCache
     * @return alwaysUsePreExtractedCache
     */
    public ConfigNodePropertyBoolean getAlwaysUsePreExtractedCache() {
        return alwaysUsePreExtractedCache;
    }

    public void setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean alwaysUsePreExtractedCache) {
        this.alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
    }

    /**
     * Get booleanClauseLimit
     * @return booleanClauseLimit
     */
    public ConfigNodePropertyInteger getBooleanClauseLimit() {
        return booleanClauseLimit;
    }

    public void setBooleanClauseLimit(ConfigNodePropertyInteger booleanClauseLimit) {
        this.booleanClauseLimit = booleanClauseLimit;
    }

    /**
     * Get enableHybridIndexing
     * @return enableHybridIndexing
     */
    public ConfigNodePropertyBoolean getEnableHybridIndexing() {
        return enableHybridIndexing;
    }

    public void setEnableHybridIndexing(ConfigNodePropertyBoolean enableHybridIndexing) {
        this.enableHybridIndexing = enableHybridIndexing;
    }

    /**
     * Get hybridQueueSize
     * @return hybridQueueSize
     */
    public ConfigNodePropertyInteger getHybridQueueSize() {
        return hybridQueueSize;
    }

    public void setHybridQueueSize(ConfigNodePropertyInteger hybridQueueSize) {
        this.hybridQueueSize = hybridQueueSize;
    }

    /**
     * Get disableStoredIndexDefinition
     * @return disableStoredIndexDefinition
     */
    public ConfigNodePropertyBoolean getDisableStoredIndexDefinition() {
        return disableStoredIndexDefinition;
    }

    public void setDisableStoredIndexDefinition(ConfigNodePropertyBoolean disableStoredIndexDefinition) {
        this.disableStoredIndexDefinition = disableStoredIndexDefinition;
    }

    /**
     * Get deletedBlobsCollectionEnabled
     * @return deletedBlobsCollectionEnabled
     */
    public ConfigNodePropertyBoolean getDeletedBlobsCollectionEnabled() {
        return deletedBlobsCollectionEnabled;
    }

    public void setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean deletedBlobsCollectionEnabled) {
        this.deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
    }

    /**
     * Get propIndexCleanerIntervalInSecs
     * @return propIndexCleanerIntervalInSecs
     */
    public ConfigNodePropertyInteger getPropIndexCleanerIntervalInSecs() {
        return propIndexCleanerIntervalInSecs;
    }

    public void setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger propIndexCleanerIntervalInSecs) {
        this.propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
    }

    /**
     * Get enableSingleBlobIndexFiles
     * @return enableSingleBlobIndexFiles
     */
    public ConfigNodePropertyBoolean getEnableSingleBlobIndexFiles() {
        return enableSingleBlobIndexFiles;
    }

    public void setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles) {
        this.enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {\n");
        
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
        sb.append("    localIndexDir: ").append(toIndentedString(localIndexDir)).append("\n");
        sb.append("    enableOpenIndexAsync: ").append(toIndentedString(enableOpenIndexAsync)).append("\n");
        sb.append("    threadPoolSize: ").append(toIndentedString(threadPoolSize)).append("\n");
        sb.append("    prefetchIndexFiles: ").append(toIndentedString(prefetchIndexFiles)).append("\n");
        sb.append("    extractedTextCacheSizeInMB: ").append(toIndentedString(extractedTextCacheSizeInMB)).append("\n");
        sb.append("    extractedTextCacheExpiryInSecs: ").append(toIndentedString(extractedTextCacheExpiryInSecs)).append("\n");
        sb.append("    alwaysUsePreExtractedCache: ").append(toIndentedString(alwaysUsePreExtractedCache)).append("\n");
        sb.append("    booleanClauseLimit: ").append(toIndentedString(booleanClauseLimit)).append("\n");
        sb.append("    enableHybridIndexing: ").append(toIndentedString(enableHybridIndexing)).append("\n");
        sb.append("    hybridQueueSize: ").append(toIndentedString(hybridQueueSize)).append("\n");
        sb.append("    disableStoredIndexDefinition: ").append(toIndentedString(disableStoredIndexDefinition)).append("\n");
        sb.append("    deletedBlobsCollectionEnabled: ").append(toIndentedString(deletedBlobsCollectionEnabled)).append("\n");
        sb.append("    propIndexCleanerIntervalInSecs: ").append(toIndentedString(propIndexCleanerIntervalInSecs)).append("\n");
        sb.append("    enableSingleBlobIndexFiles: ").append(toIndentedString(enableSingleBlobIndexFiles)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

