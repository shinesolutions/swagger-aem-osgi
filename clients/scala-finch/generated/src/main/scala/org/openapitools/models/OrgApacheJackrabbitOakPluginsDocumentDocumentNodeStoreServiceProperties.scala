package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mongouri 
 * @param db 
 * @param socketKeepAlive 
 * @param cache 
 * @param nodeCachePercentage 
 * @param prevDocCachePercentage 
 * @param childrenCachePercentage 
 * @param diffCachePercentage 
 * @param cacheSegmentCount 
 * @param cacheStackMoveDistance 
 * @param blobCacheSize 
 * @param persistentCache 
 * @param journalCache 
 * @param customBlobStore 
 * @param journalGCInterval 
 * @param journalGCMaxAge 
 * @param prefetchExternalChanges 
 * @param role 
 * @param versionGcMaxAgeInSecs 
 * @param versionGCExpression 
 * @param versionGCTimeLimitInSecs 
 * @param blobGcMaxAgeInSecs 
 * @param blobTrackSnapshotIntervalInSecs 
 * @param repositoryPeriodhome 
 * @param maxReplicationLagInSecs 
 * @param documentStoreType 
 * @param bundlingDisabled 
 * @param updateLimit 
 * @param persistentCacheIncludes 
 * @param leaseCheckMode 
 */
case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties(mongouri: Option[ConfigNodePropertyString],
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
                repositoryPeriodhome: Option[ConfigNodePropertyString],
                maxReplicationLagInSecs: Option[ConfigNodePropertyInteger],
                documentStoreType: Option[ConfigNodePropertyDropDown],
                bundlingDisabled: Option[ConfigNodePropertyBoolean],
                updateLimit: Option[ConfigNodePropertyInteger],
                persistentCacheIncludes: Option[ConfigNodePropertyArray],
                leaseCheckMode: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties] = deriveEncoder
}
