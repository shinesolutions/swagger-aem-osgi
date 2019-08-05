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
    ConfigNodePropertyString mongouri = null

    ConfigNodePropertyString db = null

    ConfigNodePropertyBoolean socketKeepAlive = null

    ConfigNodePropertyInteger cache = null

    ConfigNodePropertyInteger nodeCachePercentage = null

    ConfigNodePropertyInteger prevDocCachePercentage = null

    ConfigNodePropertyInteger childrenCachePercentage = null

    ConfigNodePropertyInteger diffCachePercentage = null

    ConfigNodePropertyInteger cacheSegmentCount = null

    ConfigNodePropertyInteger cacheStackMoveDistance = null

    ConfigNodePropertyInteger blobCacheSize = null

    ConfigNodePropertyString persistentCache = null

    ConfigNodePropertyString journalCache = null

    ConfigNodePropertyBoolean customBlobStore = null

    ConfigNodePropertyInteger journalGCInterval = null

    ConfigNodePropertyInteger journalGCMaxAge = null

    ConfigNodePropertyBoolean prefetchExternalChanges = null

    ConfigNodePropertyString role = null

    ConfigNodePropertyInteger versionGcMaxAgeInSecs = null

    ConfigNodePropertyString versionGCExpression = null

    ConfigNodePropertyInteger versionGCTimeLimitInSecs = null

    ConfigNodePropertyInteger blobGcMaxAgeInSecs = null

    ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null

    ConfigNodePropertyString repositoryHome = null

    ConfigNodePropertyInteger maxReplicationLagInSecs = null

    ConfigNodePropertyDropDown documentStoreType = null

    ConfigNodePropertyBoolean bundlingDisabled = null

    ConfigNodePropertyInteger updateLimit = null

    ConfigNodePropertyArray persistentCacheIncludes = null

    ConfigNodePropertyDropDown leaseCheckMode = null

}
