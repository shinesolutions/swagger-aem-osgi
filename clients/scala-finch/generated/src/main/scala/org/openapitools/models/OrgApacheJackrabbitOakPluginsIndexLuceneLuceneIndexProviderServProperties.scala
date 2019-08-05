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
 * @param disabled 
 * @param debug 
 * @param localIndexDir 
 * @param enableOpenIndexAsync 
 * @param threadPoolSize 
 * @param prefetchIndexFiles 
 * @param extractedTextCacheSizeInMB 
 * @param extractedTextCacheExpiryInSecs 
 * @param alwaysUsePreExtractedCache 
 * @param booleanClauseLimit 
 * @param enableHybridIndexing 
 * @param hybridQueueSize 
 * @param disableStoredIndexDefinition 
 * @param deletedBlobsCollectionEnabled 
 * @param propIndexCleanerIntervalInSecs 
 * @param enableSingleBlobIndexFiles 
 */
case class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties(disabled: Option[ConfigNodePropertyBoolean],
                debug: Option[ConfigNodePropertyBoolean],
                localIndexDir: Option[ConfigNodePropertyString],
                enableOpenIndexAsync: Option[ConfigNodePropertyBoolean],
                threadPoolSize: Option[ConfigNodePropertyInteger],
                prefetchIndexFiles: Option[ConfigNodePropertyBoolean],
                extractedTextCacheSizeInMB: Option[ConfigNodePropertyInteger],
                extractedTextCacheExpiryInSecs: Option[ConfigNodePropertyInteger],
                alwaysUsePreExtractedCache: Option[ConfigNodePropertyBoolean],
                booleanClauseLimit: Option[ConfigNodePropertyInteger],
                enableHybridIndexing: Option[ConfigNodePropertyBoolean],
                hybridQueueSize: Option[ConfigNodePropertyInteger],
                disableStoredIndexDefinition: Option[ConfigNodePropertyBoolean],
                deletedBlobsCollectionEnabled: Option[ConfigNodePropertyBoolean],
                propIndexCleanerIntervalInSecs: Option[ConfigNodePropertyInteger],
                enableSingleBlobIndexFiles: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties] = deriveEncoder
}
