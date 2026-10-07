package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
    
    ConfigNodePropertyString mongouri
    
    ConfigNodePropertyString db
    
    ConfigNodePropertyBoolean socketKeepAlive
    
    ConfigNodePropertyInteger cache
    
    ConfigNodePropertyInteger nodeCachePercentage
    
    ConfigNodePropertyInteger prevDocCachePercentage
    
    ConfigNodePropertyInteger childrenCachePercentage
    
    ConfigNodePropertyInteger diffCachePercentage
    
    ConfigNodePropertyInteger cacheSegmentCount
    
    ConfigNodePropertyInteger cacheStackMoveDistance
    
    ConfigNodePropertyInteger blobCacheSize
    
    ConfigNodePropertyString persistentCache
    
    ConfigNodePropertyString journalCache
    
    ConfigNodePropertyBoolean customBlobStore
    
    ConfigNodePropertyInteger journalGCInterval
    
    ConfigNodePropertyInteger journalGCMaxAge
    
    ConfigNodePropertyBoolean prefetchExternalChanges
    
    ConfigNodePropertyString role
    
    ConfigNodePropertyInteger versionGcMaxAgeInSecs
    
    ConfigNodePropertyString versionGCExpression
    
    ConfigNodePropertyInteger versionGCTimeLimitInSecs
    
    ConfigNodePropertyInteger blobGcMaxAgeInSecs
    
    ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs
    
    ConfigNodePropertyString repositoryHome
    
    ConfigNodePropertyInteger maxReplicationLagInSecs
    
    ConfigNodePropertyDropDown documentStoreType
    
    ConfigNodePropertyBoolean bundlingDisabled
    
    ConfigNodePropertyInteger updateLimit
    
    ConfigNodePropertyArray persistentCacheIncludes
    
    ConfigNodePropertyDropDown leaseCheckMode
}
