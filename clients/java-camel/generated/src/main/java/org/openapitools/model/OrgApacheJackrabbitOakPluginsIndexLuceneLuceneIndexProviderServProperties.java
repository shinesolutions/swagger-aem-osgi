package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {

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

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Get disabled
   * @return disabled
   */
  @Valid 
  @Schema(name = "disabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
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
   */
  @Valid 
  @Schema(name = "debug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debug")
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
   */
  @Valid 
  @Schema(name = "localIndexDir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localIndexDir")
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
   */
  @Valid 
  @Schema(name = "enableOpenIndexAsync", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableOpenIndexAsync")
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
   */
  @Valid 
  @Schema(name = "threadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threadPoolSize")
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
   */
  @Valid 
  @Schema(name = "prefetchIndexFiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefetchIndexFiles")
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
   */
  @Valid 
  @Schema(name = "extractedTextCacheSizeInMB", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extractedTextCacheSizeInMB")
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
   */
  @Valid 
  @Schema(name = "extractedTextCacheExpiryInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extractedTextCacheExpiryInSecs")
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
   */
  @Valid 
  @Schema(name = "alwaysUsePreExtractedCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alwaysUsePreExtractedCache")
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
   */
  @Valid 
  @Schema(name = "booleanClauseLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("booleanClauseLimit")
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
   */
  @Valid 
  @Schema(name = "enableHybridIndexing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableHybridIndexing")
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
   */
  @Valid 
  @Schema(name = "hybridQueueSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hybridQueueSize")
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
   */
  @Valid 
  @Schema(name = "disableStoredIndexDefinition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disableStoredIndexDefinition")
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
   */
  @Valid 
  @Schema(name = "deletedBlobsCollectionEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedBlobsCollectionEnabled")
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
   */
  @Valid 
  @Schema(name = "propIndexCleanerIntervalInSecs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propIndexCleanerIntervalInSecs")
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
   */
  @Valid 
  @Schema(name = "enableSingleBlobIndexFiles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableSingleBlobIndexFiles")
  public ConfigNodePropertyBoolean getEnableSingleBlobIndexFiles() {
    return enableSingleBlobIndexFiles;
  }

  public void setEnableSingleBlobIndexFiles(ConfigNodePropertyBoolean enableSingleBlobIndexFiles) {
    this.enableSingleBlobIndexFiles = enableSingleBlobIndexFiles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties = (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties) o;
    return Objects.equals(this.disabled, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.disabled) &&
        Objects.equals(this.debug, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.debug) &&
        Objects.equals(this.localIndexDir, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.localIndexDir) &&
        Objects.equals(this.enableOpenIndexAsync, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableOpenIndexAsync) &&
        Objects.equals(this.threadPoolSize, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.threadPoolSize) &&
        Objects.equals(this.prefetchIndexFiles, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.prefetchIndexFiles) &&
        Objects.equals(this.extractedTextCacheSizeInMB, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.extractedTextCacheSizeInMB) &&
        Objects.equals(this.extractedTextCacheExpiryInSecs, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.extractedTextCacheExpiryInSecs) &&
        Objects.equals(this.alwaysUsePreExtractedCache, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.alwaysUsePreExtractedCache) &&
        Objects.equals(this.booleanClauseLimit, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.booleanClauseLimit) &&
        Objects.equals(this.enableHybridIndexing, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableHybridIndexing) &&
        Objects.equals(this.hybridQueueSize, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.hybridQueueSize) &&
        Objects.equals(this.disableStoredIndexDefinition, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.disableStoredIndexDefinition) &&
        Objects.equals(this.deletedBlobsCollectionEnabled, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.deletedBlobsCollectionEnabled) &&
        Objects.equals(this.propIndexCleanerIntervalInSecs, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.propIndexCleanerIntervalInSecs) &&
        Objects.equals(this.enableSingleBlobIndexFiles, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.enableSingleBlobIndexFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, debug, localIndexDir, enableOpenIndexAsync, threadPoolSize, prefetchIndexFiles, extractedTextCacheSizeInMB, extractedTextCacheExpiryInSecs, alwaysUsePreExtractedCache, booleanClauseLimit, enableHybridIndexing, hybridQueueSize, disableStoredIndexDefinition, deletedBlobsCollectionEnabled, propIndexCleanerIntervalInSecs, enableSingleBlobIndexFiles);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

