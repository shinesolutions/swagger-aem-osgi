package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(
  mongouri: Option[ConfigNodePropertyString],
  db: Option[ConfigNodePropertyString],
  socketKeepAlive: Option[ConfigNodePropertyBoolean],
  cache: Option[ConfigNodePropertyInteger],
  nodeCachePercentage: Option[ConfigNodePropertyInteger],
  prevDocCachePercentage: Option[ConfigNodePropertyInteger],
  childrenCachePercentage: Option[ConfigNodePropertyInteger],
  diffCachePercentage: Option[ConfigNodePropertyInteger],
  cacheSegmentCount: Option[ConfigNodePropertyInteger],
  cacheStackMoveDistance: Option[ConfigNodePropertyInteger],
  blobCacheSize: Option[ConfigNodePropertyInteger],
  persistentCache: Option[ConfigNodePropertyString],
  journalCache: Option[ConfigNodePropertyString],
  customBlobStore: Option[ConfigNodePropertyBoolean],
  journalGCInterval: Option[ConfigNodePropertyInteger],
  journalGCMaxAge: Option[ConfigNodePropertyInteger],
  prefetchExternalChanges: Option[ConfigNodePropertyBoolean],
  role: Option[ConfigNodePropertyString],
  versionGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
  versionGCExpression: Option[ConfigNodePropertyString],
  versionGCTimeLimitInSecs: Option[ConfigNodePropertyInteger],
  blobGcMaxAgeInSecs: Option[ConfigNodePropertyInteger],
  blobTrackSnapshotIntervalInSecs: Option[ConfigNodePropertyInteger],
  repositoryHome: Option[ConfigNodePropertyString],
  maxReplicationLagInSecs: Option[ConfigNodePropertyInteger],
  documentStoreType: Option[ConfigNodePropertyDropDown],
  bundlingDisabled: Option[ConfigNodePropertyBoolean],
  updateLimit: Option[ConfigNodePropertyInteger],
  persistentCacheIncludes: Option[ConfigNodePropertyArray],
  leaseCheckMode: Option[ConfigNodePropertyDropDown]
)

object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties] = Json.format[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties]
}

