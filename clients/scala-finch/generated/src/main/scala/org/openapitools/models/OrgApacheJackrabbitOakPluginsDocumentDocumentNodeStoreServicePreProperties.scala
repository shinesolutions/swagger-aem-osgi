package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param persistentCacheIncludes 
 */
case class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties(persistentCacheIncludes: Option[ConfigNodePropertyArray]
                )

object OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties] = deriveEncoder
}
