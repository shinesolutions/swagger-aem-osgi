package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
    
    ConfigNodePropertyBoolean disabled
    
    ConfigNodePropertyBoolean debug
    
    ConfigNodePropertyString localIndexDir
    
    ConfigNodePropertyBoolean enableOpenIndexAsync
    
    ConfigNodePropertyInteger threadPoolSize
    
    ConfigNodePropertyBoolean prefetchIndexFiles
    
    ConfigNodePropertyInteger extractedTextCacheSizeInMB
    
    ConfigNodePropertyInteger extractedTextCacheExpiryInSecs
    
    ConfigNodePropertyBoolean alwaysUsePreExtractedCache
    
    ConfigNodePropertyInteger booleanClauseLimit
    
    ConfigNodePropertyBoolean enableHybridIndexing
    
    ConfigNodePropertyInteger hybridQueueSize
    
    ConfigNodePropertyBoolean disableStoredIndexDefinition
    
    ConfigNodePropertyBoolean deletedBlobsCollectionEnabled
    
    ConfigNodePropertyInteger propIndexCleanerIntervalInSecs
    
    ConfigNodePropertyBoolean enableSingleBlobIndexFiles
}
