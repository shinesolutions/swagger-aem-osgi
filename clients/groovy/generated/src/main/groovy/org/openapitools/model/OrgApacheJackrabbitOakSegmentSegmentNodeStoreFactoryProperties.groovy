package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {
    
    ConfigNodePropertyString repositoryHome
    
    ConfigNodePropertyString tarmkMode
    
    ConfigNodePropertyInteger tarmkSize
    
    ConfigNodePropertyInteger segmentCacheSize
    
    ConfigNodePropertyInteger stringCacheSize
    
    ConfigNodePropertyInteger templateCacheSize
    
    ConfigNodePropertyInteger stringDeduplicationCacheSize
    
    ConfigNodePropertyInteger templateDeduplicationCacheSize
    
    ConfigNodePropertyInteger nodeDeduplicationCacheSize
    
    ConfigNodePropertyBoolean pauseCompaction
    
    ConfigNodePropertyInteger compactionRetryCount
    
    ConfigNodePropertyInteger compactionForceTimeout
    
    ConfigNodePropertyInteger compactionSizeDeltaEstimation
    
    ConfigNodePropertyBoolean compactionDisableEstimation
    
    ConfigNodePropertyInteger compactionRetainedGenerations
    
    ConfigNodePropertyInteger compactionMemoryThreshold
    
    ConfigNodePropertyInteger compactionProgressLog
    
    ConfigNodePropertyBoolean standby
    
    ConfigNodePropertyBoolean customBlobStore
    
    ConfigNodePropertyBoolean customSegmentStore
    
    ConfigNodePropertyBoolean splitPersistence
    
    ConfigNodePropertyString repositoryBackupDir
    
    ConfigNodePropertyInteger blobGcMaxAgeInSecs
    
    ConfigNodePropertyInteger blobTrackSnapshotIntervalInSecs
    
    ConfigNodePropertyString role
    
    ConfigNodePropertyBoolean registerDescriptors
    
    ConfigNodePropertyBoolean dispatchChanges
}
