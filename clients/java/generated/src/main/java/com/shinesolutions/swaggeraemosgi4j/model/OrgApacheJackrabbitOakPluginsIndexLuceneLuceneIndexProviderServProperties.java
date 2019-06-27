/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private ConfigNodePropertyBoolean disabled = null;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private ConfigNodePropertyBoolean debug = null;

  public static final String SERIALIZED_NAME_LOCAL_INDEX_DIR = "localIndexDir";
  @SerializedName(SERIALIZED_NAME_LOCAL_INDEX_DIR)
  private ConfigNodePropertyString localIndexDir = null;

  public static final String SERIALIZED_NAME_ENABLE_OPEN_INDEX_ASYNC = "enableOpenIndexAsync";
  @SerializedName(SERIALIZED_NAME_ENABLE_OPEN_INDEX_ASYNC)
  private ConfigNodePropertyBoolean enableOpenIndexAsync = null;

  public static final String SERIALIZED_NAME_THREAD_POOL_SIZE = "threadPoolSize";
  @SerializedName(SERIALIZED_NAME_THREAD_POOL_SIZE)
  private ConfigNodePropertyInteger threadPoolSize = null;

  public static final String SERIALIZED_NAME_PREFETCH_INDEX_FILES = "prefetchIndexFiles";
  @SerializedName(SERIALIZED_NAME_PREFETCH_INDEX_FILES)
  private ConfigNodePropertyBoolean prefetchIndexFiles = null;

  public static final String SERIALIZED_NAME_EXTRACTED_TEXT_CACHE_SIZE_IN_M_B = "extractedTextCacheSizeInMB";
  @SerializedName(SERIALIZED_NAME_EXTRACTED_TEXT_CACHE_SIZE_IN_M_B)
  private ConfigNodePropertyInteger extractedTextCacheSizeInMB = null;

  public static final String SERIALIZED_NAME_EXTRACTED_TEXT_CACHE_EXPIRY_IN_SECS = "extractedTextCacheExpiryInSecs";
  @SerializedName(SERIALIZED_NAME_EXTRACTED_TEXT_CACHE_EXPIRY_IN_SECS)
  private ConfigNodePropertyInteger extractedTextCacheExpiryInSecs = null;

  public static final String SERIALIZED_NAME_ALWAYS_USE_PRE_EXTRACTED_CACHE = "alwaysUsePreExtractedCache";
  @SerializedName(SERIALIZED_NAME_ALWAYS_USE_PRE_EXTRACTED_CACHE)
  private ConfigNodePropertyBoolean alwaysUsePreExtractedCache = null;

  public static final String SERIALIZED_NAME_BOOLEAN_CLAUSE_LIMIT = "booleanClauseLimit";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_CLAUSE_LIMIT)
  private ConfigNodePropertyInteger booleanClauseLimit = null;

  public static final String SERIALIZED_NAME_ENABLE_HYBRID_INDEXING = "enableHybridIndexing";
  @SerializedName(SERIALIZED_NAME_ENABLE_HYBRID_INDEXING)
  private ConfigNodePropertyBoolean enableHybridIndexing = null;

  public static final String SERIALIZED_NAME_HYBRID_QUEUE_SIZE = "hybridQueueSize";
  @SerializedName(SERIALIZED_NAME_HYBRID_QUEUE_SIZE)
  private ConfigNodePropertyInteger hybridQueueSize = null;

  public static final String SERIALIZED_NAME_DISABLE_STORED_INDEX_DEFINITION = "disableStoredIndexDefinition";
  @SerializedName(SERIALIZED_NAME_DISABLE_STORED_INDEX_DEFINITION)
  private ConfigNodePropertyBoolean disableStoredIndexDefinition = null;

  public static final String SERIALIZED_NAME_DELETED_BLOBS_COLLECTION_ENABLED = "deletedBlobsCollectionEnabled";
  @SerializedName(SERIALIZED_NAME_DELETED_BLOBS_COLLECTION_ENABLED)
  private ConfigNodePropertyBoolean deletedBlobsCollectionEnabled = null;

  public static final String SERIALIZED_NAME_PROP_INDEX_CLEANER_INTERVAL_IN_SECS = "propIndexCleanerIntervalInSecs";
  @SerializedName(SERIALIZED_NAME_PROP_INDEX_CLEANER_INTERVAL_IN_SECS)
  private ConfigNodePropertyInteger propIndexCleanerIntervalInSecs = null;

  public static final String SERIALIZED_NAME_ENABLE_SINGLE_BLOB_INDEX_FILES = "enableSingleBlobIndexFiles";
  @SerializedName(SERIALIZED_NAME_ENABLE_SINGLE_BLOB_INDEX_FILES)
  private ConfigNodePropertyBoolean enableSingleBlobIndexFiles = null;

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties disabled(ConfigNodePropertyBoolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
