package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
    ConfigNodePropertyBoolean disabled = null

    ConfigNodePropertyBoolean debug = null

    ConfigNodePropertyString localIndexDir = null

    ConfigNodePropertyBoolean enableOpenIndexAsync = null

    ConfigNodePropertyInteger threadPoolSize = null

    ConfigNodePropertyBoolean prefetchIndexFiles = null

    ConfigNodePropertyInteger extractedTextCacheSizeInMB = null

    ConfigNodePropertyInteger extractedTextCacheExpiryInSecs = null

    ConfigNodePropertyBoolean alwaysUsePreExtractedCache = null

    ConfigNodePropertyInteger booleanClauseLimit = null

    ConfigNodePropertyBoolean enableHybridIndexing = null

    ConfigNodePropertyInteger hybridQueueSize = null

    ConfigNodePropertyBoolean disableStoredIndexDefinition = null

    ConfigNodePropertyBoolean deletedBlobsCollectionEnabled = null

    ConfigNodePropertyInteger propIndexCleanerIntervalInSecs = null

    ConfigNodePropertyBoolean enableSingleBlobIndexFiles = null

}
