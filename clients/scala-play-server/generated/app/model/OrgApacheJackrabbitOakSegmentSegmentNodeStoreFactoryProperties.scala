package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(
  repositoryHome: Option[ConfigNodePropertyString],
  tarmkMode: Option[ConfigNodePropertyString],
  tarmkSize: Option[ConfigNodePropertyInteger],
  segmentCacheSize: Option[ConfigNodePropertyInteger],
  stringCacheSize: Option[ConfigNodePropertyInteger],
  templateCacheSize: Option[ConfigNodePropertyInteger],
  stringDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
  templateDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
  nodeDeduplicationCacheSize: Option[ConfigNodePropertyInteger],
  pauseCompaction: Option[ConfigNodePropertyBoolean],
  compactionRetryCount: Option[ConfigNodePropertyInteger],
  compactionForceTimeout: Option[ConfigNodePropertyInteger],
  compactionSizeDeltaEstimation: Option[ConfigNodePropertyInteger],
  compactionDisableEstimation: Option[ConfigNodePropertyBoolean],
  compactionRetainedGenerations: Option[ConfigNodePropertyInteger],
  compactionMemoryThreshold: Option[ConfigNodePropertyInteger],
  compactionProgressLog: Option[ConfigNodePropertyInteger],
  standby: Option[ConfigNodePropertyBoolean],
  customBlobStore: Option[ConfigNodePropertyBoolean],
  customSegmentStore: Option[ConfigNodePropertyBoolean],
  splitPersistence: Option[ConfigNodePropertyBoolean],
  repositoryBackupDir: Option[ConfigNodePropertyString],
  blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
  blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger],
  role: Option[ConfigNodePropertyString],
  registerDescriptors: Option[ConfigNodePropertyBoolean],
  dispatchChanges: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties {
  implicit lazy val orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties] = Json.format[OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties]
}

