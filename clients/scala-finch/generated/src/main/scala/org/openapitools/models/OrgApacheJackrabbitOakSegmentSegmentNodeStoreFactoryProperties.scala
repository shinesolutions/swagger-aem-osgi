package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param repositoryPeriodhome 
 * @param tarmkPeriodmode 
 * @param tarmkPeriodsize 
 * @param segmentCachePeriodsize 
 * @param stringCachePeriodsize 
 * @param templateCachePeriodsize 
 * @param stringDeduplicationCachePeriodsize 
 * @param templateDeduplicationCachePeriodsize 
 * @param nodeDeduplicationCachePeriodsize 
 * @param pauseCompaction 
 * @param compactionPeriodretryCount 
 * @param compactionPeriodforcePeriodtimeout 
 * @param compactionPeriodsizeDeltaEstimation 
 * @param compactionPerioddisableEstimation 
 * @param compactionPeriodretainedGenerations 
 * @param compactionPeriodmemoryThreshold 
 * @param compactionPeriodprogressLog 
 * @param standby 
 * @param customBlobStore 
 * @param customSegmentStore 
 * @param splitPersistence 
 * @param repositoryPeriodbackupPerioddir 
 * @param blobGcMaxAgeInSecs 
 * @param blobTrackSnapshotIntervalInSecs 
 * @param role 
 * @param registerDescriptors 
 * @param dispatchChanges 
 */
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(repositoryPeriodhome: Option[ConfigNodePropertyString],
                tarmkPeriodmode: Option[ConfigNodePropertyString],
                tarmkPeriodsize: Option[ConfigNodePropertyInteger],
                segmentCachePeriodsize: Option[ConfigNodePropertyInteger],
                stringCachePeriodsize: Option[ConfigNodePropertyInteger],
                templateCachePeriodsize: Option[ConfigNodePropertyInteger],
                stringDeduplicationCachePeriodsize: Option[ConfigNodePropertyInteger],
                templateDeduplicationCachePeriodsize: Option[ConfigNodePropertyInteger],
                nodeDeduplicationCachePeriodsize: Option[ConfigNodePropertyInteger],
                pauseCompaction: Option[ConfigNodePropertyBoolean],
                compactionPeriodretryCount: Option[ConfigNodePropertyInteger],
                compactionPeriodforcePeriodtimeout: Option[ConfigNodePropertyInteger],
                compactionPeriodsizeDeltaEstimation: Option[ConfigNodePropertyInteger],
                compactionPerioddisableEstimation: Option[ConfigNodePropertyBoolean],
                compactionPeriodretainedGenerations: Option[ConfigNodePropertyInteger],
                compactionPeriodmemoryThreshold: Option[ConfigNodePropertyInteger],
                compactionPeriodprogressLog: Option[ConfigNodePropertyInteger],
                standby: Option[ConfigNodePropertyBoolean],
                customBlobStore: Option[ConfigNodePropertyBoolean],
                customSegmentStore: Option[ConfigNodePropertyBoolean],
                splitPersistence: Option[ConfigNodePropertyBoolean],
                repositoryPeriodbackupPerioddir: Option[ConfigNodePropertyString],
                blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
                blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger],
                role: Option[ConfigNodePropertyString],
                registerDescriptors: Option[ConfigNodePropertyBoolean],
                dispatchChanges: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties] = deriveEncoder
}
