package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties   {
  @JsonProperty("disabled")
  private ConfigNodePropertyBoolean disabled = null;

  @JsonProperty("debug")
  private ConfigNodePropertyBoolean debug = null;

  @JsonProperty("localIndexDir")
  private ConfigNodePropertyString localIndexDir = null;

  @JsonProperty("enableOpenIndexAsync")
  private ConfigNodePropertyBoolean enableOpenIndexAsync = null;

  @JsonProperty("threadPoolSize")
  private ConfigNodePropertyInteger threadPoolSize = null;

  @JsonProperty("prefetchIndexFiles")
  private ConfigNodePropertyBoolean prefetchIndexFiles = null;

  @JsonProperty("extractedTextCacheSizeInMB")
  private ConfigNodePropertyInteger extractedTextCacheSizeInMB = null;

  @JsonProperty("extractedTextCacheExpiryInSecs")
  private ConfigNodePropertyInteger extractedTextCacheExpiryInSecs = null;

  @JsonProperty("alwaysUsePreExtractedCache")
  private ConfigNodePropertyBoolean alwaysUsePreExtractedCache = null;

  @JsonProperty("booleanClauseLimit")
  private ConfigNodePropertyInteger booleanClauseLimit = null;

  @JsonProperty("enableHybridIndexing")
  private ConfigNodePropertyBoolean enableHybridIndexing = null;

  @JsonProperty("hybridQueueSize")
  private ConfigNodePropertyInteger hybridQueueSize = null;

  @JsonProperty("disableStoredIndexDefinition")
  private ConfigNodePropertyBoolean disableStoredIndexDefinition = null;

  @JsonProperty("deletedBlobsCollectionEnabled")
  private ConfigNodePropertyBoolean deletedBlobsCollectionEnabled = null;

  @JsonProperty("propIndexCleanerIntervalInSecs")
  private ConfigNodePropertyInteger propIndexCleanerIntervalInSecs = null;

  @JsonProperty("enableSingleBlobIndexFiles")
  private ConfigNodePropertyBoolean enableSingleBlobIndexFiles = null;

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getDisabled() {
    return disabled;
  }

  public void setDisabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties debug(ConfigNodePropertyBoolean debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @Valid
  public ConfigNodePropertyBoolean getDebug() {
    return debug;
  }

  public void setDebug(ConfigNodePropertyBoolean debug) {
    this.debug = debug;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties localIndexDir(ConfigNodePropertyString localIndexDir) {
    this.localIndexDir = localIndexDir;
    return this;
  }

   /**
   * Get localIndexDir
   * @return localIndexDir
  **/
  @Valid
  public ConfigNodePropertyString getLocalIndexDir() {
    return localIndexDir;
  }

  public void setLocalIndexDir(ConfigNodePropertyString localIndexDir) {
    this.localIndexDir = localIndexDir;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties enableOpenIndexAsync(ConfigNodePropertyBoolean enableOpenIndexAsync) {
    this.enableOpenIndexAsync = enableOpenIndexAsync;
    return this;
  }

   /**
   * Get enableOpenIndexAsync
   * @return enableOpenIndexAsync
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableOpenIndexAsync() {
    return enableOpenIndexAsync;
  }

  public void setEnableOpenIndexAsync(ConfigNodePropertyBoolean enableOpenIndexAsync) {
    this.enableOpenIndexAsync = enableOpenIndexAsync;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties threadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
    return this;
  }

   /**
   * Get threadPoolSize
   * @return threadPoolSize
  **/
  @Valid
  public ConfigNodePropertyInteger getThreadPoolSize() {
    return threadPoolSize;
  }

  public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties prefetchIndexFiles(ConfigNodePropertyBoolean prefetchIndexFiles) {
    this.prefetchIndexFiles = prefetchIndexFiles;
    return this;
  }

   /**
   * Get prefetchIndexFiles
   * @return prefetchIndexFiles
  **/
  @Valid
  public ConfigNodePropertyBoolean getPrefetchIndexFiles() {
    return prefetchIndexFiles;
  }

  public void setPrefetchIndexFiles(ConfigNodePropertyBoolean prefetchIndexFiles) {
    this.prefetchIndexFiles = prefetchIndexFiles;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties extractedTextCacheSizeInMB(ConfigNodePropertyInteger extractedTextCacheSizeInMB) {
    this.extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
    return this;
  }

   /**
   * Get extractedTextCacheSizeInMB
   * @return extractedTextCacheSizeInMB
  **/
  @Valid
  public ConfigNodePropertyInteger getExtractedTextCacheSizeInMB() {
    return extractedTextCacheSizeInMB;
  }

  public void setExtractedTextCacheSizeInMB(ConfigNodePropertyInteger extractedTextCacheSizeInMB) {
    this.extractedTextCacheSizeInMB = extractedTextCacheSizeInMB;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties extractedTextCacheExpiryInSecs(ConfigNodePropertyInteger extractedTextCacheExpiryInSecs) {
    this.extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
    return this;
  }

   /**
   * Get extractedTextCacheExpiryInSecs
   * @return extractedTextCacheExpiryInSecs
  **/
  @Valid
  public ConfigNodePropertyInteger getExtractedTextCacheExpiryInSecs() {
    return extractedTextCacheExpiryInSecs;
  }

  public void setExtractedTextCacheExpiryInSecs(ConfigNodePropertyInteger extractedTextCacheExpiryInSecs) {
    this.extractedTextCacheExpiryInSecs = extractedTextCacheExpiryInSecs;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties alwaysUsePreExtractedCache(ConfigNodePropertyBoolean alwaysUsePreExtractedCache) {
    this.alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
    return this;
  }

   /**
   * Get alwaysUsePreExtractedCache
   * @return alwaysUsePreExtractedCache
  **/
  @Valid
  public ConfigNodePropertyBoolean getAlwaysUsePreExtractedCache() {
    return alwaysUsePreExtractedCache;
  }

  public void setAlwaysUsePreExtractedCache(ConfigNodePropertyBoolean alwaysUsePreExtractedCache) {
    this.alwaysUsePreExtractedCache = alwaysUsePreExtractedCache;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties booleanClauseLimit(ConfigNodePropertyInteger booleanClauseLimit) {
    this.booleanClauseLimit = booleanClauseLimit;
    return this;
  }

   /**
   * Get booleanClauseLimit
   * @return booleanClauseLimit
  **/
  @Valid
  public ConfigNodePropertyInteger getBooleanClauseLimit() {
    return booleanClauseLimit;
  }

  public void setBooleanClauseLimit(ConfigNodePropertyInteger booleanClauseLimit) {
    this.booleanClauseLimit = booleanClauseLimit;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties enableHybridIndexing(ConfigNodePropertyBoolean enableHybridIndexing) {
    this.enableHybridIndexing = enableHybridIndexing;
    return this;
  }

   /**
   * Get enableHybridIndexing
   * @return enableHybridIndexing
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableHybridIndexing() {
    return enableHybridIndexing;
  }

  public void setEnableHybridIndexing(ConfigNodePropertyBoolean enableHybridIndexing) {
    this.enableHybridIndexing = enableHybridIndexing;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties hybridQueueSize(ConfigNodePropertyInteger hybridQueueSize) {
    this.hybridQueueSize = hybridQueueSize;
    return this;
  }

   /**
   * Get hybridQueueSize
   * @return hybridQueueSize
  **/
  @Valid
  public ConfigNodePropertyInteger getHybridQueueSize() {
    return hybridQueueSize;
  }

  public void setHybridQueueSize(ConfigNodePropertyInteger hybridQueueSize) {
    this.hybridQueueSize = hybridQueueSize;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties disableStoredIndexDefinition(ConfigNodePropertyBoolean disableStoredIndexDefinition) {
    this.disableStoredIndexDefinition = disableStoredIndexDefinition;
    return this;
  }

   /**
   * Get disableStoredIndexDefinition
   * @return disableStoredIndexDefinition
  **/
  @Valid
  public ConfigNodePropertyBoolean getDisableStoredIndexDefinition() {
    return disableStoredIndexDefinition;
  }

  public void setDisableStoredIndexDefinition(ConfigNodePropertyBoolean disableStoredIndexDefinition) {
    this.disableStoredIndexDefinition = disableStoredIndexDefinition;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties deletedBlobsCollectionEnabled(ConfigNodePropertyBoolean deletedBlobsCollectionEnabled) {
    this.deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
    return this;
  }

   /**
   * Get deletedBlobsCollectionEnabled
   * @return deletedBlobsCollectionEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getDeletedBlobsCollectionEnabled() {
    return deletedBlobsCollectionEnabled;
  }

  public void setDeletedBlobsCollectionEnabled(ConfigNodePropertyBoolean deletedBlobsCollectionEnabled) {
    this.deletedBlobsCollectionEnabled = deletedBlobsCollectionEnabled;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties propIndexCleanerIntervalInSecs(ConfigNodePropertyInteger propIndexCleanerIntervalInSecs) {
    this.propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
    return this;
  }

   /**
   * Get propIndexCleanerIntervalInSecs
   * @return propIndexCleanerIntervalInSecs
  **/
  @Valid
  public ConfigNodePropertyInteger getPropIndexCleanerIntervalInSecs() {
    return propIndexCleanerIntervalInSecs;
  }

  public void setPropIndexCleanerIntervalInSecs(ConfigNodePropertyInteger propIndexCleanerIntervalInSecs) {
    this.propIndexCleanerIntervalInSecs = propIndexCleanerIntervalInSecs;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties enableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles) {
    this.enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
    return this;
  }

   /**
   * Get enableSingleBlobIndexFiles
   * @return enableSingleBlobIndexFiles
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnableSingleBlobIndexFiles() {
    return enableSingleBlobIndexFiles;
  }

  public void setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles) {
    this.enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties = (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties) o;
    return Objects.equals(disabled, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.disabled) &&
        Objects.equals(debug, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.debug) &&
        Objects.equals(localIndexDir, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.localIndexDir) &&
        Objects.equals(enableOpenIndexAsync, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableOpenIndexAsync) &&
        Objects.equals(threadPoolSize, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.threadPoolSize) &&
        Objects.equals(prefetchIndexFiles, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.prefetchIndexFiles) &&
        Objects.equals(extractedTextCacheSizeInMB, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.extractedTextCacheSizeInMB) &&
        Objects.equals(extractedTextCacheExpiryInSecs, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.extractedTextCacheExpiryInSecs) &&
        Objects.equals(alwaysUsePreExtractedCache, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.alwaysUsePreExtractedCache) &&
        Objects.equals(booleanClauseLimit, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.booleanClauseLimit) &&
        Objects.equals(enableHybridIndexing, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableHybridIndexing) &&
        Objects.equals(hybridQueueSize, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.hybridQueueSize) &&
        Objects.equals(disableStoredIndexDefinition, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.disableStoredIndexDefinition) &&
        Objects.equals(deletedBlobsCollectionEnabled, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.deletedBlobsCollectionEnabled) &&
        Objects.equals(propIndexCleanerIntervalInSecs, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.propIndexCleanerIntervalInSecs) &&
        Objects.equals(enableSingleBlobIndexFiles, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableSingleBlobIndexFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, debug, localIndexDir, enableOpenIndexAsync, threadPoolSize, prefetchIndexFiles, extractedTextCacheSizeInMB, extractedTextCacheExpiryInSecs, alwaysUsePreExtractedCache, booleanClauseLimit, enableHybridIndexing, hybridQueueSize, disableStoredIndexDefinition, deletedBlobsCollectionEnabled, propIndexCleanerIntervalInSecs, enableSingleBlobIndexFiles);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

