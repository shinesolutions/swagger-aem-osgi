package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {
    ConfigNodePropertyString repositoryHome = null

    ConfigNodePropertyString tarmkMode = null

    ConfigNodePropertyInteger tarmkSize = null

    ConfigNodePropertyInteger segmentCacheSize = null

    ConfigNodePropertyInteger stringCacheSize = null

    ConfigNodePropertyInteger templateCacheSize = null

    ConfigNodePropertyInteger stringDeduplicationCacheSize = null

    ConfigNodePropertyInteger templateDeduplicationCacheSize = null

    ConfigNodePropertyInteger nodeDeduplicationCacheSize = null

    ConfigNodePropertyBoolean pauseCompaction = null

    ConfigNodePropertyInteger compactionRetryCount = null

    ConfigNodePropertyInteger compactionForceTimeout = null

    ConfigNodePropertyInteger compactionSizeDeltaEstimation = null

    ConfigNodePropertyBoolean compactionDisableEstimation = null

    ConfigNodePropertyInteger compactionRetainedGenerations = null

    ConfigNodePropertyInteger compactionMemoryThreshold = null

    ConfigNodePropertyInteger compactionProgressLog = null

    ConfigNodePropertyBoolean standby = null

    ConfigNodePropertyBoolean customBlobStore = null

    ConfigNodePropertyBoolean customSegmentStore = null

    ConfigNodePropertyBoolean splitPersistence = null

    ConfigNodePropertyString repositoryBackupDir = null

    ConfigNodePropertyInteger blobGcMaxAgeInSecs = null

    ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs = null

    ConfigNodePropertyString role = null

    ConfigNodePropertyBoolean registerDescriptors = null

    ConfigNodePropertyBoolean dispatchChanges = null

}
